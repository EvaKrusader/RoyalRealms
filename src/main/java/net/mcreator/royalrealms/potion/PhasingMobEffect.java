
package net.mcreator.royalrealms.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.royalrealms.procedures.PhasingEffectStartedappliedProcedure;
import net.mcreator.royalrealms.procedures.PhasingEffectExpiresProcedure;

public class PhasingMobEffect extends MobEffect {
	public PhasingMobEffect() {
		super(MobEffectCategory.NEUTRAL, -6684673);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		PhasingEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		PhasingEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
