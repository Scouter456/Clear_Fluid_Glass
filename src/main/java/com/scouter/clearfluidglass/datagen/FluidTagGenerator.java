package com.scouter.clearfluidglass.datagen;

import com.scouter.clearfluidglass.ClearFluidGlass;
import com.scouter.clearfluidglass.utils.CFGTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.FluidTagsProvider;
import net.minecraft.tags.FluidTags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class FluidTagGenerator extends FluidTagsProvider {
    public FluidTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ClearFluidGlass.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(CFGTags.Fluids.CLEAR_FLUID_GLASS_FLUIDS_TAG).addTag(FluidTags.WATER);
    }
}
