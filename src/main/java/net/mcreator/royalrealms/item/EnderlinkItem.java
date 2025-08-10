
package net.mcreator.royalrealms.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EnderlinkItem extends Item {
	public EnderlinkItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
	}
}
