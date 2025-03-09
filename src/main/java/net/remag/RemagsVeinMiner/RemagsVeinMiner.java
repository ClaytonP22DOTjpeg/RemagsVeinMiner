package net.remag.remagsveinminer;

import net.fabricmc.api.ModInitializer;

import net.remag.remagsveinminer.Item.Moditems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RemagsVeinMiner implements ModInitializer {
	public static final String MOD_ID = "remags-veinminer";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		//LOGGER.info("Hello Fabric world!");
		Moditems.registerModItems();
	}
}