package com.github.matt159.pingaddon.client.gui.config;

import com.falsepattern.lib.config.ConfigException;
import com.falsepattern.lib.config.SimpleGuiConfig;
import com.github.matt159.pingaddon.config.PingAddonConfig;
import com.github.matt159.pingaddon.Tags;

import net.minecraft.client.gui.GuiScreen;

public class PingAddonGuiConfig extends SimpleGuiConfig {
    public PingAddonGuiConfig(GuiScreen parent) throws ConfigException {
        super(parent, Tags.MODID, Tags.MODNAME,
              PingAddonConfig.General.class,
              PingAddonConfig.Dirt.class,
              PingAddonConfig.Driller.class,
              PingAddonConfig.Flora.class,
              PingAddonConfig.Gold.class,
              PingAddonConfig.Iron.class,
              PingAddonConfig.Machine.class,
              PingAddonConfig.Meteorite.class,
              PingAddonConfig.Mushroom.class,
              PingAddonConfig.Oil.class,
              PingAddonConfig.Rich.class,
              PingAddonConfig.Spawner.class,
              PingAddonConfig.Strange.class,
              PingAddonConfig.Warning.class,
              PingAddonConfig.Worthless.class);
    }
}
