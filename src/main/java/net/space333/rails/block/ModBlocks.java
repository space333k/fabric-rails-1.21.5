package net.space333.rails.block;

import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.space333.rails.Rails;
import net.space333.rails.block.custom.OxidizablePoweredRailBlock;
import net.space333.rails.block.custom.OxidizableRailBlock;
import net.space333.rails.block.custom.SelfPoweredRailBlock;

public class ModBlocks {
    public static final Block RAIL = registerBlock(
            "rail",
            new OxidizableRailBlock(
                    Oxidizable.OxidationLevel.UNAFFECTED,
                    AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Rails.MOD_ID,"rail")))
                            .mapColor(MapColor.ORANGE)
                            .strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER).noCollision()
            )
    );
    public static final Block EXPOSED_RAIL = registerBlock(
            "exposed_rail",
            new OxidizableRailBlock(
                    Oxidizable.OxidationLevel.EXPOSED,
                    AbstractBlock.Settings.copy(RAIL).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Rails.MOD_ID,"exposed_rail")))
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).noCollision()
            )
    );
    public static final Block WEATHERED_RAIL = registerBlock(
            "weathered_rail",
            new OxidizableRailBlock(
                    Oxidizable.OxidationLevel.WEATHERED,
                    AbstractBlock.Settings.copy(RAIL).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Rails.MOD_ID,"weathered_rail")))
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).noCollision()
            )
    );
    public static final Block OXIDIZED_RAIL = registerBlock(
            "oxidized_rail",
            new OxidizableRailBlock(
                    Oxidizable.OxidationLevel.OXIDIZED,
                    AbstractBlock.Settings.copy(RAIL).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Rails.MOD_ID,"oxidized_rail")))
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).noCollision()
            )
    );
    public static final Block WAXED_EXPOSED_RAIL = registerBlock(
            "waxed_exposed_rail",
            new RailBlock(
                    AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Rails.MOD_ID,"waxed_exposed_rail")))
                            .noCollision().strength(0.7F).sounds(BlockSoundGroup.METAL)
            )
    );
    public static final Block WAXED_WEATHERED_RAIL = registerBlock(
            "waxed_weathered_rail",
            new RailBlock(
                    AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Rails.MOD_ID,"waxed_weathered_rail")))
                            .noCollision().strength(0.7F).sounds(BlockSoundGroup.METAL)
            )
    );
    public static final Block WAXED_OXIDIZED_RAIL = registerBlock(
            "waxed_oxidized_rail",
            new RailBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Rails.MOD_ID,"waxed_oxidized_rail")))
                    .noCollision().strength(0.7F).sounds(BlockSoundGroup.METAL)
            )
    );
    public static final Block POWERED_RAIL = registerBlock(
            "powered_rail",
            new OxidizablePoweredRailBlock(
                    Oxidizable.OxidationLevel.UNAFFECTED,
                    AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Rails.MOD_ID,"powered_rail")))
                            .mapColor(MapColor.ORANGE)
                            .strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER).noCollision()
            )
    );
    public static final Block EXPOSED_POWERED_RAIL = registerBlock(
            "exposed_powered_rail",
            new OxidizablePoweredRailBlock(
                    Oxidizable.OxidationLevel.EXPOSED,
                    AbstractBlock.Settings.copy(POWERED_RAIL).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Rails.MOD_ID,"exposed_powered_rail")))
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).noCollision()
            )
    );
    public static final Block WEATHERED_POWERED_RAIL = registerBlock(
            "weathered_powered_rail",
            new OxidizablePoweredRailBlock(
                    Oxidizable.OxidationLevel.WEATHERED,
                    AbstractBlock.Settings.copy(POWERED_RAIL).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Rails.MOD_ID,"weathered_powered_rail")))
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).noCollision()
            )
    );
    public static final Block OXIDIZED_POWERED_RAIL = registerBlock(
            "oxidized_powered_rail",
            new OxidizablePoweredRailBlock(
                    Oxidizable.OxidationLevel.OXIDIZED,
                    AbstractBlock.Settings.copy(POWERED_RAIL).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Rails.MOD_ID,"oxidized_powered_rail")))
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).noCollision()
            )
    );
    public static final Block WAXED_EXPOSED_POWERED_RAIL = registerBlock(
            "waxed_exposed_powered_rail",
            new PoweredRailBlock(
                    AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Rails.MOD_ID,"waxed_exposed_powered_rail")))
                            .noCollision().strength(0.7F).sounds(BlockSoundGroup.METAL)
            )
    );
    public static final Block WAXED_WEATHERED_POWERED_RAIL = registerBlock(
            "waxed_weathered_powered_rail",
            new PoweredRailBlock(
                    AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Rails.MOD_ID,"waxed_weathered_powered_rail")))
                            .noCollision().strength(0.7F).sounds(BlockSoundGroup.METAL)
            )
    );
    public static final Block WAXED_OXIDIZED_POWERED_RAIL = registerBlock(
            "waxed_oxidized_powered_rail",
            new PoweredRailBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Rails.MOD_ID,"waxed_oxidized_powered_rail")))
                    .noCollision().strength(0.7F).sounds(BlockSoundGroup.METAL)
            )
    );
    public static final Block SELF_POWERED_RAIL = registerBlock(
            "self_powered_rail",
            new SelfPoweredRailBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Rails.MOD_ID,"self_powered_rail")))
                    .noCollision().strength(0.7F).sounds(BlockSoundGroup.METAL)
            )
    );


    public static void addOxidisableBlocks() {
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.RAIL, ModBlocks.EXPOSED_RAIL);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_RAIL, ModBlocks.WEATHERED_RAIL);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_RAIL, ModBlocks.OXIDIZED_RAIL);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.POWERED_RAIL, ModBlocks.EXPOSED_POWERED_RAIL);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_POWERED_RAIL, ModBlocks.WEATHERED_POWERED_RAIL);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_POWERED_RAIL, ModBlocks.OXIDIZED_POWERED_RAIL);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.RAIL, Blocks.RAIL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_RAIL, ModBlocks.WAXED_EXPOSED_RAIL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_RAIL, ModBlocks.WAXED_WEATHERED_RAIL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_RAIL, ModBlocks.WAXED_OXIDIZED_RAIL);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.POWERED_RAIL, Blocks.POWERED_RAIL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_POWERED_RAIL, ModBlocks.WAXED_EXPOSED_POWERED_RAIL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_POWERED_RAIL, ModBlocks.WAXED_WEATHERED_POWERED_RAIL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_POWERED_RAIL, ModBlocks.WAXED_OXIDIZED_POWERED_RAIL);

    }



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Rails.MOD_ID,name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Rails.MOD_ID,name),
                new BlockItem(block, new Item.Settings().registryKey(
                        RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Rails.MOD_ID,name))).useBlockPrefixedTranslationKey())
        );
    }

    public static void registerModBlocks() {
        Rails.LOGGER.info("Registering Mod Blocks for " + Rails.MOD_ID);
    }


}
