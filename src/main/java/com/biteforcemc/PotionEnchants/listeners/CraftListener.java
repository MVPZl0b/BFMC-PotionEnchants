package com.biteforcemc.PotionEnchants.listeners;

import com.biteforcemc.PotionEnchants.Main;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CraftListener implements Listener {

    @EventHandler
    public void prepareCraft(PrepareItemCraftEvent event) {
        if(event.getRecipe().getResult().getType() == Material.DIAMOND_BOOTS) {
            List<ItemStack> ingredients = Arrays.asList(event.getInventory().getContents());

            Optional<ItemStack> getChestPlate = ingredients.stream().filter(item -> item.getType() == Material.DIAMOND_BOOTS).findFirst();

            if(getChestPlate.isPresent()) {
                ItemStack chestplate = getChestPlate.get();
                ItemStack result = event.getRecipe().getResult().clone();
                Main.getInstance().getLogger().info(result.getEnchantments().toString());

                result.addEnchantments(chestplate.getEnchantments());
                Main.getInstance().getLogger().info(result.getEnchantments().toString());
                event.getInventory().setResult(result);
            }
        }
    }
}
