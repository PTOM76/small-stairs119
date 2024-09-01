package net.pitan76.smallstairs;

import net.minecraft.block.Block;
import net.pitan76.mcpitanlib.api.block.CompatibleBlockSettings;
import net.pitan76.mcpitanlib.api.item.CompatibleItemSettings;
import net.pitan76.mcpitanlib.api.item.DefaultItemGroups;
import net.pitan76.mcpitanlib.api.registry.result.RegistryResult;
import net.pitan76.mcpitanlib.api.registry.v2.CompatRegistryV2;
import net.pitan76.mcpitanlib.api.util.*;

public class SmallStairs {
    public static final String MOD_ID = "smallstairs";
    public static final String MOD_NAME = "SmallStairs";

    public static CompatIdentifier id(String id) {
        return CompatIdentifier.of(MOD_ID, id);
    }

    public static CompatRegistryV2 registry = CompatRegistryV2.create(MOD_ID);

    public static void init() {
        RegistryResult<Block> OAK_PLANKS = registry.registerBlock(id("small_stairs_planks_oak"), () -> Blocks.OAK_PLANKS_SMALL_STAIR);
        RegistryResult<Block> SPRUCE_PLANKS = registry.registerBlock(id("small_stairs_planks_spruce"), () -> Blocks.SPRUCE_PLANKS_SMALL_STAIR);
        RegistryResult<Block> BIRCH_PLANKS = registry.registerBlock(id("small_stairs_planks_birch"), () -> Blocks.BIRCH_PLANKS_SMALL_STAIR);
        RegistryResult<Block> JUNGLE_PLANKS = registry.registerBlock(id("small_stairs_planks_jungle"), () -> Blocks.JUNGLE_PLANKS_SMALL_STAIR);
        RegistryResult<Block> ACACIA_PLANKS = registry.registerBlock(id("small_stairs_planks_acacia"), () -> Blocks.ACACIA_PLANKS_SMALL_STAIR);
        RegistryResult<Block> DARK_OAK_PLANKS = registry.registerBlock(id("small_stairs_planks_dark_oak"), () -> Blocks.DARK_OAK_PLANKS_SMALL_STAIR);
        RegistryResult<Block> CRIMSON_PLANKS = registry.registerBlock(id("small_stairs_planks_crimson"), () -> Blocks.CRIMSON_PLANKS_SMALL_STAIR);
        RegistryResult<Block> WARPED_PLANKS = registry.registerBlock(id("small_stairs_planks_warped"), () -> Blocks.WARPED_PLANKS_SMALL_STAIR);
        RegistryResult<Block> COBBLESTONE = registry.registerBlock(id("small_stairs_cobblestone"), () -> Blocks.COBBLESTONE_SMALL_STAIR);
        RegistryResult<Block> SANDSTONE = registry.registerBlock(id("small_stairs_sandstone"), () -> Blocks.SANDSTONE_SMALL_STAIR);
        RegistryResult<Block> RED_SANDSTONE = registry.registerBlock(id("small_stairs_red_sandstone"), () -> Blocks.RED_SANDSTONE_SMALL_STAIR);
        RegistryResult<Block> BRICKS = registry.registerBlock(id("small_stairs_brick"), () -> Blocks.BRICKS_SMALL_STAIR);
        RegistryResult<Block> STONE_BRICKS = registry.registerBlock(id("small_stairs_stonebrick"), () -> Blocks.STONE_BRICKS_SMALL_STAIR);
        RegistryResult<Block> NETHER_BRICKS = registry.registerBlock(id("small_stairs_nether_brick"), () -> Blocks.NETHER_BRICKS_SMALL_STAIR);
        RegistryResult<Block> RED_NETHER_BRICKS = registry.registerBlock(id("small_stairs_red_nether_brick"), () -> Blocks.RED_NETHER_BRICKS_SMALL_STAIR);
        RegistryResult<Block> STONE = registry.registerBlock(id("small_stairs_stone"), () -> Blocks.STONE_SMALL_STAIR);
        RegistryResult<Block> RED_WOOL = registry.registerBlock(id("small_stairs_red_wool"), () -> Blocks.RED_WOOL_SMALL_STAIR);
        RegistryResult<Block> YELLOW_WOOL = registry.registerBlock(id("small_stairs_yellow_wool"), () -> Blocks.YELLOW_WOOL_SMALL_STAIR);
        RegistryResult<Block> QUARTZ_BLOCK = registry.registerBlock(id("small_stairs_quartz_block"), () -> Blocks.QUARTZ_BLOCK_SMALL_STAIR);
        RegistryResult<Block> PURPUR_BLOCK = registry.registerBlock(id("small_stairs_purpur_block"), () -> Blocks.PURPUR_BLOCK_SMALL_STAIR);

        registry.registerItem(id("small_stairs_planks_oak"), () -> ItemUtil.ofBlock(OAK_PLANKS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_planks_oak").toMinecraft()) ));
        registry.registerItem(id("small_stairs_planks_spruce"), () -> ItemUtil.ofBlock(SPRUCE_PLANKS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_planks_spruce").toMinecraft()) ));
        registry.registerItem(id("small_stairs_planks_birch"), () -> ItemUtil.ofBlock(BIRCH_PLANKS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_planks_birch").toMinecraft()) ));
        registry.registerItem(id("small_stairs_planks_jungle"), () -> ItemUtil.ofBlock(JUNGLE_PLANKS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_planks_jungle").toMinecraft()) ));
        registry.registerItem(id("small_stairs_planks_acacia"), () -> ItemUtil.ofBlock(ACACIA_PLANKS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_planks_acacia").toMinecraft()) ));
        registry.registerItem(id("small_stairs_planks_dark_oak"), () -> ItemUtil.ofBlock(DARK_OAK_PLANKS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_planks_dark_oak").toMinecraft()) ));

        if (BlockUtil.isExist(IdentifierUtil.id("minecraft", "mangrove_planks"))) {
            RegistryResult<Block> MANGROVE_PLANKS = registry.registerBlock(id("small_stairs_planks_mangrove"), () -> net.pitan76.smallstairs.v119.Blocks.MANGROVE_PLANKS_SMALL_STAIR);
            registry.registerItem(id("small_stairs_planks_mangrove"), () -> ItemUtil.ofBlock(MANGROVE_PLANKS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_planks_mangrove").toMinecraft()) ));
        } else {
            RegistryResult<Block> MANGROVE_PLANKS = registry.registerBlock(id("small_stairs_planks_mangrove"), () -> new SmallStairBlock(BlockStateUtil.getDefaultState(Blocks.STONE_SMALL_STAIR), CompatibleBlockSettings.copy(Blocks.STONE_SMALL_STAIR)));
            registry.registerItem(id("small_stairs_planks_mangrove"), () -> ItemUtil.ofBlock(MANGROVE_PLANKS.getOrNull(), new CompatibleItemSettings()) );
        }

        registry.registerItem(id("small_stairs_planks_crimson"), () -> ItemUtil.ofBlock(CRIMSON_PLANKS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_planks_crimson").toMinecraft()) ));
        registry.registerItem(id("small_stairs_planks_warped"), () -> ItemUtil.ofBlock(WARPED_PLANKS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_planks_warped").toMinecraft()) ));
        registry.registerItem(id("small_stairs_cobblestone"), () -> ItemUtil.ofBlock(COBBLESTONE.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_cobblestone").toMinecraft()) ));
        registry.registerItem(id("small_stairs_sandstone"), () -> ItemUtil.ofBlock(SANDSTONE.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_sandstone").toMinecraft()) ));
        registry.registerItem(id("small_stairs_red_sandstone"), () -> ItemUtil.ofBlock(RED_SANDSTONE.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_red_sandstone").toMinecraft()) ));
        registry.registerItem(id("small_stairs_brick"), () -> ItemUtil.ofBlock(BRICKS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_brick").toMinecraft()) ));
        registry.registerItem(id("small_stairs_stonebrick"), () -> ItemUtil.ofBlock(STONE_BRICKS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_stonebrick").toMinecraft()) ));
        registry.registerItem(id("small_stairs_nether_brick"), () -> ItemUtil.ofBlock(NETHER_BRICKS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_nether_brick").toMinecraft()) ));
        registry.registerItem(id("small_stairs_red_nether_brick"), () -> ItemUtil.ofBlock(RED_NETHER_BRICKS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_red_nether_brick").toMinecraft()) ));
        registry.registerItem(id("small_stairs_stone"), () -> ItemUtil.ofBlock(STONE.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_stone").toMinecraft()) ));
        registry.registerItem(id("small_stairs_red_wool"), () -> ItemUtil.ofBlock(RED_WOOL.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_red_wool").toMinecraft()) ));
        registry.registerItem(id("small_stairs_yellow_wool"), () -> ItemUtil.ofBlock(YELLOW_WOOL.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_yellow_wool").toMinecraft()) ));
        registry.registerItem(id("small_stairs_quartz_block"), () -> ItemUtil.ofBlock(QUARTZ_BLOCK.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_quartz_block").toMinecraft()) ));
        registry.registerItem(id("small_stairs_purpur_block"), () -> ItemUtil.ofBlock(PURPUR_BLOCK.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_purpur_block").toMinecraft()) ));

        registry.allRegister();

    }
}