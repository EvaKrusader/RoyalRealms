
package net.mcreator.royalrealms.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class StarliteDustItem extends Item {
	public StarliteDustItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
