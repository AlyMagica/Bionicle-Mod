package net.alymagica.bioniclemod.item;

import net.alymagica.bioniclemod.BionicleMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.swing.*;

public class ModItems {
    public static final DeferredRegister <Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BionicleMod.MOD_ID);

    public static final RegistryObject<Item> RAW_PROTODERMIS = ITEMS.register("raw_protodermis",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_PROTODERMIS = ITEMS.register("ingot_protodermis",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_PROTOSTEEL = ITEMS.register("ingot_protosteel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ANTIDERMIS = ITEMS.register("antidermis",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_EXSIDIAN = ITEMS.register("ingot_exsidian",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
