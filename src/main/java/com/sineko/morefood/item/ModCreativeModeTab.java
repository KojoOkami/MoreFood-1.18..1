package com.sineko.morefood.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MOREFOOD_TAB = new CreativeModeTab("moreFoodTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RAW_SALT.get());
        }
    };
}
