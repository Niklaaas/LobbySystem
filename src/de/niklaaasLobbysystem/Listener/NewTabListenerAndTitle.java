// This class was created by Niklaaas


package de.niklaaasLobbysystem.Listener;

import com.connorlinfoot.titleapi.TitleAPI;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

public class NewTabListenerAndTitle implements Listener {






    String nl = "\n";

    int spieler = Bukkit.getServer().getOnlinePlayers().size();
    int maxspieler = Bukkit.getServer().getMaxPlayers();


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





    @EventHandler
    public void onJoin (PlayerJoinEvent event) {

        Player player = event.getPlayer();




        TitleAPI.sendTabTitle(player, "§f§lNiklaaas.net" + "\n", "\n" + "§7Rang » " + getRank(player) + nl + "§7Twitter » §2@fzzzzzzzvs " + "\n" + "§7Instagram » §2@nkls.xy" + "\n" + "§7Teamspeak§7 » §2Niklaaas.net"
        + "\n" + "§7Spieler » " + "§2" + spieler + "§7/" + "§2" + maxspieler + "\n");



        TitleAPI.sendTitle(player, 20*2,20*4,20*2, "§4Willkommen", "§6" + player.getName());
    }

    public static String getRank(Player player){

        String rank = "";

        if(player.hasPermission("server.admin")){
            rank= "§4Administrator";
        }else if (player.hasPermission("server.dev")){
            rank= "§9Developer";
        } else if (player.hasPermission("server.srmod")) {
            rank= "§cSrModerator";
        } else if(player.hasPermission("server.mod")) {
            rank= "§cModerator";
        } else {
            rank= "§eSpieler";
        }


        return (rank);

    }




}
