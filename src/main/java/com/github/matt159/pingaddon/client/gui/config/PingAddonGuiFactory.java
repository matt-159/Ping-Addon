package com.github.matt159.pingaddon.client.gui.config;

import com.falsepattern.lib.config.SimpleGuiFactory;

import net.minecraft.client.gui.GuiScreen;

public class PingAddonGuiFactory implements SimpleGuiFactory {
    @Override
    public Class<? extends GuiScreen> mainConfigGuiClass() {
        return PingAddonGuiConfig.class;
    }
}
