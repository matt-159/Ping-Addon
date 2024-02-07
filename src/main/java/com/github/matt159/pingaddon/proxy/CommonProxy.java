package com.github.matt159.pingaddon.proxy;

import com.github.matt159.pingaddon.config.SoundMap;
import com.github.matt159.pingaddon.events.ConfigChangedEventListener;
import com.github.matt159.pingaddon.events.PingEventListener;
import lombok.val;

import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

public class CommonProxy {
    // load "Do your mod setup. Build whatever data structures you care about. Register recipes."
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new PingEventListener());

        val configChangedEventListener = new ConfigChangedEventListener();
        MinecraftForge.EVENT_BUS.register(configChangedEventListener);
        FMLCommonHandler.instance().bus().register(configChangedEventListener);

        SoundMap.reload();
    }
}
