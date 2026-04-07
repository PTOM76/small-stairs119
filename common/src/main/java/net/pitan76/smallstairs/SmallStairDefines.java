package net.pitan76.smallstairs;

import net.pitan76.mcpitanlib.api.block.v2.BlockSettingsBuilder;
import net.pitan76.mcpitanlib.api.block.v2.CompatStairsBlock;
import net.pitan76.mcpitanlib.api.item.v2.CompatibleItemSettings;
import net.pitan76.mcpitanlib.api.registry.v2.CompatRegistryV2;
import net.pitan76.mcpitanlib.api.util.CompatIdentifier;
import net.pitan76.mcpitanlib.api.util.VoxelShapeUtil;
import net.pitan76.mcpitanlib.api.util.block.properties.CompatBlockHalf;
import net.pitan76.mcpitanlib.api.util.block.properties.CompatStairShape;
import net.pitan76.mcpitanlib.core.datafixer.Pair;
import net.pitan76.mcpitanlib.midohra.block.BlockState;
import net.pitan76.mcpitanlib.midohra.block.BlockWrapper;
import net.pitan76.mcpitanlib.midohra.block.SupplierBlockWrapper;
import net.pitan76.mcpitanlib.midohra.easybuilder.BlockBuilder;
import net.pitan76.mcpitanlib.midohra.item.ItemGroups;
import net.pitan76.mcpitanlib.midohra.item.SupplierItemWrapper;
import net.pitan76.mcpitanlib.midohra.util.math.Direction;
import net.pitan76.mcpitanlib.midohra.util.shape.VoxelShape;

public class SmallStairDefines {

    private static final double base1 = 1.0 / 3.0;
    private static final double base2 = 2.0 / 3.0;

    private final CompatIdentifier id;
    private final CompatRegistryV2 registry;
    private final BlockSettingsBuilder builder;

    public SmallStairDefines(CompatRegistryV2 registry, CompatIdentifier id, BlockWrapper source) {
        this.registry = registry;
        this.id = id;
        this.builder = BlockSettingsBuilder.copyBlock(source);
    }

    public Pair<SupplierBlockWrapper, SupplierItemWrapper> create() {
        return BlockBuilder.of(builder).onOutlineShape(e -> {
            BlockState state = e.state;

            Direction facing = state.get(CompatStairsBlock.FACING);
            CompatBlockHalf half = state.get(CompatStairsBlock.COMPAT_HALF);
            CompatStairShape stairShape = state.get(CompatStairsBlock.COMPAT_SHAPE);

            return getShape(stairShape, facing, half);
        }).onAppendProperties(args -> {
            args.addProperty(CompatStairsBlock.FACING);
            args.addProperty(CompatStairsBlock.COMPAT_HALF);
            args.addProperty(CompatStairsBlock.COMPAT_SHAPE);
        }).buildWithItem(registry, id, CompatibleItemSettings.of(id).addGroup(ItemGroups.BUILDING_BLOCKS));
    }

