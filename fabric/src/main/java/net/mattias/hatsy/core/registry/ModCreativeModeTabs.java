package net.mattias.hatsy.core.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.mattias.hatsy.Constants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {

    private static CreativeModeTab registerCreativeModeTab(String name, CreativeModeTab tab) {
        return Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(Constants.MOD_ID, name), tab);
    }

    public static void register() {}

    public static final CreativeModeTab HATS_TAB = registerCreativeModeTab("hats_tab",
            FabricItemGroup.builder()
                    .title(Component.translatable("itemGroup.hatsy"))
                    .icon(() -> new ItemStack(ModItems.CHEF_HAT))
                    .displayItems((displayContext, output) -> ModItems.addToHatsTab(output))
                    .build());
}
