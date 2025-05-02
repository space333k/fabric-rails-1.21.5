package net.space333.rails.block.custom;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class OxidizablePoweredRailBlock extends PoweredRailBlock implements Oxidizable {
	public static final MapCodec<OxidizablePoweredRailBlock> CODEC = RecordCodecBuilder.mapCodec(
			instance -> instance.group(OxidationLevel.CODEC
							.fieldOf("weathering_state").forGetter(Degradable::getDegradationLevel), createSettingsCodec())
					.apply(instance, OxidizablePoweredRailBlock::new)
	);
	private final OxidationLevel oxidationLevel;
	/*
	@Override
	public MapCodec<? extends RailBlock> getCodec() {
		return OxidizableRailBlock.CODEC;
	}
	*/

	public OxidizablePoweredRailBlock(OxidationLevel oxidationLevel, Settings settings) {
		super(settings);
		this.oxidationLevel = oxidationLevel;
	}

	@Override
	protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
		this.tickDegradation(state, world, pos, random);
	}

	@Override
	protected boolean hasRandomTicks(BlockState state) {
		return Oxidizable.getIncreasedOxidationBlock(state.getBlock()).isPresent();
	}

	public OxidationLevel getDegradationLevel() {
		return this.oxidationLevel;
	}

}
