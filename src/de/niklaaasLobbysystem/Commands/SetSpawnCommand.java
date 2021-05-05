// This class was created by Niklaaas


package de.niklaaasLobbysystem.Commands;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import de.niklaaasLobbysystem.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class SetSpawnCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        Player player = (Player) commandSender;
        if (player.hasPermission("setspawn")) {
        if (commandSender instanceof Player) {
            if (args.length == 0) {

                FileConfiguration config = Main.getPlugin().getConfig();
                config.set("Spawn.World", player.getWorld().getName());
                config.set("Spawn.X", player.getLocation().getX());
                config.set("Spawn.Y", player.getLocation().getY());
                config.set("Spawn.Z", player.getLocation().getZ());
                config.set("Spawn.yaw", player.getLocation().getYaw());
                config.set("Spawn.pitch", player.getLocation().getPitch());
                Main.getPlugin().saveConfig();
                player.sendMessage("§7» §cNiklaaas.net §7┃ §aSpawnpunkt wurde gesetzt!");

            } else {
                player.sendMessage("§7» §cNiklaaas.net §7┃ §cBitte benutze /spawn§7!");
            }

        } else {
            commandSender.sendMessage("Für diesen Command musst du ein Spieler sein!");
        }


        } else {
            player.sendMessage("§7» §cNiklaaas.net §7┃ §cUnbekannter Befehl ");
        }

        return false;
    }
}
