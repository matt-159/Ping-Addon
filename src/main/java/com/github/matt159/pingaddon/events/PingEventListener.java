package com.github.matt159.pingaddon.events;

import com.github.matt159.pingaddon.PingAddon;
import com.github.matt159.pingaddon.Sounds;
import lombok.val;
import mega.ping.api.events.PingEvent;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

import java.util.HashSet;
import java.util.Set;

public class PingEventListener {
    private static final Set<String> goldOres    = new HashSet<>();
    private static final Set<String> fancyBlocks = new HashSet<>();
    private static final Set<String> mushrooms = new HashSet<>();


    static {
        goldOres.add("tile.oreGold");

        fancyBlocks.add("tile.blockGold");

        mushrooms.add("tile.mushroom");
    }

    @SubscribeEvent
    public void onPingEvent(PingEvent event) {
        PingAddon.info(event.blockPinged.getUnlocalizedName() + " was pinged");

        val blockName = event.blockPinged.getUnlocalizedName();

        if (goldOres.contains(blockName)) {
            event.player.worldObj.playSoundAtEntity(event.player,
                                                    Sounds.PING_GOLD_ORE.toString(),
                                                    1.0F,
                                                    1.0F);
        }

        if (fancyBlocks.contains(blockName)) {
            event.player.worldObj.playSoundAtEntity(event.player,
                                                    Sounds.PING_FANCY_BLOCK.toString(),
                                                    1.0F,
                                                    1.0F);
        }

        if (mushrooms.contains(blockName)) {
            event.player.worldObj.playSoundAtEntity(event.player,
                                                    Sounds.PING_MUSHROOM.toString(),
                                                    1.0F,
                                                    1.0F);
        }
    }
}
