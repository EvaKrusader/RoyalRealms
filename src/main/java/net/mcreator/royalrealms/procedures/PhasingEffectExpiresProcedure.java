package net.mcreator.royalrealms.procedures;

import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

public class PhasingEffectExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getPersistentData().getString("prePhaseGM")).equals("survival")) {
			if (entity instanceof ServerPlayer _player)
				_player.setGameMode(GameType.SURVIVAL);
		} else if ((entity.getPersistentData().getString("prePhaseGM")).equals("creative")) {
			if (entity instanceof ServerPlayer _player)
				_player.setGameMode(GameType.CREATIVE);
		} else if ((entity.getPersistentData().getString("prePhaseGM")).equals("adventure")) {
			if (entity instanceof ServerPlayer _player)
				_player.setGameMode(GameType.ADVENTURE);
		}
	}
}
