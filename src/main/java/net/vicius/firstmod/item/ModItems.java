package net.vicius.firstmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.vicius.firstmod.FirstMod;


public class ModItems {
    public static final Item MAGNETITE_INGOT = registerItem("magnetite_ingot", new Item(new Item.Settings()));
    public static final Item RAW_MAGNETITE = registerItem("raw_magnetite", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(FirstMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FirstMod.LOGGER.info("Registering Mod Items for " + FirstMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(MAGNETITE_INGOT);
            entries.add(RAW_MAGNETITE);
        });
    }
}
