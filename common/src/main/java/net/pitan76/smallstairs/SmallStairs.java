package net.pitan76.smallstairs;

import net.minecraft.block.Block;
import net.pitan76.mcpitanlib.api.CommonModInitializer;
import net.pitan76.mcpitanlib.api.block.v2.CompatibleBlockSettings;
import net.pitan76.mcpitanlib.api.item.v2.CompatibleItemSettings;
import net.pitan76.mcpitanlib.api.item.DefaultItemGroups;
import net.pitan76.mcpitanlib.api.registry.result.RegistryResult;
import net.pitan76.mcpitanlib.api.util.CompatIdentifier;
import net.pitan76.mcpitanlib.api.util.item.ItemUtil;
import net.pitan76.mcpitanlib.api.util.block.BlockUtil;

public class SmallStairs extends CommonModInitializer {
    public static final String MOD_ID = "smallstairs";
    public static final String MOD_NAME = "SmallStairs";
    
    public static SmallStairs INSTANCE;

    public void init() {
        INSTANCE = this;
        
        RegistryResult<Block> OAK_PLANKS = registry.registerBlock(_id("small_stairs_planks_oak"), () -> Blocks.OAK_PLANKS_SMALL_STAIR);
        RegistryResult<Block> SPRUCE_PLANKS = registry.registerBlock(_id("small_stairs_planks_spruce"), () -> Blocks.SPRUCE_PLANKS_SMALL_STAIR);
        RegistryResult<Block> BIRCH_PLANKS = registry.registerBlock(_id("small_stairs_planks_birch"), () -> Blocks.BIRCH_PLANKS_SMALL_STAIR);
        RegistryResult<Block> JUNGLE_PLANKS = registry.registerBlock(_id("small_stairs_planks_jungle"), () -> Blocks.JUNGLE_PLANKS_SMALL_STAIR);
        RegistryResult<Block> ACACIA_PLANKS = registry.registerBlock(_id("small_stairs_planks_acacia"), () -> Blocks.ACACIA_PLANKS_SMALL_STAIR);
        RegistryResult<Block> DARK_OAK_PLANKS = registry.registerBlock(_id("small_stairs_planks_dark_oak"), () -> Blocks.DARK_OAK_PLANKS_SMALL_STAIR);
        RegistryResult<Block> CRIMSON_PLANKS = registry.registerBlock(_id("small_stairs_planks_crimson"), () -> Blocks.CRIMSON_PLANKS_SMALL_STAIR);
        RegistryResult<Block> WARPED_PLANKS = registry.registerBlock(_id("small_stairs_planks_warped"), () -> Blocks.WARPED_PLANKS_SMALL_STAIR);
        RegistryResult<Block> COBBLESTONE = registry.registerBlock(_id("small_stairs_cobblestone"), () -> Blocks.COBBLESTONE_SMALL_STAIR);
        RegistryResult<Block> SANDSTONE = registry.registerBlock(_id("small_stairs_sandstone"), () -> Blocks.SANDSTONE_SMALL_STAIR);
        RegistryResult<Block> RED_SANDSTONE = registry.registerBlock(_id("small_stairs_red_sandstone"), () -> Blocks.RED_SANDSTONE_SMALL_STAIR);
        RegistryResult<Block> BRICKS = registry.registerBlock(_id("small_stairs_brick"), () -> Blocks.BRICKS_SMALL_STAIR);
        RegistryResult<Block> STONE_BRICKS = registry.registerBlock(_id("small_stairs_stonebrick"), () -> Blocks.STONE_BRICKS_SMALL_STAIR);
        RegistryResult<Block> NETHER_BRICKS = registry.registerBlock(_id("small_stairs_nether_brick"), () -> Blocks.NETHER_BRICKS_SMALL_STAIR);
        RegistryResult<Block> RED_NETHER_BRICKS = registry.registerBlock(_id("small_stairs_red_nether_brick"), () -> Blocks.RED_NETHER_BRICKS_SMALL_STAIR);
        RegistryResult<Block> STONE = registry.registerBlock(_id("small_stairs_stone"), () -> Blocks.STONE_SMALL_STAIR);
        RegistryResult<Block> RED_WOOL = registry.registerBlock(_id("small_stairs_red_wool"), () -> Blocks.RED_WOOL_SMALL_STAIR);
        RegistryResult<Block> YELLOW_WOOL = registry.registerBlock(_id("small_stairs_yellow_wool"), () -> Blocks.YELLOW_WOOL_SMALL_STAIR);
        RegistryResult<Block> QUARTZ_BLOCK = registry.registerBlock(_id("small_stairs_quartz_block"), () -> Blocks.QUARTZ_BLOCK_SMALL_STAIR);
        RegistryResult<Block> PURPUR_BLOCK = registry.registerBlock(_id("small_stairs_purpur_block"), () -> Blocks.PURPUR_BLOCK_SMALL_STAIR);

        registry.registerItem(_id("small_stairs_planks_oak"), () -> ItemUtil.create(OAK_PLANKS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_planks_oak")).addGroup(DefaultItemGroups.BUILDING_BLOCKS) ));
        registry.registerItem(_id("small_stairs_planks_spruce"), () -> ItemUtil.create(SPRUCE_PLANKS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_planks_spruce")).addGroup(DefaultItemGroups.BUILDING_BLOCKS) ));
        registry.registerItem(_id("small_stairs_planks_birch"), () -> ItemUtil.create(BIRCH_PLANKS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_planks_birch")).addGroup(DefaultItemGroups.BUILDING_BLOCKS) ));
        registry.registerItem(_id("small_stairs_planks_jungle"), () -> ItemUtil.create(JUNGLE_PLANKS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_planks_jungle")).addGroup(DefaultItemGroups.BUILDING_BLOCKS) ));
        registry.registerItem(_id("small_stairs_planks_acacia"), () -> ItemUtil.create(ACACIA_PLANKS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_planks_acacia")).addGroup(DefaultItemGroups.BUILDING_BLOCKS) ));
        registry.registerItem(_id("small_stairs_planks_dark_oak"), () -> ItemUtil.create(DARK_OAK_PLANKS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_planks_dark_oak")).addGroup(DefaultItemGroups.BUILDING_BLOCKS) ));

        if (BlockUtil.isExist(CompatIdentifier.of("minecraft", "mangrove_planks"))) {
            RegistryResult<Block> MANGROVE_PLANKS = registry.registerBlock(_id("small_stairs_planks_mangrove"), () -> net.pitan76.smallstairs.v119.Blocks.MANGROVE_PLANKS_SMALL_STAIR);
            registry.registerItem(_id("small_stairs_planks_mangrove"), () -> ItemUtil.create(MANGROVE_PLANKS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_planks_mangrove")).addGroup(DefaultItemGroups.BUILDING_BLOCKS) ));
        } else {
            RegistryResult<Block> MANGROVE_PLANKS = registry.registerBlock(_id("small_stairs_planks_mangrove"), () -> new SmallStairBlock(Blocks.STONE_SMALL_STAIR, CompatibleBlockSettings.copy(_id("small_stairs_planks_mangrove"), Blocks.STONE_SMALL_STAIR)));
            registry.registerItem(_id("small_stairs_planks_mangrove"), () -> ItemUtil.create(MANGROVE_PLANKS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_planks_mangrove"))) );
        }

        registry.registerItem(_id("small_stairs_planks_crimson"), () -> ItemUtil.create(CRIMSON_PLANKS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_planks_crimson")).addGroup(DefaultItemGroups.BUILDING_BLOCKS) ));
        registry.registerItem(_id("small_stairs_planks_warped"), () -> ItemUtil.create(WARPED_PLANKS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_planks_warped")).addGroup(DefaultItemGroups.BUILDING_BLOCKS) ));
        registry.registerItem(_id("small_stairs_cobblestone"), () -> ItemUtil.create(COBBLESTONE.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_cobblestone")).addGroup(DefaultItemGroups.BUILDING_BLOCKS) ));
        registry.registerItem(_id("small_stairs_sandstone"), () -> ItemUtil.create(SANDSTONE.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_sandstone")).addGroup(DefaultItemGroups.BUILDING_BLOCKS) ));
        registry.registerItem(_id("small_stairs_red_sandstone"), () -> ItemUtil.create(RED_SANDSTONE.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_red_sandstone")).addGroup(DefaultItemGroups.BUILDING_BLOCKS) ));
        registry.registerItem(_id("small_stairs_brick"), () -> ItemUtil.create(BRICKS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_brick")).addGroup(DefaultItemGroups.BUILDING_BLOCKS) ));
        registry.registerItem(_id("small_stairs_stonebrick"), () -> ItemUtil.create(STONE_BRICKS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_stonebrick")).addGroup(DefaultItemGroups.BUILDING_BLOCKS) ));
        registry.registerItem(_id("small_stairs_nether_brick"), () -> ItemUtil.create(NETHER_BRICKS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_nether_brick")).addGroup(DefaultItemGroups.BUILDING_BLOCKS) ));
        registry.registerItem(_id("small_stairs_red_nether_brick"), () -> ItemUtil.create(RED_NETHER_BRICKS.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_red_nether_brick")).addGroup(DefaultItemGroups.BUILDING_BLOCKS) ));
        registry.registerItem(_id("small_stairs_stone"), () -> ItemUtil.create(STONE.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_stone")).addGroup(DefaultItemGroups.BUILDING_BLOCKS) ));
        registry.registerItem(_id("small_stairs_red_wool"), () -> ItemUtil.create(RED_WOOL.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_red_wool")).addGroup(DefaultItemGroups.BUILDING_BLOCKS) ));
        registry.registerItem(_id("small_stairs_yellow_wool"), () -> ItemUtil.create(YELLOW_WOOL.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_yellow_wool")).addGroup(DefaultItemGroups.BUILDING_BLOCKS) ));
        registry.registerItem(_id("small_stairs_quartz_block"), () -> ItemUtil.create(QUARTZ_BLOCK.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_quartz_block")).addGroup(DefaultItemGroups.BUILDING_BLOCKS) ));
        registry.registerItem(_id("small_stairs_purpur_block"), () -> ItemUtil.create(PURPUR_BLOCK.getOrNull(), CompatibleItemSettings.of(_id("small_stairs_purpur_block")).addGroup(DefaultItemGroups.BUILDING_BLOCKS) ));
    }

    public static CompatIdentifier _id(String path) {
        return CompatIdentifier.of(MOD_ID, path);
    }

    @Override
    public String getId() {
        return MOD_ID;
    }

    @Override
    public String getName() {
        return MOD_NAME;
    }
}