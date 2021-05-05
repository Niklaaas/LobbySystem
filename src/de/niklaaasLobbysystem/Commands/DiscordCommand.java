// This class was created by Niklaaas


package de.niklaaasLobbysystem.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DiscordCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        Player player = (Player) commandSender;
        if(commandSender instanceof Player) {
            player.sendMessage("§cNiklaaas.net §7┃ §eHier findest du unseren Discord:");
            player.sendMessage("§cNiklaaas.net §7┃ §fhttps://discord.gg/DeinDiscord");


        } else {
            commandSender.sendMessage("Für diesen Command musst du ein Spieler sein!");
        }
        return false;
    }
}
