package net.mcreator.royalrealms.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

import java.util.List;

public class DateModeConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<List<? extends String>> DATEFORMAT;
	static {
		BUILDER.push("DateType");
		DATEFORMAT = BUILDER.defineList("DateFormat", List.of("dd/mm/YYYY", "mm/dd/YYYY"), entry -> true);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
