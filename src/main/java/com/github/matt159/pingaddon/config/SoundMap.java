package com.github.matt159.pingaddon.config;

import lombok.experimental.UtilityClass;
import lombok.val;

import net.minecraft.util.ResourceLocation;

import java.util.HashMap;
import java.util.Map;

@UtilityClass
public final class SoundMap {
    private static final Map<String, PingSounds> unlocalizedNameToSound = new HashMap<>();

    public static void reload() {
        unlocalizedNameToSound.clear();

        loadBlocks(PingAddonConfig.Dirt.blocks, PingSounds.dirt);
        loadBlocks(PingAddonConfig.Driller.blocks, PingSounds.driller);
        loadBlocks(PingAddonConfig.Flora.blocks, PingSounds.flora);
        loadBlocks(PingAddonConfig.Gold.blocks, PingSounds.gold);
        loadBlocks(PingAddonConfig.Iron.blocks, PingSounds.iron);
        loadBlocks(PingAddonConfig.Machine.blocks, PingSounds.machine);
        loadBlocks(PingAddonConfig.Meteorite.blocks, PingSounds.meteorite);
        loadBlocks(PingAddonConfig.Mushroom.blocks, PingSounds.mushroom);
        loadBlocks(PingAddonConfig.Oil.blocks, PingSounds.oil);
        loadBlocks(PingAddonConfig.Rich.blocks, PingSounds.rich);
        loadBlocks(PingAddonConfig.Spawner.blocks, PingSounds.spawner);
        loadBlocks(PingAddonConfig.Strange.blocks, PingSounds.strange);
        loadBlocks(PingAddonConfig.Warning.blocks, PingSounds.warning);
        loadBlocks(PingAddonConfig.Worthless.blocks, PingSounds.worthless);
    }

    private static void loadBlocks(String[] list, PingSounds sound) {
        for (val unlocalizedName : list) {
            unlocalizedNameToSound.put(unlocalizedName, sound);
        }
    }

    public static ResourceLocation getSound(String unlocalizedName) {
        val pingSound = unlocalizedNameToSound.get(unlocalizedName);

        if (pingSound != null) {
            return pingSound.sound;
        }

        return null;
    }
}
