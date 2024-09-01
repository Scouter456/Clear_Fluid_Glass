package com.scouter.clearfluidglass.blocks.entity;

import com.scouter.clearfluidglass.ClearFluidGlass;
import com.scouter.clearfluidglass.blocks.CFGBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.scouter.clearfluidglass.ClearFluidGlass.prefix;

public class CFGBlockEntities {
    public static final Logger LOGGER = LoggerFactory.getLogger(ClearFluidGlass.MODID);
    public static final BlockEntityType<ClearFluidGlassBlockEntity> CLEAR_FLUID_GLASS_ENTITY =
            registerBlockEntity("clear_fluid_glass_entity",
                    BlockEntityType.Builder.of(ClearFluidGlassBlockEntity::new,
                            CFGBlocks.CLEAR_FLUID_GLASS).build(null));


    private static BlockEntityType registerBlockEntity(String name, BlockEntityType block){
        return Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, prefix(name), block);
    }

    public static void BLOCKENTITIES(){
        LOGGER.info("Registering Block Entities for " + ClearFluidGlass.MODID);
    }
}
