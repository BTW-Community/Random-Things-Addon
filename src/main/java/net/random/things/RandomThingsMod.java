package net.random.things;

import btw.random.things.RandomThingsAddon;
import net.fabricmc.api.ModInitializer;

public class RandomThingsMod implements ModInitializer {
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		//RandomThingsAddon.getInstance().initKeybind();
		System.out.println("Hello Fabric world!");
	}
}
