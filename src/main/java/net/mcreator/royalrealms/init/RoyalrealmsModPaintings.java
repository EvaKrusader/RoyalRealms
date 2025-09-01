
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.royalrealms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.royalrealms.RoyalrealmsMod;

public class RoyalrealmsModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, RoyalrealmsMod.MODID);
	public static final RegistryObject<PaintingVariant> LACTOSE = REGISTRY.register("lactose", () -> new PaintingVariant(48, 64));
	public static final RegistryObject<PaintingVariant> LEXACTOSE = REGISTRY.register("lexactose", () -> new PaintingVariant(48, 64));
	public static final RegistryObject<PaintingVariant> NEFARIOUS = REGISTRY.register("nefarious", () -> new PaintingVariant(32, 32));
	public static final RegistryObject<PaintingVariant> JINX = REGISTRY.register("jinx", () -> new PaintingVariant(16, 32));
	public static final RegistryObject<PaintingVariant> EVA_FREAKY_LINK = REGISTRY.register("eva_freaky_link", () -> new PaintingVariant(64, 48));
	public static final RegistryObject<PaintingVariant> EVA_FREAKY_BREAD = REGISTRY.register("eva_freaky_bread", () -> new PaintingVariant(64, 48));
}
