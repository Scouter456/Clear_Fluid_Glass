package com.scouter.clearfluidglass.items;

import com.scouter.clearfluidglass.ClearFluidGlass;
import com.scouter.clearfluidglass.blocks.CFGBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.scouter.clearfluidglass.ClearFluidGlass.prefix;

public class CFGItems {
    public static final Logger LOGGER = LoggerFactory.getLogger(ClearFluidGlass.MODID);

    public static final Item CLEAR_FLUID_GLASS = registerBlockItem(CFGBlocks.CLEAR_FLUID_GLASS);


    private static Item registerBlockItem(Block block){
        return Registry.register(BuiltInRegistries.ITEM, prefix(block.getDescriptionId().replace("block.clearfluidglass.", "").toString()),
                new BlockItem(block, new Item.Properties().fireResistant()));
    }
    public static void ITEMS(){
        LOGGER.info("Registering Items for " + ClearFluidGlass.MODID);
    }

}
