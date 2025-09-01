
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.royalrealms.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.royalrealms.client.model.Modelcursed_skull;
import net.mcreator.royalrealms.client.model.Modelchastity_cage;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class RoyalrealmsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelchastity_cage.LAYER_LOCATION, Modelchastity_cage::createBodyLayer);
		event.registerLayerDefinition(Modelcursed_skull.LAYER_LOCATION, Modelcursed_skull::createBodyLayer);
	}
}
