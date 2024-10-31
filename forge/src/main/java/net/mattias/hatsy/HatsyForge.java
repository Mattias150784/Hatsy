package net.mattias.hatsy;

import net.mattias.hatsy.Constants;
import net.mattias.hatsy.Hatsy;
import net.mattias.hatsy.core.registry.ModCreativeModeTabs;
import net.mattias.hatsy.core.registry.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class HatsyForge {
    
    public HatsyForge() {

        Constants.LOG.info("Hello Forge world!");
        Hatsy.init();
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(bus);
        ModCreativeModeTabs.register(bus);
        
    }
}