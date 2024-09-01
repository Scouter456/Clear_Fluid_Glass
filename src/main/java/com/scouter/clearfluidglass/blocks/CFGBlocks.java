package com.scouter.clearfluidglass.blocks;

import com.scouter.clearfluidglass.ClearFluidGlass;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CFGBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ClearFluidGlass.MODID);
    public static final DeferredBlock<Block> CLEAR_FLUID_GLASS = BLOCKS.register("clear_fluid_glass", () -> new ClearFluidGlassBlock(BlockBehaviour.Properties.of().strength(0.6F).sound(SoundType.GLASS)));

}
