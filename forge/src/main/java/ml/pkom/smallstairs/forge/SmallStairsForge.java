package ml.pkom.smallstairs.forge;

import dev.architectury.platform.forge.EventBuses;
import ml.pkom.smallstairs.SmallStairs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SmallStairs.MOD_ID)
public class SmallStairsForge {
    public SmallStairsForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(SmallStairs.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        SmallStairs.init();
    }
}