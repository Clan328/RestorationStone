package com.atechnologeek.restorationstone;

import com.atechnologeek.restorationstone.event.EventHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static com.atechnologeek.restorationstone.registries.ItemRegistries.ITEMS;

@Mod("restorationstone")
public class RestorationStone {
    public static final String MODID = "restorationstone";

    public RestorationStone() {
        MinecraftForge.EVENT_BUS.register(EventHandler.class);

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
