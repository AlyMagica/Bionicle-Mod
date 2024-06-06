package net.alymagica.bioniclemod.item;

import net.alymagica.bioniclemod.BionicleMod;
import net.alymagica.bioniclemod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BionicleMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BIONICLE_MOD_TAB = CREATIVE_MODE_TABS.register("bionicle_mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RAW_PROTODERMIS.get()))
                    .title(Component.translatable("creativetab.bionicle_mod_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RAW_PROTODERMIS.get());
                        output.accept(ModItems.INGOT_PROTODERMIS.get());
                        output.accept(ModItems.INGOT_PROTOSTEEL.get());
                        output.accept(ModItems.ANTIDERMIS.get());
                        output.accept(ModItems.INGOT_EXSIDIAN.get());

                        output.accept(ModBlocks.LIGHTSTONE_BLOCK.get());
                        output.accept(ModBlocks.PROTODERMIS_BLOCK.get());
                        output.accept(ModBlocks.PROTOSTEEL_BLOCK.get());
                        output.accept(ModBlocks.EXSIDIAN.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
