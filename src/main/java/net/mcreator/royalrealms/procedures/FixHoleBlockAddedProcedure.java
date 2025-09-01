package net.mcreator.royalrealms.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.royalrealms.network.RoyalrealmsModVariables;
import net.mcreator.royalrealms.init.RoyalrealmsModBlocks;
import net.mcreator.royalrealms.RoyalrealmsMod;

public class FixHoleBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (RoyalrealmsModVariables.WorldVariables.get(world).fluidSwitch == false) {
			RoyalrealmsMod.queueServerWork(30, () -> {
				world.setBlock(BlockPos.containing(x, y, z), RoyalrealmsModBlocks.FIX_HOLE.get().defaultBlockState(), 3);
				RoyalrealmsMod.queueServerWork(30, () -> {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.SAND.defaultBlockState(), 3);
				});
			});
		} else {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
