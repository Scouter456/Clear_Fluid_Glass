package com.scouter.clearfluidglass.items;

import com.scouter.clearfluidglass.ClearFluidGlass;
import com.scouter.clearfluidglass.blocks.CFGBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CFGItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ClearFluidGlass.MODID);
    public static final DeferredItem<BlockItem> CLEAR_FLUID_GLASS = fromBlock(CFGBlocks.CLEAR_FLUID_GLASS);


    public static <B extends Block> DeferredItem<BlockItem> fromBlock(DeferredBlock<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(),new Item.Properties()));
    }
}

