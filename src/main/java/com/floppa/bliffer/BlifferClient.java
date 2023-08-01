package com.floppa.bliffer;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class BlifferClient implements ClientModInitializer {
    // Stores users who have capes
    public static final String[][] capes = new String[][]{
            new String[]{"FloppaGodJava", "cape"},
    };

    public void onInitializeClient() {

    }
}