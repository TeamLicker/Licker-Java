package com.floppa.bliffer.item;

import com.floppa.bliffer.BlifferMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BLIFFER_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BlifferMod.MOD_ID, "bliffer_seed"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.bliffer"))
                    .icon(() -> new ItemStack(ModItems.BLIFF_SEED)).entries((displayContext, entries) -> {
                        entries.add(ModItems.BLIFF_SEED);

                    }).build());


    public static void registerItemGroups() {
        BlifferMod.LOGGER.info("Registering Item Groups for " + BlifferMod.MOD_ID);
    }
}