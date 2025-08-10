
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

import net.mcreator.royalrealms.item.TelosteelSwordItem;
import net.mcreator.royalrealms.item.TelosteelShovelItem;
import net.mcreator.royalrealms.item.TelosteelPickaxeItem;
import net.mcreator.royalrealms.item.TelosteelIngotItem;
import net.mcreator.royalrealms.item.TelosteelHoeItem;
import net.mcreator.royalrealms.item.TelosteelAxeItem;
import net.mcreator.royalrealms.item.TelosteelArmorItem;
import net.mcreator.royalrealms.item.EnderlinkItem;
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

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
