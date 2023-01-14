package com.atechnologeek.restorationstone;

import com.atechnologeek.restorationstone.event.EventHandler;
import com.atechnologeek.restorationstone.registries.ItemRegistries;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static com.atechnologeek.restorationstone.registries.ItemRegistries.ITEMS;

@Mod("restorationstone")
public class RestorationStone {
    public static final String MODID = "restorationstone";

    public RestorationStone() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(EventHandler.class);

        modEventBus.addListener(this::addCreative);
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ItemRegistries.RESTORATION_STONE);
        }
    }
}
