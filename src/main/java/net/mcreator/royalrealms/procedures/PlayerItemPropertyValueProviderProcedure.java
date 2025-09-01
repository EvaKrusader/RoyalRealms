package net.mcreator.royalrealms.procedures;

import net.minecraft.world.item.ItemStack;

public class PlayerItemPropertyValueProviderProcedure {
	public static double execute(ItemStack itemstack) {
		double devNum = 0;
		if ((itemstack.getOrCreateTag().getString("playerScent")).equals("EvaKrusader")) {
			return 4;
		} else if ((itemstack.getOrCreateTag().getString("playerScent")).equals("BreadFiend226")) {
			return 3;
		} else if ((itemstack.getOrCreateTag().getString("playerScent")).equals("ItzLinkstar_")) {
			return 2;
		} else if ((itemstack.getOrCreateTag().getString("playerScent")).equals("subsonic3947")) {
			return 1;
		}
		return 0;
	}
}
