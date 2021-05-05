// This class was created by Niklaaas


package de.niklaaasLobbysystem.main;

import de.niklaaasLobbysystem.CancelListener.CancelListener;
import de.niklaaasLobbysystem.Commands.*;
import de.niklaaasLobbysystem.Gadgets.EnderpearlGadget;
import de.niklaaasLobbysystem.Gadgets.EnterhakenGadget;
import de.niklaaasLobbysystem.Gadgets.FireworkGadget;
import de.niklaaasLobbysystem.Gadgets.JumpBoostGadget;
import de.niklaaasLobbysystem.Listener.*;
import de.niklaaasLobbysystem.handler.ConfigHandler;
import de.niklaaasLobbysystem.handler.InventoryHandler;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;


public class Main extends JavaPlugin {
    public static String world = "lobby";

    //public static Book DescriptionBook =

    public File config = new File("plugins/Lobbysystem/config.yml");
    public YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(config);

    private static Main plugin;

    @Override
    public void onEnable() {
        plugin = this;

        System.out.println("Plugin gestartet!");

        ConfigHandler.configEdit();
        InventoryHandler.InventoryFill();


        loadCommands();
        loadListener();
        loadConfig();


    }

    @Override
    public void onDisable() {
        System.out.println("Plugin erfolgreich beendet!");
    }

    public void loadCommands() {

        getCommand("fly").setExecutor(new FlyCommand());
        getCommand("build").setExecutor(new FlyCommand());
        getCommand("gm").setExecutor(new GamemodeCommand());
        getCommand("online").setExecutor(new OnlineCommand());
        getCommand("vanish").setExecutor(new VanishCommand());
        getCommand("discord").setExecutor(new DiscordCommand());
        getCommand("setspawn").setExecutor(new SetSpawnCommand());
        getCommand("spawn").setExecutor(new SpawnCommand());
        getCommand("team").setExecutor(new TeamCommand());



    }

    public void loadListener() {
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new JoinLeaveListener(), this);
        pluginManager.registerEvents(new CancelListener(), this);
        pluginManager.registerEvents(new WilkommensNachrichtListener(), this);
        pluginManager.registerEvents(new Scoreboard(), this);
        pluginManager.registerEvents(new NewTabListenerAndTitle(), this);
        pluginManager.registerEvents(new InteractListener(), this);
        pluginManager.registerEvents(new EnderpearlGadget(), this);
        pluginManager.registerEvents(new EnterhakenGadget(), this);
        pluginManager.registerEvents(new TeamchatListener(), this);
        pluginManager.registerEvents(new CommandBlockListener(), this);
        pluginManager.registerEvents(new FireworkGadget(), this);
        pluginManager.registerEvents(new JumpBoostGadget(), this);



        //Funktionen.invitems();



    }

    public void loadConfig() {
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

    public static Main getPlugin() {
        return plugin;
    }






}


