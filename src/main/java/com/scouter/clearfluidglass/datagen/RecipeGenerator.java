package com.scouter.clearfluidglass.datagen;

import com.scouter.clearfluidglass.items.CFGItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

import static com.scouter.clearfluidglass.ClearFluidGlass.prefix;

public class RecipeGenerator extends RecipeProvider implements IConditionBuilder {


    public RecipeGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(pOutput, lookupProvider);
    }

    @Override
    protected void buildRecipes(RecipeOutput consumer) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,CFGItems.CLEAR_FLUID_GLASS.get(), 2)
                .define('g', Items.GLASS)
                .pattern("gg")
                .unlockedBy("has_glass", has(Items.GLASS))
                .save(consumer,  prefix(CFGItems.CLEAR_FLUID_GLASS.get().getDescriptionId().replaceAll("block.clearfluidglass.", "")));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Items.GLASS, 1)
                .requires(CFGItems.CLEAR_FLUID_GLASS)
                .unlockedBy("has_clear_fluid_glass", has(CFGItems.CLEAR_FLUID_GLASS.get()))
                .save(consumer,  prefix(Items.GLASS.getDescriptionId().replaceAll("block.minecraft.", "")));
    }
}
