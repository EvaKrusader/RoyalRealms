
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.royalrealms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.royalrealms.fluid.FixHoleFluid;
import net.mcreator.royalrealms.fluid.CorruptedLiquidFluid;
import net.mcreator.royalrealms.RoyalrealmsMod;

public class RoyalrealmsModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, RoyalrealmsMod.MODID);
	public static final RegistryObject<FlowingFluid> FIX_HOLE = REGISTRY.register("fix_hole", () -> new FixHoleFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_FIX_HOLE = REGISTRY.register("flowing_fix_hole", () -> new FixHoleFluid.Flowing());
	public static final RegistryObject<FlowingFluid> CORRUPTED_LIQUID = REGISTRY.register("corrupted_liquid", () -> new CorruptedLiquidFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_CORRUPTED_LIQUID = REGISTRY.register("flowing_corrupted_liquid", () -> new CorruptedLiquidFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(FIX_HOLE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_FIX_HOLE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(CORRUPTED_LIQUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_CORRUPTED_LIQUID.get(), RenderType.translucent());
		}
	}
}
