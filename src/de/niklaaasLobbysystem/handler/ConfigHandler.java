// This class was created by Niklaaas


package de.niklaaasLobbysystem.handler;

import de.niklaaasLobbysystem.Methods.ItemBuilder;
import de.niklaaasLobbysystem.main.Main;
import org.bukkit.configuration.file.YamlConfiguration;

import javax.swing.plaf.basic.BasicComboBoxUI;


public class ConfigHandler {

    public static YamlConfiguration yamlConfiguration = (YamlConfiguration) Main.getPlugin().getConfig();


    public static void configEdit() {


        yamlConfiguration.options().header("------------------------------------------------ \n \n Plugin by Schniklas V1.0 \n \n ------------------------------------------------ ");
        yamlConfiguration.options().copyHeader();
        yamlConfiguration.options().copyDefaults();

    }


}
