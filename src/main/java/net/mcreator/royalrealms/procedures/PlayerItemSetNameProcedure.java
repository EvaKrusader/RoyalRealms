package net.mcreator.royalrealms.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.royalrealms.init.RoyalrealmsModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerItemSetNameProcedure {
	@SubscribeEvent
	public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		double devNum = 0;
		String playerColor = "";
		if (entity.isShiftKeyDown() && (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RoyalrealmsModItems.PLAYER_ITEM.get()) {
			if ((entity.getDisplayName().getString()).equals("EvaKrusader")) {
				playerColor = "a";
			} else if ((entity.getDisplayName().getString()).equals("ItzLinstar_")) {
				playerColor = "6";
			} else if ((entity.getDisplayName().getString()).equals("subsoni3947")) {
				playerColor = "5";
			} else if ((entity.getDisplayName().getString()).equals("BreadFiend226")) {
				playerColor = "e";
			} else {
				playerColor = "f";
			}
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("playerScent", (entity.getDisplayName().getString()));
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).setHoverName(Component.literal((("\u00A7" + playerColor) + "" + entity.getDisplayName().getString() + "'s Scent")));
		}
	}
}
