// This class was created by Niklaaas


package de.niklaaasLobbysystem.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class OnlineCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender instanceof Player) {
            Player player = (Player) commandSender;
            int onlineplayers = Bukkit.getOnlinePlayers().size();
            player.sendMessage("Es sind momentan " + onlineplayers + " Spieler auf dem Server");



            if(player.hasPermission("online.command")){

            } else {
                player.sendMessage("Dafür hast du keine Rechte!");
            }
        }



        return false;
    }
}
