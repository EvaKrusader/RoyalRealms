
package net.mcreator.royalrealms.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.royalrealms.procedures.ShadowCloakWhileBaubleIsEquippedTickProcedure;

public class ShadowCloakItem extends Item implements ICurioItem {
	public ShadowCloakItem() {
		super(new Item.Properties().durability(50).rarity(Rarity.COMMON));
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) {
		ShadowCloakWhileBaubleIsEquippedTickProcedure.execute(slotContext.entity().level(), slotContext.entity().getX(), slotContext.entity().getY(), slotContext.entity().getZ(), slotContext.entity(), stack);
	}
}
