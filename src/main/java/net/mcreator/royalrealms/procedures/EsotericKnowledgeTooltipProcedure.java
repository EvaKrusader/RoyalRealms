package net.mcreator.royalrealms.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.royalrealms.init.RoyalrealmsModItems;

import javax.annotation.Nullable;

import java.util.List;

@Mod.EventBusSubscriber
public class EsotericKnowledgeTooltipProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onItemTooltip(ItemTooltipEvent event) {
		execute(event, event.getEntity(), event.getItemStack(), event.getToolTip());
	}

	public static void execute(Entity entity, ItemStack itemstack, List<Component> tooltip) {
		execute(null, entity, itemstack, tooltip);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack, List<Component> tooltip) {
		if (entity == null || tooltip == null)
			return;
		if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(RoyalrealmsModItems.ESOTERIC_KNOWLEDGE.get(), lv).isPresent() : false) {
			if (itemstack.getItem() == RoyalrealmsModItems.PLAYER_ITEM.get()) {
				tooltip.add(Component.literal("An item that can be used to teleport to other players."));
			}
			if (itemstack.getItem() == RoyalrealmsModItems.CURSED_SKULL.get()) {
				tooltip.add(Component.literal("A cursed item that latches onto your soul."));
			}
			if (itemstack.getItem() == RoyalrealmsModItems.PHASING_CAN.get()) {
				tooltip.add(Component.literal("A can that grants you spectator mode for a time duration between 3 and 6 seconds."));
			}
		}
	}
}
