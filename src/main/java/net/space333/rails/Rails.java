package net.space333.rails;

import net.fabricmc.api.ModInitializer;

import net.space333.rails.block.ModBlocks;
import net.space333.rails.item.ModItemGroups;
import net.space333.rails.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rails implements ModInitializer {
	public static final String MOD_ID = "rails";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModBlocks.addOxidisableBlocks();
	}
}