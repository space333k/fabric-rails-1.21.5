package net.space333.rails.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.space333.rails.Rails;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> POWERED_RAILS = createTag("powered_rails");
        public static final TagKey<Block> UNAFFECTED_RAILS = createTag("unaffected_rails");
        public static final TagKey<Block> EXPOSED_RAILS = createTag("exposed_rails");
        public static final TagKey<Block> WEATHERED_RAILS = createTag("weathered_rails");
        public static final TagKey<Block> OXIDIZED_RAILS = createTag("oxidized_rails");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Rails.MOD_ID, name));
        }
    }
}
