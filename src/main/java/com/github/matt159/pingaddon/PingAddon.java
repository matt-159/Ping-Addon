package com.github.matt159.pingaddon;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.*;

import com.github.matt159.pingaddon.config.PingAddonConfig;
import com.github.matt159.pingaddon.config.SoundMap;
import com.github.matt159.pingaddon.proxy.CommonProxy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Tags.MODID,
     version = Tags.VERSION,
     name = Tags.MODNAME,
     acceptedMinecraftVersions = "[1.7.10]",
     guiFactory = Tags.GROUPNAME + ".client.gui.config.PingAddonGuiFactory",
     dependencies = "required-after:megaping@[1.2,); " +
                    "required-after:falsepatternlib@[0.12,);")
public class PingAddon {
    private static Logger LOG = LogManager.getLogger(Tags.MODID);

    @SidedProxy(clientSide= Tags.GROUPNAME + ".proxy.ClientProxy",
                serverSide= Tags.GROUPNAME + ".proxy.CommonProxy")
    public static CommonProxy proxy;

    static {
        PingAddonConfig.poke();
    }

    @Mod.EventHandler
    // load "Do your mod setup. Build whatever data structures you care about. Register recipes."
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    public static void debug(String message) {
        LOG.debug(message);
    }

    public static void info(String message) {
        LOG.info(message);
    }

    public static void warn(String message) {
        LOG.warn(message);
    }

    public static void error(String message) {
        LOG.error(message);
    }
}