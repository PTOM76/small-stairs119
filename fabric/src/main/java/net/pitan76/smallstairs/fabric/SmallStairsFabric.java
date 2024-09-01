package net.pitan76.smallstairs.fabric;

import net.fabricmc.api.ModInitializer;
import net.pitan76.smallstairs.SmallStairs;

public class SmallStairsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        new SmallStairs();
    }
}