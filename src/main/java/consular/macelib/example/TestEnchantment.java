package consular.macelib.example;

import consular.macelib.lib.tags.ItemTags;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;

public class TestEnchantment extends Enchantment {
    protected TestEnchantment(Enchantment.Rarity weight, EquipmentSlot ... slotTypes) {
        super(weight, ItemTags.MACE_ENCHANTABLE, slotTypes);
    }

    @Override
    public int getMinPower(int level) {
        return 10 + 20 * (level - 1);
    }

    @Override
    public int getMaxPower(int level) {
        return super.getMinPower(level) + 50;
    }

    @Override
    public int getMaxLevel() {
        return 2;
    }
}

