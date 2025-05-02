package net.space333.rails.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.space333.rails.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.RAIL);
        addDrop(ModBlocks.EXPOSED_RAIL);
        addDrop(ModBlocks.WEATHERED_RAIL);
        addDrop(ModBlocks.OXIDIZED_RAIL);
        addDrop(ModBlocks.WAXED_EXPOSED_RAIL);
        addDrop(ModBlocks.WAXED_WEATHERED_RAIL);
        addDrop(ModBlocks.WAXED_OXIDIZED_RAIL);

        addDrop(ModBlocks.POWERED_RAIL);
        addDrop(ModBlocks.EXPOSED_POWERED_RAIL);
        addDrop(ModBlocks.WEATHERED_POWERED_RAIL);
        addDrop(ModBlocks.OXIDIZED_POWERED_RAIL);
        addDrop(ModBlocks.WAXED_EXPOSED_POWERED_RAIL);
        addDrop(ModBlocks.WAXED_WEATHERED_POWERED_RAIL);
        addDrop(ModBlocks.WAXED_OXIDIZED_POWERED_RAIL);

        addDrop(ModBlocks.SELF_POWERED_RAIL);
    }
}
