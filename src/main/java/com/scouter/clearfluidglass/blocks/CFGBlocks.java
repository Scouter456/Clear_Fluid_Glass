package com.scouter.clearfluidglass.blocks;

import com.scouter.clearfluidglass.ClearFluidGlass;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.scouter.clearfluidglass.ClearFluidGlass.prefix;


public class CFGBlocks {
    public static final Logger LOGGER = LoggerFactory.getLogger(ClearFluidGlass.MODID);


    public static final Block CLEAR_FLUID_GLASS = registerBlock("clear_fluid_glass", new ClearFluidGlassBlock(FabricBlockSettings.of().strength(0.6F).sound(SoundType.GLASS)));


    private static Block registerBlock(String name, Block block){
        return Registry.register(BuiltInRegistries.BLOCK, prefix(name), block);
    }

    public static void BLOCKS(){
        LOGGER.info("Registering Blocks for " + ClearFluidGlass.MODID);
    }

}
