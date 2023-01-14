package com.atechnologeek.restorationstone.registries;

import com.atechnologeek.restorationstone.RestorationStone;
import com.atechnologeek.restorationstone.item.RestorationStoneItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistries {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RestorationStone.MODID);

    public static final RegistryObject<Item> RESTORATION_STONE = ITEMS.register("restoration_stone", () -> new RestorationStoneItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.UNCOMMON)));
}
