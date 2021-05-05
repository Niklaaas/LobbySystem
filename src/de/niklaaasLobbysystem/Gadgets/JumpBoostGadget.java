// This class was created by Niklaaas


package de.niklaaasLobbysystem.Gadgets;

import de.niklaaasLobbysystem.handler.ItemHandler;
import de.niklaaasLobbysystem.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.util.Vector;

public class JumpBoostGadget implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (event.getItem() != null && event.getItem().getType() == Material.FEATHER) {
            if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
                event.setCancelled(true);
                Vector vector = event.getPlayer().getVelocity();
                vector.setY(2.1D);
                event.getPlayer().setVelocity(vector);
                event.getPlayer().playSound(event.getPlayer().getLocation(), Sound.ENDERDRAGON_WINGS, 3, 1);
                event.getPlayer().playEffect(event.getPlayer().getLocation(), Effect.FLAME, 3);


                event.getPlayer().getInventory().setItem(4, ItemHandler.FeatherLoad);
                event.getPlayer().updateInventory();

                Bukkit.getScheduler().runTaskLater(Main.getPlugin(), new Runnable() {
                    @Override
                    public void run() {
                        player.getInventory().setItem(4, ItemHandler.JumpBoostGadget);
                        event.getPlayer().updateInventory();
                    }
                }, 20 * 5);

            }
        }

    }


}
