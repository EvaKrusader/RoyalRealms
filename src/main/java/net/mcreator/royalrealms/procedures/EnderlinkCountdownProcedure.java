package net.mcreator.royalrealms.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.royalrealms.network.RoyalrealmsModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EnderlinkCountdownProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static String execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		return execute(null, world, x, y, z, entity);
	}

	private static String execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return "";
		{
			double _setval = (entity.getCapability(RoyalrealmsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RoyalrealmsModVariables.PlayerVariables())).EnderlinkCounter - 1;
			entity.getCapability(RoyalrealmsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.EnderlinkCounter = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if ((entity.getCapability(RoyalrealmsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RoyalrealmsModVariables.PlayerVariables())).EnderlinkCounter == 0) {
			EnderlinkTalkProcedureProcedure.execute(world, x, y, z, entity);
			EnderlinkTalkListProcedure.execute(entity);
			EnderlinkPlaysoundProcedure.execute(world, x, y, z, entity);
		}
		return new java.text.DecimalFormat("##").format((entity.getCapability(RoyalrealmsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RoyalrealmsModVariables.PlayerVariables())).EnderlinkCounter);
	}
}
