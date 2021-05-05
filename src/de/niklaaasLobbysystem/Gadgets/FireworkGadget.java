// This class was created by Niklaaas


package de.niklaaasLobbysystem.Gadgets;

import de.niklaaasLobbysystem.handler.ItemHandler;
import de.niklaaasLobbysystem.main.Main;
import org.bukkit.*;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.meta.FireworkMeta;

public class FireworkGadget implements Listener {

    @EventHandler
    public void onFireWorkListener (PlayerInteractEvent event) {
        if (event.getItem() !=null && event.getItem().getType() == Material.FIREWORK) {
            if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
                Player player = event.getPlayer();
                event.setCancelled(true);

                player.getInventory().setItem(4, ItemHandler.FireWorkLoad);
                player.updateInventory();

                Location location = player.getLocation();
                if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
                    location = event.getClickedBlock().getRelative(BlockFace.UP).getLocation();
                }

                FireworkMeta fireworkMeta = (FireworkMeta) event.getItem().getItemMeta();
                fireworkMeta.setPower(1);
                fireworkMeta.addEffect(FireworkEffect.builder().withFade(Color.LIME).withColor(Color.BLUE).trail(true).build());

                Firework firework = location.getWorld().spawn(location, Firework.class);
                firework.setFireworkMeta(fireworkMeta);

                Bukkit.getScheduler().runTaskLater(Main.getPlugin(), new Runnable() {
                    @Override
                    public void run() {
                        player.getInventory().setItem(4, ItemHandler.FireworkGadget);
                        player.updateInventory();
                    }
                }, 20 * 3);

            }
        }
    }


}
