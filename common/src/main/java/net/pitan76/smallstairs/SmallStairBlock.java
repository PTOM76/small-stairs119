package net.pitan76.smallstairs;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.pitan76.mcpitanlib.api.block.v2.CompatStairsBlock;
import net.pitan76.mcpitanlib.api.block.args.v2.OutlineShapeEvent;
import net.pitan76.mcpitanlib.api.block.v2.CompatibleBlockSettings;
import net.pitan76.mcpitanlib.api.util.VoxelShapeUtil;
import net.pitan76.mcpitanlib.api.util.block.properties.CompatBlockHalf;
import net.pitan76.mcpitanlib.api.util.block.properties.CompatStairShape;
import net.pitan76.mcpitanlib.core.serialization.CompatMapCodec;
import net.pitan76.mcpitanlib.core.serialization.codecs.CompatBlockMapCodecUtil;
import net.pitan76.mcpitanlib.midohra.block.BlockState;
import net.pitan76.mcpitanlib.midohra.block.BlockWrapper;
import net.pitan76.mcpitanlib.midohra.util.math.Direction;

public class SmallStairBlock extends CompatStairsBlock {

    public static final CompatMapCodec<SmallStairBlock> CODEC = CompatBlockMapCodecUtil.createCodecOfStairsBlock(SmallStairBlock::new);

    public SmallStairBlock(net.minecraft.block.BlockState baseBlockState, CompatibleBlockSettings settings) {
        super(baseBlockState, settings);
    }

    public SmallStairBlock(BlockState baseBlockState, CompatibleBlockSettings settings) {
        super(baseBlockState, settings);
    }

    public SmallStairBlock(Block block, CompatibleBlockSettings settings) {
        this(BlockState.of(block), settings);
    }

    public SmallStairBlock(BlockWrapper block, CompatibleBlockSettings settings) {
        this(block.getDefaultState(), settings);
    }

    @Override
    public CompatMapCodec<? extends CompatStairsBlock> getCompatCodec() {
        return CODEC;
    }

    private static final double base1 = 1.0 / 3.0;
    private static final double base2 = 2.0 / 3.0;

    @Override
    public VoxelShape getOutlineShape(OutlineShapeEvent e) {
        BlockState state = e.state;

        Direction facing = state.get(FACING);
        CompatBlockHalf half = state.get(COMPAT_HALF);
        CompatStairShape stairShape = state.get(COMPAT_SHAPE);

        return getShape(stairShape, facing, half);
    }

