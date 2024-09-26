package com.scouter.clearfluidglass.blocks;

import com.scouter.clearfluidglass.ClearFluidGlass;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CFGBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ClearFluidGlass.MODID);
    public static final RegistryObject<Block> CLEAR_FLUID_GLASS = BLOCKS.register("clear_fluid_glass", () -> new ClearFluidGlassBlock(BlockBehaviour.Properties.of().strength(0.6F).sound(SoundType.GLASS)));

}
