package consular.macelib.mixin;

import net.minecraft.class_9362;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;


@Mixin(class_9362.class)
public class MaceItemMixin extends Item {

    /**
     * @param settings item settings.
     */
    public MaceItemMixin(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isEnchantable(ItemStack item) {
        return !item.hasEnchantments();
    }

    @Override
    public int getEnchantability() {
        return 10;
    }
}