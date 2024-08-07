package net.pitan76.smallstairs;

import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.pitan76.mcpitanlib.api.block.CompatibleBlockSettings;
import net.pitan76.mcpitanlib.api.item.CompatibleItemSettings;
import net.pitan76.mcpitanlib.api.item.DefaultItemGroups;
import net.pitan76.mcpitanlib.api.registry.CompatRegistry;
import net.pitan76.mcpitanlib.api.registry.result.RegistryResult;
import net.pitan76.mcpitanlib.api.util.BlockStateUtil;
import net.pitan76.mcpitanlib.api.util.BlockUtil;
import net.pitan76.mcpitanlib.api.util.IdentifierUtil;
import net.pitan76.mcpitanlib.api.util.ItemUtil;

public class SmallStairs {
    public static final String MOD_ID = "smallstairs";
    public static final String MOD_NAME = "SmallStairs";

    public static Identifier id(String id) {
        return IdentifierUtil.id(MOD_ID, id);
    }

    public static CompatRegistry registry = CompatRegistry.createRegistry(MOD_ID);

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

        registry.registerItem(id("small_stairs_planks_oak"), () -> ItemUtil.ofBlock(OAK_PLANKS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_planks_oak")) ));
        registry.registerItem(id("small_stairs_planks_spruce"), () -> ItemUtil.ofBlock(SPRUCE_PLANKS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_planks_spruce")) ));
        registry.registerItem(id("small_stairs_planks_birch"), () -> ItemUtil.ofBlock(BIRCH_PLANKS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_planks_birch")) ));
        registry.registerItem(id("small_stairs_planks_jungle"), () -> ItemUtil.ofBlock(JUNGLE_PLANKS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_planks_jungle")) ));
        registry.registerItem(id("small_stairs_planks_acacia"), () -> ItemUtil.ofBlock(ACACIA_PLANKS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_planks_acacia")) ));
        registry.registerItem(id("small_stairs_planks_dark_oak"), () -> ItemUtil.ofBlock(DARK_OAK_PLANKS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_planks_dark_oak")) ));

        if (BlockUtil.isExist(IdentifierUtil.id("minecraft", "mangrove_planks"))) {
            RegistryResult<Block> MANGROVE_PLANKS = registry.registerBlock(id("small_stairs_planks_mangrove"), () -> net.pitan76.smallstairs.v119.Blocks.MANGROVE_PLANKS_SMALL_STAIR);
            registry.registerItem(id("small_stairs_planks_mangrove"), () -> ItemUtil.ofBlock(MANGROVE_PLANKS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_planks_mangrove")) ));
        } else {
            RegistryResult<Block> MANGROVE_PLANKS = registry.registerBlock(id("small_stairs_planks_mangrove"), () -> new SmallStairBlock(BlockStateUtil.getDefaultState(Blocks.STONE_SMALL_STAIR), CompatibleBlockSettings.copy(Blocks.STONE_SMALL_STAIR)));
            registry.registerItem(id("small_stairs_planks_mangrove"), () -> ItemUtil.ofBlock(MANGROVE_PLANKS.getOrNull(), new CompatibleItemSettings()) );
        }

        registry.registerItem(id("small_stairs_planks_crimson"), () -> ItemUtil.ofBlock(CRIMSON_PLANKS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_planks_crimson")) ));
        registry.registerItem(id("small_stairs_planks_warped"), () -> ItemUtil.ofBlock(WARPED_PLANKS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_planks_warped")) ));
        registry.registerItem(id("small_stairs_cobblestone"), () -> ItemUtil.ofBlock(COBBLESTONE.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_cobblestone")) ));
        registry.registerItem(id("small_stairs_sandstone"), () -> ItemUtil.ofBlock(SANDSTONE.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_sandstone")) ));
        registry.registerItem(id("small_stairs_red_sandstone"), () -> ItemUtil.ofBlock(RED_SANDSTONE.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_red_sandstone")) ));
        registry.registerItem(id("small_stairs_brick"), () -> ItemUtil.ofBlock(BRICKS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_brick")) ));
        registry.registerItem(id("small_stairs_stonebrick"), () -> ItemUtil.ofBlock(STONE_BRICKS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_stonebrick")) ));
        registry.registerItem(id("small_stairs_nether_brick"), () -> ItemUtil.ofBlock(NETHER_BRICKS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_nether_brick")) ));
        registry.registerItem(id("small_stairs_red_nether_brick"), () -> ItemUtil.ofBlock(RED_NETHER_BRICKS.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_red_nether_brick")) ));
        registry.registerItem(id("small_stairs_stone"), () -> ItemUtil.ofBlock(STONE.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_stone")) ));
        registry.registerItem(id("small_stairs_red_wool"), () -> ItemUtil.ofBlock(RED_WOOL.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_red_wool")) ));
        registry.registerItem(id("small_stairs_yellow_wool"), () -> ItemUtil.ofBlock(YELLOW_WOOL.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_yellow_wool")) ));
        registry.registerItem(id("small_stairs_quartz_block"), () -> ItemUtil.ofBlock(QUARTZ_BLOCK.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_quartz_block")) ));
        registry.registerItem(id("small_stairs_purpur_block"), () -> ItemUtil.ofBlock(PURPUR_BLOCK.getOrNull(), new CompatibleItemSettings().addGroup(() -> DefaultItemGroups.BUILDING_BLOCKS, id("small_stairs_purpur_block")) ));

        registry.allRegister();

    }
}