package net.pitan76.smallstairs;

import net.pitan76.mcpitanlib.api.CommonModInitializer;
import net.pitan76.mcpitanlib.api.registry.v2.CompatRegistryV2;
import net.pitan76.mcpitanlib.api.util.CompatIdentifier;

public class SmallStairs extends CommonModInitializer {
    public static final String MOD_ID = "smallstairs";
    public static final String MOD_NAME = "SmallStairs";
    
    public static SmallStairs INSTANCE;
    public static CompatRegistryV2 registry;

    public void init() {
        INSTANCE = this;
        registry = super.registry;

        Blocks.init();
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