
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.royalrealms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.royalrealms.enchantment.WindBlastEnchantment;
import net.mcreator.royalrealms.enchantment.ThunderstrikeEnchantment;
import net.mcreator.royalrealms.enchantment.ReplanterEnchantment;
import net.mcreator.royalrealms.enchantment.MagnetEnchantment;
import net.mcreator.royalrealms.enchantment.HotTouchEnchantment;
import net.mcreator.royalrealms.enchantment.BenedictionOfUnbreakingEnchantment;
import net.mcreator.royalrealms.RoyalrealmsMod;

public class RoyalrealmsModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, RoyalrealmsMod.MODID);
	public static final RegistryObject<Enchantment> MAGNET = REGISTRY.register("magnet", () -> new MagnetEnchantment());
	public static final RegistryObject<Enchantment> HOT_TOUCH = REGISTRY.register("hot_touch", () -> new HotTouchEnchantment());
	public static final RegistryObject<Enchantment> REPLANTER = REGISTRY.register("replanter", () -> new ReplanterEnchantment());
	public static final RegistryObject<Enchantment> THUNDERSTRIKE = REGISTRY.register("thunderstrike", () -> new ThunderstrikeEnchantment());
	public static final RegistryObject<Enchantment> WIND_BLAST = REGISTRY.register("wind_blast", () -> new WindBlastEnchantment());
	public static final RegistryObject<Enchantment> BENEDICTION_OF_UNBREAKING = REGISTRY.register("benediction_of_unbreaking", () -> new BenedictionOfUnbreakingEnchantment());
}
