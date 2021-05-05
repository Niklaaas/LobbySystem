// This class was created by Niklaaas



package de.niklaaasLobbysystem.Listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class WilkommensNachrichtListener implements Listener {

    @EventHandler
    public void WilkommensNachrichtListener (PlayerJoinEvent event) {

        Player player = event.getPlayer();
        player.sendMessage("§7[§eServer§7] §2Guten Tag " + "§c" + player.getName());
    }







}
