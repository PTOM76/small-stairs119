package ml.pkom.smallstairs.fabric;

import ml.pkom.smallstairs.SmallStairs;
import net.fabricmc.api.ModInitializer;

public class SmallStairsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        SmallStairs.init();
    }
}