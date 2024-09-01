package com.scouter.clearfluidglass.datagen;

import com.scouter.clearfluidglass.ClearFluidGlass;
import com.scouter.clearfluidglass.blocks.CFGBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

import static com.scouter.clearfluidglass.ClearFluidGlass.prefix;

public class ItemModelGenerator extends ItemModelProvider {
    public ItemModelGenerator(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ClearFluidGlass.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        //toBlock(CFGBlocks.CLEAR_FLUID_GLASS);




    }





    private void toBlock(DeferredBlock<Block> b) {
        toBlockModel(b, b.getId().getPath());
    }


    private void toBlockModel(DeferredBlock<Block> b, String model) {
        toBlockModel(b, prefix("block/" + model));
    }

    private void toBlockModel(DeferredBlock<Block>  b, ResourceLocation model) {
        withExistingParent(b.getId().getPath(), model);
    }


    private ResourceLocation key(Block block) {
        return BuiltInRegistries.BLOCK.getKey(block);
    }
}