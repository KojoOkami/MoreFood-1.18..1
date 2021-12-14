package com.sineko.morefood.item;

import com.sineko.morefood.MoreFood;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoreFood.MOD_ID); // List of items created

    /*
     * Materials
     */
    public static final RegistryObject<Item> RAW_SALT = ITEMS.register("raw_salt",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOREFOOD_TAB)));

    /*
     * Registry
     */
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus); // Registers list with forge
    }

}
