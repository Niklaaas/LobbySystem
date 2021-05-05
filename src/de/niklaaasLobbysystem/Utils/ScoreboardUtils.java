// This class was created by Niklaaas


package de.niklaaasLobbysystem.Utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;


public class ScoreboardUtils {

    public static Scoreboard getBaseScoreboard(Player player) {


        Scoreboard sb = Bukkit.getScoreboardManager().getNewScoreboard();
        Objective objective = sb.registerNewObjective("§lNiklaaas.net", "§lNiklaaas.net");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
        objective.getScore("§0§l").setScore(13);
        objective.getScore("Rang:").setScore(12);


        if (player.hasPermission("server.admin") || player.isOp()) {
            objective.getScore("§8» §4Administrator").setScore(11);
        } else if (player.hasPermission("server.dev")) {
            objective.getScore("§8» §9Developer").setScore(11);
        } else if (player.hasPermission("server.srmod")) {
            objective.getScore("§8» §cSrModerator").setScore(11);
        } else if (player.hasPermission("server.mod")) {
            objective.getScore("§8» §cModerator").setScore(11);

        } else
            objective.getScore("§8» §eSpieler").setScore(11);



        objective.getScore("§5§l").setScore(10);
        objective.getScore("§fSpielzeit:").setScore(9);
        objective.getScore("§8» §cIn Entwicklung!").setScore(8);
        objective.getScore("§9§l").setScore(7);
        objective.getScore("Coins:").setScore(6);
        objective.getScore("§8» §eIn Entwicklung!").setScore(5);
        objective.getScore("§e§l").setScore(4);
        objective.getScore("Spielerzahl:").setScore(3);
        objective.getScore("§8» §e" + String.valueOf(Bukkit.getServer().getOnlinePlayers().size())).setScore(2);
        objective.getScore("§b§l").setScore(1);
        objective.getScore("§lwww.Niklaaas.net").setScore(0);


        return sb;
    }

    public void setTab(Player player) {
        Scoreboard sb = player.getScoreboard();

        Team admin = sb.registerNewTeam("0000Admin");
        Team dev = sb.registerNewTeam("0001Dev");
        Team mod = sb.registerNewTeam("0002Mod");
        Team p = sb.registerNewTeam("0003Spieler");

        p.addPlayer(player);

        admin.setPrefix("§4Admin §7| §4");
        dev.setPrefix("§9Dev §7| §4");
        mod.setPrefix("§§cMod §7| §4");
        p.setPrefix("§4");

        Bukkit.getOnlinePlayers().forEach(all -> {
            ;
            if (all.isOp()) {
                admin.addEntry(all.getName());
            } else {
                p.addEntry(all.getName());
            }
        });

    }

    public void updateTab(Player player) {
        Scoreboard sb = player.getScoreboard();

        Team admin = sb.getTeam("0000Admin");
        Team p = sb.getTeam("0001Spieler");


        if (admin == null || player == null) {
            setTab((Player) p);
            return;
        }

        Bukkit.getOnlinePlayers().forEach(all -> {
            ;
            if (all.isOp()) {
                admin.addEntry(all.getName());
            } else {
                p.addEntry(all.getName());
            }
        });

    }


}
