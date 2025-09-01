package net.mcreator.royalrealms.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.royalrealms.network.RoyalrealmsModVariables;

public class HoleSwitchRightclickedProcedure {
	public static void execute(LevelAccessor world) {
		if (RoyalrealmsModVariables.WorldVariables.get(world).fluidSwitch == false) {
			RoyalrealmsModVariables.WorldVariables.get(world).fluidSwitch = true;
			RoyalrealmsModVariables.WorldVariables.get(world).syncData(world);
		} else {
			RoyalrealmsModVariables.WorldVariables.get(world).fluidSwitch = false;
			RoyalrealmsModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}
