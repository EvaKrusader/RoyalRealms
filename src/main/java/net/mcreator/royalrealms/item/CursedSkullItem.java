
package net.mcreator.royalrealms.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.royalrealms.procedures.CursedSkullBaubleIsEquippedProcedure;

public class CursedSkullItem extends Item implements ICurioItem {
	public CursedSkullItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		CursedSkullBaubleIsEquippedProcedure.execute(stack);
	}
}
