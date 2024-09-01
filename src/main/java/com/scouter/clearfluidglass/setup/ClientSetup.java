package com.scouter.clearfluidglass.setup;

import com.scouter.clearfluidglass.blocks.CFGBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public class ClientSetup implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        RenderLayerRegistration();
    }


    public static void RenderLayerRegistration(){

        RenderType translucent = RenderType.translucent();

        BlockRenderLayerMap.INSTANCE.putBlock(CFGBlocks.CLEAR_FLUID_GLASS, translucent);
    }


}
