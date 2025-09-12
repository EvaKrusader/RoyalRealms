package net.mcreator.royalrealms.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;

import net.mcreator.royalrealms.init.RoyalrealmsModItems;

import javax.annotation.Nullable;

import java.util.List;

@Mod.EventBusSubscriber
public class CustomItemLoreTooltipProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onItemTooltip(ItemTooltipEvent event) {
		execute(event, event.getItemStack(), event.getToolTip());
	}

	public static void execute(ItemStack itemstack, List<Component> tooltip) {
		execute(null, itemstack, tooltip);
	}

	private static void execute(@Nullable Event event, ItemStack itemstack, List<Component> tooltip) {
		if (tooltip == null)
			return;
		if (itemstack.getOrCreateTag().getBoolean("hasItemLore") == true) {
			if (!(itemstack.getItem() == RoyalrealmsModItems.LORE_ITEM.get())) {
				tooltip.add(Component.literal(""));
				if (!(itemstack.getOrCreateTag().getString("playerItemLore")).equals("NULL")) {
					tooltip.add(Component.literal(("\u00A77" + itemstack.getOrCreateTag().getString("playerItemLore"))));
				}
				if (!(itemstack.getOrCreateTag().getString("playerItemLore2")).equals("NULL")) {
					tooltip.add(Component.literal(("\u00A77" + itemstack.getOrCreateTag().getString("playerItemLore2"))));
				}
				if (!(itemstack.getOrCreateTag().getString("playerItemLore3")).equals("NULL")) {
					tooltip.add(Component.literal(("\u00A77" + itemstack.getOrCreateTag().getString("playerItemLore3"))));
				}
				if (!(itemstack.getOrCreateTag().getString("playerItemName")).equals("NULL")) {
					tooltip.add(Component.literal(("\u00A77" + ("- " + itemstack.getOrCreateTag().getString("playerItemName")))));
				}
				if (!(itemstack.getOrCreateTag().getString("playerItemDateReal")).equals("NULL")) {
					tooltip.add(Component.literal(("\u00A77" + itemstack.getOrCreateTag().getString("playerItemDateReal"))));
				}
			}
		}
	}
}
