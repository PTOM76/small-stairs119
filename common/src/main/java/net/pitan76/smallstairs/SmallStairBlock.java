package net.pitan76.smallstairs;

import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.block.enums.StairShape;
import net.minecraft.util.shape.VoxelShape;
import net.pitan76.mcpitanlib.api.block.CompatStairsBlock;
import net.pitan76.mcpitanlib.api.block.v2.CompatibleBlockSettings;
import net.pitan76.mcpitanlib.api.event.block.OutlineShapeEvent;
import net.pitan76.mcpitanlib.api.util.BlockStateUtil;
import net.pitan76.mcpitanlib.api.util.VoxelShapeUtil;
import net.pitan76.mcpitanlib.core.serialization.CompatMapCodec;
import net.pitan76.mcpitanlib.core.serialization.codecs.CompatBlockMapCodecUtil;
import net.pitan76.mcpitanlib.midohra.block.BlockState;
import net.pitan76.mcpitanlib.midohra.util.math.Direction;

public class SmallStairBlock extends CompatStairsBlock {

    public SmallStairBlock(net.minecraft.block.BlockState baseBlockState, CompatibleBlockSettings settings) {
        super(baseBlockState, settings);
    }

    public SmallStairBlock(Block block, CompatibleBlockSettings settings) {
        this(BlockStateUtil.getDefaultState(block), settings);
    }

    public static final CompatMapCodec<SmallStairBlock> CODEC = CompatBlockMapCodecUtil.createCodecOfStairsBlock(SmallStairBlock::new);

    @Override
    public CompatMapCodec<? extends StairsBlock> getCompatCodec() {
        return CODEC;
    }

    private static final double base1 = 1.0 / 3.0;
    private static final double base2 = 2.0 / 3.0;

    @Override
    public VoxelShape getOutlineShape(OutlineShapeEvent e) {
        BlockState state = BlockState.of(e.state);

        Direction facing = state.get(FACING);
        BlockHalf half = state.get(HALF);
        StairShape stairShape = state.get(SHAPE);

        return getShape(stairShape, facing, half);
    }

