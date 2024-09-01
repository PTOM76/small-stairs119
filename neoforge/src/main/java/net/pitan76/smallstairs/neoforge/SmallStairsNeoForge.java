package net.pitan76.smallstairs.neoforge;

import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.pitan76.smallstairs.SmallStairs;

@Mod(SmallStairs.MOD_ID)
public class SmallStairsNeoForge {
    public SmallStairsNeoForge(ModContainer modContainer) {
        new SmallStairs();
    }
}