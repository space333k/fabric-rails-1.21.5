package net.space333.rails.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.space333.rails.block.ModBlocks;
import net.space333.rails.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
    getOrCreateTagBuilder(BlockTags.RAILS)
            .add(ModBlocks.RAIL)
            .add(ModBlocks.EXPOSED_RAIL)
            .add(ModBlocks.WEATHERED_RAIL)
            .add(ModBlocks.OXIDIZED_RAIL)
            .add(ModBlocks.WAXED_EXPOSED_RAIL)
            .add(ModBlocks.WAXED_WEATHERED_RAIL)
            .add(ModBlocks.WAXED_OXIDIZED_RAIL)
            .add(ModBlocks.POWERED_RAIL)
            .add(ModBlocks.EXPOSED_POWERED_RAIL)
            .add(ModBlocks.WEATHERED_POWERED_RAIL)
            .add(ModBlocks.OXIDIZED_POWERED_RAIL)
            .add(ModBlocks.WAXED_EXPOSED_POWERED_RAIL)
            .add(ModBlocks.WAXED_WEATHERED_POWERED_RAIL)
            .add(ModBlocks.WAXED_OXIDIZED_POWERED_RAIL)
            .add(ModBlocks.SELF_POWERED_RAIL);

    getOrCreateTagBuilder(ModTags.Blocks.POWERED_RAILS)
            .add(ModBlocks.POWERED_RAIL)
            .add(ModBlocks.EXPOSED_POWERED_RAIL)
            .add(ModBlocks.WEATHERED_POWERED_RAIL)
            .add(ModBlocks.OXIDIZED_POWERED_RAIL)
            .add(Blocks.POWERED_RAIL)
            .add(ModBlocks.WAXED_EXPOSED_POWERED_RAIL)
            .add(ModBlocks.WAXED_WEATHERED_POWERED_RAIL)
            .add(ModBlocks.WAXED_OXIDIZED_POWERED_RAIL)
            .add(ModBlocks.SELF_POWERED_RAIL);
    }


}
