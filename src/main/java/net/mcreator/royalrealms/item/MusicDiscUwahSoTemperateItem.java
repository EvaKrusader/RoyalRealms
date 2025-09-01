
package net.mcreator.royalrealms.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MusicDiscUwahSoTemperateItem extends RecordItem {
	public MusicDiscUwahSoTemperateItem() {
		super(6, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("royalrealms:record_uwah_so_temperate")), new Item.Properties().stacksTo(1).rarity(Rarity.COMMON), 1120);
	}
}
