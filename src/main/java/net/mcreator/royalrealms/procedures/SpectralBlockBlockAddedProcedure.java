package net.mcreator.royalrealms.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.royalrealms.init.RoyalrealmsModBlocks;
import net.mcreator.royalrealms.RoyalrealmsMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SpectralBlockBlockAddedProcedure {
	@SubscribeEvent
	public static void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))) == (new Object() {
			public BlockState with(BlockState _bs, String _property, int _newValue) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
				return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
			}
		}.with(RoyalrealmsModBlocks.SPECTRAL_BLOCK.get().defaultBlockState(), "blockstate", 0))) {
			RoyalrealmsMod.queueServerWork((int) (5 * 20), () -> {
				world.setBlock(BlockPos.containing(x, y, z), (new Object() {
					public BlockState with(BlockState _bs, String _property, int _newValue) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
						return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
					}
				}.with(RoyalrealmsModBlocks.SPECTRAL_BLOCK.get().defaultBlockState(), "blockstate", 1)), 3);
			});
			RoyalrealmsMod.queueServerWork((int) (10 * 20), () -> {
				world.setBlock(BlockPos.containing(x, y, z), (new Object() {
					public BlockState with(BlockState _bs, String _property, int _newValue) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
						return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
					}
				}.with(RoyalrealmsModBlocks.SPECTRAL_BLOCK.get().defaultBlockState(), "blockstate", 2)), 3);
			});
			RoyalrealmsMod.queueServerWork((int) (15 * 20), () -> {
				world.setBlock(BlockPos.containing(x, y, z), (new Object() {
					public BlockState with(BlockState _bs, String _property, int _newValue) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
						return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
					}
				}.with(RoyalrealmsModBlocks.SPECTRAL_BLOCK.get().defaultBlockState(), "blockstate", 3)), 3);
			});
			RoyalrealmsMod.queueServerWork((int) (20 * 20), () -> {
				world.setBlock(BlockPos.containing(x, y, z), (new Object() {
					public BlockState with(BlockState _bs, String _property, int _newValue) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
						return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
					}
				}.with(RoyalrealmsModBlocks.SPECTRAL_BLOCK.get().defaultBlockState(), "blockstate", 4)), 3);
			});
			RoyalrealmsMod.queueServerWork((int) (25 * 20), () -> {
				world.setBlock(BlockPos.containing(x, y, z), (new Object() {
					public BlockState with(BlockState _bs, String _property, int _newValue) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
						return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
					}
				}.with(RoyalrealmsModBlocks.SPECTRAL_BLOCK.get().defaultBlockState(), "blockstate", 5)), 3);
			});
			RoyalrealmsMod.queueServerWork((int) (30 * 20), () -> {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				{
					int _value = 0;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			});
		}
	}
}
