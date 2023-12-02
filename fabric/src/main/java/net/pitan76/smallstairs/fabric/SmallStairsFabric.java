package net.pitan76.smallstairs.fabric;

import net.pitan76.smallstairs.SmallStairs;
import net.fabricmc.api.ModInitializer;

public class SmallStairsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        SmallStairs.init();
    }
}