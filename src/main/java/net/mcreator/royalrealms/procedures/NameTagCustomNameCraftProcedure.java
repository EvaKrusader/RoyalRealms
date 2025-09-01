package net.mcreator.royalrealms.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;

import java.util.List;
import java.util.ArrayList;

import java.io.File;

@Mod.EventBusSubscriber
public class NameTagCustomNameCraftProcedure {
	@SubscribeEvent
	public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		com.google.gson.JsonObject json = new com.google.gson.JsonObject();
		File file = new File("");
		double namePicker = 0;
		String stringStart = "";
		String enderlinkName = "";
		String tipStart = "";
		String url = "";
		List<Object> list = new ArrayList<>();
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.NAME_TAG && entity.isShiftKeyDown() && entity.getLookAngle().y <= -0.9
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getBoolean("hasDefaultRename") == false) {
			if (list.isEmpty()) {
				list.add("Pih");
				list.add("Freak");
				list.add("Whore");
				list.add("Bitch");
				list.add("Slut");
				list.add("Cookie");
				list.add("Coochie");
				list.add("Mario");
				list.add("Luigi");
				list.add("Diddy");
				list.add("Pomni");
				list.add("Cum");
				list.add("Precum");
				list.add("Dildo");
				list.add("Fleshlight");
				list.add("Pussy");
				list.add("Sparkle");
				list.add("Awawa");
				list.add("True");
				list.add("Earpod");
				list.add("Jeff");
				list.add("Twin");
				list.add("Dih");
			}
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putBoolean("hasDefaultRename", true);
			namePicker = Mth.nextInt(RandomSource.create(), 0, (int) (list.size() - 1));
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).setHoverName(Component.literal((list.get((int) namePicker) instanceof String _s ? _s : "")));
		}
	}
}
