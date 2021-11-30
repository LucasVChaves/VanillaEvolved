package net.fabricmc.VanillaEvolved.block;

import net.fabricmc.VanillaEvolved.Main;
import net.fabricmc.VanillaEvolved.block.custom.ModCustomStairs;
import net.fabricmc.VanillaEvolved.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    //Kiln -----------------------------------------------------------------------------------
    public static final Block KILN_BLOCK = registerBlock("kiln",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.50f).requiresTool()));

    //Nether brick fence gate -----------------------------------------------------------------------
    public static final Block NETHER_BRICK_FENCE_GATE = registerBlock("nether_brick_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool()));

    //Andesite -----------------------------------------------------------------------------------
    public static final Block ANDESITE_BRICKS = registerBlock("andesite_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.50f).requiresTool()));

    public static final Block ANDESITE_BRICKS_SLAB = registerBlock("andesite_bricks_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(1.50f).requiresTool()));

    public static final Block ANDESITE_BRICKS_STAIRS = registerBlock("andesite_bricks_stairs",
            new ModCustomStairs(ModBlocks.ANDESITE_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(1.50f).requiresTool()));

    public static final Block ANDESITE_BRICKS_WALL = registerBlock("andesite_bricks_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(1.50f).requiresTool()));

    //Diorite -----------------------------------------------------------------------------------
    public static final Block DIORITE_BRICKS = registerBlock("diorite_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.50f).requiresTool()));

    public static final Block DIORITE_BRICKS_SLAB = registerBlock("diorite_bricks_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(1.50f).requiresTool()));

    public static final Block DIORITE_BRICKS_STAIRS = registerBlock("diorite_bricks_stairs",
            new ModCustomStairs(ModBlocks.ANDESITE_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(1.50f).requiresTool()));

    public static final Block DIORITE_BRICKS_WALL = registerBlock("diorite_bricks_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(1.50f).requiresTool()));

    //Granite -----------------------------------------------------------------------------------
    public static final Block GRANITE_BRICKS = registerBlock("granite_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.50f).requiresTool()));

    public static final Block GRANITE_BRICKS_SLAB = registerBlock("granite_bricks_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(1.50f).requiresTool()));

    public static final Block GRANITE_BRICKS_STAIRS = registerBlock("granite_bricks_stairs",
            new ModCustomStairs(ModBlocks.ANDESITE_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(1.50f).requiresTool()));

    public static final Block GRANITE_BRICKS_WALL = registerBlock("granite_bricks_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(1.50f).requiresTool()));

    //White Concrete -----------------------------------------------------------------------------------
    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            new ModCustomStairs(Blocks.WHITE_CONCRETE.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    public static final Block WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    //Orange Concrete --------------------------------------------------------------------------------
    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    public static final Block ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            new ModCustomStairs(Blocks.WHITE_CONCRETE.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    public static final Block ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    //Block and Item register functions ------------------------------------------------------
    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, name), block);
    }
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ModItemGroup.VANILLA_EVOLVED_BLOCKS)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering ModBlocks for " + Main.MOD_ID);
    }
}
