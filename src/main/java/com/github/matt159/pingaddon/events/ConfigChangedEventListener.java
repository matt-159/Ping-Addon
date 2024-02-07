package com.github.matt159.pingaddon.events;

import com.github.matt159.pingaddon.Tags;
import com.github.matt159.pingaddon.config.SoundMap;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ConfigChangedEventListener {
    @SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (!event.modID.equals(Tags.MODID)) {
            return;
        }

        SoundMap.reload();
    }
}
