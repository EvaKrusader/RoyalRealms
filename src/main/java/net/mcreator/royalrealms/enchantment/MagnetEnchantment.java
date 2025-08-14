
package net.mcreator.royalrealms.enchantment;

import net.minecraftforge.common.crafting.CompoundIngredient;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

public class MagnetEnchantment extends Enchantment {
	public MagnetEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.RARE, EnchantmentCategory.BREAKABLE, slots);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack itemstack) {
		return CompoundIngredient.of(Ingredient.of(ItemTags.create(new ResourceLocation("minecraft:pickaxes"))), Ingredient.of(ItemTags.create(new ResourceLocation("minecraft:axes"))),
				Ingredient.of(ItemTags.create(new ResourceLocation("minecraft:hoes"))), Ingredient.of(ItemTags.create(new ResourceLocation("minecraft:shovels")))).test(itemstack);
	}
}
