package com.scouter.clearfluidglass.datagen;

import com.scouter.clearfluidglass.ClearFluidGlass;
import com.scouter.clearfluidglass.blocks.CFGBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class BlockTagGenerator extends BlockTagsProvider {
    public BlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ClearFluidGlass.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(CFGBlocks.CLEAR_FLUID_GLASS.get());
        tag(BlockTags.IMPERMEABLE)
                .add(CFGBlocks.CLEAR_FLUID_GLASS.get());

    }
}
