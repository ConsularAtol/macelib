package consular.macelib;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import consular.macelib.example.TestEnchantments;
import consular.macelib.example.TestItems;

public class MaceLib implements ModInitializer {
	public static final String MODID = "macelib";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		if (FabricLoader.getInstance().isDevelopmentEnvironment()){
			LOGGER.info("Dev environment detected, running example mod");
			TestEnchantments.registerEnchantments();
			TestItems.registerItems();
		}
	}
}