package net.mcreator.royalrealms.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;

import java.util.List;
import java.util.ArrayList;

import java.io.File;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class EnderlinkDevProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
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
				list.add("1");
				list.add("2");
				list.add("3");
				list.add("4");
				list.add("5");
				list.add("6");
				list.add("7");
				list.add("8");
				list.add("9");
				list.add("10");
				list.add("11");
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
		namePicker = DoubleArgumentType.getDouble(arguments, "quantity");
		enderlinkName = "<Enderlink> ";
		tipStart = "Tip #" + new java.text.DecimalFormat("##.##").format(namePicker) + " : ";
		stringStart = enderlinkName + "" + tipStart;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal((stringStart + "" + (list.get((int) namePicker) instanceof String _s ? _s : ""))), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("Array Length : " + new java.text.DecimalFormat("##.##").format(list.size()))), false);
	}
}
