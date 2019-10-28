package com.biteforcemc.PotionEnchants;

import com.biteforcemc.PotionEnchants.handlers.EnchantHandler;
import com.biteforcemc.PotionEnchants.listeners.ArmorListener;
import com.biteforcemc.PotionEnchants.listeners.CraftListener;
import com.biteforcemc.PotionEnchants.listeners.EnchantListener;
import lombok.Getter;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class Main extends JavaPlugin {
    @Getter
    private static Main instance;
    private EnchantHandler handler;

    public void onEnable() {
        instance = this;
        register();

        getServer().resetRecipes();
        getServer().addRecipe(EnchantHandler.speed2());
        getServer().addRecipe(EnchantHandler.nightVision());
        getServer().addRecipe(EnchantHandler.speed1());
        getServer().addRecipe(EnchantHandler.jp());
        getServer().addRecipe(EnchantHandler.str2());
        getServer().addRecipe(EnchantHandler.str1());
        getServer().addRecipe(EnchantHandler.res());
    }

    public void onDisable() {

    }


    private void register() {
        ArrayList<String> m = new ArrayList<String>();
        m.add("DIAMOND_AXE");
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new CraftListener(), this);
        pm.registerEvents(new EnchantListener(), this);
        pm.registerEvents(new ArmorListener(m), this);

        //getServer().addRecipe(handler.speed2());
        //getServer().addRecipe(handler.speed2(Material.DIAMOND_LEGGINGS));
    }

    public static Main getInstance() {
        return instance;
    }

}
