// This class was created by Niklaaas


package de.niklaaasLobbysystem.handler;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

import java.awt.print.Book;


public class InventoryHandler {


    public static Inventory NavigatorInventory = Bukkit.createInventory(null, 5 * 9, "§a§lNavigator");
    public static Inventory LobbyInventory = Bukkit.createInventory(null, InventoryType.HOPPER, "§bLobby-Wechsler");
    public static Inventory GadgetsInventory = Bukkit.createInventory(null, InventoryType.ENDER_CHEST, "§a§lGadgets");
    public static Inventory MenuInventory = Bukkit.createInventory(null, InventoryType.CHEST, "§a§lMenu");

    public static Inventory HeadsInventory = Bukkit.createInventory(null, InventoryType.CHEST, "§b§lHüte");
    public static Inventory SpielerKoepfe = Bukkit.createInventory(null, InventoryType.CHEST, "§a§lSpieler-Köpfe");
    public static Inventory SMheads = Bukkit.createInventory(null, InventoryType.CHEST, "§a§lSocialMedia-Köpfe");
    public static Inventory FoodHeads = Bukkit.createInventory(null, InventoryType.CHEST, "§a§lFood-Heads");
    public static Inventory LaenderHeads = Bukkit.createInventory(null, InventoryType.CHEST, "§a§lLänder-Heads");

    public static Inventory SpielsachenInventory = Bukkit.createInventory(null, InventoryType.CHEST, "§b§lSpielsachen");
    public static Inventory EffekteInventory = Bukkit.createInventory(null, InventoryType.CHEST, "§b§lEffekte");
    public static Inventory KleidungInventory = Bukkit.createInventory(null, InventoryType.CHEST, "§b§lKleidung");


    public static void InventoryFill() {
        Player player;

        final int[] NavigatorFiller = {0,1,2,3,4,5,6,7,8,36,37,38,39,40,41,42,43,44};
        final int[] GadgetsFiller = {0,1,2,3,4,5,6,7,8,9,11,13,15,17,18,19,20,21,22,23,24,25,26};
        final int[] HeadsFill = {0,1,2,3,4,5,6,7,8,9,11,13,15,17,19,20,21,22,23,24,25,26};
        final int[] SpielsachenFill = {0,1,2,3,4,5,6,7,8,9,11,13,15,17,19,20,21,22,23,24,25,26};
        final int[] SpielerKoepfeFill = {0,1,2,3,4,5,6,7,8};




//CompassInventory Fill
        for(int i : NavigatorFiller){
            NavigatorInventory.setItem(i, ItemHandler.Filler);
        }

        NavigatorInventory.setItem(10, ItemHandler.Bedwars);
        NavigatorInventory.setItem(12, ItemHandler.Skywars);
        NavigatorInventory.setItem(22, ItemHandler.MLGRush);
        NavigatorInventory.setItem(32, ItemHandler.Cores);
        NavigatorInventory.setItem(34, ItemHandler.MarioParty);
        NavigatorInventory.setItem(4, ItemHandler.LobbySwitch);
        NavigatorInventory.setItem(40, ItemHandler.SpielModiErklaerung);

//GadgetsInventory Fill
        for(int i : GadgetsFiller){
            GadgetsInventory.setItem(i, ItemHandler.Filler);
        }

        GadgetsInventory.setItem(10, ItemHandler.KoepfeAuswahl);
        GadgetsInventory.setItem(12, ItemHandler.Spielsachen);
        GadgetsInventory.setItem(14, ItemHandler.Effekte);
        GadgetsInventory.setItem(16, ItemHandler.Rüstung);


//HeadsInventory Fill
        for(int i : HeadsFill) {
            HeadsInventory.setItem(i, ItemHandler.Filler);
        }
        HeadsInventory.setItem(10, ItemHandler.SpielerKoepfe);
        HeadsInventory.setItem(12, ItemHandler.twitter);
        HeadsInventory.setItem(14, ItemHandler.FoodHeads);
        HeadsInventory.setItem(16, ItemHandler.LaenderSkull);
        HeadsInventory.setItem(18, ItemHandler.zurueckSkull);


//LobbyInventoryFill
        LobbyInventory.setItem(0, ItemHandler.lobby1);
        LobbyInventory.setItem(1, ItemHandler.lobby2);
        LobbyInventory.setItem(2, ItemHandler.lobby3);
        LobbyInventory.setItem(3, ItemHandler.lobby4);
        LobbyInventory.setItem(4, ItemHandler.lobby5);


//SpielsachenInventory
        for (int i : SpielsachenFill) {
            SpielsachenInventory.setItem(i, ItemHandler.Filler);
        }
        SpielsachenInventory.setItem(10, ItemHandler.EnterhakenGadget);
        SpielsachenInventory.setItem(12, ItemHandler.FireworkGadget);
        SpielsachenInventory.setItem(14, ItemHandler.EnderpearlGadget);
        SpielsachenInventory.setItem(16, ItemHandler.JumpBoostGadget);
        SpielsachenInventory.setItem(18, ItemHandler.zurueckSkull);

//SpielerHeadsInventory
        for(int i : SpielerKoepfeFill){
            SpielerKoepfe.setItem(i, ItemHandler.Filler);
        }
         SpielerKoepfe.setItem(10, ItemHandler.NiklaaasHead);
        SpielerKoepfe.setItem(18,ItemHandler.zurueckSkull);

//SocialMediaInventory

        SMheads.setItem(18,ItemHandler.zurueckSkull);


//EffekteIventory
        EffekteInventory.setItem(18, ItemHandler.zurueckSkull);

//KleidungInventory
        KleidungInventory.setItem(18, ItemHandler.zurueckSkull);


    }


}
