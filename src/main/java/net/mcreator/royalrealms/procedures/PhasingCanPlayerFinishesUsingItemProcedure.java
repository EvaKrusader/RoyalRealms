package net.mcreator.royalrealms.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.royalrealms.init.RoyalrealmsModMobEffects;

public class PhasingCanPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(RoyalrealmsModMobEffects.PHASING.get(), (int) (Mth.nextInt(RandomSource.create(), 2, 5) * 20 + 20), 0, false, false));
	}
}
