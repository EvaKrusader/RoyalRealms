
package net.mcreator.royalrealms.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.royalrealms.procedures.FluoriteNecklaceBaubleIsEquippedProcedure;

public class FluoriteNecklaceItem extends Item implements ICurioItem {
	public FluoriteNecklaceItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) {
		FluoriteNecklaceBaubleIsEquippedProcedure.execute(slotContext.entity(), stack);
	}
}
