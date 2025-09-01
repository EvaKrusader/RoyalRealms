package net.mcreator.royalrealms.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.royalrealms.network.RoyalrealmsModVariables;

public class ReturnSkullProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Skull Curse : " + new java.text.DecimalFormat("##").format((entity.getCapability(RoyalrealmsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RoyalrealmsModVariables.PlayerVariables())).playerSkullCurse);
	}
}
