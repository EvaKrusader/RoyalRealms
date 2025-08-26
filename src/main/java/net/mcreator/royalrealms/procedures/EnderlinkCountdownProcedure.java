package net.mcreator.royalrealms.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.royalrealms.network.RoyalrealmsModVariables;
import net.mcreator.royalrealms.RoyalrealmsMod;

public class EnderlinkCountdownProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		RoyalrealmsMod.queueServerWork((int) (entity.getCapability(RoyalrealmsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RoyalrealmsModVariables.PlayerVariables())).EnderlinkCounter, () -> {
			EnderlinkTalkProcedureProcedure.execute(world, entity);
			EnderlinkTalkListProcedure.execute(entity);
			EnderlinkPlaysoundProcedure.execute();
		});
	}
}
