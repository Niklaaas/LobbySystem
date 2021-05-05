// This class was created by Niklaaas


package de.niklaaasLobbysystem.Commands;

import de.niklaaasLobbysystem.Methods.ItemBuilder;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


import java.util.ArrayList;

public class VanishCommand implements CommandExecutor {


    ArrayList<Player> vanisharray = new ArrayList<>();


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;
            if (player.hasPermission("vanish.perm")) {


                if (args.length == 0) {

                    if (vanisharray.contains(player)) {
                        player.removePotionEffect(PotionEffectType.INVISIBILITY);
                        player.sendMessage("§cNiklaaas.net §7┃ Du bist nun nicht mehr unsichtbar!");

                    } else {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 200000000, 1));
                        vanisharray.add(player);
                        player.sendMessage("§cNiklaaas.net §7┃ Du bist nun unsichtbar!");


                    }
                }
            } else {
                player.sendMessage("§cNiklaaas.net §7┃ §cDafür hast du keine Rechte!");
            }
        } commandSender.sendMessage("Für diesen Command musst du ein Spieler sein!");


        return false;
    }
}
