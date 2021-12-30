package net.fabricmc.VanillaEvolved;

import net.fabricmc.VanillaEvolved.block.ModBlocks;
import net.fabricmc.VanillaEvolved.item.ModItems;
import net.fabricmc.VanillaEvolved.registries.ModRegistries;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class Main implements ModInitializer {

	public static final String MOD_ID = "vanilla_evolved_mod";

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModRegistries.registerComposterFilling();
		RegisterBlockRenderLayerMaps();

		System.out.println("Initializing Vanilla Evolved...");
	}

	private void RegisterBlockRenderLayerMaps() {
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WHITE_LANTERN, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ORANGE_LANTERN, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAGENTA_LANTERN, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_BLUE_LANTERN, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YELLOW_LANTERN, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIME_LANTERN, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_LANTERN, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_GRAY_LANTERN, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRAY_LANTERN, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CYAN_LANTERN, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PURPLE_LANTERN, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_LANTERN, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BROWN_LANTERN, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GREEN_LANTERN, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_LANTERN, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACK_LANTERN, RenderLayer.getCutout());
	}
}
