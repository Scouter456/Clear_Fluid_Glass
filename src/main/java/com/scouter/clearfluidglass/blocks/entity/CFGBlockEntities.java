package com.scouter.clearfluidglass.blocks.entity;

import com.scouter.clearfluidglass.ClearFluidGlass;
import com.scouter.clearfluidglass.blocks.CFGBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CFGBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, ClearFluidGlass.MODID);
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ClearFluidGlassBlockEntity>> CLEAR_FLUID_GLASS =
            BLOCK_ENTITIES.register("clear_fluid_glass_entity", () ->
                    BlockEntityType.Builder.of(ClearFluidGlassBlockEntity::new,
                            CFGBlocks.CLEAR_FLUID_GLASS.get()).build(null));
}