    public static VoxelShape getShape(CompatStairShape stairShape, Direction facing, CompatBlockHalf half) {
        VoxelShape voxelShape = VoxelShapeUtil.cuboid(0, 0, 0, 1, 1, 1);

        double sy1 = half.equals(CompatBlockHalf.BOTTOM) ? 0 : base2;
        double ey1 = half.equals(CompatBlockHalf.BOTTOM) ? base1 : 1;
        double sy2 = base1;
        double ey2 = base2;

        if (facing.equals(Direction.NORTH)) {
            if (stairShape.equals(CompatStairShape.STRAIGHT)) {
                voxelShape = VoxelShapeUtil.cuboid(0, sy1, 0, 1, ey1, base2);
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(0, sy2, 0, 1, ey2, base1));
            }
            if (stairShape.equals(CompatStairShape.OUTER_RIGHT)) {
                voxelShape = VoxelShapeUtil.cuboid(base1, sy1, 0, 1, ey1, base2);
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(base2, sy2, 0, 1, ey2, base1));
            }
            if (stairShape.equals(CompatStairShape.INNER_RIGHT)) {
                voxelShape = VoxelShapeUtil.union(VoxelShapeUtil.cuboid(0, sy1, 0, 1, ey1, base2), VoxelShapeUtil.cuboid(base1, sy1, 0, 1, ey1, 1));
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(0, sy2, 0, 1, ey2, base1), VoxelShapeUtil.cuboid(base2, sy2, 0, 1, ey2, 1));
            }

            if (stairShape.equals(CompatStairShape.OUTER_LEFT)) {
                voxelShape = VoxelShapeUtil.cuboid(0, sy1, 0, base2, ey1, base2);
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(0, sy2, 0, base1, ey2, base1));
            }
            if (stairShape.equals(CompatStairShape.INNER_LEFT)) {
                voxelShape = VoxelShapeUtil.union(VoxelShapeUtil.cuboid(0, sy1, 0, 1, ey1, base2), VoxelShapeUtil.cuboid(0, sy1, 0, base2, ey1, 1));
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(0, sy2, 0, 1, ey2, base1), VoxelShapeUtil.cuboid(0, sy2, 0, base1, ey2, 1));
            }
        }
        if (facing.equals(Direction.SOUTH)) {
            if (stairShape.equals(CompatStairShape.STRAIGHT)) {
                voxelShape = VoxelShapeUtil.cuboid(0, sy1, base1, 1, ey1, 1);
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(0, sy2, base2, 1, ey2, 1));
            }
            if (stairShape.equals(CompatStairShape.OUTER_RIGHT)) {
                voxelShape = VoxelShapeUtil.cuboid(0, sy1, base1, base2, ey1, 1);
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(0, sy2, base2, base1, ey2, 1));
            }
            if (stairShape.equals(CompatStairShape.INNER_RIGHT)) {
                voxelShape = VoxelShapeUtil.union(VoxelShapeUtil.cuboid(0, sy1, 0, base2, ey1, 1), VoxelShapeUtil.cuboid(0, sy1, base1, 1, ey1, 1));
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(0, sy2, 0, base1, ey2, 1), VoxelShapeUtil.cuboid(0, sy2, base2, 1, ey2, 1));
            }

            if (stairShape.equals(CompatStairShape.OUTER_LEFT)) {
                voxelShape = VoxelShapeUtil.cuboid(base1, sy1, base1, 1, ey1, 1);
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(base2, sy2, base2, 1, ey2, 1));
            }
            if (stairShape.equals(CompatStairShape.INNER_LEFT)) {
                voxelShape = VoxelShapeUtil.union(VoxelShapeUtil.cuboid(base1, sy1, 0, 1, ey1, 1), VoxelShapeUtil.cuboid(0, sy1, base1, base1, ey1, 1));
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(base2, sy2, 0, 1, ey2, 1), VoxelShapeUtil.cuboid(0, sy2, base2, base2, ey2, 1));
            }
        }
        if (facing.equals(Direction.EAST)) {
            if (stairShape.equals(CompatStairShape.STRAIGHT)) {
                voxelShape = VoxelShapeUtil.cuboid(base1, sy1, 0, 1, ey1, 1);
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(base2, sy2, 0, 1, ey2, 1));
            }
            if (stairShape.equals(CompatStairShape.OUTER_RIGHT)) {
                voxelShape = VoxelShapeUtil.cuboid(base1, sy1, base1, 1, ey1, 1);
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(base2, sy2, base2, 1, ey2, 1));
            }
            if (stairShape.equals(CompatStairShape.INNER_RIGHT)) {
                voxelShape = VoxelShapeUtil.union(VoxelShapeUtil.cuboid(base1, sy1, 0, 1, ey1, 1), VoxelShapeUtil.cuboid(0, sy1, base1, base1, ey1, 1));
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(base2, sy2, 0, 1, ey2, 1), VoxelShapeUtil.cuboid(0, sy2, base2, base2, ey2, 1));
            }

            if (stairShape.equals(CompatStairShape.OUTER_LEFT)) {
                voxelShape = VoxelShapeUtil.cuboid(base1, sy1, 0, 1, ey1, base2);
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(base2, sy2, 0, 1, ey2, base1));
            }
            if (stairShape.equals(CompatStairShape.INNER_LEFT)) {
                voxelShape = VoxelShapeUtil.union(VoxelShapeUtil.cuboid(0, sy1, 0, 1, ey1, base2), VoxelShapeUtil.cuboid(base1, sy1, 0, 1, ey1, 1));
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(0, sy2, 0, 1, ey2, base1), VoxelShapeUtil.cuboid(base2, sy2, 0, 1, ey2, 1));
            }
        }
        if (facing.equals(Direction.WEST)) {
            if (stairShape.equals(CompatStairShape.STRAIGHT)) {
                voxelShape = VoxelShapeUtil.cuboid(0, sy1, 0, base2, ey1, 1);
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(0, sy2, 0, base1, ey2, 1));
            }
            if (stairShape.equals(CompatStairShape.OUTER_RIGHT)) {
                voxelShape = VoxelShapeUtil.cuboid(0, sy1, 0, base2, ey1, base2);
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(0, sy2, 0, base1, ey2, base1));
            }
            if (stairShape.equals(CompatStairShape.INNER_RIGHT)) {
                voxelShape = VoxelShapeUtil.union(VoxelShapeUtil.cuboid(0, sy1, 0, 1, ey1, base2), VoxelShapeUtil.cuboid(0, sy1, 0, base2, ey1, 1));
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(0, sy2, 0, 1, ey2, base1), VoxelShapeUtil.cuboid(0, sy2, 0, base1, ey2, 1));
            }
            if (stairShape.equals(CompatStairShape.OUTER_LEFT)) {
                voxelShape = VoxelShapeUtil.cuboid(0, sy1, base1, base2, ey1, 1);
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(0, sy2, base2, base1, ey2, 1));
            }
            if (stairShape.equals(CompatStairShape.INNER_LEFT)) {
                voxelShape = VoxelShapeUtil.union(VoxelShapeUtil.cuboid(0, sy1, 0, base2, ey1, 1), VoxelShapeUtil.cuboid(0, sy1, base1, 1, ey1, 1));
                voxelShape = VoxelShapeUtil.union(voxelShape, VoxelShapeUtil.cuboid(0, sy2, 0, base1, ey2, 1), VoxelShapeUtil.cuboid(0, sy2, base2, 1, ey2, 1));
            }
        }
        return voxelShape;
    }
}
