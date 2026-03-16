package com.milad.myfirstmod.block;



import com.milad.myfirstmod.MyFirstMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    // Add Blocks here :3
    public static final Block PALM_LOG = registerBlock("palm_log",
            new Block(AbstractBlock.Settings.create().strength(2.0f).resistance(2.0f).hardness(2.0f).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block PALM_PLANKS = registerBlock("palm_planks",
            new Block(AbstractBlock.Settings.create().strength(2.0f).resistance(2.0f).hardness(2.0f).sounds(BlockSoundGroup.WOOD).burnable()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MyFirstMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(MyFirstMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        MyFirstMod.LOGGER.info("Registering ModBlocks for " + MyFirstMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(PALM_LOG);
            entries.add(PALM_PLANKS);
        });
    }
}