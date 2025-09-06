package net.mcreator.royalrealms.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.royalrealms.init.RoyalrealmsModMobEffects;

public class PhasingOverlayDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(RoyalrealmsModMobEffects.PHASING.get())) {
			return true;
		}
		return false;
	}
}
