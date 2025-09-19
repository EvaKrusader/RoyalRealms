
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.royalrealms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.royalrealms.world.inventory.LoreGuiMenu;
import net.mcreator.royalrealms.world.inventory.DevGUIMenu;
import net.mcreator.royalrealms.RoyalrealmsMod;

public class RoyalrealmsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, RoyalrealmsMod.MODID);
	public static final RegistryObject<MenuType<LoreGuiMenu>> LORE_GUI = REGISTRY.register("lore_gui", () -> IForgeMenuType.create(LoreGuiMenu::new));
	public static final RegistryObject<MenuType<DevGUIMenu>> DEV_GUI = REGISTRY.register("dev_gui", () -> IForgeMenuType.create(DevGUIMenu::new));
}
