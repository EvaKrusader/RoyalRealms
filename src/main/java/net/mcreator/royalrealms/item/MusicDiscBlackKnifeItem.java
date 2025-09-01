
package net.mcreator.royalrealms.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MusicDiscBlackKnifeItem extends RecordItem {
	public MusicDiscBlackKnifeItem() {
		super(12, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("royalrealms:record_black_knife")), new Item.Properties().stacksTo(1).rarity(Rarity.COMMON), 2340);
	}
}
