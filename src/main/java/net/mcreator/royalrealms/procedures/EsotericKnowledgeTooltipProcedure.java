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

import net.mcreator.royalrealms.network.RoyalrealmsModVariables;
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
			if (itemstack.getItem() == RoyalrealmsModItems.MUSIC_DISC_HEALING.get()) {
				tooltip.add(Component.literal("Plays 1 of 7 random tracks!"));
			}
			if (itemstack.getItem() == RoyalrealmsModItems.MUSIC_DISC_BORN.get()) {
				tooltip.add(Component.literal("Plays 1 of 10 random tracks!"));
			}
		}
		if ((entity.getCapability(RoyalrealmsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RoyalrealmsModVariables.PlayerVariables())).playerHasEnderlink == true) {
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(RoyalrealmsModItems.ESOTERIC_KNOWLEDGE.get(), lv).isPresent() : false) {
				if (itemstack.getItem() == RoyalrealmsModItems.MUSIC_DISC_HEALING.get()) {
					tooltip.add(Component.literal("1 - Pain"));
					tooltip.add(Component.literal("2 - Fear"));
					tooltip.add(Component.literal("3 - Despair"));
					tooltip.add(Component.literal("4 - Hope"));
					tooltip.add(Component.literal("5 - Exemption"));
					tooltip.add(Component.literal("6 - Peace"));
					tooltip.add(Component.literal("7 - Healing"));
				}
				if (itemstack.getItem() == RoyalrealmsModItems.MUSIC_DISC_BORN.get()) {
					tooltip.add(Component.literal("1 - Birth"));
					tooltip.add(Component.literal("2 - Year"));
					tooltip.add(Component.literal("3 - Day"));
					tooltip.add(Component.literal("4 - Forever"));
					tooltip.add(Component.literal("5 - Spring"));
					tooltip.add(Component.literal("6 - Peace"));
					tooltip.add(Component.literal("7 - Day"));
					tooltip.add(Component.literal("8 - Night"));
					tooltip.add(Component.literal("9 - Dark"));
					tooltip.add(Component.literal("10 - Die"));
				}
			}
		}
	}
}
