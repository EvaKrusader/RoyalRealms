package net.mcreator.royalrealms.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

import java.util.List;
import java.util.ArrayList;

import java.io.File;

public class EnderlinkTalkListProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		com.google.gson.JsonObject json = new com.google.gson.JsonObject();
		File file = new File("");
		String tipStart = "";
		String enderlinkName = "";
		String stringStart = "";
		String url = "";
		double textPicker = 0;
		double SoundItem = 0;
		double nextVersion = 0;
		double currentVersion = 0;
		double namePicker = 0;
		List<Object> list = new ArrayList<>();
		boolean checker = false;
		if (list.isEmpty()) {
			if (checker == false) {
				list.add("This fact should not appear. Please contact support for help.");
				list.add("There are new music discs to find!");
				list.add("There are new enchantments to discover!");
				list.add("Art is a great escape! There are many new paintings to admire!");
				list.add("The Enderlink\u2122 may cause brain damage during installation.");
				list.add("Starlite got it's name from the way it looks! Like glowing stars in the night sky.");
				list.add("Spice up your style with brand-new armor trims!");
				list.add("The Wishing Star reveals your wish to everyone, ironic isn't it?");
				list.add("You can extinguish yourself with a Wishing Star, useful when in the Nether!");
				list.add("You can use a Wishing Star to sacrifice an item to realise a wish!");
				list.add("You can use a Player Item on a Wishing Star to teleport to them!");
				list.add("12");
				list.add("13");
				list.add("14");
				list.add("15");
			}
			if (checker == false) {
				list.add("16");
				list.add("17");
				list.add("18");
				list.add("19");
				list.add("20");
				list.add("21");
				list.add("22");
				list.add("23");
				list.add("24");
				list.add("25");
				list.add("26");
				list.add("27");
				list.add("28");
				list.add("29");
				list.add("30");
			}
		}
		namePicker = Mth.nextInt(RandomSource.create(), 1, (int) (list.size() - 1));
		enderlinkName = "<Enderlink> ";
		tipStart = "FacTip #" + new java.text.DecimalFormat("##.##").format(namePicker) + " : ";
		stringStart = enderlinkName + "" + tipStart;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal((stringStart + "" + (list.get((int) namePicker) instanceof String _s ? _s : ""))), false);
	}
}
