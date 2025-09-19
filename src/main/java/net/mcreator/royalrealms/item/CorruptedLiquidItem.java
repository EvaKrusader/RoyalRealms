
package net.mcreator.royalrealms.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.royalrealms.init.RoyalrealmsModFluids;

public class CorruptedLiquidItem extends BucketItem {
	public CorruptedLiquidItem() {
		super(RoyalrealmsModFluids.CORRUPTED_LIQUID, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
