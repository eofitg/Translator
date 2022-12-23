package com.eofitg.translator;

import com.eofitg.translator.listener.MessageListener;
import com.eofitg.translator.listener.PlayerListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Translator extends JavaPlugin {
    private static Translator instance;
    public static Translator getInstance() {
        return instance;
    }

    @Override
    public void onLoad() {
        saveDefaultConfig();
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        Bukkit.getPluginManager().registerEvents(new MessageListener(), this);
        Bukkit.getPluginManager().registerEvents(new PlayerListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        instance = null;
        saveConfig();
    }
}
