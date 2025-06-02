package net.space333.rails.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.space333.rails.block.ModBlocks;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerTurnableRail(ModBlocks.RAIL);
        blockStateModelGenerator.registerTurnableRail(ModBlocks.EXPOSED_RAIL);
        blockStateModelGenerator.registerTurnableRail(ModBlocks.WEATHERED_RAIL);
        blockStateModelGenerator.registerTurnableRail(ModBlocks.OXIDIZED_RAIL);
        blockStateModelGenerator.registerTurnableRail(ModBlocks.WAXED_EXPOSED_RAIL);
        blockStateModelGenerator.registerTurnableRail(ModBlocks.WAXED_WEATHERED_RAIL);
        blockStateModelGenerator.registerTurnableRail(ModBlocks.WAXED_OXIDIZED_RAIL);

        blockStateModelGenerator.registerStraightRail(ModBlocks.POWERED_RAIL);
        blockStateModelGenerator.registerStraightRail(ModBlocks.EXPOSED_POWERED_RAIL);
        blockStateModelGenerator.registerStraightRail(ModBlocks.WEATHERED_POWERED_RAIL);
        blockStateModelGenerator.registerStraightRail(ModBlocks.OXIDIZED_POWERED_RAIL);
        blockStateModelGenerator.registerStraightRail(ModBlocks.WAXED_EXPOSED_POWERED_RAIL);
        blockStateModelGenerator.registerStraightRail(ModBlocks.WAXED_WEATHERED_POWERED_RAIL);
        blockStateModelGenerator.registerStraightRail(ModBlocks.WAXED_OXIDIZED_POWERED_RAIL);

        blockStateModelGenerator.registerStraightRail(ModBlocks.SELF_POWERED_RAIL);

        blockStateModelGenerator.registerStraightRail(ModBlocks.DETECTOR_RAIL);
        blockStateModelGenerator.registerStraightRail(ModBlocks.EXPOSED_DETECTOR_RAIL);
        blockStateModelGenerator.registerStraightRail(ModBlocks.WEATHERED_DETECTOR_RAIL);
        blockStateModelGenerator.registerStraightRail(ModBlocks.OXIDIZED_DETECTOR_RAIL);
        blockStateModelGenerator.registerStraightRail(ModBlocks.WAXED_EXPOSED_DETECTOR_RAIL);
        blockStateModelGenerator.registerStraightRail(ModBlocks.WAXED_WEATHERED_DETECTOR_RAIL);
        blockStateModelGenerator.registerStraightRail(ModBlocks.WAXED_OXIDIZED_DETECTOR_RAIL);

        blockStateModelGenerator.registerStraightRail(ModBlocks.ACTIVATOR_RAIL);
        blockStateModelGenerator.registerStraightRail(ModBlocks.EXPOSED_ACTIVATOR_RAIL);
        blockStateModelGenerator.registerStraightRail(ModBlocks.WEATHERED_ACTIVATOR_RAIL);
        blockStateModelGenerator.registerStraightRail(ModBlocks.OXIDIZED_ACTIVATOR_RAIL);
        blockStateModelGenerator.registerStraightRail(ModBlocks.WAXED_EXPOSED_ACTIVATOR_RAIL);
        blockStateModelGenerator.registerStraightRail(ModBlocks.WAXED_WEATHERED_ACTIVATOR_RAIL);
        blockStateModelGenerator.registerStraightRail(ModBlocks.WAXED_OXIDIZED_ACTIVATOR_RAIL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
