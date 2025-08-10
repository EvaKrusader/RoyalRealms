
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
import net.mcreator.royalrealms.RoyalrealmsMod;

public class RoyalrealmsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RoyalrealmsMod.MODID);
	public static final RegistryObject<Block> TELOSTEEL_ORE = REGISTRY.register("telosteel_ore", () -> new TelosteelOreBlock());
	public static final RegistryObject<Block> TELOSTEEL_BLOCK = REGISTRY.register("telosteel_block", () -> new TelosteelBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
