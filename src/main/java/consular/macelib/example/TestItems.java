package consular.macelib.example;

import consular.macelib.MaceLib;
import consular.macelib.lib.item.MaceItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class TestItems {
    public static Item DIAMOND_MACE = registerItem("diamond_mace", new MaceItem(4 /* Base Damage */, Items.DIAMOND /* Repairing Item */, 250 /* Durability */));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(MaceLib.MODID, name), item);
    }

    public static void registerItems(){
        MaceLib.LOGGER.info("Registering items");
    }
}
