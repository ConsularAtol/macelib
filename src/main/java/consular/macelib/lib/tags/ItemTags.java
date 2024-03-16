package consular.macelib.lib.tags;

import consular.macelib.MaceLib;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ItemTags {
    public static final TagKey<Item> MACE_ENCHANTABLE = ItemTags.of("enchantable/mace");

    private static TagKey<Item> of(String id) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier(MaceLib.MODID, id));
    }
}
