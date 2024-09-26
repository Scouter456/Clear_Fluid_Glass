package com.scouter.clearfluidglass;

import com.scouter.clearfluidglass.setup.Registration;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Locale;

public class ClearFluidGlass implements ModInitializer {
	public static final String MODID = "clearfluidglass";

	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		Registration.init();
	}

	public static ResourceLocation prefix(String name) {
		return  new ResourceLocation(MODID, name.toLowerCase(Locale.ROOT));
	}
}