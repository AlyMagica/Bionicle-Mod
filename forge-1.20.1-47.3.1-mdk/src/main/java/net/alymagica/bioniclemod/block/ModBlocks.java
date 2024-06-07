package net.alymagica.bioniclemod.block;

import net.alymagica.bioniclemod.BionicleMod;
import net.alymagica.bioniclemod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BionicleMod.MOD_ID);

    public static final RegistryObject<Block> PROTODERMIS_BLOCK = registerBlock("protodermis_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> PROTOSTEEL_BLOCK = registerBlock("protosteel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(25.0F, 700.0F)));
    public static final RegistryObject<Block> LIGHTSTONE_BLOCK = registerBlock("lightstone_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).lightLevel((p_152607_) -> {
                return 15;
            })));
    public static final RegistryObject<Block> EXSIDIAN = registerBlock("exsidian",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)));
    public static final RegistryObject<Block> PROTODERMIS_ORE = registerBlock("protodermis_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> LIGHTSTONE_ORE = registerBlock("lightstone_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE).lightLevel((p_152607_) -> {
                return 8;
            })));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
