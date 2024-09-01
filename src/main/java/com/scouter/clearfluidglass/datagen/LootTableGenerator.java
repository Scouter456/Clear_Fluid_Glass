package com.scouter.clearfluidglass.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class LootTableGenerator extends LootTableProvider{
    public LootTableGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(pOutput, Set.of(),
                List.of(
                        new LootTableProvider.SubProviderEntry(LootTableBlocks::new, LootContextParamSets.BLOCK)
                ),lookupProvider
        );
    }
}
