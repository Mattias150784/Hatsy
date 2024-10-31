package net.mattias.hatsy.core.registry;


import net.mattias.hatsy.Constants;
import net.mattias.hatsy.core.item.ChefHatItem;
import net.mattias.hatsy.core.item.LuffyHatItem;
import net.mattias.hatsy.core.item.TopHatItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, name), item);
    }

    public static void register() {}

    public static final Item CHEF_HAT = registerItem("chef_hat", new ChefHatItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final Item LUFFY_HAT = registerItem("luffy_hat", new LuffyHatItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item TOP_HAT = registerItem("top_hat", new TopHatItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item WIZARD_HAT = registerItem("wizard_hat", new TopHatItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final Item SANTA_HAT = registerItem("santa_hat", new TopHatItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item EAR_MUFFS = registerItem("ear_muffs", new TopHatItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item SPINNY_HAT = registerItem("spinny_hat", new TopHatItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item SHERLOCK_HOLMES_HAT = registerItem("sherlock_holmes_hat", new TopHatItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item ASTRONAUT_HAT = registerItem("astronaut_hat", new TopHatItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item NARUTO_HEADBAND = registerItem("naruto_headband", new TopHatItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));






    public static void addToHatsTab(CreativeModeTab.Output output) {
        output.accept(CHEF_HAT);

        output.accept(LUFFY_HAT);
        output.accept(TOP_HAT);
        output.accept(WIZARD_HAT);
        output.accept(SANTA_HAT);
        output.accept(EAR_MUFFS);
        output.accept(SPINNY_HAT);
        output.accept(ASTRONAUT_HAT);
        output.accept(SHERLOCK_HOLMES_HAT);
        output.accept(NARUTO_HEADBAND);


    }


}
