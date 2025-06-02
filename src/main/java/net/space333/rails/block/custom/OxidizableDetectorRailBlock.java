package net.space333.rails.block.custom;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class OxidizableDetectorRailBlock extends DetectorRailBlock implements Oxidizable {
	public static final MapCodec<OxidizableDetectorRailBlock> CODEC = RecordCodecBuilder.mapCodec(
			instance -> instance.group(OxidationLevel.CODEC
							.fieldOf("weathering_state").forGetter(Degradable::getDegradationLevel), createSettingsCodec())
					.apply(instance, OxidizableDetectorRailBlock::new)
	);
	private final OxidationLevel oxidationLevel;
	/*
	@Override
	public MapCodec<OxidizableRailBlock> getCodec() {
		return CODEC;
	}
	*/

	public OxidizableDetectorRailBlock(OxidationLevel oxidationLevel, Settings settings) {
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
