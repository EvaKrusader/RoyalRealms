
package net.mcreator.royalrealms.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ChastityCageBlackItem extends Item implements ICurioItem {
	public ChastityCageBlackItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
