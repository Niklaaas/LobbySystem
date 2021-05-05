// This class was created by Niklaaas


package de.niklaaasLobbysystem.Listener;


import de.niklaaasLobbysystem.handler.InventoryHandler;
import de.niklaaasLobbysystem.handler.ItemHandler;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;


public class InteractListener implements Listener {
//OPEN NAVIGATOR INVENTORY
    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
        Player player = (Player) event.getPlayer();
        if (event.hasItem()) {
            if (event.getItem().hasItemMeta()) {
                if (event.getItem().getItemMeta().getDisplayName().equals("§a§lNavigator")) {
                    player.openInventory(InventoryHandler.NavigatorInventory);
                }
            }
        }
    }

    //OPEN Gadgets INVENTORY
    @EventHandler
    public void oninteract(PlayerInteractEvent event) {
        Player player = (Player) event.getPlayer();
        if (event.hasItem()) {
            if (event.getItem().hasItemMeta()) {
                if (event.getItem().getItemMeta().getDisplayName().equals("§a§lGadgets")) {

                    player.openInventory(InventoryHandler.GadgetsInventory);
                }
            }
        }
    }

    @EventHandler
    public void OnInteract (PlayerInteractEvent event) {
        Player player = (Player) event.getPlayer();
        if (event.hasItem()) {
            if (event.getItem().hasItemMeta()) {
                if (event.getItem().getItemMeta().getDisplayName().equals("§a§lProfil")) {

                    player.openInventory(InventoryHandler.MenuInventory);
                }
            }
        }
    }

//OPEN LOBBY INVENTORY
    @EventHandler
    public void InventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (event.getClickedInventory() != null) {
            if (event.getCurrentItem().hasItemMeta()) {
                if (event.getInventory().getName().equalsIgnoreCase("§a§lNavigator")) {
                    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§bLobby-Wechsler")) {
                        player.openInventory(InventoryHandler.LobbyInventory);
                        event.setCancelled(true);
                    }
                } else {
                    event.setCancelled(true);
                }

            } else {
                event.setCancelled(true);
            }


        } else {
            event.setCancelled(true);
        }
    }

//OPEN HEADS INVENTORY
    @EventHandler
    public void Headsinventory(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (event.getClickedInventory() != null) {
            if (event.getCurrentItem().hasItemMeta()) {
                if (event.getInventory().getName().equalsIgnoreCase("§a§lGadgets")) {
                    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§a§lKöpfe-Auswahl")) {
                        player.openInventory(InventoryHandler.HeadsInventory);

                    }

                } else {
                    event.setCancelled(true);
                }


            } else {
                event.setCancelled(true);
            }


        } else {
            event.setCancelled(true);
        }

    }

    @EventHandler
    public void ZurueckButton(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (event.getClickedInventory() != null) {
            if (event.getCurrentItem().hasItemMeta()) {
                if (event.getInventory().getName().equalsIgnoreCase("§b§lHüte")) {
                    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§a§lZurück")) {
                        player.openInventory(InventoryHandler.GadgetsInventory);

                    }
                } else {
                    event.setCancelled(true);
                }
            } else {
                event.setCancelled(true);
            }
        } else {
            event.setCancelled(true);
        }
    }

//OPEN SPIELSACHEN INVENTORY
    @EventHandler
    public void Spielsachen(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (event.getClickedInventory() != null) {
            if (event.getCurrentItem().hasItemMeta()) {
                if (event.getInventory().getName().equalsIgnoreCase("§a§lGadgets")) {
                    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§a§lSpielsachen")) {
                        player.openInventory(InventoryHandler.SpielsachenInventory);

                    }
                } else {
                    event.setCancelled(true);
                }
            } else {
                event.setCancelled(true);
            }
        } else {
            event.setCancelled(true);
        }
    }
// OPEN EFFEKTE INVENTORY
    @EventHandler
    public void Effekte(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (event.getClickedInventory() != null) {
            if (event.getCurrentItem().hasItemMeta()) {
                if (event.getInventory().getName().equalsIgnoreCase("§a§lGadgets")) {
                    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§a§lEffekte")) {
                        player.openInventory(InventoryHandler.EffekteInventory);

                    }
                } else {
                    event.setCancelled(true);
                }
            } else {
                event.setCancelled(true);
            }
        } else {
            event.setCancelled(true);
        }
    }
