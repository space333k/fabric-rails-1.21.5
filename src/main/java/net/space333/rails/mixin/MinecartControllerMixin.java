package net.space333.rails.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.entity.vehicle.ExperimentalMinecartController;
import net.minecraft.entity.vehicle.MinecartController;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.space333.rails.block.ModBlocks;
import net.space333.rails.util.ModTags;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ExperimentalMinecartController.class)
public abstract class MinecartControllerMixin extends MinecartController {
    protected MinecartControllerMixin(AbstractMinecartEntity minecart) {
        super(minecart);
    }

    @Unique
    public BlockPos getRailOrMinecartPos() {
        int i = MathHelper.floor(this.getX());
        int j = MathHelper.floor(this.getY());
        int k = MathHelper.floor(this.getZ());
        double d = this.getY() - 0.1 - 1.0E-5F;
        if (this.getWorld().getBlockState(BlockPos.ofFloored(i, d, k)).isIn(BlockTags.RAILS)) {
            j = MathHelper.floor(d);
        }
        return new BlockPos(i, j, k);
    }

    /**
     * @author
     * @reason
     */
    @Overwrite
    public double getMaxSpeed(ServerWorld world) {
        double maxSpeed = 64;

        BlockPos blockPos = this.getRailOrMinecartPos();
        BlockState blockState = this.getWorld().getBlockState(blockPos);

        if(blockState.isIn(ModTags.Blocks.EXPOSED_RAILS)) {
            maxSpeed = maxSpeed*6/8;
        }
        else if(blockState.isIn(ModTags.Blocks.WEATHERED_RAILS)) {
            maxSpeed = maxSpeed*4/8;
        }
        else if(blockState.isIn(ModTags.Blocks.OXIDIZED_RAILS)) {
            maxSpeed = maxSpeed*2/8;
        }
        else if(blockState.isOf(ModBlocks.POWERED_RAIL) || blockState.isOf(Blocks.POWERED_RAIL)) {
            maxSpeed = maxSpeed*4/8;
        }
        else if(blockState.isOf(ModBlocks.EXPOSED_POWERED_RAIL) || blockState.isOf(ModBlocks.WAXED_EXPOSED_POWERED_RAIL)) {
            maxSpeed = maxSpeed*3/8;
        }
        else if(blockState.isOf(ModBlocks.WEATHERED_POWERED_RAIL) || blockState.isOf(ModBlocks.WAXED_WEATHERED_POWERED_RAIL)) {
            maxSpeed = maxSpeed*2/8;
        }
        else if(blockState.isOf(ModBlocks.OXIDIZED_POWERED_RAIL) || blockState.isOf(ModBlocks.WAXED_OXIDIZED_POWERED_RAIL)) {
            maxSpeed = maxSpeed*1/8;
        }

        return maxSpeed * (this.minecart.isTouchingWater() ? 0.5 : 1.0) / 20.0;
    }

    @Redirect(method = "decelerateFromPoweredRail", at = @At(value = "INVOKE", target = "Lnet/minecraft/block/BlockState;isOf(Lnet/minecraft/block/Block;)Z"))
    public boolean applyPoweredTagToDecrease(BlockState railState, Block block) {
        return railState.isIn(ModTags.Blocks.POWERED_RAILS);
    }

    @Redirect(method = "accelerateFromPoweredRail", at = @At(value = "INVOKE", target = "Lnet/minecraft/block/BlockState;isOf(Lnet/minecraft/block/Block;)Z"))
    public boolean applyPoweredTagToAccelerate(BlockState railState, Block block) {
        return railState.isIn(ModTags.Blocks.POWERED_RAILS);
    }


}
