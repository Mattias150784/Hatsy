package net.mattias.hatsy.core.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Equipable;
import net.minecraft.world.item.Item;

public class NarutoHeadbandItem extends Item implements Equipable {

    ArmorMaterial material;
    ArmorItem.Type type;

    public NarutoHeadbandItem(ArmorMaterial material, ArmorItem.Type type, Properties properties) {
        super(properties);

        this.material = material;
        this.type = type;
    }

    @Override
    public EquipmentSlot getEquipmentSlot() {
        return type.getSlot();
    }

    @Override
    public SoundEvent getEquipSound() {
        return material.getEquipSound();
    }
}
