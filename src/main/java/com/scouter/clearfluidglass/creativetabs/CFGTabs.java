package com.scouter.clearfluidglass.creativetabs;

import com.scouter.clearfluidglass.ClearFluidGlass;
import com.scouter.clearfluidglass.items.CFGItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CFGTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ClearFluidGlass.MODID);

    private static final CreativeModeTab CFG = new CreativeModeTab.Builder(CreativeModeTab.Row.TOP, 9)
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .title(Component.translatable("itemGroup.clearfluidglass"))
            .icon(() -> new ItemStack(CFGItems.CLEAR_FLUID_GLASS.get()))
            .displayItems((d, entries) ->{
                entries.accept(CFGItems.CLEAR_FLUID_GLASS.get());
            })
            .build();

    public static final DeferredHolder<CreativeModeTab, ?> CFG_TAB = TABS.register("clearfluidglass", () -> CFG);


}
