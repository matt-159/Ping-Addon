package com.github.matt159.pingaddon.config;

import com.falsepattern.lib.config.Config;
import com.falsepattern.lib.config.ConfigurationManager;
import com.github.matt159.pingaddon.Tags;

public class PingAddonConfig {
    @Config(modid = Tags.MODID)
    public static class General {
        @Config.Comment("Display pinged block in the console")
        @Config.DefaultBoolean(false)
        @Config.LangKey("ping.addon.group.general.showPingedBlock")
        public static boolean showBlockName;

        static {
            ConfigurationManager.selfInit();
        }

        public static void poke() {}
    }

    @Config(modid = Tags.MODID,
            category = "Dirt")
    public static class Dirt {
        @Config.Comment("Blocks that will play a 'dirt' sound when pinged")
        @Config.DefaultStringList({ "tile.dirt" })
        @Config.LangKey("ping.addon.group.dirt")
        public static String[] blocks;

        static {
            ConfigurationManager.selfInit();
        }

        public static void poke() {}
    }

    @Config(modid = Tags.MODID,
            category = "Driller")
    public static class Driller {
        @Config.Comment("Blocks that will play a 'driller' sound when pinged")
        @Config.DefaultStringList({})
        @Config.LangKey("ping.addon.group.driller")
        public static String[] blocks;

        static {
            ConfigurationManager.selfInit();
        }

        public static void poke() {}
    }

    @Config(modid = Tags.MODID,
            category = "Flora")
    public static class Flora {
        @Config.Comment("Blocks that will play a 'flora' sound when pinged")
        @Config.DefaultStringList({ "tile.tallGrass", "tile.flower1", "tile.flower2" })
        @Config.LangKey("ping.addon.group.flora")
        public static String[] blocks;

        static {
            ConfigurationManager.selfInit();
        }

        public static void poke() {}
    }

    @Config(modid = Tags.MODID,
            category = "Gold")
    public static class Gold {
        @Config.Comment("Blocks that will play a 'gold' sound when pinged")
        @Config.DefaultStringList({ "tile.goldOre" })
        @Config.LangKey("ping.addon.group.gold")
        public static String[] blocks;

        static {
            ConfigurationManager.selfInit();
        }

        public static void poke() {}
    }

    @Config(modid = Tags.MODID,
            category = "Iron")
    public static class Iron {
        @Config.Comment("Blocks that will play a 'iron' sound when pinged")
        @Config.DefaultStringList({ "tile.ironOre" })
        @Config.LangKey("ping.addon.group.iron")
        public static String[] blocks;

        static {
            ConfigurationManager.selfInit();
        }

        public static void poke() {}
    }

    @Config(modid = Tags.MODID,
            category = "Machine")
    public static class Machine {
        @Config.Comment("Blocks that will play a 'machine' sound when pinged")
        @Config.DefaultStringList({})
        @Config.LangKey("ping.addon.group.machine")
        public static String[] blocks;

        static {
            ConfigurationManager.selfInit();
        }

        public static void poke() {}
    }

    @Config(modid = Tags.MODID,
            category = "Meteorite")
    public static class Meteorite {
        @Config.Comment("Blocks that will play a 'meteorite' sound when pinged")
        @Config.DefaultStringList({})
        @Config.LangKey("ping.addon.group.meteorite")
        public static String[] blocks;

        static {
            ConfigurationManager.selfInit();
        }

        public static void poke() {}
    }

    @Config(modid = Tags.MODID,
            category = "Mushroom")
    public static class Mushroom {
        @Config.Comment("Blocks that will play a 'mushroom' sound when pinged")
        @Config.DefaultStringList({ "tile.mushroom" })
        @Config.LangKey("ping.addon.group.mushroom")
        public static String[] blocks;

        static {
            ConfigurationManager.selfInit();
        }

        public static void poke() {}
    }

    @Config(modid = Tags.MODID,
            category = "Oil")
    public static class Oil {
        @Config.Comment("Blocks that will play a 'oil' sound when pinged")
        @Config.DefaultStringList({})
        @Config.LangKey("ping.addon.group.oil")
        public static String[] blocks;

        static {
            ConfigurationManager.selfInit();
        }

        public static void poke() {}
    }

    @Config(modid = Tags.MODID,
            category = "Rich")
    public static class Rich {
        @Config.Comment("Blocks that will play a 'rich' sound when pinged")
        @Config.DefaultStringList({ "tile.blockGold" })
        @Config.LangKey("ping.addon.group.rich")
        public static String[] blocks;

        static {
            ConfigurationManager.selfInit();
        }

        public static void poke() {}
    }

    @Config(modid = Tags.MODID,
            category = "Spawner")
    public static class Spawner {
        @Config.Comment("Blocks that will play a 'spawner' sound when pinged")
        @Config.DefaultStringList({})
        @Config.LangKey("ping.addon.group.spawner")
        public static String[] blocks;

        static {
            ConfigurationManager.selfInit();
        }

        public static void poke() {}
    }

    @Config(modid = Tags.MODID,
            category = "Strange")
    public static class Strange {
        @Config.Comment("Blocks that will play a 'strange' sound when pinged")
        @Config.DefaultStringList({})
        @Config.LangKey("ping.addon.group.strange")
        public static String[] blocks;

        static {
            ConfigurationManager.selfInit();
        }

        public static void poke() {}
    }

    @Config(modid = Tags.MODID,
            category = "Warning")
    public static class Warning {
        @Config.Comment("Blocks that will play a 'warning' sound when pinged")
        @Config.DefaultStringList({})
        @Config.LangKey("ping.addon.group.warning")
        public static String[] blocks;

        static {
            ConfigurationManager.selfInit();
        }

        public static void poke() {}
    }

    @Config(modid = Tags.MODID,
            category = "Worthless")
    public static class Worthless {
        @Config.Comment("Blocks that will play a 'worthless' sound when pinged")
        @Config.DefaultStringList({})
        @Config.LangKey("ping.addon.group.worthless")
        public static String[] blocks;

        static {
            ConfigurationManager.selfInit();
        }

        public static void poke() {}
    }

    public static void poke() {
        General.poke();

        Dirt.poke();
        Driller.poke();
        Flora.poke();
        Gold.poke();
        Iron.poke();
        Machine.poke();
        Meteorite.poke();
        Mushroom.poke();
        Oil.poke();
        Rich.poke();
        Spawner.poke();
        Strange.poke();
        Warning.poke();
        Worthless.poke();
    }
}