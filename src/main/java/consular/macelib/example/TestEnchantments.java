package consular.macelib.example;

import consular.macelib.MaceLib;
import net.minecraft.enchantment.Enchantment;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class TestEnchantments {
    public static final Enchantment TEST_ENCHANTMENT = registerEnchantment("test_enchantment", new TestEnchantment(Enchantment.Rarity.RARE, EquipmentSlot.MAINHAND));

    private static Enchantment registerEnchantment(String name, Enchantment enchantment) {
        return Registry.register(Registries.ENCHANTMENT, new Identifier(MaceLib.MODID, name), enchantment);
    }

    public static void registerEnchantments(){
        MaceLib.LOGGER.info("registered enchantments");
    }
}
