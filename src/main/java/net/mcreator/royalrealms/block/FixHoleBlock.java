
package net.mcreator.royalrealms.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.royalrealms.procedures.FixHoleBlockAddedProcedure;
import net.mcreator.royalrealms.init.RoyalrealmsModFluids;

public class FixHoleBlock extends LiquidBlock {
	public FixHoleBlock() {
		super(() -> RoyalrealmsModFluids.FIX_HOLE.get(), BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		FixHoleBlockAddedProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}
