package net.mcreator.royalrealms.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.royalrealms.init.RoyalrealmsModMobEffects;

public class PhasingOverlayTextProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return new java.text.DecimalFormat("#")
				.format(Math.ceil((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RoyalrealmsModMobEffects.PHASING.get()) ? _livEnt.getEffect(RoyalrealmsModMobEffects.PHASING.get()).getDuration() : 0) / 20) + 1);
	}
}
