
package net.mcreator.royalrealms.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.royalrealms.init.RoyalrealmsModItems;

public class BirylliumAxeItem extends AxeItem {
	public BirylliumAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 80;
			}

			public float getSpeed() {
				return 15f;
			}

			public float getAttackDamageBonus() {
				return -1f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 25;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(RoyalrealmsModItems.BIRYLLIUM.get()));
			}
		}, 1, -3.25f, new Item.Properties());
	}
}
