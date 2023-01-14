package com.atechnologeek.restorationstone.event;

import com.atechnologeek.restorationstone.registries.ItemRegistries;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.BasicTrade;
import net.minecraftforge.event.AnvilUpdateEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class EventHandler {
    @SubscribeEvent
    public static void onAnvilUpdate(AnvilUpdateEvent event) {
        ItemStack itemstack1 = event.getLeft();
        ItemStack itemstack2 = event.getRight();
        if (!itemstack1.isDamageableItem() || itemstack2.getItem() != ItemRegistries.RESTORATION_STONE.get()) return;

        int cost = event.getCost()+1;
        ItemStack itemstack = itemstack1.copy();
        itemstack.setRepairCost(0);
        itemstack.setDamageValue(0);

        event.setCost(cost);
        event.setMaterialCost(1);
        event.setOutput(itemstack);
    }

    @SubscribeEvent
    public static void onWandererTrades(WandererTradesEvent event) {
        event.getRareTrades().add(new BasicTrade(48, new ItemStack(ItemRegistries.RESTORATION_STONE.get()), 1, 0));
    }
}
