package net.mattias.hatsy.core.registry;


import net.mattias.hatsy.Constants;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), Constants.MOD_ID);

    public static void register(IEventBus bus) {
        CREATIVE_MODE_TABS.register(bus);
    }

    public static final RegistryObject<CreativeModeTab> HATS_TAB = CREATIVE_MODE_TABS.register("hats_tab", () ->
            CreativeModeTab.builder()
                    .withTabsBefore(CreativeModeTabs.OP_BLOCKS)
                    .icon(() -> new ItemStack(ModItems.CHEF_HAT.get()))
                    .title(Component.translatable("itemGroup.hatsy"))
                    .displayItems(((itemDisplayParameters, output) -> ModItems.addToHatsTab(output)))
                    .build());
}
