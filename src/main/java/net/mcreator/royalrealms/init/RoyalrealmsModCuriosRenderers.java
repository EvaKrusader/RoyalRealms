package net.mcreator.royalrealms.init;

import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;

import net.mcreator.royalrealms.client.renderer.CursedSkullRenderer;
import net.mcreator.royalrealms.client.renderer.ChastityCageGoldRenderer;
import net.mcreator.royalrealms.client.renderer.ChastityCageBlackRenderer;
import net.mcreator.royalrealms.client.model.Modelcursed_skull;
import net.mcreator.royalrealms.client.model.Modelchastity_cage;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RoyalrealmsModCuriosRenderers {
	@SubscribeEvent
	public static void registerLayers(final EntityRenderersEvent.RegisterLayerDefinitions evt) {
		evt.registerLayerDefinition(RoyalrealmsModLayerDefinitions.CURSED_SKULL, Modelcursed_skull::createBodyLayer);
		evt.registerLayerDefinition(RoyalrealmsModLayerDefinitions.CHASTITY_CAGE_BLACK, Modelchastity_cage::createBodyLayer);
		evt.registerLayerDefinition(RoyalrealmsModLayerDefinitions.CHASTITY_CAGE_GOLD, Modelchastity_cage::createBodyLayer);
	}

	@SubscribeEvent
	public static void clientSetup(final FMLClientSetupEvent evt) {
		CuriosRendererRegistry.register(RoyalrealmsModItems.CURSED_SKULL.get(), CursedSkullRenderer::new);
		CuriosRendererRegistry.register(RoyalrealmsModItems.CHASTITY_CAGE_BLACK.get(), ChastityCageBlackRenderer::new);
		CuriosRendererRegistry.register(RoyalrealmsModItems.CHASTITY_CAGE_GOLD.get(), ChastityCageGoldRenderer::new);
	}
}
