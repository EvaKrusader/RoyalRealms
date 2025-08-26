
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

public abstract class FixHoleFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> RoyalrealmsModFluidTypes.FIX_HOLE_TYPE.get(), () -> RoyalrealmsModFluids.FIX_HOLE.get(), () -> RoyalrealmsModFluids.FLOWING_FIX_HOLE.get())
			.explosionResistance(100f).slopeFindDistance(1).bucket(() -> RoyalrealmsModItems.FIX_HOLE_BUCKET.get()).block(() -> (LiquidBlock) RoyalrealmsModBlocks.FIX_HOLE.get());

	private FixHoleFluid() {
		super(PROPERTIES);
	}

	public static class Source extends FixHoleFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends FixHoleFluid {
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
