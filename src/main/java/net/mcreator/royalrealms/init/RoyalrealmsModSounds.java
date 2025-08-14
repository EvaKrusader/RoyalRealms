
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.royalrealms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.royalrealms.RoyalrealmsMod;

public class RoyalrealmsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, RoyalrealmsMod.MODID);
	public static final RegistryObject<SoundEvent> ENDERLINK_MSG1 = REGISTRY.register("enderlink_msg1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("royalrealms", "enderlink_msg1")));
	public static final RegistryObject<SoundEvent> ENDERLINK_MSG2 = REGISTRY.register("enderlink_msg2", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("royalrealms", "enderlink_msg2")));
	public static final RegistryObject<SoundEvent> ENDERLINK_MSG3 = REGISTRY.register("enderlink_msg3", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("royalrealms", "enderlink_msg3")));
	public static final RegistryObject<SoundEvent> ENDERLINK_MSG_RARE = REGISTRY.register("enderlink_msg_rare", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("royalrealms", "enderlink_msg_rare")));
	public static final RegistryObject<SoundEvent> ENDERLINK_BOOT = REGISTRY.register("enderlink_boot", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("royalrealms", "enderlink_boot")));
	public static final RegistryObject<SoundEvent> ENDERLINK_BOOT_RARE1 = REGISTRY.register("enderlink_boot_rare1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("royalrealms", "enderlink_boot_rare1")));
	public static final RegistryObject<SoundEvent> ENDERLINK_BOOT_RARE2 = REGISTRY.register("enderlink_boot_rare2", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("royalrealms", "enderlink_boot_rare2")));
	public static final RegistryObject<SoundEvent> ENDERLINK_BOOT_RARE3 = REGISTRY.register("enderlink_boot_rare3", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("royalrealms", "enderlink_boot_rare3")));
}
