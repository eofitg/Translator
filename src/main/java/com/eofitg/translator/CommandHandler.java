package com.eofitg.translator;

import com.eofitg.translator.config.ConfigWriter;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandHandler implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String args[]) {
        if(equals(label, "transltoggle")) {
            ConfigWriter.toggleEnabled();
            sender.sendMessage(ChatColor.GREEN + "Translator state has been toggled!");
        }
        return true;
    }

    private boolean equals(String label, String commandName) {
        String pluginName = Translator.getInstance().getName().toLowerCase();
        if(label.startsWith(pluginName + ":")) {
            label = label.substring(pluginName.length() + 1);
        }
        return label.equalsIgnoreCase(commandName);
    }

}
