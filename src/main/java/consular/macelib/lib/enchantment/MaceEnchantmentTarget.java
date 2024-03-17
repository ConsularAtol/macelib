package consular.macelib.lib.enchantment;

import consular.macelib.lib.item.MaceItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

public class MaceEnchantmentTarget extends EnchantmentTargetMixin {

    @Override
    public boolean isAcceptableItem(Item item) {
        return item == Items.MACE || item instanceof MaceItem;
    }
}
