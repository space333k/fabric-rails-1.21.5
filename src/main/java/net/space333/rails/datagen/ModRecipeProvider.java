package net.space333.rails.datagen;

import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.space333.rails.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider  extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                /*createShaped(RecipeCategory.TRANSPORTATION, Blocks.RAIL, 16)
                        .pattern("CHC")
                        .pattern("CSC")
                        .pattern("C C")
                        .input('C', Items.COPPER_INGOT)
                        .input('H', Items.HONEYCOMB)
                        .input('S', Items.STICK)
                        .criterion(hasItem(Blocks.RAIL), conditionsFromItem(Blocks.RAIL))
                        .offerTo(recipeExporter, getRecipeName(Items.RAIL));
                 */
                createShaped(RecipeCategory.TRANSPORTATION, ModBlocks.RAIL, 16)
                        .pattern("C C")
                        .pattern("CSC")
                        .pattern("C C")
                        .input('C', Items.COPPER_INGOT)
                        .input('S', Items.STICK)
                        .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                        .offerTo(recipeExporter);

                /*createShaped(RecipeCategory.TRANSPORTATION, Blocks.POWERED_RAIL, 3)
                        .pattern("ICI")
                        .pattern("RCR")
                        .pattern("ICI")
                        .input('C', Blocks.RAIL)
                        .input('R', Items.REDSTONE)
                        .input('I', Items.IRON_INGOT)
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(recipeExporter);
                 */
                createShaped(RecipeCategory.TRANSPORTATION, ModBlocks.WAXED_EXPOSED_POWERED_RAIL, 3)
                        .pattern("ICI")
                        .pattern("RCR")
                        .pattern("ICI")
                        .input('C', ModBlocks.WAXED_EXPOSED_RAIL)
                        .input('R', Items.REDSTONE)
                        .input('I', Items.IRON_INGOT)
                        .group("waxed_exposed_powered_rail")
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(recipeExporter, String.valueOf(Identifier.of("rails", "waxed_exposed_powered_rail_from_waxed_exposed_rail")));
                createShaped(RecipeCategory.TRANSPORTATION, ModBlocks.WAXED_WEATHERED_POWERED_RAIL, 3)
                        .pattern("ICI")
                        .pattern("RCR")
                        .pattern("ICI")
                        .input('C', ModBlocks.WAXED_WEATHERED_RAIL)
                        .input('R', Items.REDSTONE)
                        .input('I', Items.IRON_INGOT)
                        .group("waxed_weathered_powered_rail")
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(recipeExporter, String.valueOf(Identifier.of("rails", "waxed_weathered_powered_rail_from_waxed_weathered_rail")));
                createShaped(RecipeCategory.TRANSPORTATION, ModBlocks.WAXED_OXIDIZED_POWERED_RAIL, 3)
                        .pattern("ICI")
                        .pattern("RCR")
                        .pattern("ICI")
                        .input('C', ModBlocks.WAXED_OXIDIZED_RAIL)
                        .input('R', Items.REDSTONE)
                        .input('I', Items.IRON_INGOT)
                        .group("waxed_oxidized_powered_rail")
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(recipeExporter, String.valueOf(Identifier.of("rails", "waxed_oxidized_powered_rail_from_waxed_oxidized_rail")));

                createShaped(RecipeCategory.TRANSPORTATION, ModBlocks.POWERED_RAIL, 3)
                        .pattern("ICI")
                        .pattern("RCR")
                        .pattern("ICI")
                        .input('C', ModBlocks.RAIL)
                        .input('R', Items.REDSTONE)
                        .input('I', Items.IRON_INGOT)
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.TRANSPORTATION, ModBlocks.EXPOSED_POWERED_RAIL, 3)
                        .pattern("ICI")
                        .pattern("RCR")
                        .pattern("ICI")
                        .input('C', ModBlocks.EXPOSED_RAIL)
                        .input('R', Items.REDSTONE)
                        .input('I', Items.IRON_INGOT)
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.TRANSPORTATION, ModBlocks.WEATHERED_POWERED_RAIL, 3)
                        .pattern("ICI")
                        .pattern("RCR")
                        .pattern("ICI")
                        .input('C', ModBlocks.WEATHERED_RAIL)
                        .input('R', Items.REDSTONE)
                        .input('I', Items.IRON_INGOT)
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.TRANSPORTATION, ModBlocks.OXIDIZED_POWERED_RAIL, 3)
                        .pattern("ICI")
                        .pattern("RCR")
                        .pattern("ICI")
                        .input('C', ModBlocks.OXIDIZED_RAIL)
                        .input('R', Items.REDSTONE)
                        .input('I', Items.IRON_INGOT)
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(recipeExporter);

                createShapeless(RecipeCategory.TRANSPORTATION, Blocks.RAIL)
                        .input(ModBlocks.RAIL)
                        .input(Items.HONEYCOMB)
                        .group("rail")
                        .criterion(hasItem(Items.HONEYCOMB), conditionsFromItem(Items.HONEYCOMB))
                        .offerTo(recipeExporter, String.valueOf(Identifier.of("rails", "rail_from_wax")));
                createShapeless(RecipeCategory.TRANSPORTATION, ModBlocks.WAXED_EXPOSED_RAIL)
                        .input(ModBlocks.EXPOSED_RAIL)
                        .input(Items.HONEYCOMB)
                        .criterion(hasItem(Items.HONEYCOMB), conditionsFromItem(Items.HONEYCOMB))
                        .offerTo(recipeExporter);
                createShapeless(RecipeCategory.TRANSPORTATION, ModBlocks.WAXED_WEATHERED_RAIL)
                        .input(ModBlocks.WEATHERED_RAIL)
                        .input(Items.HONEYCOMB)
                        .criterion(hasItem(Items.HONEYCOMB), conditionsFromItem(Items.HONEYCOMB))
                        .offerTo(recipeExporter);
                createShapeless(RecipeCategory.TRANSPORTATION, ModBlocks.WAXED_OXIDIZED_RAIL)
                        .input(ModBlocks.OXIDIZED_RAIL)
                        .input(Items.HONEYCOMB)
                        .criterion(hasItem(Items.HONEYCOMB), conditionsFromItem(Items.HONEYCOMB))
                        .offerTo(recipeExporter);

                createShapeless(RecipeCategory.TRANSPORTATION, Blocks.POWERED_RAIL)
                        .input(ModBlocks.POWERED_RAIL)
                        .input(Items.HONEYCOMB)
                        .group("powered_rail")
                        .criterion(hasItem(Items.HONEYCOMB), conditionsFromItem(Items.HONEYCOMB))
                        .offerTo(recipeExporter, String.valueOf(Identifier.of("rails", "powered_rail_from_wax")));
                createShapeless(RecipeCategory.TRANSPORTATION, ModBlocks.WAXED_EXPOSED_POWERED_RAIL)
                        .input(ModBlocks.EXPOSED_POWERED_RAIL)
                        .input(Items.HONEYCOMB)
                        .group("rails")
                        .group("waxed_exposed_powered_rail")
                        .criterion(hasItem(Items.HONEYCOMB), conditionsFromItem(Items.HONEYCOMB))
                        .offerTo(recipeExporter, String.valueOf(Identifier.of("rails", "waxed_exposed_powered_rail_from_wax")));
                createShapeless(RecipeCategory.TRANSPORTATION, ModBlocks.WAXED_WEATHERED_POWERED_RAIL)
                        .input(ModBlocks.WEATHERED_POWERED_RAIL)
                        .input(Items.HONEYCOMB)
                        .group("waxed_weathered_powered_rail")
                        .criterion(hasItem(Items.HONEYCOMB), conditionsFromItem(Items.HONEYCOMB))
                        .offerTo(recipeExporter, String.valueOf(Identifier.of("rails", "waxed_weathered_powered_rail_from_wax")));
                createShapeless(RecipeCategory.TRANSPORTATION, ModBlocks.WAXED_OXIDIZED_POWERED_RAIL)
                        .input(ModBlocks.OXIDIZED_POWERED_RAIL)
                        .input(Items.HONEYCOMB)
                        .group("waxed_oxidized_powered_rail")
                        .criterion(hasItem(Items.HONEYCOMB), conditionsFromItem(Items.HONEYCOMB))
                        .offerTo(recipeExporter, String.valueOf(Identifier.of("rails", "waxed_oxidized_powered_rail_from_wax")));

                createShaped(RecipeCategory.TRANSPORTATION, ModBlocks.SELF_POWERED_RAIL, 8)
                        .pattern("GRG")
                        .pattern("GCG")
                        .pattern("GRG")
                        .input('C', ModBlocks.RAIL)
                        .input('R', Blocks.REDSTONE_BLOCK)
                        .input('G', Items.GOLD_INGOT)
                        .group("self_powered_rail")
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(recipeExporter, String.valueOf(Identifier.of("rails", "self_powered_rail_from_rail")));
                createShaped(RecipeCategory.TRANSPORTATION, ModBlocks.SELF_POWERED_RAIL, 8)
                        .pattern("GRG")
                        .pattern("GCG")
                        .pattern("GRG")
                        .input('C', ModBlocks.EXPOSED_RAIL)
                        .input('R', Blocks.REDSTONE_BLOCK)
                        .input('G', Items.GOLD_INGOT)
                        .group("self_powered_rail")
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(recipeExporter, String.valueOf(Identifier.of("rails", "self_powered_rail_from_exposed_rail")));
                createShaped(RecipeCategory.TRANSPORTATION, ModBlocks.SELF_POWERED_RAIL, 8)
                        .pattern("GRG")
                        .pattern("GCG")
                        .pattern("GRG")
                        .input('C', ModBlocks.WEATHERED_RAIL)
                        .input('R', Blocks.REDSTONE_BLOCK)
                        .input('G', Items.GOLD_INGOT)
                        .group("self_powered_rail")
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(recipeExporter, String.valueOf(Identifier.of("rails", "self_powered_rail_from_weathered_rail")));
                createShaped(RecipeCategory.TRANSPORTATION, ModBlocks.SELF_POWERED_RAIL, 8)
                        .pattern("GRG")
                        .pattern("GCG")
                        .pattern("GRG")
                        .input('C', ModBlocks.OXIDIZED_RAIL)
                        .input('R', Blocks.REDSTONE_BLOCK)
                        .input('G', Items.GOLD_INGOT)
                        .group("self_powered_rail")
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(recipeExporter, String.valueOf(Identifier.of("rails", "self_powered_rail_from_oxidized_rail")));
                createShaped(RecipeCategory.TRANSPORTATION, ModBlocks.SELF_POWERED_RAIL, 8)
                        .pattern("GRG")
                        .pattern("GCG")
                        .pattern("GRG")
                        .input('C', Blocks.RAIL)
                        .input('R', Blocks.REDSTONE_BLOCK)
                        .input('G', Items.GOLD_INGOT)
                        .group("self_powered_rail")
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(recipeExporter, String.valueOf(Identifier.of("rails", "self_powered_rail_from_waxed_rail")));
                createShaped(RecipeCategory.TRANSPORTATION, ModBlocks.SELF_POWERED_RAIL, 8)
                        .pattern("GRG")
                        .pattern("GCG")
                        .pattern("GRG")
                        .input('C', ModBlocks.WAXED_EXPOSED_RAIL)
                        .input('R', Blocks.REDSTONE_BLOCK)
                        .input('G', Items.GOLD_INGOT)
                        .group("self_powered_rail")
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(recipeExporter, String.valueOf(Identifier.of("rails", "self_powered_rail_from_waxed_exposed_rail")));
                createShaped(RecipeCategory.TRANSPORTATION, ModBlocks.SELF_POWERED_RAIL, 8)
                        .pattern("GRG")
                        .pattern("GCG")
                        .pattern("GRG")
                        .input('C', ModBlocks.WAXED_WEATHERED_RAIL)
                        .input('R', Blocks.REDSTONE_BLOCK)
                        .input('G', Items.GOLD_INGOT)
                        .group("self_powered_rail")
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(recipeExporter, String.valueOf(Identifier.of("rails", "self_powered_rail_from_waxed_weathered_rail")));
                createShaped(RecipeCategory.TRANSPORTATION, ModBlocks.SELF_POWERED_RAIL, 8)
                        .pattern("GRG")
                        .pattern("GCG")
                        .pattern("GRG")
                        .input('C', ModBlocks.WAXED_OXIDIZED_RAIL)
                        .input('R', Blocks.REDSTONE_BLOCK)
                        .input('G', Items.GOLD_INGOT)
                        .group("self_powered_rail")
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(recipeExporter, String.valueOf(Identifier.of("rails", "self_powered_rail_from_waxed_oxidized_rail")));
                createShaped(RecipeCategory.TRANSPORTATION, ModBlocks.SELF_POWERED_RAIL, 3)
                        .pattern("GRG")
                        .pattern("GSG")
                        .pattern("GRG")
                        .input('S', Items.STICK)
                        .input('R', Blocks.REDSTONE_BLOCK)
                        .input('G', Items.GOLD_INGOT)
                        .group("self_powered_rail")
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(recipeExporter);
            }
        };
    }

    @Override
    public String getName() {
        return "Rails recipe";
    }
}
