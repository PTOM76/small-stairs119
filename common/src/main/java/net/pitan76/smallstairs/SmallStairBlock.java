package net.pitan76.smallstairs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.block.enums.StairShape;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.pitan76.mcpitanlib.api.block.CompatibleBlockSettings;

public class SmallStairBlock extends StairsBlock {

    public SmallStairBlock(BlockState baseBlockState, CompatibleBlockSettings settings) {
        super(baseBlockState, settings.build());
    }

    public SmallStairBlock(Block block, CompatibleBlockSettings settings) {
        super(block.getDefaultState(), settings.build());
    }

    private static final double base1 = 1.0 / 3.0;
    private static final double base2 = 2.0 / 3.0;

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        VoxelShape voxelShape = VoxelShapes.cuboid(0, 0, 0, 1, 1, 1);;

        Direction facing = state.get(FACING);
        BlockHalf half = state.get(HALF);
        double sy1 = half == BlockHalf.BOTTOM ? 0 : base2;
        double ey1 = half == BlockHalf.BOTTOM ? base1 : 1;
        double sy2 = base1;
        double ey2 = base2;

        StairShape stairShape = state.get(SHAPE);

        if (facing == Direction.NORTH) {
            if (stairShape == StairShape.STRAIGHT) {
                voxelShape = VoxelShapes.cuboid(0, sy1, 0, 1, ey1, base2);
                voxelShape = VoxelShapes.union(voxelShape, VoxelShapes.cuboid(0, sy2, 0, 1, ey2, base1));
            }
            if (stairShape == StairShape.OUTER_RIGHT) {
                voxelShape = VoxelShapes.cuboid(base1, sy1, 0, 1, ey1, base2);
                voxelShape = VoxelShapes.union(voxelShape, VoxelShapes.cuboid(base2, sy2, 0, 1, ey2, base1));
            }
            if (stairShape == StairShape.INNER_RIGHT) {
                voxelShape = VoxelShapes.union(VoxelShapes.cuboid(0, sy1, 0, 1, ey1, base2), VoxelShapes.cuboid(base1, sy1, 0, 1, ey1, 1));
                voxelShape = VoxelShapes.union(voxelShape, VoxelShapes.cuboid(0, sy2, 0, 1, ey2, base1), VoxelShapes.cuboid(base2, sy2, 0, 1, ey2, 1));
            }

            if (stairShape == StairShape.OUTER_LEFT) {
                voxelShape = VoxelShapes.cuboid(0, sy1, 0, base2, ey1, base2);
                voxelShape = VoxelShapes.union(voxelShape, VoxelShapes.cuboid(0, sy2, 0, base1, ey2, base1));
            }
            if (stairShape == StairShape.INNER_LEFT) {
                voxelShape = VoxelShapes.union(VoxelShapes.cuboid(0, sy1, 0, 1, ey1, base2), VoxelShapes.cuboid(0, sy1, 0, base2, ey1, 1));
                voxelShape = VoxelShapes.union(voxelShape, VoxelShapes.cuboid(0, sy2, 0, 1, ey2, base1), VoxelShapes.cuboid(0, sy2, 0, base1, ey2, 1));
            }
        }
        if (facing == Direction.SOUTH) {
            if (stairShape == StairShape.STRAIGHT) {
                voxelShape = VoxelShapes.cuboid(0, sy1, base1, 1, ey1, 1);
                voxelShape = VoxelShapes.union(voxelShape, VoxelShapes.cuboid(0, sy2, base2, 1, ey2, 1));
            }
            if (stairShape == StairShape.OUTER_RIGHT) {
                voxelShape = VoxelShapes.cuboid(0, sy1, base1, base2, ey1, 1);
                voxelShape = VoxelShapes.union(voxelShape, VoxelShapes.cuboid(0, sy2, base2, base1, ey2, 1));
            }
            if (stairShape == StairShape.INNER_RIGHT) {
                voxelShape = VoxelShapes.union(VoxelShapes.cuboid(0, sy1, 0, base2, ey1, 1), VoxelShapes.cuboid(0, sy1, base1, 1, ey1, 1));
                voxelShape = VoxelShapes.union(voxelShape, VoxelShapes.cuboid(0, sy2, 0, base1, ey2, 1), VoxelShapes.cuboid(0, sy2, base2, 1, ey2, 1));
            }

            if (stairShape == StairShape.OUTER_LEFT) {
                voxelShape = VoxelShapes.cuboid(base1, sy1, base1, 1, ey1, 1);
                voxelShape = VoxelShapes.union(voxelShape, VoxelShapes.cuboid(base2, sy2, base2, 1, ey2, 1));
            }
            if (stairShape == StairShape.INNER_LEFT) {
                voxelShape = VoxelShapes.union(VoxelShapes.cuboid(base1, sy1, 0, 1, ey1, 1), VoxelShapes.cuboid(0, sy1, base1, base1, ey1, 1));
                voxelShape = VoxelShapes.union(voxelShape, VoxelShapes.cuboid(base2, sy2, 0, 1, ey2, 1), VoxelShapes.cuboid(0, sy2, base2, base2, ey2, 1));
            }
        }
        if (facing == Direction.EAST) {
            if (stairShape == StairShape.STRAIGHT) {
                voxelShape = VoxelShapes.cuboid(base1, sy1, 0, 1, ey1, 1);
                voxelShape = VoxelShapes.union(voxelShape, VoxelShapes.cuboid(base2, sy2, 0, 1, ey2, 1));
            }
            if (stairShape == StairShape.OUTER_RIGHT) {
                voxelShape = VoxelShapes.cuboid(base1, sy1, base1, 1, ey1, 1);
                voxelShape = VoxelShapes.union(voxelShape, VoxelShapes.cuboid(base2, sy2, base2, 1, ey2, 1));
            }
            if (stairShape == StairShape.INNER_RIGHT) {
                voxelShape = VoxelShapes.union(VoxelShapes.cuboid(base1, sy1, 0, 1, ey1, 1), VoxelShapes.cuboid(0, sy1, base1, base1, ey1, 1));
                voxelShape = VoxelShapes.union(voxelShape, VoxelShapes.cuboid(base2, sy2, 0, 1, ey2, 1), VoxelShapes.cuboid(0, sy2, base2, base2, ey2, 1));
            }

            if (stairShape == StairShape.OUTER_LEFT) {
                voxelShape = VoxelShapes.cuboid(base1, sy1, 0, 1, ey1, base2);
                voxelShape = VoxelShapes.union(voxelShape, VoxelShapes.cuboid(base2, sy2, 0, 1, ey2, base1));
            }
            if (stairShape == StairShape.INNER_LEFT) {
                voxelShape = VoxelShapes.union(VoxelShapes.cuboid(0, sy1, 0, 1, ey1, base2), VoxelShapes.cuboid(base1, sy1, 0, 1, ey1, 1));
                voxelShape = VoxelShapes.union(voxelShape, VoxelShapes.cuboid(0, sy2, 0, 1, ey2, base1), VoxelShapes.cuboid(base2, sy2, 0, 1, ey2, 1));
            }
        }
        if (facing == Direction.WEST) {
            if (stairShape == StairShape.STRAIGHT) {
                voxelShape = VoxelShapes.cuboid(0, sy1, 0, base2, ey1, 1);
                voxelShape = VoxelShapes.union(voxelShape, VoxelShapes.cuboid(0, sy2, 0, base1, ey2, 1));
            }
            if (stairShape == StairShape.OUTER_RIGHT) {
                voxelShape = VoxelShapes.cuboid(0, sy1, 0, base2, ey1, base2);
                voxelShape = VoxelShapes.union(voxelShape, VoxelShapes.cuboid(0, sy2, 0, base1, ey2, base1));
            }
            if (stairShape == StairShape.INNER_RIGHT) {
                voxelShape = VoxelShapes.union(VoxelShapes.cuboid(0, sy1, 0, 1, ey1, base2), VoxelShapes.cuboid(0, sy1, 0, base2, ey1, 1));
                voxelShape = VoxelShapes.union(voxelShape, VoxelShapes.cuboid(0, sy2, 0, 1, ey2, base1), VoxelShapes.cuboid(0, sy2, 0, base1, ey2, 1));
            }
            if (stairShape == StairShape.OUTER_LEFT) {
                voxelShape = VoxelShapes.cuboid(0, sy1, base1, base2, ey1, 1);
                voxelShape = VoxelShapes.union(voxelShape, VoxelShapes.cuboid(0, sy2, base2, base1, ey2, 1));
            }
            if (stairShape == StairShape.INNER_LEFT) {
                voxelShape = VoxelShapes.union(VoxelShapes.cuboid(0, sy1, 0, base2, ey1, 1), VoxelShapes.cuboid(0, sy1, base1, 1, ey1, 1));
                voxelShape = VoxelShapes.union(voxelShape, VoxelShapes.cuboid(0, sy2, 0, base1, ey2, 1), VoxelShapes.cuboid(0, sy2, base2, 1, ey2, 1));
            }
        }
        return voxelShape;
    }
}
