package net.mcreator.royalrealms.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.royalrealms.network.RoyalrealmsModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EnderlinkTalkProcedureProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double timer = 0;
		{
			double _setval = 1 * 60 * 20;
			entity.getCapability(RoyalrealmsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.EnderlinkCounter = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = Mth.nextInt(RandomSource.create(), 0, 1000);
			entity.getCapability(RoyalrealmsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.EnderlinkStartupSound = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		EnderlinkStartupSoundProcedure.execute(world, x, y, z, entity);
	}
}
