
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.royalrealms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.royalrealms.fluid.types.FixHoleFluidType;
import net.mcreator.royalrealms.fluid.types.CorruptedLiquidFluidType;
import net.mcreator.royalrealms.RoyalrealmsMod;

public class RoyalrealmsModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, RoyalrealmsMod.MODID);
	public static final RegistryObject<FluidType> FIX_HOLE_TYPE = REGISTRY.register("fix_hole", () -> new FixHoleFluidType());
	public static final RegistryObject<FluidType> CORRUPTED_LIQUID_TYPE = REGISTRY.register("corrupted_liquid", () -> new CorruptedLiquidFluidType());
}
