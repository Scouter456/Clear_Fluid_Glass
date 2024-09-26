package com.scouter.clearfluidglass.items;

import com.scouter.clearfluidglass.ClearFluidGlass;
import com.scouter.clearfluidglass.blocks.CFGBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CFGItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ClearFluidGlass.MODID);

    public static final RegistryObject<Item> CLEAR_FLUID_GLASS = fromBlock(CFGBlocks.CLEAR_FLUID_GLASS);


    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(),new Item.Properties()));
    }
}

