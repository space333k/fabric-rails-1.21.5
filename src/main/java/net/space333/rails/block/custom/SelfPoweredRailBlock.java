package net.space333.rails.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PoweredRailBlock;
import net.minecraft.block.enums.RailShape;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SelfPoweredRailBlock extends PoweredRailBlock {
    public SelfPoweredRailBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected void updateBlockState(BlockState state, World world, BlockPos pos, Block neighbor) {
        boolean bl = (Boolean)state.get(POWERED);
        boolean bl2 = true;
        if (bl2 != bl) {
            world.setBlockState(pos, state.with(POWERED, bl2), Block.NOTIFY_ALL);
            world.updateNeighbors(pos.down(), this);
            if (((RailShape)state.get(SHAPE)).isAscending()) {
                world.updateNeighbors(pos.up(), this);
            }
        }
    }

}
