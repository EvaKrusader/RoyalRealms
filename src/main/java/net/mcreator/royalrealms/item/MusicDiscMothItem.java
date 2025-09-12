
package net.mcreator.royalrealms.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MusicDiscMothItem extends RecordItem {
	public MusicDiscMothItem() {
		super(4, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("royalrealms:record_moth")), new Item.Properties().stacksTo(1).rarity(Rarity.COMMON), 1480);
	}
}
