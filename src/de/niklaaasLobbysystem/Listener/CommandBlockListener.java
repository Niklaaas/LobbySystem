// This class was created by Niklaaas


package de.niklaaasLobbysystem.Listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class CommandBlockListener implements Listener {

    @EventHandler
    public void onCmd (PlayerCommandPreprocessEvent event) {
        Player player = event.getPlayer();

        String[] cmd = event.getMessage().substring(1).split(" ");

        //bukkit:me
        //plugin
        //?

        if (cmd[0].startsWith("bukkit")) {
            if (!player.isOp()) {
                player.sendMessage("§cNiklaaas.net §7| §cKeine Rechte!");
                event.setCancelled(true);
            }
        }
        if (cmd[0].equalsIgnoreCase("plugin") || cmd[0].equalsIgnoreCase("pl") || cmd[0].equalsIgnoreCase("?") || cmd[0].equalsIgnoreCase("help") || cmd[0].equalsIgnoreCase("version") || cmd[0].equalsIgnoreCase("tell")) {
            if (!player.isOp()) {
                player.sendMessage("§cNiklaaas.net §7| §cKeine Rechte!");
                event.setCancelled(true);
            }
        }
        if (cmd[0].equalsIgnoreCase("me")) {
            if (!player.hasPermission("server.admin")) {
                player.sendMessage("§cNiklaaas.net §7| §cKeine Rechte!");
                event.setCancelled(true);
            }
        }
    }


}
