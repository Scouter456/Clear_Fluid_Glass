package com.scouter.clearfluidglass.creativetabs;

import com.scouter.clearfluidglass.ClearFluidGlass;
import com.scouter.clearfluidglass.items.CFGItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.scouter.clearfluidglass.ClearFluidGlass.prefix;

public class CFGTabs {

    public static final Logger LOGGER = LoggerFactory.getLogger(ClearFluidGlass.MODID);

    private static final CreativeModeTab CFG = FabricItemGroup
            .builder()
            .title(Component.translatable("itemGroup.clearfluidglass"))
            .displayItems((enabledFeatures, entries) -> {
                entries.accept(CFGItems.CLEAR_FLUID_GLASS);
            })
            .icon(CFGItems.CLEAR_FLUID_GLASS::getDefaultInstance)
            .build();



    public static final CreativeModeTab CFG_TAB = creativeModeTab("clearfluidglass", CFG);

    private static CreativeModeTab creativeModeTab(String name, CreativeModeTab item) {
        return Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, prefix(name), item);
    }
    private static void generateEnchantsForBoots(CreativeModeTab.Output output, HolderLookup<Enchantment> lookup, Item item, CreativeModeTab.TabVisibility tabVisibility) {
        ItemStack soulsuckerBoots = new ItemStack(item);
        lookup.get(Enchantments.SOUL_SPEED).ifPresent(e -> {
            soulsuckerBoots.enchant(e, 3);
        });
        output.accept(soulsuckerBoots, tabVisibility);
    }

    public static void TABS(){
        LOGGER.info("Registering tabs for " + ClearFluidGlass.MODID);
    }
}
