// This class was created by Niklaaas


package de.niklaaasLobbysystem.Commands;


import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


import java.util.ArrayList;

public class FlyCommand implements CommandExecutor {

    public static ArrayList<Player> flyarray = new ArrayList<>();


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if(commandSender instanceof Player) {
            Player player = (Player) commandSender;
            if(player.hasPermission("fly.perm")) {
                if(args.length == 0) {
                    if(flyarray.contains(player)) {
                        flyarray.remove(player);
                        player.setAllowFlight(false);
                        player.sendMessage("§cNiklaaas.net §7┃ §cDu kannst nun nicht mehr fliegen!");

                    } else {
                        flyarray.add(player);
                        player.setAllowFlight(true);
                        player.sendMessage("§cNiklaaas.net §7┃ §2Du kannst nun fliegen!");
                    }
                }
            } else {
                player.sendMessage("§cNiklaaas.net §7┃ §cDafür hast du keine Rechte!");
            }



            ///fly
        } else {
            commandSender.sendMessage("Für diesen Command musst du ein Spieler sein!");
        }
        return false;
    }
}




