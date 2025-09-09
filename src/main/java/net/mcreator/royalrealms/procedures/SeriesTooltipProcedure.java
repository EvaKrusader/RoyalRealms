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
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.mcreator.royalrealms.network.RoyalrealmsModVariables;
import net.mcreator.royalrealms.init.RoyalrealmsModItems;

import javax.annotation.Nullable;

import java.util.List;

@Mod.EventBusSubscriber
public class SeriesTooltipProcedure {
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
		if (entity instanceof LivingEntity lv
				? CuriosApi.getCuriosHelper().findEquippedCurio(RoyalrealmsModItems.ESOTERIC_KNOWLEDGE.get(), lv).isPresent()
				: false || (entity.getCapability(RoyalrealmsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RoyalrealmsModVariables.PlayerVariables())).playerHasEnderlink == true) {
			if (itemstack.is(ItemTags.create(new ResourceLocation("minecraft:series_winter_paralysis")))) {
				tooltip.add(Component.literal("Part of the \"Winter Paralysis\" series"));
			}
			if (itemstack.is(ItemTags.create(new ResourceLocation("minecraft:series_bug_music")))) {
				tooltip.add(Component.literal("Part of the \"music for bugs\" series"));
			}
		}
	}
}
