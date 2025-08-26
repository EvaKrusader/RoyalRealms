
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.royalrealms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.royalrealms.item.WeirdTrimItemItem;
import net.mcreator.royalrealms.item.TungstenItem;
import net.mcreator.royalrealms.item.TelosteelSwordItem;
import net.mcreator.royalrealms.item.TelosteelShovelItem;
import net.mcreator.royalrealms.item.TelosteelPickaxeItem;
import net.mcreator.royalrealms.item.TelosteelIngotItem;
import net.mcreator.royalrealms.item.TelosteelHoeItem;
import net.mcreator.royalrealms.item.TelosteelAxeItem;
import net.mcreator.royalrealms.item.TelosteelArmorItem;
import net.mcreator.royalrealms.item.StarliteSwordItem;
import net.mcreator.royalrealms.item.StarliteShovelItem;
import net.mcreator.royalrealms.item.StarlitePickaxeItem;
import net.mcreator.royalrealms.item.StarliteHoeItem;
import net.mcreator.royalrealms.item.StarliteDustItem;
import net.mcreator.royalrealms.item.StarliteAxeItem;
import net.mcreator.royalrealms.item.StarliteArmorItem;
import net.mcreator.royalrealms.item.RawTungstenItem;
import net.mcreator.royalrealms.item.PhasingCanItem;
import net.mcreator.royalrealms.item.PaperCopyPatentItem;
import net.mcreator.royalrealms.item.NeoniumItem;
import net.mcreator.royalrealms.item.MusicDisc7l011Item;
import net.mcreator.royalrealms.item.MalachiteSwordItem;
import net.mcreator.royalrealms.item.MalachiteShovelItem;
import net.mcreator.royalrealms.item.MalachitePickaxeItem;
import net.mcreator.royalrealms.item.MalachiteItem;
import net.mcreator.royalrealms.item.MalachiteHoeItem;
import net.mcreator.royalrealms.item.MalachiteAxeItem;
import net.mcreator.royalrealms.item.MalachiteArmorItem;
import net.mcreator.royalrealms.item.LustTrimItemItem;
import net.mcreator.royalrealms.item.FixHoleItem;
import net.mcreator.royalrealms.item.ExperienceAmuletItem;
import net.mcreator.royalrealms.item.EnderlinkItem;
import net.mcreator.royalrealms.item.BrightcoreItem;
import net.mcreator.royalrealms.RoyalrealmsMod;

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
	public static final RegistryObject<Item> MALACHITE = REGISTRY.register("malachite", () -> new MalachiteItem());
	public static final RegistryObject<Item> MALACHITE_ORE = block(RoyalrealmsModBlocks.MALACHITE_ORE);
	public static final RegistryObject<Item> MALACHITE_BLOCK = block(RoyalrealmsModBlocks.MALACHITE_BLOCK);
	public static final RegistryObject<Item> MALACHITE_PICKAXE = REGISTRY.register("malachite_pickaxe", () -> new MalachitePickaxeItem());
	public static final RegistryObject<Item> MALACHITE_AXE = REGISTRY.register("malachite_axe", () -> new MalachiteAxeItem());
	public static final RegistryObject<Item> MALACHITE_SWORD = REGISTRY.register("malachite_sword", () -> new MalachiteSwordItem());
	public static final RegistryObject<Item> MALACHITE_SHOVEL = REGISTRY.register("malachite_shovel", () -> new MalachiteShovelItem());
	public static final RegistryObject<Item> MALACHITE_HOE = REGISTRY.register("malachite_hoe", () -> new MalachiteHoeItem());
	public static final RegistryObject<Item> MALACHITE_ARMOR_HELMET = REGISTRY.register("malachite_armor_helmet", () -> new MalachiteArmorItem.Helmet());
	public static final RegistryObject<Item> MALACHITE_ARMOR_CHESTPLATE = REGISTRY.register("malachite_armor_chestplate", () -> new MalachiteArmorItem.Chestplate());
	public static final RegistryObject<Item> MALACHITE_ARMOR_LEGGINGS = REGISTRY.register("malachite_armor_leggings", () -> new MalachiteArmorItem.Leggings());
	public static final RegistryObject<Item> MALACHITE_ARMOR_BOOTS = REGISTRY.register("malachite_armor_boots", () -> new MalachiteArmorItem.Boots());
	public static final RegistryObject<Item> STARLITE_DUST = REGISTRY.register("starlite_dust", () -> new StarliteDustItem());
	public static final RegistryObject<Item> STARLITE_ORE = block(RoyalrealmsModBlocks.STARLITE_ORE);
	public static final RegistryObject<Item> STARLITE_BLOCK = block(RoyalrealmsModBlocks.STARLITE_BLOCK);
	public static final RegistryObject<Item> STARLITE_PICKAXE = REGISTRY.register("starlite_pickaxe", () -> new StarlitePickaxeItem());
	public static final RegistryObject<Item> STARLITE_AXE = REGISTRY.register("starlite_axe", () -> new StarliteAxeItem());
	public static final RegistryObject<Item> STARLITE_SWORD = REGISTRY.register("starlite_sword", () -> new StarliteSwordItem());
	public static final RegistryObject<Item> STARLITE_SHOVEL = REGISTRY.register("starlite_shovel", () -> new StarliteShovelItem());
	public static final RegistryObject<Item> STARLITE_HOE = REGISTRY.register("starlite_hoe", () -> new StarliteHoeItem());
	public static final RegistryObject<Item> STARLITE_ARMOR_HELMET = REGISTRY.register("starlite_armor_helmet", () -> new StarliteArmorItem.Helmet());
	public static final RegistryObject<Item> STARLITE_ARMOR_CHESTPLATE = REGISTRY.register("starlite_armor_chestplate", () -> new StarliteArmorItem.Chestplate());
	public static final RegistryObject<Item> STARLITE_ARMOR_LEGGINGS = REGISTRY.register("starlite_armor_leggings", () -> new StarliteArmorItem.Leggings());
	public static final RegistryObject<Item> STARLITE_ARMOR_BOOTS = REGISTRY.register("starlite_armor_boots", () -> new StarliteArmorItem.Boots());
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

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
