
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.royalrealms.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.royalrealms.network.SparkleMessage;
import net.mcreator.royalrealms.network.GamemodeSwitcherMessage;
import net.mcreator.royalrealms.RoyalrealmsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class RoyalrealmsModKeyMappings {
	public static final KeyMapping GAMEMODE_SWITCHER = new KeyMapping("key.royalrealms.gamemode_switcher", GLFW.GLFW_KEY_UNKNOWN, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				RoyalrealmsMod.PACKET_HANDLER.sendToServer(new GamemodeSwitcherMessage(0, 0));
				GamemodeSwitcherMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SPARKLE = new KeyMapping("key.royalrealms.sparkle", GLFW.GLFW_KEY_UNKNOWN, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				RoyalrealmsMod.PACKET_HANDLER.sendToServer(new SparkleMessage(0, 0));
				SparkleMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(GAMEMODE_SWITCHER);
		event.register(SPARKLE);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				GAMEMODE_SWITCHER.consumeClick();
				SPARKLE.consumeClick();
			}
		}
	}
}
