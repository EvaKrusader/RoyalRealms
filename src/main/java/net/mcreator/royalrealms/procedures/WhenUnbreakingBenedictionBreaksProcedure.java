package net.mcreator.royalrealms.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerDestroyItemEvent;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;

import net.mcreator.royalrealms.init.RoyalrealmsModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class WhenUnbreakingBenedictionBreaksProcedure {
	@SubscribeEvent
	public static void onItemDestroyed(PlayerDestroyItemEvent event) {
		execute(event, event.getOriginal());
	}

	public static void execute(ItemStack itemstack) {
		execute(null, itemstack);
	}

	private static void execute(@Nullable Event event, ItemStack itemstack) {
		if (EnchantmentHelper.getItemEnchantmentLevel(RoyalrealmsModEnchantments.BENEDICTION_OF_UNBREAKING.get(), itemstack) != 0) {
			itemstack.setDamageValue(0);
		}
	}
}
