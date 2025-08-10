
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.royalrealms.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.royalrealms.RoyalrealmsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RoyalrealmsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RoyalrealmsMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(RoyalrealmsModBlocks.TELOSTEEL_ORE.get().asItem());
			tabData.accept(RoyalrealmsModBlocks.TELOSTEEL_BLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(RoyalrealmsModItems.TELOSTEEL_SWORD.get());
			tabData.accept(RoyalrealmsModItems.TELOSTEEL_ARMOR_HELMET.get());
			tabData.accept(RoyalrealmsModItems.TELOSTEEL_ARMOR_CHESTPLATE.get());
			tabData.accept(RoyalrealmsModItems.TELOSTEEL_ARMOR_LEGGINGS.get());
			tabData.accept(RoyalrealmsModItems.TELOSTEEL_ARMOR_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(RoyalrealmsModItems.TELOSTEEL_INGOT.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(RoyalrealmsModItems.TELOSTEEL_PICKAXE.get());
			tabData.accept(RoyalrealmsModItems.TELOSTEEL_AXE.get());
			tabData.accept(RoyalrealmsModItems.TELOSTEEL_SHOVEL.get());
			tabData.accept(RoyalrealmsModItems.TELOSTEEL_HOE.get());
		}
	}
}
