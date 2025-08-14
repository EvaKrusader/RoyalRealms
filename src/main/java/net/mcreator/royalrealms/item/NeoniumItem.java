
package net.mcreator.royalrealms.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NeoniumItem extends Item {
	public NeoniumItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
