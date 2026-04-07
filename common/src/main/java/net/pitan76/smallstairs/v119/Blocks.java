package net.pitan76.smallstairs.v119;

import net.pitan76.mcpitanlib.api.block.v2.CompatibleBlockSettings;
import net.pitan76.mcpitanlib.midohra.block.BlockWrapper;
import net.pitan76.smallstairs.SmallStairBlock;

import static net.pitan76.smallstairs.SmallStairs._id;

public class Blocks {
    public static SmallStairBlock MANGROVE_PLANKS_SMALL_STAIR = new SmallStairBlock(BlockWrapper.of("mangrove_planks"), CompatibleBlockSettings.copy(_id("small_stairs_planks_mangrove"), BlockWrapper.of("mangrove_planks").getOrDefault(net.minecraft.block.Blocks.MANGROVE_PLANKS)));
}
