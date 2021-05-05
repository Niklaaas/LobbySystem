// This class was created by Niklaaas


package de.niklaaasLobbysystem.Commands;

import de.niklaaasLobbysystem.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class SpawnCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        Player player = (Player) commandSender;
        if (commandSender instanceof Player) {
            if (args.length == 0) {

                FileConfiguration config = Main.getPlugin().getConfig();
                World world = Bukkit.getWorld(config.getString("Spawn.World"));
                double x = config.getDouble("Spawn.X");
                double y = config.getDouble("Spawn.Y");
                double z = config.getDouble("Spawn.Z");
                float yaw = (float) config.getDouble("Spawn.yaw");
                float pitch = (float) config.getDouble("Spawn.pitch");
                Location loc = new Location(world, x, y, z, yaw, pitch);
                player.teleport(loc);

            } else {
                player.sendMessage("§7» §cNiklaaas.net §7┃ §cBitte benutze /spawn§7!");
            }
        } else {
            commandSender.sendMessage("Für diesen Command musst du ein Spieler sein!");
        }

        return false;
    }
}
