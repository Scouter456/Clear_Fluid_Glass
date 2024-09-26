package com.scouter.clearfluidglass;

import com.mojang.logging.LogUtils;
import com.scouter.clearfluidglass.setup.Registration;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

import java.util.Locale;

@Mod(ClearFluidGlass.MODID)
public class ClearFluidGlass
{
    public static final String MODID = "clearfluidglass";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();
    public ClearFluidGlass()
    {
        Registration.init();


    }


    public static ResourceLocation prefix(String name) {
        return  new ResourceLocation(MODID, name.toLowerCase(Locale.ROOT));
    }
}
