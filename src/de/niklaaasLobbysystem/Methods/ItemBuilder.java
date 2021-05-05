// This class was created by Niklaaas


package de.niklaaasLobbysystem.Methods;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ItemBuilder {

    /*
     Grundaufbaue einer Methode:

     public / private  = Public: VOn jeder Klasse zugreifbar | Private: Nur von der Klasse selbst benutzbar
     static            = Wird immer benötig wenn ein Zugriff von einer Klasse stattfinden soll.
     void              = Hat keine rückgabewerte
     |                 = Es muss nicht immer void sein, es kann z.B auch "int" oder "String" sein.
                         Hier muss dann "return" benutzt werden



     */
    public static String getVollerName(String Vorname, String Nachname) {
        String vollerName = Vorname + " " + Nachname;

        return (vollerName);
    }

    public static ItemStack createItemWithMaterial(Material material, String displayname, Boolean unbreakable, String lore) {
        ArrayList<String> liste1 = new ArrayList<String>();
        ItemStack itemStack = new ItemStack(material);
        ItemMeta itemMeta = itemStack.getItemMeta();
        liste1.add(lore);
        itemMeta.setDisplayName(displayname);
        if (unbreakable == true) {
            itemMeta.spigot().setUnbreakable(true);
        }
        itemMeta.setLore(liste1);
        itemStack.setItemMeta(itemMeta);
        return (itemStack);
    }

    public static ItemStack createItemWithShortID(int id, int subid, int amount, String displayname, Boolean unbreakable, String lore) {
        ArrayList<String> liste2 = new ArrayList<String>();
        ItemStack itemStack = new ItemStack(id, amount, (short) subid);
        ItemMeta itemMeta = itemStack.getItemMeta();
        liste2.add(lore);
        itemMeta.setDisplayName(displayname);
        if (unbreakable == true) {
            itemMeta.spigot().setUnbreakable(true);
        }
        itemMeta.setLore(liste2);
        itemStack.setItemMeta(itemMeta);


        return itemStack;
    }

    public static ItemStack createSkull(Material material, int amount, int subid, String displayname, String skullowner, String lore) {
        ArrayList<String> list3 = new ArrayList<String>();
        ItemStack itemStack = new ItemStack(material, amount, (short) subid);
        SkullMeta skullMeta = (SkullMeta) itemStack.getItemMeta();
        skullMeta.setOwner(skullowner);
        skullMeta.setDisplayName(displayname);
        skullMeta.setLore(list3);
        itemStack.setItemMeta(skullMeta);
        return itemStack;
    }






}
