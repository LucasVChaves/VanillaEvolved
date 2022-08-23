package net.fabricmc.VanillaEvolved.registries;

import net.fabricmc.VanillaEvolved.Main;
import net.fabricmc.VanillaEvolved.block.ModBlocks;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.Items;

public class ModRegistries {
    public static void registerComposterFilling() {
        System.out.println("Now registering Fuels for " + Main.MOD_ID);

        CompostingChanceRegistry.INSTANCE.add(Items.ROTTEN_FLESH, 0.40f);
        CompostingChanceRegistry.INSTANCE.add(Items.BAMBOO, 0.25f);
        CompostingChanceRegistry.INSTANCE.add(Items.POISONOUS_POTATO, 0.40f);
    }

    public static void RegisterBlockRenderLayerMaps() {
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
