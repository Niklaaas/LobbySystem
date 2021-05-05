// This class was created by Niklaaas


package de.niklaaasLobbysystem.Commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if (commandSender instanceof Player) {


            Player player = (Player) commandSender;
            if(player.hasPermission("server.gm")) {
                if (args.length == 1) {
                    if (args[0].equalsIgnoreCase("0")) {

                        player.setGameMode(GameMode.SURVIVAL);
                        player.sendMessage("§cNiklaaas.net §7┃ §eDu bist nun im Überlebensmodus!");


                    } else if (args[0].equalsIgnoreCase("1")) {

                        player.setGameMode(GameMode.CREATIVE);
                        player.sendMessage("§cNiklaaas.net §7┃ §eDu bist nun im Kreativmodus!");

                    } else if (args[0].equalsIgnoreCase("2")) {
                        player.setGameMode(GameMode.ADVENTURE);
                        player.sendMessage("§cNiklaaas.net §7┃ §eDu bist nun im Abenteuermodus!");
                    } else if (args[0].equalsIgnoreCase("3")) {
                        player.setGameMode(GameMode.SPECTATOR);
                        player.sendMessage("§cNiklaaas.net §7┃ §eDu bist nun im Specatormodus!");
                    } else {
                        player.sendMessage("§cNiklaaas.net §7┃ §eBitte benutze /gm [0-3]!");
                    }
                }

            }
        } else {
            commandSender.sendMessage("Für diesen Command musst du ein Spieler sein!");
        }

        return false;
    }
}
