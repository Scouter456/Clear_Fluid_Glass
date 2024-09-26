package com.scouter.clearfluidglass.utils;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.material.Fluid;

import static com.scouter.clearfluidglass.ClearFluidGlass.prefix;

public class CFGTags {
    public static class Fluids {


        public static final TagKey<Fluid> CLEAR_FLUID_GLASS_FLUIDS_TAG = tag("clear_fluid_glass_fluids");


        private static TagKey<Fluid> tag(String name){
            return TagKey.create(Registries.FLUID, prefix(name));
        }

        private static TagKey<Fluid> forgeTag(String name){
            return TagKey.create(Registries.FLUID,  new ResourceLocation("fabric", name));

        }
    }
}
