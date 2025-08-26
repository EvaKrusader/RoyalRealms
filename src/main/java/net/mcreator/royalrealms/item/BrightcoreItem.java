
package net.mcreator.royalrealms.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BrightcoreItem extends Item {
	public BrightcoreItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
