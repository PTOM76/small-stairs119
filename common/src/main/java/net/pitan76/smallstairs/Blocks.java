package net.pitan76.smallstairs;

import net.pitan76.mcpitanlib.api.util.CompatIdentifier;
import net.pitan76.mcpitanlib.api.util.block.BlockUtil;
import net.pitan76.mcpitanlib.core.datafixer.Pair;
import net.pitan76.mcpitanlib.midohra.block.BlockWrapper;
import net.pitan76.mcpitanlib.midohra.block.SupplierBlockWrapper;
import net.pitan76.mcpitanlib.midohra.item.SupplierItemWrapper;

import static net.pitan76.smallstairs.SmallStairs.registry;
import static net.pitan76.smallstairs.SmallStairs._id;
import static net.pitan76.mcpitanlib.midohra.block.Blocks.*;

public class Blocks {
    public static Pair<SupplierBlockWrapper, SupplierItemWrapper> OAK_PLANKS_SMALL_STAIR;
    public static Pair<SupplierBlockWrapper, SupplierItemWrapper> SPRUCE_PLANKS_SMALL_STAIR;
    public static Pair<SupplierBlockWrapper, SupplierItemWrapper> BIRCH_PLANKS_SMALL_STAIR;
    public static Pair<SupplierBlockWrapper, SupplierItemWrapper> JUNGLE_PLANKS_SMALL_STAIR;
    public static Pair<SupplierBlockWrapper, SupplierItemWrapper> ACACIA_PLANKS_SMALL_STAIR;
    public static Pair<SupplierBlockWrapper, SupplierItemWrapper> DARK_OAK_PLANKS_SMALL_STAIR;
    public static Pair<SupplierBlockWrapper, SupplierItemWrapper> MANGROVE_PLANKS_SMALL_STAIR;
    public static Pair<SupplierBlockWrapper, SupplierItemWrapper> CRIMSON_PLANKS_SMALL_STAIR;
    public static Pair<SupplierBlockWrapper, SupplierItemWrapper> WARPED_PLANKS_SMALL_STAIR;
    public static Pair<SupplierBlockWrapper, SupplierItemWrapper> COBBLESTONE_SMALL_STAIR;
    public static Pair<SupplierBlockWrapper, SupplierItemWrapper> SANDSTONE_SMALL_STAIR;
    public static Pair<SupplierBlockWrapper, SupplierItemWrapper> RED_SANDSTONE_SMALL_STAIR;
    public static Pair<SupplierBlockWrapper, SupplierItemWrapper> BRICKS_SMALL_STAIR;
    public static Pair<SupplierBlockWrapper, SupplierItemWrapper> STONE_BRICKS_SMALL_STAIR;
    public static Pair<SupplierBlockWrapper, SupplierItemWrapper> NETHER_BRICKS_SMALL_STAIR;
    public static Pair<SupplierBlockWrapper, SupplierItemWrapper> RED_NETHER_BRICKS_SMALL_STAIR;
    public static Pair<SupplierBlockWrapper, SupplierItemWrapper> STONE_SMALL_STAIR;
    public static Pair<SupplierBlockWrapper, SupplierItemWrapper> RED_WOOL_SMALL_STAIR;
    public static Pair<SupplierBlockWrapper, SupplierItemWrapper> YELLOW_WOOL_SMALL_STAIR;
    public static Pair<SupplierBlockWrapper, SupplierItemWrapper> QUARTZ_BLOCK_SMALL_STAIR;
    public static Pair<SupplierBlockWrapper, SupplierItemWrapper> PURPUR_BLOCK_SMALL_STAIR;

    public static void init() {
        OAK_PLANKS_SMALL_STAIR = new SmallStairDefines(registry, _id("small_stairs_planks_oak"), OAK_PLANKS).create();
        SPRUCE_PLANKS_SMALL_STAIR = new SmallStairDefines(registry, _id("small_stairs_planks_spruce"), SPRUCE_PLANKS).create();
        BIRCH_PLANKS_SMALL_STAIR = new SmallStairDefines(registry, _id("small_stairs_planks_birch"), BIRCH_PLANKS).create();
        JUNGLE_PLANKS_SMALL_STAIR = new SmallStairDefines(registry, _id("small_stairs_planks_jungle"), JUNGLE_PLANKS).create();
        ACACIA_PLANKS_SMALL_STAIR = new SmallStairDefines(registry, _id("small_stairs_planks_acacia"), ACACIA_PLANKS).create();
        DARK_OAK_PLANKS_SMALL_STAIR = new SmallStairDefines(registry, _id("small_stairs_planks_dark_oak"), DARK_OAK_PLANKS).create();

        if (BlockUtil.isExist(CompatIdentifier.of("minecraft", "mangrove_planks"))) {
            MANGROVE_PLANKS_SMALL_STAIR = new SmallStairDefines(registry, _id("small_stairs_planks_mangrove"), BlockWrapper.of("mangrove_planks")).create();
        }

        CRIMSON_PLANKS_SMALL_STAIR = new SmallStairDefines(registry, _id("small_stairs_planks_crimson"), CRIMSON_PLANKS).create();
        WARPED_PLANKS_SMALL_STAIR = new SmallStairDefines(registry, _id("small_stairs_planks_warped"), WARPED_PLANKS).create();
        COBBLESTONE_SMALL_STAIR = new SmallStairDefines(registry, _id("small_stairs_cobblestone"), COBBLESTONE).create();
        SANDSTONE_SMALL_STAIR = new SmallStairDefines(registry, _id("small_stairs_sandstone"), SANDSTONE).create();
        RED_SANDSTONE_SMALL_STAIR = new SmallStairDefines(registry, _id("small_stairs_red_sandstone"), RED_SANDSTONE).create();
        BRICKS_SMALL_STAIR = new SmallStairDefines(registry, _id("small_stairs_brick"), BRICKS).create();
        STONE_BRICKS_SMALL_STAIR = new SmallStairDefines(registry, _id("small_stairs_stonebrick"), STONE_BRICKS).create();
        NETHER_BRICKS_SMALL_STAIR = new SmallStairDefines(registry, _id("small_stairs_nether_brick"), NETHER_BRICKS).create();
        RED_NETHER_BRICKS_SMALL_STAIR = new SmallStairDefines(registry, _id("small_stairs_red_nether_brick"), RED_NETHER_BRICKS).create();
        STONE_SMALL_STAIR = new SmallStairDefines(registry, _id("small_stairs_stone"), STONE).create();
        RED_WOOL_SMALL_STAIR = new SmallStairDefines(registry, _id("small_stairs_red_wool"), RED_WOOL).create();
        YELLOW_WOOL_SMALL_STAIR = new SmallStairDefines(registry, _id("small_stairs_yellow_wool"), YELLOW_WOOL).create();
        QUARTZ_BLOCK_SMALL_STAIR = new SmallStairDefines(registry, _id("small_stairs_quartz_block"), QUARTZ_BLOCK).create();
        PURPUR_BLOCK_SMALL_STAIR = new SmallStairDefines(registry, _id("small_stairs_purpur_block"), PURPUR_BLOCK).create();
    }
}
