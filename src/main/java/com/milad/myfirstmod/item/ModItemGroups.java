package com.milad.myfirstmod.item;

import com.milad.myfirstmod.MyFirstMod;
import com.milad.myfirstmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MY_FIRST_MOD_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MyFirstMod.MOD_ID, "my_first_mod_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.Banana))
                    .displayName(Text.translatable("itemgroup.myfirstmod.my_first_mod_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.Banana);
                        entries.add(ModItems.Coconut);

                    }).build());

    public static final ItemGroup MY_FIRST_MOD_Block_GROUP = Registry.register(Registries.ITEM_GROUP,
                Identifier.of(MyFirstMod.MOD_ID, "my_first_mod_blocks"),
                FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.PALM_LOG))
                        .displayName(Text.translatable("itemgroup.myfirstmod.my_first_mod_blocks"))
                        .entries((displayContext, entries) -> {
                            entries.add(ModBlocks.PALM_LOG);
                            entries.add(ModBlocks.PALM_PLANKS);

                        }).build());


    public static void registerItemGroups() {
        MyFirstMod.LOGGER.info("Registering Item Groups for " + MyFirstMod.MOD_ID);
    }
}
