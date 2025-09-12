
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.royalrealms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.royalrealms.RoyalrealmsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RoyalrealmsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RoyalrealmsMod.MODID);
	public static final RegistryObject<CreativeModeTab> MUSIC_DISCS = REGISTRY.register("music_discs",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.royalrealms.music_discs")).icon(() -> new ItemStack(RoyalrealmsModItems.MUSIC_DISC_TV_TIME.get())).displayItems((parameters, tabData) -> {
				tabData.accept(RoyalrealmsModItems.MUSIC_DISC_7L_011.get());
				tabData.accept(RoyalrealmsModItems.MUSIC_DISC_CORE.get());
				tabData.accept(RoyalrealmsModItems.MUSIC_DISC_TV_WORLD.get());
				tabData.accept(RoyalrealmsModItems.MUSIC_DISC_GLOWING_SNOW.get());
				tabData.accept(RoyalrealmsModItems.MUSIC_DISC_BLACK_KNIFE.get());
				tabData.accept(RoyalrealmsModItems.MUSIC_DISC_TV_TIME.get());
				tabData.accept(RoyalrealmsModItems.MUSIC_DISC_UWAH_SO_TEMPERATE.get());
				tabData.accept(RoyalrealmsModItems.MUSIC_DISC_HEALING.get());
				tabData.accept(RoyalrealmsModItems.MUSIC_DISC_BORN.get());
				tabData.accept(RoyalrealmsModItems.MUSIC_DISC_WEEVIL.get());
				tabData.accept(RoyalrealmsModItems.MUSIC_DISC_BUTTERFLY.get());
				tabData.accept(RoyalrealmsModItems.MUSIC_DISC_TREEHOPPER.get());
				tabData.accept(RoyalrealmsModItems.MUSIC_DISC_MOTH.get());
				tabData.accept(RoyalrealmsModItems.MUSIC_DISC_ISOPOD.get());
				tabData.accept(RoyalrealmsModItems.MUSIC_DISC_BUMBLEBEE.get());
				tabData.accept(RoyalrealmsModItems.MUSIC_DISC_SCARAB.get());
				tabData.accept(RoyalrealmsModItems.MUSIC_DISC_SPINY_SPIDER.get());
				tabData.accept(RoyalrealmsModItems.MUSIC_DISC_TORTOISE_BEETLE.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(RoyalrealmsModBlocks.TELOSTEEL_BLOCK.get().asItem());
			tabData.accept(RoyalrealmsModBlocks.STARLITE_BLOCK.get().asItem());
			tabData.accept(RoyalrealmsModBlocks.NEONIUM_BLOCK.get().asItem());
			tabData.accept(RoyalrealmsModBlocks.BRIGHTCORE_BLOCK.get().asItem());
			tabData.accept(RoyalrealmsModBlocks.TUNGSTEN_BLOCK.get().asItem());
			tabData.accept(RoyalrealmsModBlocks.RAW_TUNGSTEN_BLOCK.get().asItem());
			tabData.accept(RoyalrealmsModBlocks.FLUORITE_BLOCK.get().asItem());
			tabData.accept(RoyalrealmsModBlocks.OBSIDIAN_GLASS.get().asItem());
			tabData.accept(RoyalrealmsModBlocks.SPECTRAL_BLOCK.get().asItem());
			tabData.accept(RoyalrealmsModBlocks.VANTABLACK.get().asItem());
			tabData.accept(RoyalrealmsModBlocks.RAINBOW.get().asItem());
			tabData.accept(RoyalrealmsModBlocks.BIRYLLIUM_ORE.get().asItem());
			tabData.accept(RoyalrealmsModBlocks.BIRYLLIUM_BLOCK.get().asItem());
			tabData.accept(RoyalrealmsModBlocks.BIRYLLIUM_BLOCK_REFINED.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(RoyalrealmsModItems.HOLE_SWITCH.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(RoyalrealmsModItems.TELOSTEEL_SWORD.get());
			tabData.accept(RoyalrealmsModItems.TELOSTEEL_ARMOR_HELMET.get());
			tabData.accept(RoyalrealmsModItems.TELOSTEEL_ARMOR_CHESTPLATE.get());
			tabData.accept(RoyalrealmsModItems.TELOSTEEL_ARMOR_LEGGINGS.get());
			tabData.accept(RoyalrealmsModItems.TELOSTEEL_ARMOR_BOOTS.get());
			tabData.accept(RoyalrealmsModItems.WATER_ARMOR_HELMET.get());
			tabData.accept(RoyalrealmsModItems.WATER_ARMOR_CHESTPLATE.get());
			tabData.accept(RoyalrealmsModItems.WATER_ARMOR_LEGGINGS.get());
			tabData.accept(RoyalrealmsModItems.WATER_ARMOR_BOOTS.get());
			tabData.accept(RoyalrealmsModItems.BIRYLLIUM_ARMOR_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(RoyalrealmsModItems.EXPERIENCE_AMULET.get());
			tabData.accept(RoyalrealmsModItems.FLUORITE_NECKLACE.get());
			tabData.accept(RoyalrealmsModItems.CURSED_SKULL.get());
			tabData.accept(RoyalrealmsModItems.FALL_BREAKER_CHARM.get());
			tabData.accept(RoyalrealmsModItems.CHASTITY_CAGE_BLACK.get());
			tabData.accept(RoyalrealmsModItems.CHASTITY_CAGE_GOLD.get());
			tabData.accept(RoyalrealmsModItems.ESOTERIC_KNOWLEDGE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(RoyalrealmsModItems.TELOSTEEL_INGOT.get());
			tabData.accept(RoyalrealmsModItems.STARLITE_DUST.get());
			tabData.accept(RoyalrealmsModItems.NEONIUM.get());
			tabData.accept(RoyalrealmsModItems.FIX_HOLE_BUCKET.get());
			tabData.accept(RoyalrealmsModItems.BRIGHTCORE.get());
			tabData.accept(RoyalrealmsModItems.LUST_TRIM_ITEM.get());
			tabData.accept(RoyalrealmsModItems.WEIRD_TRIM_ITEM.get());
			tabData.accept(RoyalrealmsModItems.TUNGSTEN.get());
			tabData.accept(RoyalrealmsModItems.RAW_TUNGSTEN.get());
			tabData.accept(RoyalrealmsModItems.FLUORITE.get());
			tabData.accept(RoyalrealmsModItems.BIRYLLIUM.get());
			tabData.accept(RoyalrealmsModItems.BIRYLLIUM_REFINED.get());
			tabData.accept(RoyalrealmsModItems.LORE_ITEM.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(RoyalrealmsModBlocks.TELOSTEEL_ORE.get().asItem());
			tabData.accept(RoyalrealmsModBlocks.STARLITE_ORE.get().asItem());
			tabData.accept(RoyalrealmsModBlocks.NEONIUM_ORE.get().asItem());
			tabData.accept(RoyalrealmsModBlocks.BRIGHTCORE_ORE.get().asItem());
			tabData.accept(RoyalrealmsModBlocks.TUNGSTEN_ORE.get().asItem());
			tabData.accept(RoyalrealmsModBlocks.FLUORITE_ORE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(RoyalrealmsModItems.TELOSTEEL_PICKAXE.get());
			tabData.accept(RoyalrealmsModItems.TELOSTEEL_AXE.get());
			tabData.accept(RoyalrealmsModItems.TELOSTEEL_SHOVEL.get());
			tabData.accept(RoyalrealmsModItems.TELOSTEEL_HOE.get());
			tabData.accept(RoyalrealmsModItems.MUSIC_DISC_7L_011.get());
			tabData.accept(RoyalrealmsModItems.MUSIC_DISC_CORE.get());
			tabData.accept(RoyalrealmsModItems.MUSIC_DISC_TV_WORLD.get());
			tabData.accept(RoyalrealmsModItems.MUSIC_DISC_GLOWING_SNOW.get());
			tabData.accept(RoyalrealmsModItems.MUSIC_DISC_BLACK_KNIFE.get());
			tabData.accept(RoyalrealmsModItems.MUSIC_DISC_TV_TIME.get());
			tabData.accept(RoyalrealmsModItems.MUSIC_DISC_UWAH_SO_TEMPERATE.get());
			tabData.accept(RoyalrealmsModItems.WISHING_STAR.get());
			tabData.accept(RoyalrealmsModItems.PLAYER_ITEM.get());
			tabData.accept(RoyalrealmsModItems.BLACK_KNIFE.get());
			tabData.accept(RoyalrealmsModItems.LOBOTOMIZER.get());
			tabData.accept(RoyalrealmsModItems.BIRYLLIUM_AXE.get());
			tabData.accept(RoyalrealmsModItems.MUSIC_DISC_HEALING.get());
			tabData.accept(RoyalrealmsModItems.MUSIC_DISC_BORN.get());
			tabData.accept(RoyalrealmsModItems.MUSIC_DISC_WEEVIL.get());
			tabData.accept(RoyalrealmsModItems.MUSIC_DISC_BUTTERFLY.get());
			tabData.accept(RoyalrealmsModItems.MUSIC_DISC_TREEHOPPER.get());
			tabData.accept(RoyalrealmsModItems.MUSIC_DISC_MOTH.get());
			tabData.accept(RoyalrealmsModItems.MUSIC_DISC_ISOPOD.get());
			tabData.accept(RoyalrealmsModItems.MUSIC_DISC_BUMBLEBEE.get());
			tabData.accept(RoyalrealmsModItems.MUSIC_DISC_SCARAB.get());
			tabData.accept(RoyalrealmsModItems.MUSIC_DISC_SPINY_SPIDER.get());
			tabData.accept(RoyalrealmsModItems.MUSIC_DISC_TORTOISE_BEETLE.get());
			tabData.accept(RoyalrealmsModItems.LORE_ITEM.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(RoyalrealmsModItems.PHASING_CAN.get());
		}
	}
}
