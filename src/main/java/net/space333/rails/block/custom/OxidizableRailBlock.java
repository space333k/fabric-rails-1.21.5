package net.space333.rails.block.custom;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.block.Degradable;
import net.minecraft.block.Oxidizable;
import net.minecraft.block.RailBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class OxidizableRailBlock extends RailBlock implements Oxidizable {
	public static final MapCodec<OxidizableRailBlock> CODEC = RecordCodecBuilder.mapCodec(
			instance -> instance.group(OxidationLevel.CODEC
							.fieldOf("weathering_state").forGetter(Degradable::getDegradationLevel), createSettingsCodec())
					.apply(instance, OxidizableRailBlock::new)
	);
	private final OxidationLevel oxidationLevel;
	/*
	@Override
	public MapCodec<OxidizableRailBlock> getCodec() {
		return CODEC;
	}
	*/

	public OxidizableRailBlock(OxidationLevel oxidationLevel, Settings settings) {
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
