// This class was created by Niklaaas


package de.niklaaasLobbysystem.Commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class BuildCommand implements CommandExecutor {


    ArrayList<Player> buildarray = new ArrayList<>();

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        Player player = (Player) commandSender;
        if(commandSender instanceof Player) {
            if(player.hasPermission("build.perm")) {

                if(args.length == 0)
                    if(buildarray.contains(player)) {
                        buildarray.remove(player);
                        player.setGameMode(GameMode.SURVIVAL);
                        player.sendMessage("§cNiklaaas.net §7┃ §eDu bist nun im Überlebensmodus!");

                    } else {
                        buildarray.add(player);
                        player.setGameMode(GameMode.CREATIVE);
                        player.sendMessage("§cNiklaaas.net §7┃ §eDu bist nun im Kreativmodus!");

                    } else {
                    player.sendMessage("§cNiklaaas.net §7┃ §eBitte benutze /build");
                }

            }
        } else {
            commandSender.sendMessage("Für diesen Command musst du ein Spieler sein!");
        }

        return false;
    }
}
