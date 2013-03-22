package com.maps.classes;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.maps.OresomeBattlesMaps;
import com.oresomecraft.OresomeBattles.InventoryEvent;
import com.oresomecraft.OresomeBattles.OresomeBattles;
import com.oresomecraft.OresomeBattles.ReadyMapsEvent;

public class Template implements Listener {
    
    OresomeBattlesMaps plugin;
    OresomeBattles Battles;
    public Deep Caverns(OresomeBattlesMaps pl) {
	plugin = pl;
	plugin.getServer().getPluginManager().registerEvents(this, plugin);
	Battles = (OresomeBattles) Bukkit.getServer().getPluginManager().getPlugin("OresomeBattles");
    }
    
    // Spawn lists. (Don't change!)
    public ArrayList<Location> redSpawns = new ArrayList<Location>();
    public ArrayList<Location> blueSpawns = new ArrayList<Location>();
    public ArrayList<Location> FFASpawns = new ArrayList<Location>();

    // Map details
    String name = "deep caverns";
    String fullName = "Deep Caverns";
    String creators = "Kalysar, Alphaminecraft91, MR_SKINNA7";
    //Map download link: N/A
    
    @EventHandler(priority = EventPriority.NORMAL)
    public void readyMap(ReadyMapsEvent event) {
	Battles.addVotes(name);
	clearSpawns();
	readyTDMSpawns();
	readyFFASpawns();
	Battles.addCreators(name, creators); 
	Battles.setFullName(name, fullName);
    }
    
    public void readyTDMSpawns() {
	World w = Bukkit.getServer().getWorld(name);

	Location redSpawn = new Location(w, 0, 99, 27, 2, 0);
	Location blueSpawn = new Location(w, -9, 110, -20, 0, 0);

	redSpawns.add(redSpawn);
	redSpawns.add(new Location(w, 0, 99, 27, 2, 0));
	redSpawns.add(new Location(w, -9, 110, -20, 0, 0));
	redSpawns.add(new Location(w, 21, 105, -13, 0, 0));
	redSpawns.add(new Location(w, 4, 106, -41, 0, 0));
	redSpawns.add(new Location(w, -18, 101, 13, 0, 0));
	redSpawns.add(new Location(w, 2, 104, 15, 0, 0));
	redSpawns.add(new Location(w, -2, 109, -4, 0, 0));
	redSpawns.add(new Location(w, 28, 105, 10, 0, 0));
	redSpawns.add(new Location(w, 27, 96, 0, 0, 0));
	redSpawns.add(new Location(w, 30, 105, -14, 0, 0));
	redSpawns.add(new Location(w, -9, 106, 18, 0, 0));
	
	blueSpawns.add(blueSpawn);
	blueSpawns.add(new Location(w, -9, 110, -20, 0, 0));
	blueSpawns.add(new Location(w, 0, 99, 27, 0, 0));
	blueSpawns.add(new Location(w, -16, 108, -3, 0, 0));
	blueSpawns.add(new Location(w, -30, 108, -3, 0, 0));
	blueSpawns.add(new Location(w, -18, 101, 13, 0, 0));
	blueSpawns.add(new Location(w, -27, 88, 17, 0, 0));
	blueSpawns.add(new Location(w, -32, 76, 16, 0, 0));
	blueSpawns.add(new Location(w, -46, 97, 7, 0, 0));
	blueSpawns.add(new Location(w, -86, 93, 13, 0, 0));
	blueSpawns.add(new Location(w, 26, 105, -13, 0, 0));
	blueSpawns.add(new Location(w, 21, 94, 2, 0, 0));

	Battles.setRedSpawns(name, redSpawns);
	Battles.setBlueSpawns(name, blueSpawns);
    }

    public void readyFFASpawns() {

	World w = Bukkit.getServer().getWorld(name);

	Location redSpawn = new Location(w, -72, 71, -1208, -1, 0);
	Location blueSpawn = new Location(w, -116, 66, -1140, -178, 0);

	FFASpawns.add(redSpawn);
	FFASpawns.add(blueSpawn);
	FFASpawns.add(new Location(w, -143, 66, -1211, -50, 0));
	FFASpawns.add(new Location(w, -142, 66, -1171, -108, 0));
	FFASpawns.add(new Location(w, -141, 66, -1142, -152, 0));
	FFASpawns.add(new Location(w, -127, 70, -1158, -162, 0));
	FFASpawns.add(new Location(w, -112, 66, -1162, 116, 0));
	FFASpawns.add(new Location(w, -125, 71, -1132, -95, 0));
	FFASpawns.add(new Location(w, -101, 71, -1159, -51, 0));
	FFASpawns.add(new Location(w, -109, 71, -1162, -132, 0));
	FFASpawns.add(new Location(w, -97, 66, -1171, 156, 0));
	FFASpawns.add(new Location(w, -83, 71, -1182, 41, 0));
	FFASpawns.add(new Location(w, -78, 71, -1188, -88, 0));
	FFASpawns.add(new Location(w, -43, 71, -1168, 124, 0));
	FFASpawns.add(new Location(w, -48, 71, -1197, 90, 0));
	FFASpawns.add(new Location(w, -91, 71, -1207, -89, 0));
	FFASpawns.add(new Location(w, -121, 71, -1190, 121, 0));
	FFASpawns.add(new Location(w, -139, 71, -1192, 89, 0));
	FFASpawns.add(new Location(w, -114, 66, -1191, 43, 0));
	FFASpawns.add(new Location(w, -77, 71, -1169, -90, 0));
	FFASpawns.add(new Location(w, -58, 71, -1147, 156, 0));
	FFASpawns.add(new Location(w, -91, 71, -1140, 141, 0));

	Battles.setFFASpawns(name, FFASpawns);
    }
    
