package com.biteforcemc.PotionEnchants.handlers;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;

public class EnchantHandler {


    public static ShapedRecipe speed2() {

        ItemStack armor2 = new ItemStack(Material.DIAMOND_BOOTS, 1);
        ItemMeta itemMeta = armor2.getItemMeta();

        ArrayList<String> lore = new ArrayList<String>();
        lore.add(0, ChatColor.translateAlternateColorCodes('&', "&bSpeed 2"));
        itemMeta.setLore(lore);
        armor2.setItemMeta(itemMeta);


        ShapedRecipe speed2 = new ShapedRecipe(armor2);
        speed2.shape("***", "*%*", "***");

        speed2.setIngredient('*', Material.POTION, 8226);
        speed2.setIngredient('%', Material.DIAMOND_BOOTS);

        return speed2;
    }

    public static ShapedRecipe speed1() {

        ItemStack armor2 = new ItemStack(Material.DIAMOND_BOOTS, 1);
        ItemMeta itemMeta = armor2.getItemMeta();

        ArrayList<String> lore = new ArrayList<String>();
        lore.add(0, ChatColor.translateAlternateColorCodes('&', "&bSpeed 1"));
        itemMeta.setLore(lore);
        armor2.setItemMeta(itemMeta);


        ShapedRecipe speed1 = new ShapedRecipe(armor2);
        speed1.shape("***", "*%*", "***");

        speed1.setIngredient('*', Material.POTION, 8194);
        speed1.setIngredient('%', Material.DIAMOND_BOOTS);

        return speed1;
    }

    public static ShapedRecipe nightVision() {

        ItemStack armor2 = new ItemStack(Material.DIAMOND_HELMET, 1);
        ItemMeta itemMeta = armor2.getItemMeta();

        ArrayList<String> lore = new ArrayList<String>();
        lore.add(0, ChatColor.translateAlternateColorCodes('&', "&dNight Vision"));
        itemMeta.setLore(lore);
        armor2.setItemMeta(itemMeta);


        ShapedRecipe nightVision = new ShapedRecipe(armor2);
        nightVision.shape("***", "*%*", "***");

        nightVision.setIngredient('*', Material.POTION, 8230);
        nightVision.setIngredient('%', Material.DIAMOND_HELMET);

        return nightVision;
    }

    public static ShapedRecipe str1() {

        ItemStack armor2 = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        ItemMeta itemMeta = armor2.getItemMeta();

        ArrayList<String> lore = new ArrayList<String>();
        lore.add(0, ChatColor.translateAlternateColorCodes('&', "&cStrength 1"));
        itemMeta.setLore(lore);
        armor2.setItemMeta(itemMeta);


        ShapedRecipe str1 = new ShapedRecipe(armor2);
        str1.shape("***", "*%*", "***");

        str1.setIngredient('*', Material.POTION, 8201);
        str1.setIngredient('%', Material.DIAMOND_CHESTPLATE);

        return str1;
    }

    public static ShapedRecipe str2() {

        ItemStack armor2 = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        ItemMeta itemMeta = armor2.getItemMeta();

        ArrayList<String> lore = new ArrayList<String>();
        lore.add(0, ChatColor.translateAlternateColorCodes('&', "&cStrength 2"));
        itemMeta.setLore(lore);
        armor2.setItemMeta(itemMeta);


        ShapedRecipe str2 = new ShapedRecipe(armor2);
        str2.shape("***", "*%*", "***");

        str2.setIngredient('*', Material.POTION, 8233);
        str2.setIngredient('%', Material.DIAMOND_CHESTPLATE);

        return str2;
    }

    public static ShapedRecipe res() {

        ItemStack armor2 = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
        ItemMeta itemMeta = armor2.getItemMeta();

        ArrayList<String> lore = new ArrayList<String>();
        lore.add(0, ChatColor.translateAlternateColorCodes('&', "&6Fire Resistance"));
        itemMeta.setLore(lore);
        armor2.setItemMeta(itemMeta);


        ShapedRecipe res = new ShapedRecipe(armor2);
        res.shape("***", "*%*", "***");

        res.setIngredient('*', Material.POTION, 8227);
        res.setIngredient('%', Material.DIAMOND_LEGGINGS);

        return res;
    }

    public static ShapedRecipe jp() {

        ItemStack armor2 = new ItemStack(Material.DIAMOND_BOOTS, 1);
        ItemMeta itemMeta = armor2.getItemMeta();

        ArrayList<String> lore = new ArrayList<String>();
        lore.add(0, ChatColor.translateAlternateColorCodes('&', "&aJump Boost"));
        lore.add(1, ChatColor.translateAlternateColorCodes('&', "&bSpeed 2"));
        itemMeta.setLore(lore);
        armor2.setItemMeta(itemMeta);


        ShapedRecipe jp = new ShapedRecipe(armor2);
        jp.shape("###", "#%*", "***");

        jp.setIngredient('*', Material.POTION, 8203);
        jp.setIngredient('%', Material.DIAMOND_BOOTS);
        jp.setIngredient('#', Material.POTION, 8226);

        return jp;
    }
}