// OPEN KLEIDUNG INVENTORY
    @EventHandler
    public void Kleidung(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (event.getClickedInventory() != null) {
            if (event.getCurrentItem().hasItemMeta()) {
                if (event.getInventory().getName().equalsIgnoreCase("§a§lGadgets")) {
                    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§a§lKleidung")) {
                        player.openInventory(InventoryHandler.KleidungInventory);

                    }
                } else {
                    event.setCancelled(true);
                }
            } else {
                event.setCancelled(true);
            }
        } else {
            event.setCancelled(true);
        }
    }

//OPEN SOCIAL-MEDIA-HEADS INVENTORY
    @EventHandler
    public void SMHeads(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (event.getClickedInventory() != null) {
            if (event.getCurrentItem().hasItemMeta()) {
                if (event.getInventory().getName().equalsIgnoreCase("§b§lHüte")) {
                    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§a§lSocialMedia-Köpfe")) {
                        player.openInventory(InventoryHandler.SMheads);

                    }
                } else {
                    event.setCancelled(true);
                }
            } else {
                event.setCancelled(true);
            }
        } else {
            event.setCancelled(true);
        }
    }
    //OPEN FOOD-HEADS INVENTORY
    @EventHandler
    public void FoodHeads(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (event.getClickedInventory() != null) {
            if (event.getCurrentItem().hasItemMeta()) {
                if (event.getInventory().getName().equalsIgnoreCase("§b§lHüte")) {
                    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§a§lFood-Heads")) {
                        player.openInventory(InventoryHandler.FoodHeads);



                    }
                } else {
                    event.setCancelled(true);
                }
            } else {
                event.setCancelled(true);
            }
        } else {
            event.setCancelled(true);
        }
    }
    //OPEN LÄNDER-HEADS INVENTORY
    @EventHandler
    public void LaenderHeads(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (event.getClickedInventory() != null) {
            if (event.getCurrentItem().hasItemMeta()) {
                if (event.getInventory().getName().equalsIgnoreCase("§b§lHüte")) {
                    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§a§lLänder-Heads")) {
                        player.openInventory(InventoryHandler.LaenderHeads);

                    }
                } else {
                    event.setCancelled(true);
                }
            } else {
                event.setCancelled(true);
            }
        } else {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void ZurueckButton2(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (event.getClickedInventory() != null) {
            if (event.getCurrentItem().hasItemMeta()) {
                if (event.getInventory().getName().equalsIgnoreCase("§b§lSpielsachen")) {
                    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§a§lZurück")) {
                        player.openInventory(InventoryHandler.GadgetsInventory);

                    }
                } else {
                    event.setCancelled(true);
                }
            } else {
                event.setCancelled(true);
            }
        } else {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void ZurueckButton3(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (event.getClickedInventory() != null) {
            if (event.getCurrentItem().hasItemMeta()) {
                if (event.getInventory().getName().equalsIgnoreCase("§b§lEffekte")) {
                    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§a§lZurück")) {
                        player.openInventory(InventoryHandler.GadgetsInventory);

                    }
                } else {
                    event.setCancelled(true);
                }
            } else {
                event.setCancelled(true);
            }
        } else {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void ZurueckButton4(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (event.getClickedInventory() != null) {
            if (event.getCurrentItem().hasItemMeta()) {
                if (event.getInventory().getName().equalsIgnoreCase("§b§lKleidung")) {
                    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§a§lZurück")) {
                        player.openInventory(InventoryHandler.GadgetsInventory);

                    }
                } else {
                    event.setCancelled(true);
                }
            } else {
                event.setCancelled(true);
            }
        } else {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void ZurueckButton5(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (event.getClickedInventory() != null) {
            if (event.getCurrentItem().hasItemMeta()) {
                if (event.getInventory().getName().equalsIgnoreCase("§a§lSocialMedia-Köpfe")) {
                    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§a§lZurück")) {
                        player.openInventory(InventoryHandler.GadgetsInventory);

                    }
                } else {
                    event.setCancelled(true);
                }
            } else {
                event.setCancelled(true);
            }
        } else {
            event.setCancelled(true);
        }
    }
    //OPEN SPIELER-HEADS INVENTORY
    @EventHandler
    public void SpielerKoepfe (InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (event.getClickedInventory() !=null) {
            if (event.getCurrentItem().hasItemMeta()) {
                if (event.getInventory().getName().equalsIgnoreCase("§b§lHüte")) {
                    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§a§lSpieler-Köpfe")) {
                        player.openInventory(InventoryHandler.SpielerKoepfe);
                    }
                } else {
                    event.setCancelled(true);
                }
            } else {
                event.setCancelled(true);
            }
        } else {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void ZurueckButton6(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (event.getClickedInventory() != null) {
            if (event.getCurrentItem().hasItemMeta()) {
                if (event.getInventory().getName().equalsIgnoreCase("§a§lFood-Heads")) {
                    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§a§lZurück")) {
                        player.openInventory(InventoryHandler.GadgetsInventory);

                    }
                } else {
                    event.setCancelled(true);
                }
            } else {
                event.setCancelled(true);
            }
        } else {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void BookClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (event.getClickedInventory() !=null) {
            if (event.getCurrentItem().hasItemMeta()){
                if (event.getInventory().getName().equalsIgnoreCase("§a§lNavigator")) {
                    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6§lSpielModi-Erklaerungen")) {
                        if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6§lSpielModi-Erklaerungen")) {
                            player.closeInventory();
                            player.sendMessage("§cNiklaaas.net §7┃ §bDieses Inventory ist noch in der Entwicklung!");
                        }

                    }
                }

            }
        }
    }




    //CURRENT GADGET
    @EventHandler
    public void GadgetItem (InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (event.getClickedInventory() !=null) {
            if (event.getClickedInventory().getName().equalsIgnoreCase("§b§lSpielsachen")) {
                if (event.getCurrentItem() !=null && event.getCurrentItem().getType() != Material.AIR) {
                    Material material = event.getCurrentItem().getType();
                    if (material == Material.FISHING_ROD) {
                        player.getInventory().setItem(4, ItemHandler.EnterhakenGadget);
                    } else if(material == Material.ENDER_PEARL) {
                        player.getInventory().setItem(4, ItemHandler.EnderpearlGadget);
                        player.updateInventory();
                        player.playSound(player.getLocation(), Sound.NOTE_PLING, 3, 1);
                    } else if (material == Material.FIREWORK) {
                        player.getInventory().setItem(4, ItemHandler.FireworkGadget);
                        player.updateInventory();

                    } else if (material == Material.FEATHER) {
                        player.getInventory().setItem(4, ItemHandler.JumpBoostGadget);
                        player.updateInventory();

                    }

                }
            }
        }
    }



    @EventHandler
    public void CurrentGadget (InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (event.getClickedInventory() !=null) {
            if (event.getClickedInventory().getName().equalsIgnoreCase("§b§lSpielsachen")) {
                if (event.getCurrentItem() !=null && event.getCurrentItem().getType() !=Material.AIR) {
                    Material material = event.getCurrentItem().getType();
                    if (material == Material.FISHING_ROD) {
                        InventoryHandler.SpielsachenInventory.setItem(22, ItemHandler.EnterhakenGadget);
                    } else if (material == Material.ENDER_PEARL) {
                        InventoryHandler.SpielsachenInventory.setItem(22, ItemHandler.EnderpearlGadget);
                    } else if (material == Material.FIREWORK) {
                        InventoryHandler.SpielsachenInventory.setItem(22, ItemHandler.FireworkGadget);
                    } else if (material == Material.FEATHER)
                        InventoryHandler.SpielsachenInventory.setItem(22, ItemHandler.JumpBoostGadget);
                        player.playSound(player.getLocation(), Sound.NOTE_PLING, 3, 1);

                }
            }
        }
    }






}
