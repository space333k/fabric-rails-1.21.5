package net.space333.rails.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.space333.rails.Rails;
import net.space333.rails.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup RAILS_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Rails.MOD_ID, "rail_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Blocks.RAIL))
                    .displayName(Text.translatable("itemgroup.rails.rail_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(Items.MINECART);
                        entries.add(Blocks.ACTIVATOR_RAIL);
                        entries.add(Blocks.DETECTOR_RAIL);
                        entries.add(ModBlocks.RAIL);
                        entries.add(ModBlocks.EXPOSED_RAIL);
                        entries.add(ModBlocks.WEATHERED_RAIL);
                        entries.add(ModBlocks.OXIDIZED_RAIL);
                        entries.add(Blocks.RAIL);
                        entries.add(ModBlocks.WAXED_EXPOSED_RAIL);
                        entries.add(ModBlocks.WAXED_WEATHERED_RAIL);
                        entries.add(ModBlocks.WAXED_OXIDIZED_RAIL);
                        entries.add(ModBlocks.POWERED_RAIL);
                        entries.add(ModBlocks.EXPOSED_POWERED_RAIL);
                        entries.add(ModBlocks.WEATHERED_POWERED_RAIL);
                        entries.add(ModBlocks.OXIDIZED_POWERED_RAIL);
                        entries.add(Blocks.POWERED_RAIL);
                        entries.add(ModBlocks.WAXED_EXPOSED_POWERED_RAIL);
                        entries.add(ModBlocks.WAXED_WEATHERED_POWERED_RAIL);
                        entries.add(ModBlocks.WAXED_OXIDIZED_POWERED_RAIL);
                        entries.add(ModBlocks.SELF_POWERED_RAIL);
                    }).build());

    public static void registerItemGroups() {
        Rails.LOGGER.info("Registering Item Groups for " + Rails.MOD_ID);
    }

}
