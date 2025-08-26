package net.mcreator.royalrealms.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

import java.net.URL;

import java.io.IOException;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

public class EnderlinkTalkListProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		com.google.gson.JsonObject json = new com.google.gson.JsonObject();
		File file = new File("");
		double textPicker = 0;
		double SoundItem = 0;
		double nextVersion = 0;
		double currentVersion = 0;
		String tipStart = "";
		String enderlinkName = "";
		String stringStart = "";
		String url = "";
		textPicker = Mth.nextInt(RandomSource.create(), 1, 5);
		enderlinkName = "<Enderlink> ";
		tipStart = "Tip #" + new java.text.DecimalFormat("##.##").format(textPicker) + " : ";
		stringStart = enderlinkName + "" + tipStart;
		file = new File(System.getProperty("java.io.tmpdir"), File.separator + "enderlink.json");
		url = "https://raw.githubusercontent.com/EvaKrusader/" + "RoyalRealms" + "/master/src/main/enderlink.json";
		try {
			org.apache.commons.io.FileUtils.copyURLToFile(new URL(url), file, 1000, 1000);
		} catch (IOException e) {
			e.printStackTrace();
		}
		{
			try {
				BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
				StringBuilder jsonstringbuilder = new StringBuilder();
				String line;
				while ((line = bufferedReader.readLine()) != null) {
					jsonstringbuilder.append(line);
				}
				bufferedReader.close();
				json = new com.google.gson.Gson().fromJson(jsonstringbuilder.toString(), com.google.gson.JsonObject.class);
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((stringStart + "" + json.get(("tip" + new java.text.DecimalFormat("#").format(textPicker))).getAsString())), false);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
