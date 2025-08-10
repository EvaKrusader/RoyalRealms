
package net.mcreator.royalrealms.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.royalrealms.init.RoyalrealmsModItems;

public class TelosteelHoeItem extends HoeItem {
	public TelosteelHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(RoyalrealmsModItems.TELOSTEEL_INGOT.get()));
			}
		}, 0, -1f, new Item.Properties());
	}
}
