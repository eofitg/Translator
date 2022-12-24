package com.eofitg.translator.config;

import com.eofitg.translator.Translator;
import org.bukkit.configuration.file.FileConfiguration;

public class ConfigWriter {
    private static FileConfiguration config = Translator.getInstance().getConfig();
    public static FileConfiguration getConfig() {
        return config;
    }
    public static void toggleEnabled() {
        boolean state = ConfigReader.getEnabled();
        config.set("enabled", !state);
        Translator.getInstance().saveConfig();
    }
}
