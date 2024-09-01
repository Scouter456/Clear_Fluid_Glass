package com.scouter.clearfluidglass.setup;

import com.scouter.clearfluidglass.blocks.CFGBlocks;
import com.scouter.clearfluidglass.blocks.entity.CFGBlockEntities;
import com.scouter.clearfluidglass.creativetabs.CFGTabs;
import com.scouter.clearfluidglass.items.CFGItems;

public class Registration {

    public static void init(){
        CFGItems.ITEMS();
        CFGBlocks.BLOCKS();
        CFGBlockEntities.BLOCKENTITIES();
        CFGTabs.TABS();

    }
}
