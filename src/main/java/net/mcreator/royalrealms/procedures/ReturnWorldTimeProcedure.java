package net.mcreator.royalrealms.procedures;

import net.minecraft.world.level.LevelAccessor;

public class ReturnWorldTimeProcedure {
	public static String execute(LevelAccessor world) {
		return "World Time : " + new java.text.DecimalFormat("#").format(world.dayTime());
	}
}
