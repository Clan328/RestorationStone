package com.atechnologeek.restorationstone.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RestorationStoneItem extends Item {
    public RestorationStoneItem(Item.Properties properties) {
        super(properties);
    }

    public boolean isFoil(ItemStack itemstack) { return true; }

    public boolean isEnchantable(ItemStack itemstack) {
        return false;
    }
}
