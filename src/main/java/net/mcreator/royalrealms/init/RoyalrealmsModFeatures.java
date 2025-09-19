
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.royalrealms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.royalrealms.world.features.TelosteelOreFeatureFeature;
import net.mcreator.royalrealms.RoyalrealmsMod;

@Mod.EventBusSubscriber
public class RoyalrealmsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, RoyalrealmsMod.MODID);
	public static final RegistryObject<Feature<?>> TELOSTEEL_ORE_FEATURE = REGISTRY.register("telosteel_ore_feature", TelosteelOreFeatureFeature::new);
}
