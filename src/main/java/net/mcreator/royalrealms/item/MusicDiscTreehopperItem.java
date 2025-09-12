
package net.mcreator.royalrealms.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MusicDiscTreehopperItem extends RecordItem {
	public MusicDiscTreehopperItem() {
		super(3, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("royalrealms:record_treehopper")), new Item.Properties().stacksTo(1).rarity(Rarity.COMMON), 2340);
	}
}
