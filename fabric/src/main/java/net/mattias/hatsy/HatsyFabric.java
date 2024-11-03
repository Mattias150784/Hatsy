package net.mattias.hatsy;

import net.fabricmc.api.ModInitializer;
import net.mattias.hatsy.Constants;
import net.mattias.hatsy.Hatsy;
import net.mattias.hatsy.core.registry.ModCreativeModeTabs;
import net.mattias.hatsy.core.registry.ModItems;

public class HatsyFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        

        Hatsy.init();
        ModItems.register();
        ModCreativeModeTabs.register();
    }
}
