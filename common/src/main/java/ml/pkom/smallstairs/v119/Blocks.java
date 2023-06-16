package ml.pkom.smallstairs.v119;

import ml.pkom.mcpitanlibarch.api.block.CompatibleBlockSettings;
import ml.pkom.smallstairs.SmallStairBlock;
import net.minecraft.block.Block;

import static net.minecraft.block.Blocks.MANGROVE_PLANKS;

public class Blocks {
    public static Block MANGROVE_PLANKS_SMALL_STAIR = new SmallStairBlock(MANGROVE_PLANKS.getDefaultState(), CompatibleBlockSettings.copy(MANGROVE_PLANKS));
}
