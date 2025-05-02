package net.space333.rails.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.space333.rails.Rails;


import java.util.List;

public class ModItems {


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Rails.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Rails.LOGGER.info("Registering Mod Items for " + Rails.MOD_ID);
    }
}