    public static VoxelShape getShape(StairShape stairShape, Direction facing, BlockHalf half) {
        VoxelShape voxelShape = VoxelShapeUtil.cuboid(0, 0, 0, 1, 1, 1);

        double sy1 = half == BlockHalf.BOTTOM ? 0 : base2;
        double ey1 = half == BlockHalf.BOTTOM ? base1 : 1;
        double sy2 = base1;
        double ey2 = base2;

        if (facing == Direction.NORTH) {
            if (stairShape == StairShape.STRAIGHT) {
                voxelShape = VoxelShapeUtil.cuboid(0, sy1, 0, 1, ey1, base2);
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(0, sy2, 0, 1, ey2, base1));
            }
            if (stairShape == StairShape.OUTER_RIGHT) {
                voxelShape = VoxelShapeUtil.cuboid(base1, sy1, 0, 1, ey1, base2);
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(base2, sy2, 0, 1, ey2, base1));
            }
            if (stairShape == StairShape.INNER_RIGHT) {
                voxelShape = VoxelShapeUtil.union(VoxelShapeUtil.cuboid(0, sy1, 0, 1, ey1, base2), VoxelShapeUtil.cuboid(base1, sy1, 0, 1, ey1, 1));
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(0, sy2, 0, 1, ey2, base1), VoxelShapeUtil.cuboid(base2, sy2, 0, 1, ey2, 1));
            }

            if (stairShape == StairShape.OUTER_LEFT) {
                voxelShape = VoxelShapeUtil.cuboid(0, sy1, 0, base2, ey1, base2);
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(0, sy2, 0, base1, ey2, base1));
            }
            if (stairShape == StairShape.INNER_LEFT) {
                voxelShape = VoxelShapeUtil.union(VoxelShapeUtil.cuboid(0, sy1, 0, 1, ey1, base2), VoxelShapeUtil.cuboid(0, sy1, 0, base2, ey1, 1));
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(0, sy2, 0, 1, ey2, base1), VoxelShapeUtil.cuboid(0, sy2, 0, base1, ey2, 1));
            }
        }
        if (facing == Direction.SOUTH) {
            if (stairShape == StairShape.STRAIGHT) {
                voxelShape = VoxelShapeUtil.cuboid(0, sy1, base1, 1, ey1, 1);
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(0, sy2, base2, 1, ey2, 1));
            }
            if (stairShape == StairShape.OUTER_RIGHT) {
                voxelShape = VoxelShapeUtil.cuboid(0, sy1, base1, base2, ey1, 1);
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(0, sy2, base2, base1, ey2, 1));
            }
            if (stairShape == StairShape.INNER_RIGHT) {
                voxelShape = VoxelShapeUtil.union(VoxelShapeUtil.cuboid(0, sy1, 0, base2, ey1, 1), VoxelShapeUtil.cuboid(0, sy1, base1, 1, ey1, 1));
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(0, sy2, 0, base1, ey2, 1), VoxelShapeUtil.cuboid(0, sy2, base2, 1, ey2, 1));
            }

            if (stairShape == StairShape.OUTER_LEFT) {
                voxelShape = VoxelShapeUtil.cuboid(base1, sy1, base1, 1, ey1, 1);
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(base2, sy2, base2, 1, ey2, 1));
            }
            if (stairShape == StairShape.INNER_LEFT) {
                voxelShape = VoxelShapeUtil.union(VoxelShapeUtil.cuboid(base1, sy1, 0, 1, ey1, 1), VoxelShapeUtil.cuboid(0, sy1, base1, base1, ey1, 1));
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(base2, sy2, 0, 1, ey2, 1), VoxelShapeUtil.cuboid(0, sy2, base2, base2, ey2, 1));
            }
        }
        if (facing == Direction.EAST) {
            if (stairShape == StairShape.STRAIGHT) {
                voxelShape = VoxelShapeUtil.cuboid(base1, sy1, 0, 1, ey1, 1);
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(base2, sy2, 0, 1, ey2, 1));
            }
            if (stairShape == StairShape.OUTER_RIGHT) {
                voxelShape = VoxelShapeUtil.cuboid(base1, sy1, base1, 1, ey1, 1);
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(base2, sy2, base2, 1, ey2, 1));
            }
            if (stairShape == StairShape.INNER_RIGHT) {
                voxelShape = VoxelShapeUtil.union(VoxelShapeUtil.cuboid(base1, sy1, 0, 1, ey1, 1), VoxelShapeUtil.cuboid(0, sy1, base1, base1, ey1, 1));
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(base2, sy2, 0, 1, ey2, 1), VoxelShapeUtil.cuboid(0, sy2, base2, base2, ey2, 1));
            }

            if (stairShape == StairShape.OUTER_LEFT) {
                voxelShape = VoxelShapeUtil.cuboid(base1, sy1, 0, 1, ey1, base2);
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(base2, sy2, 0, 1, ey2, base1));
            }
            if (stairShape == StairShape.INNER_LEFT) {
                voxelShape = VoxelShapeUtil.union(VoxelShapeUtil.cuboid(0, sy1, 0, 1, ey1, base2), VoxelShapeUtil.cuboid(base1, sy1, 0, 1, ey1, 1));
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(0, sy2, 0, 1, ey2, base1), VoxelShapeUtil.cuboid(base2, sy2, 0, 1, ey2, 1));
            }
        }
        if (facing == Direction.WEST) {
            if (stairShape == StairShape.STRAIGHT) {
                voxelShape = VoxelShapeUtil.cuboid(0, sy1, 0, base2, ey1, 1);
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(0, sy2, 0, base1, ey2, 1));
            }
            if (stairShape == StairShape.OUTER_RIGHT) {
                voxelShape = VoxelShapeUtil.cuboid(0, sy1, 0, base2, ey1, base2);
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(0, sy2, 0, base1, ey2, base1));
            }
            if (stairShape == StairShape.INNER_RIGHT) {
                voxelShape = VoxelShapeUtil.union(VoxelShapeUtil.cuboid(0, sy1, 0, 1, ey1, base2), VoxelShapeUtil.cuboid(0, sy1, 0, base2, ey1, 1));
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(0, sy2, 0, 1, ey2, base1), VoxelShapeUtil.cuboid(0, sy2, 0, base1, ey2, 1));
            }
            if (stairShape == StairShape.OUTER_LEFT) {
                voxelShape = VoxelShapeUtil.cuboid(0, sy1, base1, base2, ey1, 1);
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(0, sy2, base2, base1, ey2, 1));
            }
            if (stairShape == StairShape.INNER_LEFT) {
                voxelShape = VoxelShapeUtil.union(VoxelShapeUtil.cuboid(0, sy1, 0, base2, ey1, 1), VoxelShapeUtil.cuboid(0, sy1, base1, 1, ey1, 1));
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(0, sy2, 0, base1, ey2, 1), VoxelShapeUtil.cuboid(0, sy2, base2, 1, ey2, 1));
            }
        }
        return voxelShape;
    }
}
