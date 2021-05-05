// This class was created by Niklaaas


package de.niklaaasLobbysystem.Utils;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;


import java.io.File;

public class ConfigUtils {

    public void setLocation(Player player, YamlConfiguration config, File file) {


        double X = player.getLocation().getX();
        double y = player.getLocation().getY();
        double z = player.getLocation().getZ();
        float yaw = player.getLocation().getYaw();
        float pitch = player.getLocation().getPitch();

        String world = player.getLocation().getWorld().getName();


    }


}
