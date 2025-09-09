
package net.mcreator.royalrealms.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MusicDiscButterflyItem extends RecordItem {
	public MusicDiscButterflyItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("royalrealms:enderlink_msg1")), new Item.Properties().stacksTo(1).rarity(Rarity.COMMON), 100);
	}
}
