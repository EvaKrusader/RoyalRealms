package net.mcreator.royalrealms.procedures;

import net.minecraft.world.entity.Entity;

public class NametagOverlayConfirmationProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getLookAngle().y <= -0.9) {
			return true;
		}
		return false;
	}
}
