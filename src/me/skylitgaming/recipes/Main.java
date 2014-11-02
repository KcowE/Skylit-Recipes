package me.skylitgaming.recipes;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	public void onEnable(){
		
		this.getServer().getLogger().info("============================================");
		this.getServer().getLogger().info("********** ENABLING SKYLIT RECIPE **********");
		this.getServer().getLogger().info("============================================");
		
		/* NAMETAG RECIPE*/
		
		ItemStack nametag = new ItemStack(Material.NAME_TAG, 1);
		ItemMeta nametagmeta = nametag.getItemMeta();
		nametagmeta.setDisplayName(ChatColor.GOLD+"Name Tag");
		nametagmeta.setLore(Arrays.asList("Put in an anvil", "Give it a name", "Right click the animal you want to name"));
		nametag.setItemMeta(nametagmeta);
		
		ShapedRecipe ntrecipe = new ShapedRecipe(nametag);
		ntrecipe.shape("SSS",
				       "ADA", 
				       "AIA");
		ntrecipe.setIngredient('S', Material.STRING);
		ntrecipe.setIngredient('A', Material.AIR);
		ntrecipe.setIngredient('D', Material.DIAMOND);
		ntrecipe.setIngredient('I', Material.IRON_INGOT);
		Bukkit.getServer().addRecipe(ntrecipe);
		
		/* SADDLE RECIPE */
		
		ItemStack saddle = new ItemStack(Material.SADDLE, 1);
		ItemMeta saddlemeta = saddle.getItemMeta();
		saddlemeta.setDisplayName(ChatColor.GOLD+"Saddle");
		saddlemeta.setLore(Arrays.asList("Ride the pig like you have always dreamed of","Or a horse if you prefer"));
		saddle.setItemMeta(saddlemeta);
		
		ShapedRecipe srecipe = new ShapedRecipe(saddle);
		srecipe.shape("LLL",
				      "LLL",
				      "IAI");
		srecipe.setIngredient('L', Material.LEATHER);
		srecipe.setIngredient('I', Material.IRON_INGOT);
		srecipe.setIngredient('A', Material.AIR);
		Bukkit.getServer().addRecipe(srecipe);
		
		
		
		/* CHAINMAIL HELMET RECIPE */
		
		ItemStack chain_helm = new ItemStack(Material.CHAINMAIL_HELMET, 1);
		ItemMeta chain_helmmeta = chain_helm.getItemMeta();
		chain_helmmeta.setDisplayName(ChatColor.GOLD+"Chainmail Helmet");
		chain_helm.setItemMeta(chain_helmmeta);
		
		ShapedRecipe chrecipe = new ShapedRecipe(chain_helm);
		chrecipe.shape("BBB",
				       "BAB",
			           "AAA");
		chrecipe.setIngredient('B', Material.IRON_FENCE);
		chrecipe.setIngredient('A', Material.AIR);
		Bukkit.getServer().addRecipe(chrecipe);
		
		/* CHAINMAIL CHESTPLATE RECIPE */
		
		ItemStack chain_chest = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
		ItemMeta chain_chestmeta = chain_chest.getItemMeta();
		chain_chestmeta.setDisplayName(ChatColor.GOLD+"Chainmail Chestplate");
		chain_chest.setItemMeta(chain_chestmeta);
		
		ShapedRecipe ccrecipe = new ShapedRecipe(chain_chest);
		ccrecipe.shape("BAB",
				       "BBB",
				       "BBB");
		ccrecipe.setIngredient('B', Material.IRON_FENCE);
		ccrecipe.setIngredient('A', Material.AIR);
		Bukkit.getServer().addRecipe(ccrecipe);
		
		/* CHAINMAIL LEGGINGS RECIPE */
		
		ItemStack chain_leg = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
		ItemMeta chain_legmeta = chain_leg.getItemMeta();
		chain_legmeta.setDisplayName(ChatColor.GOLD+"Chainmail Leggings");
		chain_leg.setItemMeta(chain_legmeta);
		
		ShapedRecipe clrecipe = new ShapedRecipe(chain_leg);
		clrecipe.shape("BBB",
				       "BAB",
				       "BAB");
		ccrecipe.setIngredient('B', Material.IRON_FENCE);
		ccrecipe.setIngredient('A', Material.AIR);
		Bukkit.getServer().addRecipe(clrecipe);
		
		/* CHAINMAIL BOOTS RECIPE */
		
		ItemStack chain_boot = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
		ItemMeta chain_bootmeta = chain_boot.getItemMeta();
		chain_bootmeta.setDisplayName(ChatColor.GOLD+"Chainmail Boots");
		chain_boot.setItemMeta(chain_bootmeta);
		
		ShapedRecipe cbrecipe = new ShapedRecipe(chain_boot);
		cbrecipe.shape("AAA",
			           "BAB",
			           "BAB");
		ccrecipe.setIngredient('B', Material.IRON_FENCE);
		ccrecipe.setIngredient('A', Material.AIR);
		Bukkit.getServer().addRecipe(cbrecipe);
		
		/* IRON HORSE ARMOUR RECIPE */
		
		ItemStack ironhorse = new ItemStack(Material.IRON_BARDING, 1);
		ItemMeta ironhorsemeta = ironhorse.getItemMeta();
		ironhorsemeta.setDisplayName(ChatColor.GOLD+"Iron Horse Armour");
		ironhorsemeta.setLore(Arrays.asList("Protect your noble steed!"));
		ironhorse.setItemMeta(ironhorsemeta);
		
		ShapedRecipe ihrecipe = new ShapedRecipe(ironhorse);
		ihrecipe.shape("AAI",
				       "IWI",
				       "III");
		ihrecipe.setIngredient('I', Material.IRON_INGOT);
		ihrecipe.setIngredient('W', Material.WOOL);
		ihrecipe.setIngredient('A', Material.AIR);
		Bukkit.getServer().addRecipe(ihrecipe);
		
		/* GOLD HORSE ARMOUR RECIPE */
		
		ItemStack goldhorse = new ItemStack(Material.GOLD_BARDING, 1);
		ItemMeta goldhorsemeta = goldhorse.getItemMeta();
		goldhorsemeta.setDisplayName(ChatColor.GOLD+"Gold Horse Armour");
		goldhorsemeta.setLore(Arrays.asList("Protect your noble steed!"));
		goldhorse.setItemMeta(goldhorsemeta);
		
		ShapedRecipe ghrecipe = new ShapedRecipe(goldhorse);
		ghrecipe.shape("AAG",
				       "GWG",
				       "GGG");
		ghrecipe.setIngredient('A', Material.AIR);
		ghrecipe.setIngredient('G', Material.GOLD_INGOT);
		ghrecipe.setIngredient('W', Material.WOOL);
		Bukkit.getServer().addRecipe(ghrecipe);
		
		/* DIAMOND HORSE ARMOUR RECIPE */
		
		ItemStack diamondhorse = new ItemStack(Material.DIAMOND_BARDING, 1);
		ItemMeta dhmeta = diamondhorse.getItemMeta();
		dhmeta.setDisplayName(ChatColor.GOLD+"Diamond Horse Armour");
		dhmeta.setLore(Arrays.asList("Protect your noble steed!"));
		diamondhorse.setItemMeta(dhmeta);
		
		ShapedRecipe dhrecipe = new ShapedRecipe(diamondhorse);
		dhrecipe.shape("AAD",
				       "DWD",
				       "DDD");
		dhrecipe.setIngredient('A', Material.AIR);
		dhrecipe.setIngredient('D', Material.DIAMOND);
		dhrecipe.setIngredient('W', Material.WOOL);
		Bukkit.getServer().addRecipe(dhrecipe);
		
		this.getServer().getLogger().info("============================================");
		this.getServer().getLogger().info("********** SKYLIT RECIPE ENABLED ***********");
		this.getServer().getLogger().info("============================================");
	}
	
	public void onDisable(){
		this.getServer().getLogger().info("============================================");
		this.getServer().getLogger().info("********** SKYLIT RECIPE DISABLED **********");
		this.getServer().getLogger().info("============================================");
	}
}
