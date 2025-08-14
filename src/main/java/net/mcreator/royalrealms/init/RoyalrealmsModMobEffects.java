
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.royalrealms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.royalrealms.potion.PhasingMobEffect;
import net.mcreator.royalrealms.RoyalrealmsMod;

public class RoyalrealmsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, RoyalrealmsMod.MODID);
	public static final RegistryObject<MobEffect> PHASING = REGISTRY.register("phasing", () -> new PhasingMobEffect());
}
