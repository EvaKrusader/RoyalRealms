
package net.mcreator.royalrealms.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MusicDiscBumblebeeItem extends RecordItem {
	public MusicDiscBumblebeeItem() {
		super(6, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("royalrealms:record_bumblebee")), new Item.Properties().stacksTo(1).rarity(Rarity.COMMON), 1940);
	}
}
