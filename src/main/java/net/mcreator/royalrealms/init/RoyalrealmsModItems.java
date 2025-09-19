
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.royalrealms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.item.ItemProperties;

import net.mcreator.royalrealms.procedures.PlayerItemPropertyValueProviderProcedure;
import net.mcreator.royalrealms.item.WishingStarItem;
import net.mcreator.royalrealms.item.WeirdTrimItemItem;
import net.mcreator.royalrealms.item.WaterArmorItem;
import net.mcreator.royalrealms.item.TungstenItem;
import net.mcreator.royalrealms.item.TelosteelSwordItem;
import net.mcreator.royalrealms.item.TelosteelShovelItem;
import net.mcreator.royalrealms.item.TelosteelPickaxeItem;
import net.mcreator.royalrealms.item.TelosteelIngotItem;
import net.mcreator.royalrealms.item.TelosteelHoeItem;
import net.mcreator.royalrealms.item.TelosteelAxeItem;
import net.mcreator.royalrealms.item.TelosteelArmorItem;
import net.mcreator.royalrealms.item.StarliteDustItem;
import net.mcreator.royalrealms.item.ShadowCloakItem;
import net.mcreator.royalrealms.item.RawTungstenItem;
import net.mcreator.royalrealms.item.PlayerItemItem;
import net.mcreator.royalrealms.item.PhasingCanItem;
import net.mcreator.royalrealms.item.PaperCopyPatentItem;
import net.mcreator.royalrealms.item.NeoniumItem;
import net.mcreator.royalrealms.item.MusicDiscWeevilItem;
import net.mcreator.royalrealms.item.MusicDiscUwahSoTemperateItem;
import net.mcreator.royalrealms.item.MusicDiscTvWorldItem;
import net.mcreator.royalrealms.item.MusicDiscTvTimeItem;
import net.mcreator.royalrealms.item.MusicDiscTreehopperItem;
import net.mcreator.royalrealms.item.MusicDiscTortoiseBeetleItem;
import net.mcreator.royalrealms.item.MusicDiscSpinySpiderItem;
import net.mcreator.royalrealms.item.MusicDiscScarabItem;
import net.mcreator.royalrealms.item.MusicDiscMothItem;
import net.mcreator.royalrealms.item.MusicDiscIsopodItem;
import net.mcreator.royalrealms.item.MusicDiscHealingItem;
import net.mcreator.royalrealms.item.MusicDiscGlowingSnowItem;
import net.mcreator.royalrealms.item.MusicDiscCOREItem;
import net.mcreator.royalrealms.item.MusicDiscButterflyItem;
import net.mcreator.royalrealms.item.MusicDiscBumblebeeItem;
import net.mcreator.royalrealms.item.MusicDiscBornItem;
import net.mcreator.royalrealms.item.MusicDiscBlackKnifeItem;
import net.mcreator.royalrealms.item.MusicDisc7l011Item;
import net.mcreator.royalrealms.item.LustTrimItemItem;
import net.mcreator.royalrealms.item.LoreItemItem;
import net.mcreator.royalrealms.item.LobotomizerItem;
import net.mcreator.royalrealms.item.InvisibleInkItem;
import net.mcreator.royalrealms.item.HoleSwitchItem;
import net.mcreator.royalrealms.item.GridworldItem;
import net.mcreator.royalrealms.item.FluoriteNecklaceItem;
import net.mcreator.royalrealms.item.FluoriteItem;
import net.mcreator.royalrealms.item.FixHoleItem;
import net.mcreator.royalrealms.item.FallBreakerCharmItem;
import net.mcreator.royalrealms.item.ExperienceAmuletItem;
import net.mcreator.royalrealms.item.EnderlinkItem;
import net.mcreator.royalrealms.item.CursedSkullItem;
import net.mcreator.royalrealms.item.CorruptedLiquidItem;
import net.mcreator.royalrealms.item.CorruptedBladeItem;
import net.mcreator.royalrealms.item.ChastityCageGoldItem;
import net.mcreator.royalrealms.item.ChastityCageBlackItem;
import net.mcreator.royalrealms.item.ByrilliumPureItem;
import net.mcreator.royalrealms.item.BrightcoreItem;
import net.mcreator.royalrealms.item.BlackKnifeItem;
import net.mcreator.royalrealms.item.BirylliumItem;
import net.mcreator.royalrealms.item.BirylliumAxeItem;
import net.mcreator.royalrealms.item.BirylliumArmorItem;
import net.mcreator.royalrealms.item.AngelShotItem;
import net.mcreator.royalrealms.RoyalrealmsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RoyalrealmsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RoyalrealmsMod.MODID);
	public static final RegistryObject<Item> TELOSTEEL_INGOT = REGISTRY.register("telosteel_ingot", () -> new TelosteelIngotItem());
	public static final RegistryObject<Item> TELOSTEEL_ORE = block(RoyalrealmsModBlocks.TELOSTEEL_ORE);
	public static final RegistryObject<Item> TELOSTEEL_BLOCK = block(RoyalrealmsModBlocks.TELOSTEEL_BLOCK);
	public static final RegistryObject<Item> TELOSTEEL_PICKAXE = REGISTRY.register("telosteel_pickaxe", () -> new TelosteelPickaxeItem());
	public static final RegistryObject<Item> TELOSTEEL_AXE = REGISTRY.register("telosteel_axe", () -> new TelosteelAxeItem());
	public static final RegistryObject<Item> TELOSTEEL_SWORD = REGISTRY.register("telosteel_sword", () -> new TelosteelSwordItem());
	public static final RegistryObject<Item> TELOSTEEL_SHOVEL = REGISTRY.register("telosteel_shovel", () -> new TelosteelShovelItem());
	public static final RegistryObject<Item> TELOSTEEL_HOE = REGISTRY.register("telosteel_hoe", () -> new TelosteelHoeItem());
	public static final RegistryObject<Item> TELOSTEEL_ARMOR_HELMET = REGISTRY.register("telosteel_armor_helmet", () -> new TelosteelArmorItem.Helmet());
	public static final RegistryObject<Item> TELOSTEEL_ARMOR_CHESTPLATE = REGISTRY.register("telosteel_armor_chestplate", () -> new TelosteelArmorItem.Chestplate());
	public static final RegistryObject<Item> TELOSTEEL_ARMOR_LEGGINGS = REGISTRY.register("telosteel_armor_leggings", () -> new TelosteelArmorItem.Leggings());
	public static final RegistryObject<Item> TELOSTEEL_ARMOR_BOOTS = REGISTRY.register("telosteel_armor_boots", () -> new TelosteelArmorItem.Boots());
	public static final RegistryObject<Item> ENDERLINK = REGISTRY.register("enderlink", () -> new EnderlinkItem());
	public static final RegistryObject<Item> STARLITE_DUST = REGISTRY.register("starlite_dust", () -> new StarliteDustItem());
	public static final RegistryObject<Item> STARLITE_ORE = block(RoyalrealmsModBlocks.STARLITE_ORE);
	public static final RegistryObject<Item> STARLITE_BLOCK = block(RoyalrealmsModBlocks.STARLITE_BLOCK);
	public static final RegistryObject<Item> NEONIUM = REGISTRY.register("neonium", () -> new NeoniumItem());
	public static final RegistryObject<Item> NEONIUM_ORE = block(RoyalrealmsModBlocks.NEONIUM_ORE);
	public static final RegistryObject<Item> NEONIUM_BLOCK = block(RoyalrealmsModBlocks.NEONIUM_BLOCK);
	public static final RegistryObject<Item> PHASING_CAN = REGISTRY.register("phasing_can", () -> new PhasingCanItem());
	public static final RegistryObject<Item> PAPER_COPY_PATENT = REGISTRY.register("paper_copy_patent", () -> new PaperCopyPatentItem());
	public static final RegistryObject<Item> FIX_HOLE_BUCKET = REGISTRY.register("fix_hole_bucket", () -> new FixHoleItem());
	public static final RegistryObject<Item> BRIGHTCORE = REGISTRY.register("brightcore", () -> new BrightcoreItem());
	public static final RegistryObject<Item> BRIGHTCORE_ORE = block(RoyalrealmsModBlocks.BRIGHTCORE_ORE);
	public static final RegistryObject<Item> BRIGHTCORE_BLOCK = block(RoyalrealmsModBlocks.BRIGHTCORE_BLOCK);
	public static final RegistryObject<Item> LUST_TRIM_ITEM = REGISTRY.register("lust_trim_item", () -> new LustTrimItemItem());
	public static final RegistryObject<Item> MUSIC_DISC_7L_011 = REGISTRY.register("music_disc_7l_011", () -> new MusicDisc7l011Item());
	public static final RegistryObject<Item> EXPERIENCE_AMULET = REGISTRY.register("experience_amulet", () -> new ExperienceAmuletItem());
	public static final RegistryObject<Item> WEIRD_TRIM_ITEM = REGISTRY.register("weird_trim_item", () -> new WeirdTrimItemItem());
	public static final RegistryObject<Item> TUNGSTEN = REGISTRY.register("tungsten", () -> new TungstenItem());
	public static final RegistryObject<Item> TUNGSTEN_ORE = block(RoyalrealmsModBlocks.TUNGSTEN_ORE);
	public static final RegistryObject<Item> TUNGSTEN_BLOCK = block(RoyalrealmsModBlocks.TUNGSTEN_BLOCK);
	public static final RegistryObject<Item> RAW_TUNGSTEN = REGISTRY.register("raw_tungsten", () -> new RawTungstenItem());
	public static final RegistryObject<Item> RAW_TUNGSTEN_BLOCK = block(RoyalrealmsModBlocks.RAW_TUNGSTEN_BLOCK);
	public static final RegistryObject<Item> FLUORITE_NECKLACE = REGISTRY.register("fluorite_necklace", () -> new FluoriteNecklaceItem());
	public static final RegistryObject<Item> CURSED_SKULL = REGISTRY.register("cursed_skull", () -> new CursedSkullItem());
	public static final RegistryObject<Item> MUSIC_DISC_CORE = REGISTRY.register("music_disc_core", () -> new MusicDiscCOREItem());
	public static final RegistryObject<Item> MUSIC_DISC_TV_WORLD = REGISTRY.register("music_disc_tv_world", () -> new MusicDiscTvWorldItem());
	public static final RegistryObject<Item> MUSIC_DISC_GLOWING_SNOW = REGISTRY.register("music_disc_glowing_snow", () -> new MusicDiscGlowingSnowItem());
	public static final RegistryObject<Item> MUSIC_DISC_BLACK_KNIFE = REGISTRY.register("music_disc_black_knife", () -> new MusicDiscBlackKnifeItem());
	public static final RegistryObject<Item> MUSIC_DISC_TV_TIME = REGISTRY.register("music_disc_tv_time", () -> new MusicDiscTvTimeItem());
	public static final RegistryObject<Item> MUSIC_DISC_UWAH_SO_TEMPERATE = REGISTRY.register("music_disc_uwah_so_temperate", () -> new MusicDiscUwahSoTemperateItem());
	public static final RegistryObject<Item> FLUORITE = REGISTRY.register("fluorite", () -> new FluoriteItem());
	public static final RegistryObject<Item> FLUORITE_ORE = block(RoyalrealmsModBlocks.FLUORITE_ORE);
	public static final RegistryObject<Item> FLUORITE_BLOCK = block(RoyalrealmsModBlocks.FLUORITE_BLOCK);
	public static final RegistryObject<Item> FALL_BREAKER_CHARM = REGISTRY.register("fall_breaker_charm", () -> new FallBreakerCharmItem());
	public static final RegistryObject<Item> WATER_ARMOR_HELMET = REGISTRY.register("water_armor_helmet", () -> new WaterArmorItem.Helmet());
	public static final RegistryObject<Item> WATER_ARMOR_CHESTPLATE = REGISTRY.register("water_armor_chestplate", () -> new WaterArmorItem.Chestplate());
	public static final RegistryObject<Item> WATER_ARMOR_LEGGINGS = REGISTRY.register("water_armor_leggings", () -> new WaterArmorItem.Leggings());
	public static final RegistryObject<Item> WATER_ARMOR_BOOTS = REGISTRY.register("water_armor_boots", () -> new WaterArmorItem.Boots());
	public static final RegistryObject<Item> WISHING_STAR = REGISTRY.register("wishing_star", () -> new WishingStarItem());
	public static final RegistryObject<Item> PLAYER_ITEM = REGISTRY.register("player_item", () -> new PlayerItemItem());
	public static final RegistryObject<Item> CHASTITY_CAGE_BLACK = REGISTRY.register("chastity_cage_black", () -> new ChastityCageBlackItem());
	public static final RegistryObject<Item> CHASTITY_CAGE_GOLD = REGISTRY.register("chastity_cage_gold", () -> new ChastityCageGoldItem());
	public static final RegistryObject<Item> HOLE_SWITCH = REGISTRY.register("hole_switch", () -> new HoleSwitchItem());
	public static final RegistryObject<Item> BLACK_KNIFE = REGISTRY.register("black_knife", () -> new BlackKnifeItem());
	public static final RegistryObject<Item> OBSIDIAN_GLASS = block(RoyalrealmsModBlocks.OBSIDIAN_GLASS);
	public static final RegistryObject<Item> SPECTRAL_BLOCK = block(RoyalrealmsModBlocks.SPECTRAL_BLOCK);
	public static final RegistryObject<Item> VANTABLACK = block(RoyalrealmsModBlocks.VANTABLACK);
	public static final RegistryObject<Item> RAINBOW = block(RoyalrealmsModBlocks.RAINBOW);
	public static final RegistryObject<Item> LOBOTOMIZER = REGISTRY.register("lobotomizer", () -> new LobotomizerItem());
	public static final RegistryObject<Item> ANGEL_SHOT = REGISTRY.register("angel_shot", () -> new AngelShotItem());
	public static final RegistryObject<Item> BIRYLLIUM = REGISTRY.register("biryllium", () -> new BirylliumItem());
	public static final RegistryObject<Item> BIRYLLIUM_ORE = block(RoyalrealmsModBlocks.BIRYLLIUM_ORE);
	public static final RegistryObject<Item> BIRYLLIUM_BLOCK = block(RoyalrealmsModBlocks.BIRYLLIUM_BLOCK);
	public static final RegistryObject<Item> BIRYLLIUM_AXE = REGISTRY.register("biryllium_axe", () -> new BirylliumAxeItem());
	public static final RegistryObject<Item> BIRYLLIUM_ARMOR_BOOTS = REGISTRY.register("biryllium_armor_boots", () -> new BirylliumArmorItem.Boots());
	public static final RegistryObject<Item> BIRYLLIUM_REFINED = REGISTRY.register("biryllium_refined", () -> new ByrilliumPureItem());
	public static final RegistryObject<Item> BIRYLLIUM_BLOCK_REFINED = block(RoyalrealmsModBlocks.BIRYLLIUM_BLOCK_REFINED);
	public static final RegistryObject<Item> MUSIC_DISC_HEALING = REGISTRY.register("music_disc_healing", () -> new MusicDiscHealingItem());
	public static final RegistryObject<Item> MUSIC_DISC_BORN = REGISTRY.register("music_disc_born", () -> new MusicDiscBornItem());
	public static final RegistryObject<Item> MUSIC_DISC_WEEVIL = REGISTRY.register("music_disc_weevil", () -> new MusicDiscWeevilItem());
	public static final RegistryObject<Item> MUSIC_DISC_BUTTERFLY = REGISTRY.register("music_disc_butterfly", () -> new MusicDiscButterflyItem());
	public static final RegistryObject<Item> MUSIC_DISC_TREEHOPPER = REGISTRY.register("music_disc_treehopper", () -> new MusicDiscTreehopperItem());
	public static final RegistryObject<Item> MUSIC_DISC_MOTH = REGISTRY.register("music_disc_moth", () -> new MusicDiscMothItem());
	public static final RegistryObject<Item> MUSIC_DISC_ISOPOD = REGISTRY.register("music_disc_isopod", () -> new MusicDiscIsopodItem());
	public static final RegistryObject<Item> MUSIC_DISC_BUMBLEBEE = REGISTRY.register("music_disc_bumblebee", () -> new MusicDiscBumblebeeItem());
	public static final RegistryObject<Item> MUSIC_DISC_SCARAB = REGISTRY.register("music_disc_scarab", () -> new MusicDiscScarabItem());
	public static final RegistryObject<Item> MUSIC_DISC_SPINY_SPIDER = REGISTRY.register("music_disc_spiny_spider", () -> new MusicDiscSpinySpiderItem());
	public static final RegistryObject<Item> MUSIC_DISC_TORTOISE_BEETLE = REGISTRY.register("music_disc_tortoise_beetle", () -> new MusicDiscTortoiseBeetleItem());
	public static final RegistryObject<Item> LORE_ITEM = REGISTRY.register("lore_item", () -> new LoreItemItem());
	public static final RegistryObject<Item> OLYMPIAN_GRASS = block(RoyalrealmsModBlocks.OLYMPIAN_GRASS);
	public static final RegistryObject<Item> OLYMPIAN_STONE = block(RoyalrealmsModBlocks.OLYMPIAN_STONE);
	public static final RegistryObject<Item> VANTAWHITE = block(RoyalrealmsModBlocks.VANTAWHITE);
	public static final RegistryObject<Item> GRIDSTONE = block(RoyalrealmsModBlocks.GRIDSTONE);
	public static final RegistryObject<Item> GRIDSTONE_TILES = block(RoyalrealmsModBlocks.GRIDSTONE_TILES);
	public static final RegistryObject<Item> GRIDSTONE_BLOCK = block(RoyalrealmsModBlocks.GRIDSTONE_BLOCK);
	public static final RegistryObject<Item> GRIDLIGHT_TILES = block(RoyalrealmsModBlocks.GRIDLIGHT_TILES);
	public static final RegistryObject<Item> GRIDLIGHT_BLOCK = block(RoyalrealmsModBlocks.GRIDLIGHT_BLOCK);
	public static final RegistryObject<Item> GRIDSTONE_SLAB = block(RoyalrealmsModBlocks.GRIDSTONE_SLAB);
	public static final RegistryObject<Item> GRIDSTONE_STAIRS = block(RoyalrealmsModBlocks.GRIDSTONE_STAIRS);
	public static final RegistryObject<Item> GRIDSTONE_TILES_SLAB = block(RoyalrealmsModBlocks.GRIDSTONE_TILES_SLAB);
	public static final RegistryObject<Item> GRIDSTONE_TILES_STAIRS = block(RoyalrealmsModBlocks.GRIDSTONE_TILES_STAIRS);
	public static final RegistryObject<Item> INVISIBLE_CLOAK = REGISTRY.register("invisible_cloak", () -> new ShadowCloakItem());
	public static final RegistryObject<Item> INVISIBLE_INK = REGISTRY.register("invisible_ink", () -> new InvisibleInkItem());
	public static final RegistryObject<Item> GRIDWORLD = REGISTRY.register("gridworld", () -> new GridworldItem());
	public static final RegistryObject<Item> GRIDPORTAL = block(RoyalrealmsModBlocks.GRIDPORTAL);
	public static final RegistryObject<Item> GRIDGLASS_BLOCK = block(RoyalrealmsModBlocks.GRIDGLASS_BLOCK);
	public static final RegistryObject<Item> GRIDGLASS = block(RoyalrealmsModBlocks.GRIDGLASS);
	public static final RegistryObject<Item> GRIDGLASS_TILES = block(RoyalrealmsModBlocks.GRIDGLASS_TILES);
	public static final RegistryObject<Item> GRIDSTONE_BLOCK_TILE = block(RoyalrealmsModBlocks.GRIDSTONE_BLOCK_TILE);
	public static final RegistryObject<Item> CORRUPTED_BLADE = REGISTRY.register("corrupted_blade", () -> new CorruptedBladeItem());
	public static final RegistryObject<Item> CORRUPTED_LIQUID_BUCKET = REGISTRY.register("corrupted_liquid_bucket", () -> new CorruptedLiquidItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			ItemProperties.register(PLAYER_ITEM.get(), new ResourceLocation("royalrealms:player_item_player_belongs"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) PlayerItemPropertyValueProviderProcedure.execute(itemStackToRender));
		});
	}
}
