// This class was created by Niklaaas


package de.niklaaasLobbysystem.Listener;


import de.niklaaasLobbysystem.Utils.ScoreboardUtils;
import de.niklaaasLobbysystem.main.Main;
import org.bukkit.Bukkit;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityRegainHealthEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLevelChangeEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.scheduler.BukkitRunnable;


public class Scoreboard implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        event.getPlayer().setScoreboard(ScoreboardUtils.getBaseScoreboard(event.getPlayer()));

        for (Player all : Bukkit.getOnlinePlayers()) {
            all.setScoreboard(ScoreboardUtils.getBaseScoreboard(all.getPlayer()));
        }


    }

    @EventHandler
    public void LevelChange(PlayerLevelChangeEvent event) {
        Player player = event.getPlayer();

        event.getPlayer().setScoreboard(ScoreboardUtils.getBaseScoreboard(event.getPlayer()));

    }


    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();


        // Scheduler == Timer

        Bukkit.getScheduler().runTaskLater(Main.getPlugin(), new Runnable() {

            @Override
            public void run() {

                for (Player all : Bukkit.getOnlinePlayers()) {
                    all.setScoreboard(ScoreboardUtils.getBaseScoreboard(all.getPlayer()));

                }
            }
        }, 20L);
        {
        }

    }


}