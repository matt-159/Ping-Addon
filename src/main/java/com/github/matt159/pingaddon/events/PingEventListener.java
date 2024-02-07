package com.github.matt159.pingaddon.events;

import com.github.matt159.pingaddon.PingAddon;
import com.github.matt159.pingaddon.config.PingAddonConfig;
import com.github.matt159.pingaddon.config.SoundMap;
import lombok.val;
import mega.ping.api.events.PingEvent;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class PingEventListener {
    @SubscribeEvent
    public void onPingEvent(PingEvent event) {
        val blockName = event.blockPinged.getUnlocalizedName();

        if (PingAddonConfig.General.showBlockName) {
            PingAddon.info(blockName + " was pinged");
        }

        val sound = SoundMap.getSound(blockName);

        if (sound != null) {
            this.playSound(event.player, sound);
        }
    }

    private void playSound(EntityPlayer player, ResourceLocation sound) {
        player.worldObj.playSoundAtEntity(player,
                                          sound.toString(),
                                          1.0F,
                                          1.0F);
    }
}
