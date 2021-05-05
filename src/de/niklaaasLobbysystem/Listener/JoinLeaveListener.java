// This class was created by Niklaaas


package de.niklaaasLobbysystem.Listener;


import de.niklaaasLobbysystem.Methods.CustomSkull;
import de.niklaaasLobbysystem.handler.InventoryHandler;
import de.niklaaasLobbysystem.handler.ItemHandler;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;


public class JoinLeaveListener implements Listener {


    @EventHandler
    public void JoinListener(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        event.setJoinMessage(null);



        ItemStack FriendItem = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
        SkullMeta FriendMeta = (SkullMeta) FriendItem.getItemMeta();
        FriendMeta.setDisplayName("§a§lProfil");
        FriendMeta.setOwner(player.getName());
        FriendItem.setItemMeta(FriendMeta);

        if (player.hasPermission("nicktool.perm")) {
            ItemStack Nicktool = new ItemStack(Material.NAME_TAG);
            ItemMeta NicktoolMeta = Nicktool.getItemMeta();
            NicktoolMeta.setDisplayName("§a§lNick-Tool §7[§eRechtsklick§7]");
            Nicktool.setItemMeta(NicktoolMeta);
            player.getInventory().setItem(5, Nicktool);
        }
        if (player.hasPermission("schutzschild.perm")) {
            ItemStack Schubser = new ItemStack(Material.EYE_OF_ENDER);
            ItemMeta SchubserMeta = Schubser.getItemMeta();
            SchubserMeta.setDisplayName("§5Schutzschild");
            Schubser.setItemMeta(SchubserMeta);
            player.getInventory().setItem(3, Schubser);
        }

        player.getInventory().setItem(0, ItemHandler.Navigator);
        player.getInventory().setItem(1, ItemHandler.Gadgets);
        player.getInventory().setItem(7, ItemHandler.PlayerHide);
        player.getInventory().setItem(8, FriendItem);


    }

    @EventHandler
    public void LeaveListener(PlayerQuitEvent event) {

        Player player = event.getPlayer();
        player.getInventory().clear();
        player.setLevel(0);
        event.setQuitMessage(null);
    }



}



