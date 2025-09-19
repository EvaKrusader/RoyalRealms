package net.mcreator.royalrealms.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.royalrealms.init.RoyalrealmsModBlocks;
import net.mcreator.royalrealms.RoyalrealmsMod;

import java.util.List;
import java.util.ArrayList;

public class GridworldPlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		List<Object> spawnRandol = new ArrayList<>();
		if (entity instanceof Player _player)
			_player.getInventory().clearContent();
		if (entity instanceof ServerPlayer _player) {
			Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("royalrealms:gridworld_adv"));
			AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
			if (!_ap.isDone()) {
				for (String criteria : _ap.getRemainingCriteria())
					_player.getAdvancements().award(_adv, criteria);
			}
		}
		world.setBlock(new BlockPos(0, 0, 0), RoyalrealmsModBlocks.GRIDSTONE.get().defaultBlockState(), 3);
		RoyalrealmsMod.queueServerWork(100, () -> {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"fill -50 3 -50 50 3 50 royalrealms:gridstone");
		});
		{
			Entity _ent = entity;
			_ent.teleportTo(0, 5, 0);
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(0, 5, 0, _ent.getYRot(), _ent.getXRot());
		}
	}
}