    public static VoxelShape getShape(CompatStairShape stairShape, Direction facing, CompatBlockHalf half) {
        VoxelShape voxelShape = VoxelShape.fullCube();

        double sy1 = half == CompatBlockHalf.BOTTOM ? 0 : base2;
        double ey1 = half == CompatBlockHalf.BOTTOM ? base1 : 1;
        double sy2 = base1;
        double ey2 = base2;

        if (facing == Direction.NORTH) {
            if (stairShape == CompatStairShape.STRAIGHT) {
                voxelShape = VoxelShape.of(VoxelShapeUtil.cuboid(0, sy1, 0, 1, ey1, base2));
                voxelShape = voxelShape.union(VoxelShape.of(VoxelShapeUtil.cuboid(0, sy2, 0, 1, ey2, base1)));
            }
            if (stairShape == CompatStairShape.OUTER_RIGHT) {
                voxelShape = VoxelShape.of(VoxelShapeUtil.cuboid(base1, sy1, 0, 1, ey1, base2));
                voxelShape = voxelShape.union(VoxelShape.of(VoxelShapeUtil.cuboid(base2, sy2, 0, 1, ey2, base1)));
            }
            if (stairShape == CompatStairShape.INNER_RIGHT) {
                voxelShape = VoxelShape.of(VoxelShapeUtil.cuboid(0, sy1, 0, 1, ey1, base2)).union(VoxelShape.of(VoxelShapeUtil.cuboid(base1, sy1, 0, 1, ey1, 1)));
                voxelShape = VoxelShape.of(VoxelShapeUtil.union(voxelShape.raw(), VoxelShapeUtil.cuboid(0, sy2, 0, 1, ey2, base1), VoxelShapeUtil.cuboid(base2, sy2, 0, 1, ey2, 1)));
            }

            if (stairShape == CompatStairShape.OUTER_LEFT) {
                voxelShape = VoxelShape.of(VoxelShapeUtil.cuboid(0, sy1, 0, base2, ey1, base2));
                voxelShape = voxelShape.union(VoxelShape.of(VoxelShapeUtil.cuboid(0, sy2, 0, base1, ey2, base1)));
            }
            if (stairShape == CompatStairShape.INNER_LEFT) {
                voxelShape = VoxelShape.of(VoxelShapeUtil.cuboid(0, sy1, 0, 1, ey1, base2)).union(VoxelShape.of(VoxelShapeUtil.cuboid(0, sy1, 0, base2, ey1, 1)));
                voxelShape = VoxelShape.of(VoxelShapeUtil.union(voxelShape.raw(), VoxelShapeUtil.cuboid(0, sy2, 0, 1, ey2, base1), VoxelShapeUtil.cuboid(0, sy2, 0, base1, ey2, 1)));
            }
        }

        if (facing == Direction.SOUTH) {
            if (stairShape == CompatStairShape.STRAIGHT) {
                voxelShape = VoxelShape.of(VoxelShapeUtil.cuboid(0, sy1, base1, 1, ey1, 1));
                voxelShape = voxelShape.union(VoxelShape.of(VoxelShapeUtil.cuboid(0, sy2, base2, 1, ey2, 1)));
            }
            if (stairShape == CompatStairShape.OUTER_RIGHT) {
                voxelShape = VoxelShape.of(VoxelShapeUtil.cuboid(0, sy1, base1, base2, ey1, 1));
                voxelShape = voxelShape.union(VoxelShape.of(VoxelShapeUtil.cuboid(0, sy2, base2, base1, ey2, 1)));
            }
            if (stairShape == CompatStairShape.INNER_RIGHT) {
                voxelShape = VoxelShape.of(VoxelShapeUtil.cuboid(0, sy1, 0, base2, ey1, 1)).union(VoxelShape.of(VoxelShapeUtil.cuboid(0, sy1, base1, 1, ey1, 1)));
                voxelShape = VoxelShape.of(VoxelShapeUtil.union(voxelShape.raw(), VoxelShapeUtil.cuboid(0, sy2, 0, base1, ey2, 1), VoxelShapeUtil.cuboid(0, sy2, base2, 1, ey2, 1)));
            }

            if (stairShape == CompatStairShape.OUTER_LEFT) {
                voxelShape = VoxelShape.of(VoxelShapeUtil.cuboid(base1, sy1, base1, 1, ey1, 1));
                voxelShape = voxelShape.union(VoxelShape.of(VoxelShapeUtil.cuboid(base2, sy2, base2, 1, ey2, 1)));
            }
            if (stairShape == CompatStairShape.INNER_LEFT) {
                voxelShape = VoxelShape.of(VoxelShapeUtil.cuboid(base1, sy1, 0, 1, ey1, 1)).union(VoxelShape.of(VoxelShapeUtil.cuboid(0, sy1, base1, base1, ey1, 1)));
                voxelShape = VoxelShape.of(VoxelShapeUtil.union(voxelShape.raw(), VoxelShapeUtil.cuboid(base2, sy2, 0, 1, ey2, 1), VoxelShapeUtil.cuboid(0, sy2, base2, base2, ey2, 1)));
            }
        }
        if (facing == Direction.EAST) {
            if (stairShape == CompatStairShape.STRAIGHT) {
                voxelShape = VoxelShape.of(VoxelShapeUtil.cuboid(base1, sy1, 0, 1, ey1, 1));
                voxelShape = voxelShape.union(VoxelShape.of(VoxelShapeUtil.cuboid(base2, sy2, 0, 1, ey2, 1)));
            }
            if (stairShape == CompatStairShape.OUTER_RIGHT) {
                voxelShape = VoxelShape.of(VoxelShapeUtil.cuboid(base1, sy1, base1, 1, ey1, 1));
                voxelShape = voxelShape.union(VoxelShape.of(VoxelShapeUtil.cuboid(base2, sy2, base2, 1, ey2, 1)));
            }
            if (stairShape == CompatStairShape.INNER_RIGHT) {
                voxelShape = VoxelShape.of(VoxelShapeUtil.cuboid(base1, sy1, 0, 1, ey1, 1)).union(VoxelShape.of(VoxelShapeUtil.cuboid(0, sy1, base1, base1, ey1, 1)));
                voxelShape = VoxelShape.of(VoxelShapeUtil.union(voxelShape.raw(), VoxelShapeUtil.cuboid(base2, sy2, 0, 1, ey2, 1), VoxelShapeUtil.cuboid(0, sy2, base2, base2, ey2, 1)));
            }

            if (stairShape == CompatStairShape.OUTER_LEFT) {
                voxelShape = VoxelShape.of(VoxelShapeUtil.cuboid(base1, sy1, 0, 1, ey1, base2));
                voxelShape = voxelShape.union(VoxelShape.of(VoxelShapeUtil.cuboid(base2, sy2, 0, 1, ey2, base1)));
            }
            if (stairShape == CompatStairShape.INNER_LEFT) {
                voxelShape = VoxelShape.of(VoxelShapeUtil.cuboid(0, sy1, 0, 1, ey1, base2)).union(VoxelShape.of(VoxelShapeUtil.cuboid(base1, sy1, 0, 1, ey1, 1)));
                voxelShape = VoxelShape.of(VoxelShapeUtil.union(voxelShape.raw(), VoxelShapeUtil.cuboid(0, sy2, 0, 1, ey2, base1), VoxelShapeUtil.cuboid(base2, sy2, 0, 1, ey2, 1)));
            }
        }
        if (facing == Direction.WEST) {
            if (stairShape == CompatStairShape.STRAIGHT) {
                voxelShape = VoxelShape.of(VoxelShapeUtil.cuboid(0, sy1, 0, base2, ey1, 1));
                voxelShape = voxelShape.union(VoxelShape.of(VoxelShapeUtil.cuboid(0, sy2, 0, base1, ey2, 1)));
            }
            if (stairShape == CompatStairShape.OUTER_RIGHT) {
                voxelShape = VoxelShape.of(VoxelShapeUtil.cuboid(0, sy1, 0, base2, ey1, base2));
                voxelShape = voxelShape.union(VoxelShape.of(VoxelShapeUtil.cuboid(0, sy2, 0, base1, ey2, base1)));
            }
            if (stairShape == CompatStairShape.INNER_RIGHT) {
                voxelShape = VoxelShape.of(VoxelShapeUtil.cuboid(0, sy1, 0, 1, ey1, base2)).union(VoxelShape.of(VoxelShapeUtil.cuboid(0, sy1, 0, base2, ey1, 1)));
                voxelShape = VoxelShape.of(VoxelShapeUtil.union(voxelShape.raw(), VoxelShapeUtil.cuboid(0, sy2, 0, 1, ey2, base1), VoxelShapeUtil.cuboid(0, sy2, 0, base1, ey2, 1)));
            }
            if (stairShape == CompatStairShape.OUTER_LEFT) {
                voxelShape = VoxelShape.of(VoxelShapeUtil.cuboid(0, sy1, base1, base2, ey1, 1));
                voxelShape = voxelShape.union(VoxelShape.of(VoxelShapeUtil.cuboid(0, sy2, base2, base1, ey2, 1)));
            }
            if (stairShape == CompatStairShape.INNER_LEFT) {
                voxelShape = VoxelShape.of(VoxelShapeUtil.cuboid(0, sy1, 0, base2, ey1, 1)).union(VoxelShape.of(VoxelShapeUtil.cuboid(0, sy1, base1, 1, ey1, 1)));
                voxelShape = VoxelShape.of(VoxelShapeUtil.union(voxelShape.raw(), VoxelShapeUtil.cuboid(0, sy2, 0, base1, ey2, 1), VoxelShapeUtil.cuboid(0, sy2, base2, 1, ey2, 1)));
            }
        }
        return voxelShape;
    }
}
