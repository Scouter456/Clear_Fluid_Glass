package com.scouter.clearfluidglass.setup;

import com.mojang.logging.LogUtils;
import com.scouter.clearfluidglass.blocks.CFGBlocks;
import com.scouter.clearfluidglass.blocks.entity.CFGBlockEntities;
import com.scouter.clearfluidglass.creativetabs.CFGTabs;
import com.scouter.clearfluidglass.items.CFGItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModLoadingContext;
import org.slf4j.Logger;


public class Registration {
    private static final Logger LOGGER = LogUtils.getLogger();
    public static void init(){

        IEventBus bus = ModLoadingContext.get().getActiveContainer().getEventBus();
        CFGBlocks.BLOCKS.register(bus);
        CFGBlockEntities.BLOCK_ENTITIES.register(bus);
        CFGItems.ITEMS.register(bus);
        CFGTabs.TABS.register(bus);
    }
}
