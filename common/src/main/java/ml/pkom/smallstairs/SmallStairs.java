package ml.pkom.smallstairs;

import ml.pkom.mcpitanlibarch.api.event.registry.RegistryEvent;
import ml.pkom.mcpitanlibarch.api.registry.ArchRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SmallStairs {
    public static final String MOD_ID = "smallstairs";
    public static final String MOD_NAME = "SmallStairs";

    public static Logger LOGGER = LogManager.getLogger();
    public static void log(Level level, String message){
        LOGGER.log(level, "[" + MOD_NAME + "] " + message);
    }

    public static Identifier id(String id) {
        return new Identifier(MOD_ID, id);
    }

    public static ArchRegistry registry = ArchRegistry.createRegistry(MOD_ID);

    public static void init() {
        RegistryEvent<Block> OAK_PLANKS = registry.registerBlock(id("small_stairs_planks_oak"), () -> Blocks.OAK_PLANKS_SMALL_STAIR);
        RegistryEvent<Block> SPRUCE_PLANKS = registry.registerBlock(id("small_stairs_planks_spruce"), () -> Blocks.SPRUCE_PLANKS_SMALL_STAIR);
        RegistryEvent<Block> BIRCH_PLANKS = registry.registerBlock(id("small_stairs_planks_birch"), () -> Blocks.BIRCH_PLANKS_SMALL_STAIR);
        RegistryEvent<Block> JUNGLE_PLANKS = registry.registerBlock(id("small_stairs_planks_jungle"), () -> Blocks.JUNGLE_PLANKS_SMALL_STAIR);
        RegistryEvent<Block> ACACIA_PLANKS = registry.registerBlock(id("small_stairs_planks_acacia"), () -> Blocks.ACACIA_PLANKS_SMALL_STAIR);
        RegistryEvent<Block> DARK_OAK_PLANKS = registry.registerBlock(id("small_stairs_planks_dark_oak"), () -> Blocks.DARK_OAK_PLANKS_SMALL_STAIR);
        RegistryEvent<Block> CRIMSON_PLANKS = registry.registerBlock(id("small_stairs_planks_crimson"), () -> Blocks.CRIMSON_PLANKS_SMALL_STAIR);
        RegistryEvent<Block> WARPED_PLANKS = registry.registerBlock(id("small_stairs_planks_warped"), () -> Blocks.WARPED_PLANKS_SMALL_STAIR);
        RegistryEvent<Block> COBBLESTONE = registry.registerBlock(id("small_stairs_cobblestone"), () -> Blocks.COBBLESTONE_SMALL_STAIR);
        RegistryEvent<Block> SANDSTONE = registry.registerBlock(id("small_stairs_sandstone"), () -> Blocks.SANDSTONE_SMALL_STAIR);
        RegistryEvent<Block> RED_SANDSTONE = registry.registerBlock(id("small_stairs_red_sandstone"), () -> Blocks.RED_SANDSTONE_SMALL_STAIR);
        RegistryEvent<Block> BRICKS = registry.registerBlock(id("small_stairs_brick"), () -> Blocks.BRICKS_SMALL_STAIR);
        RegistryEvent<Block> STONE_BRICKS = registry.registerBlock(id("small_stairs_stonebrick"), () -> Blocks.STONE_BRICKS_SMALL_STAIR);
        RegistryEvent<Block> NETHER_BRICKS = registry.registerBlock(id("small_stairs_nether_brick"), () -> Blocks.NETHER_BRICKS_SMALL_STAIR);
        RegistryEvent<Block> RED_NETHER_BRICKS = registry.registerBlock(id("small_stairs_red_nether_brick"), () -> Blocks.RED_NETHER_BRICKS_SMALL_STAIR);
        RegistryEvent<Block> STONE = registry.registerBlock(id("small_stairs_stone"), () -> Blocks.STONE_SMALL_STAIR);
        RegistryEvent<Block> RED_WOOL = registry.registerBlock(id("small_stairs_red_wool"), () -> Blocks.RED_WOOL_SMALL_STAIR);
        RegistryEvent<Block> YELLOW_WOOL = registry.registerBlock(id("small_stairs_yellow_wool"), () -> Blocks.YELLOW_WOOL_SMALL_STAIR);
        RegistryEvent<Block> QUARTZ_BLOCK = registry.registerBlock(id("small_stairs_quartz_block"), () -> Blocks.QUARTZ_BLOCK_SMALL_STAIR);

        registry.registerItem(id("small_stairs_planks_oak"), () -> new BlockItem(OAK_PLANKS.getOrNull(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        registry.registerItem(id("small_stairs_planks_spruce"), () -> new BlockItem(SPRUCE_PLANKS.getOrNull(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        registry.registerItem(id("small_stairs_planks_birch"), () -> new BlockItem(BIRCH_PLANKS.getOrNull(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        registry.registerItem(id("small_stairs_planks_jungle"), () -> new BlockItem(JUNGLE_PLANKS.getOrNull(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        registry.registerItem(id("small_stairs_planks_acacia"), () -> new BlockItem(ACACIA_PLANKS.getOrNull(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        registry.registerItem(id("small_stairs_planks_dark_oak"), () -> new BlockItem(DARK_OAK_PLANKS.getOrNull(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        if (Registry.BLOCK.getIds().contains(new Identifier("minecraft", "mangrove_planks"))) {
            RegistryEvent<Block> MANGROVE_PLANKS = registry.registerBlock(id("small_stairs_planks_mangrove"), () -> ml.pkom.smallstairs.v119.Blocks.MANGROVE_PLANKS_SMALL_STAIR);
            registry.registerItem(id("small_stairs_planks_mangrove"), () -> new BlockItem(MANGROVE_PLANKS.getOrNull(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        }
        registry.registerItem(id("small_stairs_planks_crimson"), () -> new BlockItem(CRIMSON_PLANKS.getOrNull(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        registry.registerItem(id("small_stairs_planks_warped"), () -> new BlockItem(WARPED_PLANKS.getOrNull(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        registry.registerItem(id("small_stairs_cobblestone"), () -> new BlockItem(COBBLESTONE.getOrNull(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        registry.registerItem(id("small_stairs_sandstone"), () -> new BlockItem(SANDSTONE.getOrNull(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        registry.registerItem(id("small_stairs_red_sandstone"), () -> new BlockItem(RED_SANDSTONE.getOrNull(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        registry.registerItem(id("small_stairs_brick"), () -> new BlockItem(BRICKS.getOrNull(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        registry.registerItem(id("small_stairs_stonebrick"), () -> new BlockItem(STONE_BRICKS.getOrNull(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        registry.registerItem(id("small_stairs_nether_brick"), () -> new BlockItem(NETHER_BRICKS.getOrNull(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        registry.registerItem(id("small_stairs_red_nether_brick"), () -> new BlockItem(RED_NETHER_BRICKS.getOrNull(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        registry.registerItem(id("small_stairs_stone"), () -> new BlockItem(STONE.getOrNull(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        registry.registerItem(id("small_stairs_red_wool"), () -> new BlockItem(RED_WOOL.getOrNull(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        registry.registerItem(id("small_stairs_yellow_wool"), () -> new BlockItem(YELLOW_WOOL.getOrNull(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        registry.registerItem(id("small_stairs_quartz_block"), () -> new BlockItem(QUARTZ_BLOCK.getOrNull(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

        registry.allRegister();
    }
}