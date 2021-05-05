// This class was created by Niklaaas


package de.niklaaasLobbysystem.Gadgets;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.FishHook;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.util.Vector;

public class EnterhakenGadget implements Listener {


    @EventHandler
    public void OnPlayerFishEvent (PlayerFishEvent event) {
        Player player = event.getPlayer();
        FishHook fishHook = event.getHook();
        if (fishHook.getLocation().subtract(0, 1, 0).getBlock().getType() != Material.AIR) {
            Location playerloc = player.getLocation();
            Location hookloc = fishHook.getLocation();

            Vector vector = player.getVelocity();
            double distance = playerloc.distance(hookloc);

            vector.setX((1.06D * distance) * (hookloc.getX() - playerloc.getX()) / distance);
            vector.setY((0.9D * distance) * (hookloc.getY() - playerloc.getY()) / distance - -0.05D * distance);
            vector.setZ((1.02D * distance) * (hookloc.getZ() - playerloc.getZ()) / distance);

            player.setVelocity(vector);
            player.getInventory().getItemInHand().setDurability((short) 0);
            player.updateInventory();
            player.playSound(player.getLocation(), Sound.FIREWORK_BLAST, 2, 1 );


        }
    }


}
