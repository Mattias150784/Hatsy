package net.mattias.hatsy.core.registry;

import net.mattias.hatsy.Constants;
import net.mattias.hatsy.core.item.*;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MOD_ID);

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }

    public static RegistryObject<Item> registerItem(String name, Supplier<Item> item) {
        return ITEMS.register(name, item);
    }
    public static final RegistryObject<Item> CHEF_HAT = registerItem("chef_hat", () -> new ChefHatItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> LUFFY_HAT = registerItem("luffy_hat", () -> new LuffyHatItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> TOP_HAT = registerItem("top_hat", () -> new TopHatItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> WIZARD_HAT = registerItem("wizard_hat", () -> new WizardHatItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SANTA_HAT = registerItem("santa_hat", () -> new SantaHatItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> EAR_MUFFS = registerItem("ear_muffs", () -> new EarMuffsItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SPINNY_HAT = registerItem("spinny_hat", () -> new SpinnyHatItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SHERLOCK_HOLMES_HAT = registerItem("sherlock_holmes_hat", () -> new TopHatItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> ASTRONAUT_HAT = registerItem("astronaut_hat", () -> new TopHatItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> NARUTO_HEADBAND = registerItem("naruto_headband", () -> new NarutoHeadbandItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> PUMPKIN_HAT = registerItem("pumpkin_hat", () -> new NarutoHeadbandItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));




    public static void addToHatsTab(CreativeModeTab.Output output) {
        output.accept(CHEF_HAT.get());
        output.accept(LUFFY_HAT.get());
        output.accept(TOP_HAT.get());
        output.accept(WIZARD_HAT.get());
        output.accept(SANTA_HAT.get());
        output.accept(EAR_MUFFS.get());
        output.accept(SPINNY_HAT.get());
        output.accept(ASTRONAUT_HAT.get());
        output.accept(SHERLOCK_HOLMES_HAT.get());
        output.accept(PUMPKIN_HAT.get());
        output.accept(NARUTO_HEADBAND.get());


    }
}
