package com.scouter.clearfluidglass.blocks.entity;

import com.scouter.clearfluidglass.ClearFluidGlass;
import com.scouter.clearfluidglass.blocks.CFGBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CFGBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ClearFluidGlass.MODID);
    public static final RegistryObject<BlockEntityType<ClearFluidGlassBlockEntity>> CLEAR_FLUID_GLASS =
            BLOCK_ENTITIES.register("clear_fluid_glass_entity", () ->
                    BlockEntityType.Builder.of(ClearFluidGlassBlockEntity::new,
                            CFGBlocks.CLEAR_FLUID_GLASS.get()).build(null));
}
