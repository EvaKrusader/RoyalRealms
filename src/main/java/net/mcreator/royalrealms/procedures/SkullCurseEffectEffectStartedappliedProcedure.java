package net.mcreator.royalrealms.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.royalrealms.network.RoyalrealmsModVariables;

public class SkullCurseEffectEffectStartedappliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1;
			entity.getCapability(RoyalrealmsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.playerSkullCurse = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
