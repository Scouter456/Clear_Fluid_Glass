package com.scouter.clearfluidglass.setup;

import com.mojang.logging.LogUtils;
import com.scouter.clearfluidglass.blocks.CFGBlocks;
import com.scouter.clearfluidglass.blocks.entity.CFGBlockEntities;
import com.scouter.clearfluidglass.creativetabs.CFGTabs;
import com.scouter.clearfluidglass.items.CFGItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;


public class Registration {
    private static final Logger LOGGER = LogUtils.getLogger();
    public static void init(){

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        CFGBlocks.BLOCKS.register(bus);
        CFGBlockEntities.BLOCK_ENTITIES.register(bus);
        CFGItems.ITEMS.register(bus);
        CFGTabs.TABS.register(bus);
    }
}
