// This class was created by Niklaaas


package de.niklaaasLobbysystem.Methods;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Base64;
import java.util.UUID;

public class CustomSkull {

    private static Class<?> skullMetaClass, tileEntityClass, blockPositionClass;
    private static int mcVersion;


    static {
        String version = Bukkit.getServer().getClass().getPackage().getName().split("\\.")[3];
        mcVersion = Integer.parseInt(version.replaceAll("[^0-9]", ""));
        try {
            skullMetaClass = Class.forName("org.bukkit.craftbukkit." + version + ".inventory.CraftMetaSkull");
            tileEntityClass = Class.forName("net.minecraft.server." + version + ".TileEntitySkull");
            if (mcVersion > 174) {
                blockPositionClass = Class.forName("net.minecraft.server." + version + ".BlockPosition");
            } else {
                blockPositionClass = null;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static ItemStack getSkull(String displayname ,String skinURL, int amount, String lore) {
        ItemStack skull = new ItemStack(Material.SKULL_ITEM, amount, (short) 3);
        SkullMeta meta = (SkullMeta) skull.getItemMeta();

       // liste.set(1, "Hdiasjdo"); <-- Wert auf einen bestimmten Slot legen
        // <-- How to make lore
            ArrayList<String> liste = new ArrayList<String>();
            liste.add(lore);
            meta.setLore(liste);


        meta.setDisplayName(displayname);

        try {
            Field profileField = skullMetaClass.getDeclaredField("profile");
            profileField.setAccessible(true);
            profileField.set(meta, getProfile(skinURL));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        skull.setItemMeta(meta);
        return skull;
    }



    private static GameProfile getProfile(String skinURL) {
        GameProfile profile = new GameProfile(UUID.randomUUID(), null);

        String base64encoded = Base64.getEncoder().encodeToString(new
                String("{textures:{SKIN:{url:\"" + skinURL + "\"}}}").getBytes());
        Property property = new Property("textures", base64encoded);
        profile.getProperties().put("textures", property);
        return profile;
    }





}


