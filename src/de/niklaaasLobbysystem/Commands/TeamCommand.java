// This class was created by Niklaaas


package de.niklaaasLobbysystem.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TeamCommand implements CommandExecutor {




    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        Player player = (Player) commandSender;
        if (player.hasPermission("team.command")) {
            if (args.length == 1) {
                player.sendMessage("§cNiklaaas.net §7┃ §cRichtige Benutzung: /Team§7!");
            } else {
                player.sendMessage("§cNiklaaas.net §7┃ §eAktuelle Übersicht der Teammitglieder:");
                player.sendMessage("⚊⚊⚊⚊⚊⚊⚊⚊ » §4Administration");
            }
        }
        return false;



    }
}

