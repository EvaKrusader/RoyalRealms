
package net.mcreator.royalrealms.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.royalrealms.init.RoyalrealmsModItems;
import net.mcreator.royalrealms.init.RoyalrealmsModFluids;
import net.mcreator.royalrealms.init.RoyalrealmsModFluidTypes;
import net.mcreator.royalrealms.init.RoyalrealmsModBlocks;

public abstract class CorruptedLiquidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> RoyalrealmsModFluidTypes.CORRUPTED_LIQUID_TYPE.get(), () -> RoyalrealmsModFluids.CORRUPTED_LIQUID.get(),
			() -> RoyalrealmsModFluids.FLOWING_CORRUPTED_LIQUID.get()).explosionResistance(100f).tickRate(1).slopeFindDistance(1).bucket(() -> RoyalrealmsModItems.CORRUPTED_LIQUID_BUCKET.get())
			.block(() -> (LiquidBlock) RoyalrealmsModBlocks.CORRUPTED_LIQUID.get());

	private CorruptedLiquidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends CorruptedLiquidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends CorruptedLiquidFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
