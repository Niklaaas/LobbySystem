// This class was created by Niklaaas


package de.niklaaasLobbysystem.Listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class TeamchatListener implements Listener {
    Player player;

    final static String prefix = "§7@§cTeam §7┃ ";

    @EventHandler
    public void PlayerChatEvent(AsyncPlayerChatEvent event) {




        Player player = (Player) event.getPlayer();
        if (event.getMessage().startsWith("@t")) {
            event.setCancelled(true);
            if (player.hasPermission("team.chat")) {
                String msg = event.getMessage();
                for (Player team : Bukkit.getOnlinePlayers()) {
                    team.sendMessage(prefix + player.getName() + " §c»§8 " + msg.replaceAll("@t", "§8"));


                }
            }

        }
    }


}
