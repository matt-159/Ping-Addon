package com.github.matt159.pingaddon.proxy;

import com.github.matt159.pingaddon.config.SoundMap;

import cpw.mods.fml.common.event.*;

public class ClientProxy extends CommonProxy {
    // load "Do your mod setup. Build whatever data structures you care about. Register recipes."
    public void init(FMLInitializationEvent event) {
        super.init(event);

        SoundMap.reload();
    }
}