package net.mcreator.royalrealms.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

public class EnderlinkTalkListProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		String tipStart = "";
		String enderlinkName = "";
		String stringStart = "";
		double textPicker = 0;
		double SoundItem = 0;
		textPicker = Mth.nextInt(RandomSource.create(), 1, 5);
		enderlinkName = "<Enderlink> ";
		tipStart = "Tip #" + new java.text.DecimalFormat("##.##").format(textPicker) + " : ";
		stringStart = enderlinkName + "" + tipStart;
		if (textPicker == 0) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((stringStart + "You are not supposed to see this message, please reboot your Enderlink.")), false);
		} else if (textPicker == 1) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((stringStart + "You can craft bread faster by using hay blocks!")), false);
		} else if (textPicker == 2) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((stringStart + "Installing the Enderlink may cause temporary brain damage.")), false);
		} else if (textPicker == 3) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((stringStart + "Starlite is named that way after it's appearance, it ressembles stars in the night sky!")), false);
		} else if (textPicker == 4) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((stringStart + "Neonium is a great source of fuel!")), false);
		} else if (textPicker == 5) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((stringStart + "Test message")), false);
		}
	}
}
