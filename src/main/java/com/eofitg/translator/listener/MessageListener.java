package com.eofitg.translator.listener;

import com.eofitg.translator.ConfigReader;
import com.eofitg.translator.util.Translator;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.awt.*;
import java.io.IOException;
import java.util.Set;

public class MessageListener implements Listener {
    @EventHandler
    public void onChat (AsyncPlayerChatEvent e) throws IOException {
        Set<Player> recipients = e.getRecipients();
        String message = e.getMessage();
        String target = ConfigReader.getTarget();
        if(ConfigReader.getEnabled()) {
            for (Player player : recipients) {
                player.sendMessage(ChatColor.GRAY + "[" + e.getPlayer().getName() + " : " + Translator.get(message) + "]");
            }
        }
    }
}
