package net.pitan76.smallstairs.v119;

import net.minecraft.block.Block;
import net.pitan76.mcpitanlib.api.block.v2.CompatibleBlockSettings;
import net.pitan76.smallstairs.SmallStairBlock;

import static net.minecraft.block.Blocks.MANGROVE_PLANKS;
import static net.pitan76.smallstairs.SmallStairs._id;

public class Blocks {
    public static Block MANGROVE_PLANKS_SMALL_STAIR = new SmallStairBlock(MANGROVE_PLANKS, CompatibleBlockSettings.copy(_id("small_stairs_planks_mangrove"), MANGROVE_PLANKS));
}
