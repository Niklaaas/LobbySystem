// This class was created by Niklaaas


package de.niklaaasLobbysystem.CancelListener;

import org.bukkit.event.Listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerAchievementAwardedEvent;
import org.bukkit.event.player.PlayerChatTabCompleteEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.weather.WeatherChangeEvent;

public class CancelListener implements Listener {

    @EventHandler
    public void FoodLevelChanged(FoodLevelChangeEvent event) {
        event.setCancelled(true);


    }

    @EventHandler
    public void WeatherChangeListener(WeatherChangeEvent event) {
       event.setCancelled(true);
    }

    @EventHandler
    public void BlockPlace(BlockPlaceEvent event) {
        Player player = event.getPlayer();
        event.setCancelled(true);


    }


    @EventHandler
    public void BlockBreak(BlockBreakEvent event) {
        Player player = event.getPlayer();
        event.setCancelled(true);

    }


    @EventHandler
    public void DropCancel(PlayerDropItemEvent event) {
        Player player = event.getPlayer();
        event.setCancelled(true);
    }

    @EventHandler
    public void EntityDamageEvent(EntityDamageEvent event) {
        event.setCancelled(true);
    }

    @EventHandler
    public void InteractListener(PlayerInteractEvent event) {
        event.setCancelled(false);


    }

    @EventHandler
    public void AchievementListener(PlayerAchievementAwardedEvent event) {
        event.setCancelled(true);
    }

    @EventHandler
    public void ClickListener(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        event.setCancelled(true);
    }



}
