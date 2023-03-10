package com.eofitg.translator.config;

import com.eofitg.translator.Translator;
import org.bukkit.configuration.file.FileConfiguration;

public class ConfigReader {
    private static FileConfiguration config = Translator.getInstance().getConfig();
    public static FileConfiguration getConfig() {
        return config;
    }
    public static boolean getEnabled() {
        return config.getBoolean("enabled", true);
    }
}
