package com.scouter.clearfluidglass.datagen;

import com.scouter.clearfluidglass.ClearFluidGlass;
import com.scouter.clearfluidglass.blocks.CFGBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class LanguageGenerator extends LanguageProvider {
    public LanguageGenerator(PackOutput output) {
        super(output, ClearFluidGlass.MODID, "en_us");
    }

    @Override
    protected void addTranslations(){
        //BLOCKS
        addBlock(CFGBlocks.CLEAR_FLUID_GLASS, "Clear Fluid Glass");
        add("itemGroup.clearfluidglass", "Clear Fluid Glass Tab");
    }
}

