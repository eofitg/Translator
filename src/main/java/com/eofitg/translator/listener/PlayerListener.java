package com.eofitg.translator.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        String address = e.getPlayer().getAddress().toString();
        e.setJoinMessage(e.getPlayer().getName() + " joined game from " + address);
    }
}