    @EventHandler(priority = EventPriority.NORMAL)
    public void applyInventory(InventoryEvent event) {

	String par = event.getMessage();
	Player p = event.getPlayer();
	Inventory i = p.getInventory();
	if (par.equalsIgnoreCase(name)) {
	    Battles.utility.clearInv(p);

	    ItemStack HEALTH_POTION = new ItemStack(Material.POTION, 1, (short) 16373);
	    ItemStack STEAK = new ItemStack(Material.COOKED_BEEF, 1);
	    ItemStack BOW = new ItemStack(Material.BOW, 1);
	    ItemStack ARROWS = new ItemStack(Material.ARROW, 64);
	    ItemStack IRON_HELMET = new ItemStack(Material.IRON_HELMET, 1);
	    ItemStack IRON_CHESTPLATE = new ItemStack(Material.IRON_CHESTPLATE, 1);
	    ItemStack IRON_PANTS = new ItemStack(Material.IRON_LEGGINGS, 1);
	    ItemStack IRON_BOOTS = new ItemStack(Material.IRON_BOOTS, 1);
	    ItemStack IRON_SWORD = new ItemStack(Material.IRON_SWORD, 1);
	    ItemStack EXP = new ItemStack(Material.EXP_BOTTLE, 5);
	    
	    p.getInventory().setBoots(IRON_BOOTS);
	    p.getInventory().setLeggings(IRON_PANTS);
	    p.getInventory().setChestplate(IRON_CHESTPLATE);
	    p.getInventory().setHelmet(IRON_HELMET);
	    
	    i.setItem(0, IRON_SWORD);
	    i.setItem(1, BOW);
	    i.setItem(2, STEAK);
	    i.setItem(3, HEALTH_POTION);
	    i.setItem(4, ARROWS);
	    i.setItem(5, EXP);

	   }
    }
    
    public void clearSpawns() {
	redSpawns.clear();
	blueSpawns.clear();
	FFASpawns.clear();
    }
    
    // Region. (Top corner block and bottom corner block.
    // Top left corner.
    public int x1 = -100;
    public int y1 = 160;
    public int z1 = -70;
    
    //Bottom right corner.
    public int x2 = -70;
    public int y2 = 30;
    public int z2 = 50;

    // Getting the region
    public static boolean contains(Location loc, int x1, int x2, int y1,
	 int y2, int z1, int z2) {
	int bottomCornerX = x1 < x2 ? x1 : x2; 
	int bottomCornerZ = z1 < z2 ? z1 : z2; 
	int topCornerX = x1 > x2 ? x1 : x2;
	int topCornerZ = z1 > z2 ? z1 : z2;
	int bottomCornerY = y1 < y2 ? y1 : y2;
	int topCornerY = y1 > y2 ? y1 : y2;
	if (loc.getX() >= bottomCornerX && loc.getX() <= topCornerX) {
	    if (loc.getZ() >= bottomCornerZ && loc.getZ() <= topCornerZ) {
		if (loc.getY() >= bottomCornerY && loc.getY() <= topCornerY) {
		    return true;
		    }
	    }
	}
	return false;

    }
    
    
    /*
     * Custom effects/items code goes here! This is also the place where you can
     * have code that says what blocks can and can't be broken.
     * 
     * Usually you should just leave this to Zachoz and pegabeavercorn to do and
     * leave them you suggestions via a comment. ("// zach and pega can u perhaps add a plugin or two. one that affects a ghast tear and one that affects maybe a fishing rod that drags or whatever. Rename it however u like. Sorry first time coding Alpha was being a douche and made me do it all. Thanks. Text here")
     * 
     * If you have experience in Java and the Bukkit API feel free to write your own!
     */  

    // Code for disabling block breaking:

    @EventHandler(priority = EventPriority.NORMAL)
    public void protection(BlockBreakEvent event) {

	Block b = event.getBlock();
	Location loc = b.getLocation();

	if (loc.getWorld().getName().equals(name)) {

	    event.setCancelled(true);
	}

    }

}

