// This class was created by Niklaaas


package de.niklaaasLobbysystem.handler;

import de.niklaaasLobbysystem.Methods.CustomSkull;
import de.niklaaasLobbysystem.Methods.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;


public class ItemHandler {


    Player player;
    public static ItemStack Navigator = ItemBuilder.createItemWithMaterial(Material.COMPASS, "§a§lNavigator", true, " ");
    static ItemStack LobbySwitch = ItemBuilder.createItemWithMaterial(Material.NETHER_STAR, "§bLobby-Wechsler", true, " ");
    static ItemStack lobby1 = ItemBuilder.createItemWithMaterial(Material.NETHER_STAR, "§a§llobby-1", true, " ");
    static ItemStack lobby2 = ItemBuilder.createItemWithMaterial(Material.NETHER_STAR, "§a§llobby-2", true, " ");
    static ItemStack lobby3 = ItemBuilder.createItemWithMaterial(Material.NETHER_STAR, "§a§llobby-3", true, " ");
    static ItemStack lobby4 = ItemBuilder.createItemWithMaterial(Material.NETHER_STAR, "§a§llobby-4", true, " ");
    static ItemStack lobby5 = ItemBuilder.createItemWithMaterial(Material.NETHER_STAR, "§a§llobby-5", true, " ");
    static ItemStack Bedwars = ItemBuilder.createItemWithMaterial(Material.BED, "§cBedwars", true, " ");
    static ItemStack Skywars = ItemBuilder.createItemWithMaterial(Material.GRASS, "§2Skywars", true, " ");
    static ItemStack MLGRush = ItemBuilder.createItemWithMaterial(Material.STICK, "§bMLG-Rush", true, " ");
    static ItemStack Cores = ItemBuilder.createItemWithMaterial(Material.BEACON, "§bCores", true, " ");
    static ItemStack MarioParty = ItemBuilder.createItemWithMaterial(Material.HUGE_MUSHROOM_2, "§cMario-Party", true, " ");
    static ItemStack SpielModiErklaerung = ItemBuilder.createItemWithMaterial(Material.BOOK_AND_QUILL, "§6§lSpielModi-Erklaerungen", true, " ");
    public static ItemStack Gadgets = ItemBuilder.createItemWithMaterial(Material.ENDER_CHEST, "§a§lGadgets", true, " ");
    public static ItemStack Nicktool = ItemBuilder.createItemWithMaterial(Material.NAME_TAG, "§a§lNick-Tool", true, " ");
    public static ItemStack Schubser = ItemBuilder.createItemWithMaterial(Material.EYE_OF_ENDER, "§5Schutzschild", true, " " );
    public static ItemStack PlayerHide = ItemBuilder.createItemWithMaterial(Material.BLAZE_ROD, "§a§lPlayerhide", true, " ");
    //PLAYER-HEAD
    static ItemStack KoepfeAuswahl = ItemBuilder.createItemWithMaterial(Material.IRON_HELMET, "§a§lKöpfe-Auswahl", true, " ");
    static ItemStack SpielerKoepfe = ItemBuilder.createItemWithMaterial(Material.IRON_HELMET, "§a§lSpieler-Köpfe", true, " ");
    public static ItemStack NiklaaasHead = ItemBuilder.createSkull(Material.SKULL_ITEM, 1, 3, "Niklaaas", "Niklaaas", "Linksklick zum aufsetzen!");
    //public static ItemStack DrNutellaHead = ItemBuilder.createSkullWithOwner("§aDrNutella Head", "DrNutella", "§bLinksklick um den Head aufzusetzen");
    //public static ItemStack la_conejaHead = ItemBuilder.createSkullWithOwner("§ala_coneja Head", "la_coneja", "§bLinksklick um den Head aufzusetzen");
    //public static ItemStack NotchHead = ItemBuilder.createSkullWithOwner("§aNotch Head", "Notch", "§bLinksklick um den Head aufzusetzen");
    //public static ItemStack PalutenHead = ItemBuilder.createSkullWithOwner("§aPaluten Head", "Paluten", "§bLinksklick um den Head aufzusetzen");
    //public static ItemStack GronkhHead = ItemBuilder.createSkullWithOwner("§Gronkh Head", "Gronkh", "§bLinksklick um den Head aufzusetzen");
    public static ItemStack twitter = CustomSkull.getSkull("§a§lSocialMedia-Köpfe", "http://textures.minecraft.net/texture/3685a0be743e9067de95cd8c6d1ba21ab21d37371b3d597211bb75e43279", 1, " ");
    public static ItemStack FoodHeads = CustomSkull.getSkull("§a§lFood-Heads", "http://textures.minecraft.net/texture/515dcb2da02cf734829e1e273e3025617d8071516f953251b52545da8d3e8db8", 1, " ");
    public static ItemStack LaenderSkull = CustomSkull.getSkull("§a§lLänder-Heads", "http://textures.minecraft.net/texture/5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f", 1, " ");
    static ItemStack Spielsachen = ItemBuilder.createItemWithMaterial(Material.ENDER_CHEST, "§a§lSpielsachen", true, " ");
    public static ItemStack EnterhakenGadget = ItemBuilder.createItemWithMaterial(Material.FISHING_ROD, "§aEnterhaken", true, "§eDamit kannst du dich schneller fortbewegen!");
    public static ItemStack FireworkGadget = ItemBuilder.createItemWithMaterial(Material.FIREWORK, "§aFeuerwerk", true, "§aZündle ein bisschen!");
    public static ItemStack EnderpearlGadget = ItemBuilder.createItemWithMaterial(Material.ENDER_PEARL, "§5Enderperle", true, "§eTeleportiere dich zu entfernte Ziele!!");
    public static ItemStack JumpBoostGadget = ItemBuilder.createItemWithMaterial(Material.FEATHER, "§a§lJumpBoost-Gadget", true, "§eSpringe höher als deine Freunde!");
    static ItemStack Effekte = ItemBuilder.createItemWithMaterial(Material.BLAZE_POWDER, "§a§lEffekte", true, " ");
    static ItemStack Rüstung = ItemBuilder.createItemWithMaterial(Material.LEATHER_CHESTPLATE, "§a§lKleidung", true, " ");
    static ItemStack Filler = ItemBuilder.createItemWithShortID(160, 8, 1, " ", true, " ");
    public static ItemStack NoGadget = ItemBuilder.createItemWithMaterial(Material.BARRIER, "§cKein Gadget ausgewählt!", true, " ");
    public static ItemStack GadgetLoad = ItemBuilder.createItemWithMaterial(Material.FIREWORK_CHARGE, "§7Enderperle", true, "§cDein Gadget lädt, bitte warten...");
    public static ItemStack FireWorkLoad = ItemBuilder.createItemWithMaterial(Material.FIREWORK_CHARGE, "§7Feuerwerk", true, "§cDein Gadget lädt, bitte warten...");
    public static ItemStack zurueckSkull = CustomSkull.getSkull("§a§lZurück", "http://textures.minecraft.net/texture/37aee9a75bf0df7897183015cca0b2a7d755c63388ff01752d5f4419fc645", 1, " ");
    public static ItemStack FeatherLoad = ItemBuilder.createItemWithMaterial(Material.FIREWORK_CHARGE, "§7Jump-Boost", true, "§cDein Gadget lädt, bitte warten...");





}







