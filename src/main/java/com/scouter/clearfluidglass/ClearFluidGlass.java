package com.scouter.clearfluidglass;

import com.mojang.logging.LogUtils;
import com.scouter.clearfluidglass.setup.Registration;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
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
        IEventBus forgeBus = NeoForge.EVENT_BUS;

    }


    public static ResourceLocation prefix(String name) {
        return  ResourceLocation.fromNamespaceAndPath(MODID, name.toLowerCase(Locale.ROOT));
    }
}
