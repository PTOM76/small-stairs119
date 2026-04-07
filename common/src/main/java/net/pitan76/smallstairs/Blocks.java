package net.pitan76.smallstairs;

import net.minecraft.block.Block;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.block.enums.StairShape;
import net.pitan76.mcpitanlib.api.block.CompatibleMaterial;
import net.pitan76.mcpitanlib.api.block.v2.BlockSettingsBuilder;
import net.pitan76.mcpitanlib.api.block.v2.CompatStairsBlock;
import net.pitan76.mcpitanlib.api.block.v2.CompatibleBlockSettings;
import net.pitan76.mcpitanlib.midohra.block.BlockState;
import net.pitan76.mcpitanlib.midohra.easybuilder.BlockBuilder;
import net.pitan76.mcpitanlib.midohra.util.math.Direction;
import net.pitan76.mcpitanlib.midohra.util.shape.VoxelShape;

import static net.pitan76.smallstairs.SmallStairDefines.getShape;
import static net.pitan76.smallstairs.SmallStairs._id;

public class Blocks {
    public static BlockBuilder SMALL_STAIR_BUILDER = BlockBuilder.of(new BlockSettingsBuilder())
            .onOutlineShape(e -> {
        BlockState state = e.state;

        Direction facing = state.get(CompatStairsBlock.FACING);
        BlockHalf half = state.get(CompatStairsBlock.HALF);
        StairShape stairShape = state.get(CompatStairsBlock.SHAPE);

        return VoxelShape.of(getShape(stairShape, facing, half));
    });

    public static Block OAK_PLANKS_SMALL_STAIR = new SmallStairDefines(MCBlocks.OAK_PLANKS, CompatibleBlockSettings.copy(_id("small_stairs_planks_oak"), OAK_PLANKS));
    public static Block SPRUCE_PLANKS_SMALL_STAIR = new SmallStairDefines(SPRUCE_PLANKS, CompatibleBlockSettings.copy(_id("small_stairs_planks_spruce"), SPRUCE_PLANKS));
    public static Block BIRCH_PLANKS_SMALL_STAIR = new SmallStairDefines(BIRCH_PLANKS, CompatibleBlockSettings.copy(_id("small_stairs_planks_birch"), BIRCH_PLANKS));
    public static Block JUNGLE_PLANKS_SMALL_STAIR = new SmallStairDefines(JUNGLE_PLANKS, CompatibleBlockSettings.copy(_id("small_stairs_planks_jungle"), JUNGLE_PLANKS));
    public static Block ACACIA_PLANKS_SMALL_STAIR = new SmallStairDefines(ACACIA_PLANKS, CompatibleBlockSettings.copy(_id("small_stairs_planks_acacia"), ACACIA_PLANKS));
    public static Block DARK_OAK_PLANKS_SMALL_STAIR = new SmallStairDefines(DARK_OAK_PLANKS, CompatibleBlockSettings.copy(_id("small_stairs_planks_dark_oak"), DARK_OAK_PLANKS));
    public static Block CRIMSON_PLANKS_SMALL_STAIR = new SmallStairDefines(CRIMSON_PLANKS, CompatibleBlockSettings.copy(_id("small_stairs_planks_crimson"), CRIMSON_PLANKS));
    public static Block WARPED_PLANKS_SMALL_STAIR = new SmallStairDefines(WARPED_PLANKS, CompatibleBlockSettings.copy(_id("small_stairs_planks_warped"), WARPED_PLANKS));
    public static Block COBBLESTONE_SMALL_STAIR = new SmallStairDefines(COBBLESTONE, CompatibleBlockSettings.copy(_id("small_stairs_cobblestone"), COBBLESTONE));
    public static Block SANDSTONE_SMALL_STAIR = new SmallStairDefines(SANDSTONE, CompatibleBlockSettings.copy(_id("small_stairs_sandstone"), SANDSTONE));
    public static Block RED_SANDSTONE_SMALL_STAIR = new SmallStairDefines(RED_SANDSTONE, CompatibleBlockSettings.copy(_id("small_stairs_red_sandstone"), RED_SANDSTONE));
    public static Block BRICKS_SMALL_STAIR = new SmallStairDefines(BRICKS, CompatibleBlockSettings.copy(_id("small_stairs_brick"), BRICKS));
    public static Block STONE_BRICKS_SMALL_STAIR = new SmallStairDefines(STONE_BRICKS, CompatibleBlockSettings.copy(_id("small_stairs_stonebrick"), STONE_BRICKS));
    public static Block NETHER_BRICKS_SMALL_STAIR = new SmallStairDefines(NETHER_BRICKS, CompatibleBlockSettings.copy(_id("small_stairs_nether_brick"), NETHER_BRICKS));
    public static Block RED_NETHER_BRICKS_SMALL_STAIR = new SmallStairDefines(RED_NETHER_BRICKS, CompatibleBlockSettings.copy(_id("small_stairs_red_nether_brick"), RED_NETHER_BRICKS));
    public static Block STONE_SMALL_STAIR = new SmallStairDefines(STONE, CompatibleBlockSettings.copy(_id("small_stairs_stone"), STONE));
    public static Block RED_WOOL_SMALL_STAIR = new SmallStairDefines(RED_WOOL, CompatibleBlockSettings.copy(_id("small_stairs_red_wool"), RED_WOOL));
    public static Block YELLOW_WOOL_SMALL_STAIR = new SmallStairDefines(YELLOW_WOOL, CompatibleBlockSettings.copy(_id("small_stairs_yellow_wool"), YELLOW_WOOL));
    public static Block QUARTZ_BLOCK_SMALL_STAIR = new SmallStairDefines(QUARTZ_BLOCK, CompatibleBlockSettings.copy(_id("small_stairs_quartz_block"), QUARTZ_BLOCK));
    public static Block PURPUR_BLOCK_SMALL_STAIR = new SmallStairDefines(PURPUR_BLOCK, CompatibleBlockSettings.copy(_id("small_stairs_purpur_block"), PURPUR_BLOCK));
}
