package net.mcreator.royalrealms.init;

import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.mcreator.royalrealms.configuration.DateModeConfiguration;
import net.mcreator.royalrealms.RoyalrealmsMod;

@Mod.EventBusSubscriber(modid = RoyalrealmsMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RoyalrealmsModConfigs {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, DateModeConfiguration.SPEC, "royalrealms_config.toml");
		});
	}
}
