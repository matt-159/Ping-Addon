package com.github.matt159.pingaddon.config;

import com.github.matt159.pingaddon.Tags;

import net.minecraft.util.ResourceLocation;

public enum PingSounds {
    dig,
    dirt,
    driller,
    flora,
    gold,
    iron,
    machine,
    marker,
    meteorite,
    mushroom,
    oil,
    rich,
    spawner,
    strange,
    warning,
    worthless,
    ;

    public final ResourceLocation sound = new ResourceLocation(Tags.MODID, this.name());
}
