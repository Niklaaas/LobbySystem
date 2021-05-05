// This class was created by Niklaaas


package de.niklaaasLobbysystem.Gadgets;

import de.niklaaasLobbysystem.handler.ItemHandler;
import de.niklaaasLobbysystem.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.vehicle.VehicleExitEvent;

import java.util.HashMap;

public class EnderpearlGadget implements Listener {
    private HashMap<Player, EnderPearl> enderpearls = new HashMap<>();


    @EventHandler
    public void EnderperleGadget(PlayerInteractEvent event) {
        if (event.getItem() != null && event.getItem().getType() == Material.ENDER_PEARL) {
            if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
                Player player = event.getPlayer();
                event.setCancelled(true);

                event.getPlayer().getInventory().setItem(4, ItemHandler.GadgetLoad);
                event.getPlayer().updateInventory();

                EnderPearl enderPearl = player.launchProjectile(EnderPearl.class);
                enderPearl.setPassenger(player);
                enderpearls.put(player, enderPearl);

                Bukkit.getScheduler().runTaskLater(Main.getPlugin(), new Runnable() {
                    @Override
                    public void run() {
                        player.getInventory().setItem(4, ItemHandler.EnderpearlGadget);
                        event.getPlayer().updateInventory();
                    }
                }, 20 * 5);

            }


        }



    }

    @EventHandler
    public void OnVehicleLeave (VehicleExitEvent event) {
        if (event.getExited() instanceof Player) {
            if (enderpearls.containsKey(event.getExited())) {
                enderpearls.get(event.getExited()).remove();
            }
        }
    }
}
