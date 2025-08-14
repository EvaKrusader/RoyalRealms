package net.mcreator.royalrealms.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.royalrealms.network.RoyalrealmsModVariables;

public class EnderlinkPlaysoundProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		String tipStart = "";
		String enderlinkName = "";
		String stringStart = "";
		double textPicker = 0;
		double SoundItem = 0;
		{
			double _setval = Mth.nextInt(RandomSource.create(), 0, 1000);
			entity.getCapability(RoyalrealmsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.EnderlinkSoundItem = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if ((entity.getCapability(RoyalrealmsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RoyalrealmsModVariables.PlayerVariables())).EnderlinkSoundItem == 0) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("royalrealms:enderlink_msg_rare")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("royalrealms:enderlink_msg_rare")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else if ((entity.getCapability(RoyalrealmsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RoyalrealmsModVariables.PlayerVariables())).EnderlinkSoundItem > 0
				&& (entity.getCapability(RoyalrealmsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RoyalrealmsModVariables.PlayerVariables())).EnderlinkSoundItem < 334) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("royalrealms:enderlink_msg1")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("royalrealms:enderlink_msg1")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else if ((entity.getCapability(RoyalrealmsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RoyalrealmsModVariables.PlayerVariables())).EnderlinkSoundItem > 333
				&& (entity.getCapability(RoyalrealmsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RoyalrealmsModVariables.PlayerVariables())).EnderlinkSoundItem < 667) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("royalrealms:enderlink_msg2")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("royalrealms:enderlink_msg2")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else if ((entity.getCapability(RoyalrealmsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RoyalrealmsModVariables.PlayerVariables())).EnderlinkSoundItem > 666
				&& (entity.getCapability(RoyalrealmsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RoyalrealmsModVariables.PlayerVariables())).EnderlinkSoundItem < 999) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("royalrealms:enderlink_msg3")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("royalrealms:enderlink_msg3")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else if ((entity.getCapability(RoyalrealmsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RoyalrealmsModVariables.PlayerVariables())).EnderlinkSoundItem == 1000) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("royalrealms:enderlink_msg_rare")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("royalrealms:enderlink_msg_rare")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
	}
}
