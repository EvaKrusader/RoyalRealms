
package net.mcreator.royalrealms.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.royalrealms.procedures.SkullCurseEffectOnEffectActiveTickProcedure;
import net.mcreator.royalrealms.procedures.SkullCurseEffectEffectStartedappliedProcedure;

public class SkullCurseEffectMobEffect extends MobEffect {
	public SkullCurseEffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -4966667);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		SkullCurseEffectEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		SkullCurseEffectOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
