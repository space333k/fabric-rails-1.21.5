package net.space333.rails.mixin;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.AbstractRailBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PoweredRailBlock;
import net.minecraft.block.enums.RailShape;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.space333.rails.block.ModBlocks;
import net.space333.rails.util.ModTags;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(PoweredRailBlock.class)
public abstract class PoweredRailBlockMixin extends AbstractRailBlock {
    protected PoweredRailBlockMixin(boolean forbidCurves, Settings settings) {
        super(forbidCurves, settings);
    }

    @Redirect(method = "isPoweredByOtherRails(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;ZILnet/minecraft/block/enums/RailShape;)Z",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/block/BlockState;isOf(Lnet/minecraft/block/Block;)Z"))
    private boolean poweredCondition(BlockState blockstate, Block block) {
         return blockstate.isIn(ModTags.Blocks.POWERED_RAILS);
    }

    @Redirect(method = "isPoweredByOtherRails(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;ZILnet/minecraft/block/enums/RailShape;)Z",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/world/World;isReceivingRedstonePower(Lnet/minecraft/util/math/BlockPos;)Z"))
    private boolean CheckSelfPoweredRail(World world, BlockPos pos) {
        return world.isReceivingRedstonePower(pos) || world.getBlockState(pos).isOf(ModBlocks.SELF_POWERED_RAIL);
    }

}
