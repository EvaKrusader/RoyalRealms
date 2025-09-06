package net.mcreator.royalrealms.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.royalrealms.network.RoyalrealmsModVariables;

import javax.annotation.Nullable;

import java.net.URL;

import java.io.IOException;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

@Mod.EventBusSubscriber
public class CheckModVersionWhenJoinProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		File file = new File("");
		com.google.gson.JsonObject json = new com.google.gson.JsonObject();
		double nextVersion = 0;
		double currentVersion = 0;
		double nextVersion1 = 0;
		double nextVersion2 = 0;
		double nextVersion3 = 0;
		String url = "";
		String currentModVer = "";
		String playerModVer = "";
		playerModVer = (new java.text.DecimalFormat("#").format((entity.getCapability(RoyalrealmsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RoyalrealmsModVariables.PlayerVariables())).ver1) + ".") + ""
				+ (new java.text.DecimalFormat("#").format((entity.getCapability(RoyalrealmsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RoyalrealmsModVariables.PlayerVariables())).ver2) + ".")
				+ new java.text.DecimalFormat("#").format((entity.getCapability(RoyalrealmsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RoyalrealmsModVariables.PlayerVariables())).ver3);
		file = new File(System.getProperty("java.io.tmpdir"), File.separator + "modver.json");
		url = "https://raw.githubusercontent.com/EvaKrusader/" + "RoyalRealms" + "/master/src/main/modver.json";
		try {
			org.apache.commons.io.FileUtils.copyURLToFile(new URL(url), file, 1000, 1000);
		} catch (IOException e) {
			e.printStackTrace();
		}
		{
			try {
				BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
				StringBuilder jsonstringbuilder = new StringBuilder();
				String line;
				while ((line = bufferedReader.readLine()) != null) {
					jsonstringbuilder.append(line);
				}
				bufferedReader.close();
				json = new com.google.gson.Gson().fromJson(jsonstringbuilder.toString(), com.google.gson.JsonObject.class);
				{
					String _setval = (new java.text.DecimalFormat("#").format(Math.round(json.get("ver1").getAsDouble())) + ".") + "" + (new java.text.DecimalFormat("#").format(Math.round(json.get("ver2").getAsDouble())) + ".")
							+ new java.text.DecimalFormat("#").format(Math.round(json.get("ver3").getAsDouble()));
					entity.getCapability(RoyalrealmsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.nextVersion = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				currentModVer = (new java.text.DecimalFormat("#").format(Math.round(json.get("ver1").getAsDouble())) + ".") + "" + (new java.text.DecimalFormat("#").format(Math.round(json.get("ver2").getAsDouble())) + ".")
						+ new java.text.DecimalFormat("#").format(Math.round(json.get("ver3").getAsDouble()));
				currentVersion = new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(new java.text.DecimalFormat("#").format((entity.getCapability(RoyalrealmsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RoyalrealmsModVariables.PlayerVariables())).ver1) + ""
						+ new java.text.DecimalFormat("#").format((entity.getCapability(RoyalrealmsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RoyalrealmsModVariables.PlayerVariables())).ver2)
						+ new java.text.DecimalFormat("#").format((entity.getCapability(RoyalrealmsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RoyalrealmsModVariables.PlayerVariables())).ver3));
				nextVersion = new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(
						new java.text.DecimalFormat("#").format(json.get("ver1").getAsDouble()) + "" + new java.text.DecimalFormat("#").format(json.get("ver2").getAsDouble()) + new java.text.DecimalFormat("#").format(json.get("ver3").getAsDouble()));
				if (nextVersion > currentVersion) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("This version of the mod is outdated."), false);
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(("You are using the version " + "\u00A7c[" + playerModVer + "]\u00A7f" + " of this mod.")), false);
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(("The version " + "\u00A7a[" + currentModVer + "]\u00A7f" + " of this mod is out!")), false);
				} else if (nextVersion == currentVersion) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(("You are using the right version of this mod! [" + "\u00A7b" + currentModVer + "\u00A7f" + "]")), false);
				} else if (nextVersion < currentVersion) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(("You are somehow using an unreleased version of this mod [\u00A7e" + playerModVer + "\u00A7f" + "]")), false);
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(("The current version of this mod is " + "\u00A7a[" + currentModVer + "]\u00A7f" + ".")), false);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (entity instanceof ServerPlayer _player) {
			Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("royalrealms:royal_realms"));
			AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
			if (!_ap.isDone()) {
				for (String criteria : _ap.getRemainingCriteria())
					_player.getAdvancements().award(_adv, criteria);
			}
		}
	}
}
