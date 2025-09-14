package net.mcreator.royalrealms.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Checkbox;

import java.util.HashMap;
import java.util.Calendar;

public class LoreGuiEngraveProcedure {
	public static void execute(Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		double numSec = 0;
		double numMin = 0;
		double numHour = 0;
		double numDay = 0;
		double numMonth = 0;
		double numYear = 0;
		String txtSec = "";
		String txtMin = "";
		String txtHour = "";
		String txtDay = "";
		String txtMonth = "";
		String txtYear = "";
		numSec = Calendar.getInstance().get(Calendar.SECOND);
		numMin = Calendar.getInstance().get(Calendar.MINUTE);
		numHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		numDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		numMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
		numYear = Calendar.getInstance().get(Calendar.YEAR);
		if (numSec < 10) {
			txtSec = "0" + new java.text.DecimalFormat("##").format(numSec);
		} else {
			txtSec = new java.text.DecimalFormat("##").format(numSec);
		}
		if (numMin < 10) {
			txtMin = "0" + new java.text.DecimalFormat("##").format(numMin);
		} else {
			txtMin = new java.text.DecimalFormat("##").format(numMin);
		}
		if (numHour < 10) {
			txtHour = "0" + new java.text.DecimalFormat("##").format(numHour);
		} else {
			txtHour = new java.text.DecimalFormat("##").format(numHour);
		}
		if (numDay < 10) {
			txtDay = "0" + new java.text.DecimalFormat("##").format(numDay);
		} else {
			txtDay = new java.text.DecimalFormat("##").format(numDay);
		}
		if (numMonth < 10) {
			txtMonth = "0" + new java.text.DecimalFormat("##").format(numMonth);
		} else {
			txtMonth = new java.text.DecimalFormat("##").format(numMonth);
		}
		if ((guistate.containsKey("text:Lore") ? ((EditBox) guistate.get("text:Lore")).getValue() : "").isEmpty()) {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("itemLore", "NULL");
		} else {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("itemLore", (guistate.containsKey("text:Lore") ? ((EditBox) guistate.get("text:Lore")).getValue() : ""));
		}
		if ((guistate.containsKey("text:Lore2") ? ((EditBox) guistate.get("text:Lore2")).getValue() : "").isEmpty()) {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("itemLore2", "NULL");
		} else {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("itemLore2", (guistate.containsKey("text:Lore2") ? ((EditBox) guistate.get("text:Lore2")).getValue() : ""));
		}
		if ((guistate.containsKey("text:Lore3") ? ((EditBox) guistate.get("text:Lore3")).getValue() : "").isEmpty()) {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("itemLore3", "NULL");
		} else {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("itemLore3", (guistate.containsKey("text:Lore3") ? ((EditBox) guistate.get("text:Lore3")).getValue() : ""));
		}
		if ((guistate.containsKey("checkbox:SignUsername") && ((Checkbox) guistate.get("checkbox:SignUsername")).selected()) == true) {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("itemSigned", (entity.getDisplayName().getString()));
		} else {
			if ((guistate.containsKey("text:CustomName") ? ((EditBox) guistate.get("text:CustomName")).getValue() : "").isEmpty()) {
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("itemSigned", "NULL");
			} else {
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("itemSigned", (guistate.containsKey("text:CustomName") ? ((EditBox) guistate.get("text:CustomName")).getValue() : ""));
			}
		}
		if ((guistate.containsKey("checkbox:TimeDataReal") && ((Checkbox) guistate.get("checkbox:TimeDataReal")).selected()) == true) {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("itemDateReal",
					((txtDay + "/" + txtMonth + "/" + new java.text.DecimalFormat("#").format(Calendar.getInstance().get(Calendar.YEAR))) + " " + (txtHour + ":" + txtMin + ":" + txtSec)));
		} else {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("itemDateReal", "NULL");
		}
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}
