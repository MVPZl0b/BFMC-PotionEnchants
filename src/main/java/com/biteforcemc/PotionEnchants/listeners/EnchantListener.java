package com.biteforcemc.PotionEnchants.listeners;

import com.biteforcemc.PotionEnchants.Main;
import com.biteforcemc.PotionEnchants.util.ArmorEquipEvent;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class EnchantListener implements Listener {


    @EventHandler
    public void armorEquip(ArmorEquipEvent event) {
        if (event.getNewArmorPiece().getType() == Material.DIAMOND_BOOTS) {
            if (event.getNewArmorPiece().hasItemMeta()) {
                if (event.getNewArmorPiece().getItemMeta().getLore().contains(ChatColor.AQUA + "Speed 2")) {
                    event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 99999, 1));
                }
            }
        } else if (event.getOldArmorPiece().getType() == Material.DIAMOND_BOOTS) {
            if (event.getOldArmorPiece().hasItemMeta()) {
                if (event.getOldArmorPiece().getItemMeta().getLore().contains(ChatColor.AQUA + "Speed 2")) {
                    event.getPlayer().removePotionEffect(PotionEffectType.SPEED);
                }
            }
        } else if (event.getNewArmorPiece().getType() == Material.DIAMOND_HELMET) {
            if (event.getNewArmorPiece().hasItemMeta()) {
                if (event.getNewArmorPiece().getItemMeta().getLore().contains(ChatColor.LIGHT_PURPLE + "Night Vision")) {
                    event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 99999, 0));
                }
            }
        } else if (event.getOldArmorPiece().getType() == Material.DIAMOND_HELMET) {
            if (event.getOldArmorPiece().hasItemMeta()) {
                if (event.getOldArmorPiece().getItemMeta().getLore().contains(ChatColor.LIGHT_PURPLE + "Night Vision")) {
                    event.getPlayer().removePotionEffect(PotionEffectType.NIGHT_VISION);
                }
            }
        } else if (event.getNewArmorPiece().getType() == Material.DIAMOND_BOOTS) {
            if (event.getNewArmorPiece().hasItemMeta()) {
                if (event.getNewArmorPiece().getItemMeta().getLore().contains(ChatColor.AQUA + "Speed 1")) {
                    event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 99999, 0));
                }
            }
        } else if (event.getOldArmorPiece().getType() == Material.DIAMOND_BOOTS) {
            if (event.getOldArmorPiece().hasItemMeta()) {
                if (event.getOldArmorPiece().getItemMeta().getLore().contains(ChatColor.AQUA + "Speed 1")) {
                    event.getPlayer().removePotionEffect(PotionEffectType.SPEED);
                }
            }
        }
    }
}