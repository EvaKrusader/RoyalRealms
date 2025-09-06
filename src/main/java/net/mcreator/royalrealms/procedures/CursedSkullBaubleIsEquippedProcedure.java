package net.mcreator.royalrealms.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;

public class CursedSkullBaubleIsEquippedProcedure {
	public static void execute(ItemStack itemstack) {
		if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BINDING_CURSE, itemstack) != 0)) {
			itemstack.enchant(Enchantments.BINDING_CURSE, 1);
		}
	}
}
