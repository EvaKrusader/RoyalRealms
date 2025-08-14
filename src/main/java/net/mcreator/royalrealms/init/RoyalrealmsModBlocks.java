
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.royalrealms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.royalrealms.block.TelosteelOreBlock;
import net.mcreator.royalrealms.block.TelosteelBlockBlock;
import net.mcreator.royalrealms.block.StarliteOreBlock;
import net.mcreator.royalrealms.block.StarliteBlockBlock;
import net.mcreator.royalrealms.block.NeoniumOreBlock;
import net.mcreator.royalrealms.block.NeoniumBlockBlock;
import net.mcreator.royalrealms.block.MalachiteOreBlock;
import net.mcreator.royalrealms.block.MalachiteBlockBlock;
import net.mcreator.royalrealms.RoyalrealmsMod;

public class RoyalrealmsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RoyalrealmsMod.MODID);
	public static final RegistryObject<Block> TELOSTEEL_ORE = REGISTRY.register("telosteel_ore", () -> new TelosteelOreBlock());
	public static final RegistryObject<Block> TELOSTEEL_BLOCK = REGISTRY.register("telosteel_block", () -> new TelosteelBlockBlock());
	public static final RegistryObject<Block> MALACHITE_ORE = REGISTRY.register("malachite_ore", () -> new MalachiteOreBlock());
	public static final RegistryObject<Block> MALACHITE_BLOCK = REGISTRY.register("malachite_block", () -> new MalachiteBlockBlock());
	public static final RegistryObject<Block> STARLITE_ORE = REGISTRY.register("starlite_ore", () -> new StarliteOreBlock());
	public static final RegistryObject<Block> STARLITE_BLOCK = REGISTRY.register("starlite_block", () -> new StarliteBlockBlock());
	public static final RegistryObject<Block> NEONIUM_ORE = REGISTRY.register("neonium_ore", () -> new NeoniumOreBlock());
	public static final RegistryObject<Block> NEONIUM_BLOCK = REGISTRY.register("neonium_block", () -> new NeoniumBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
