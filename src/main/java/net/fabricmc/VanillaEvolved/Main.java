package net.fabricmc.VanillaEvolved;

import net.fabricmc.VanillaEvolved.block.ModBlocks;
import net.fabricmc.VanillaEvolved.item.ModItems;
import net.fabricmc.VanillaEvolved.registries.ModRegistries;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {

	public static final String MOD_ID = "vanilla_evolved_mod";

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModRegistries.registerComposterFilling();

		System.out.println("Initializing Vanilla Evolved...");
	}
}
