
package net.mcreator.royalrealms.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MusicDisc7l011Item extends RecordItem {
	public MusicDisc7l011Item() {
		super(7, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("royalrealms:record_7l011")), new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON), 1280);
	}
}
