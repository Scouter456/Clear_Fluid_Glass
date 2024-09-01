package com.scouter.clearfluidglass.client.renderer;

import com.scouter.clearfluidglass.blocks.CFGBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

public class RenderLayerRegistration {
    public static void init() {
        RenderType translucent = RenderType.translucent();

        ItemBlockRenderTypes.setRenderLayer(CFGBlocks.CLEAR_FLUID_GLASS.get(), translucent);
    }
}