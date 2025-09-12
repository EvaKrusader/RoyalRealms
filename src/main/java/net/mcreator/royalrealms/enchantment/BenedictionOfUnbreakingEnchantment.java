
package net.mcreator.royalrealms.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;

public class BenedictionOfUnbreakingEnchantment extends Enchantment {
	public BenedictionOfUnbreakingEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.BREAKABLE, slots);
	}

	@Override
	public boolean isTreasureOnly() {
		return true;
	}
}
