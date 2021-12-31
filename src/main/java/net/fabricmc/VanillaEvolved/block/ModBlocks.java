package net.fabricmc.VanillaEvolved.block;

import net.fabricmc.VanillaEvolved.Main;
import net.fabricmc.VanillaEvolved.block.custom.ModCustomStairs;
import net.fabricmc.VanillaEvolved.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
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

    //Calcite -----------------------------------------------------------------------------------
    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(0.75f).requiresTool()));

    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
            new ModCustomStairs(Blocks.CALCITE.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(0.75f).requiresTool()));

    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(0.75f).requiresTool()));

    //Smooth Basalt -----------------------------------------------------------------------------------
    public static final Block SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(1.25f).requiresTool()));

    public static final Block SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            new ModCustomStairs(Blocks.SMOOTH_BASALT.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(1.25f).requiresTool()));

    public static final Block SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(1.25f).requiresTool()));

    //Tuff -----------------------------------------------------------------------------------
    public static final Block TUFF_SLAB = registerBlock("tuff_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(1.5f).requiresTool().sounds(BlockSoundGroup.TUFF)));

    public static final Block TUFF_STAIRS = registerBlock("tuff_stairs",
            new ModCustomStairs(Blocks.TUFF.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(1.5f).requiresTool().sounds(BlockSoundGroup.TUFF)));

    public static final Block TUFF_WALL = registerBlock("tuff_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(1.5f).requiresTool().sounds(BlockSoundGroup.TUFF)));

    //Amethyst -----------------------------------------------------------------------------------
    public static final Block AMETHYST_SLAB = registerBlock("amethyst_slab",
            new SlabBlock(FabricBlockSettings.of(Material.AMETHYST).strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block AMETHYST_STAIRS = registerBlock("amethyst_stairs",
            new ModCustomStairs(Blocks.AMETHYST_BLOCK.getDefaultState(), FabricBlockSettings.of(Material.AMETHYST).strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block AMETHYST_WALL = registerBlock("amethyst_wall",
            new WallBlock(FabricBlockSettings.of(Material.AMETHYST).strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

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

    //Magenta Concrete --------------------------------------------------------------------------------
    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    public static final Block MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            new ModCustomStairs(Blocks.WHITE_CONCRETE.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    public static final Block MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    //Light Blue Concrete --------------------------------------------------------------------------------
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            new ModCustomStairs(Blocks.WHITE_CONCRETE.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    //Yellow Concrete --------------------------------------------------------------------------------
    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    public static final Block YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            new ModCustomStairs(Blocks.WHITE_CONCRETE.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    public static final Block YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    //Lime Concrete --------------------------------------------------------------------------------
    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    public static final Block LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            new ModCustomStairs(Blocks.WHITE_CONCRETE.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    public static final Block LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    //Pink Concrete --------------------------------------------------------------------------------
    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    public static final Block PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            new ModCustomStairs(Blocks.WHITE_CONCRETE.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    public static final Block PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    //Light Gray Concrete --------------------------------------------------------------------------------
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            new ModCustomStairs(Blocks.WHITE_CONCRETE.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    //Light Gray Concrete --------------------------------------------------------------------------------
    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    public static final Block GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            new ModCustomStairs(Blocks.WHITE_CONCRETE.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    public static final Block GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    //Cyan Concrete --------------------------------------------------------------------------------
    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    public static final Block CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            new ModCustomStairs(Blocks.WHITE_CONCRETE.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    public static final Block CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    //Purple Concrete --------------------------------------------------------------------------------
    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    public static final Block PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            new ModCustomStairs(Blocks.WHITE_CONCRETE.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    public static final Block PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    //Blue Concrete --------------------------------------------------------------------------------
    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    public static final Block BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            new ModCustomStairs(Blocks.WHITE_CONCRETE.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    public static final Block BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    //Brown Concrete --------------------------------------------------------------------------------
    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    public static final Block BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            new ModCustomStairs(Blocks.WHITE_CONCRETE.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    public static final Block BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    //Green Concrete --------------------------------------------------------------------------------
    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    public static final Block GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            new ModCustomStairs(Blocks.WHITE_CONCRETE.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    public static final Block GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    //Red Concrete --------------------------------------------------------------------------------
    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    public static final Block RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            new ModCustomStairs(Blocks.WHITE_CONCRETE.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    public static final Block RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    //Black Concrete --------------------------------------------------------------------------------
    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    public static final Block BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            new ModCustomStairs(Blocks.WHITE_CONCRETE.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    public static final Block BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(1.80f).requiresTool()));

    //White Lantern --------------------------------------------------------------------------------
    public static final Block WHITE_LANTERN = registerBlock("white_lantern",
            new LanternBlock(FabricBlockSettings.of(Material.DECORATION).sounds(BlockSoundGroup.LANTERN).strength(3.50f).requiresTool().luminance(15)));

    //Orange Lantern --------------------------------------------------------------------------------
    public static final Block ORANGE_LANTERN = registerBlock("orange_lantern",
            new LanternBlock(FabricBlockSettings.of(Material.DECORATION).sounds(BlockSoundGroup.LANTERN).strength(3.50f).requiresTool().luminance(15)));

    //Magenta Lantern --------------------------------------------------------------------------------
    public static final Block MAGENTA_LANTERN = registerBlock("magenta_lantern",
            new LanternBlock(FabricBlockSettings.of(Material.DECORATION).sounds(BlockSoundGroup.LANTERN).strength(3.50f).requiresTool().luminance(15)));

    //Light Blue Lantern --------------------------------------------------------------------------------
    public static final Block LIGHT_BLUE_LANTERN = registerBlock("light_blue_lantern",
            new LanternBlock(FabricBlockSettings.of(Material.DECORATION).sounds(BlockSoundGroup.LANTERN).strength(3.50f).requiresTool().luminance(15)));

    //Yellow Lantern --------------------------------------------------------------------------------
    public static final Block YELLOW_LANTERN = registerBlock("yellow_lantern",
            new LanternBlock(FabricBlockSettings.of(Material.DECORATION).sounds(BlockSoundGroup.LANTERN).strength(3.50f).requiresTool().luminance(15)));

    //Lime Lantern --------------------------------------------------------------------------------
    public static final Block LIME_LANTERN = registerBlock("lime_lantern",
            new LanternBlock(FabricBlockSettings.of(Material.DECORATION).sounds(BlockSoundGroup.LANTERN).strength(3.50f).requiresTool().luminance(15)));

    //Pink Lantern --------------------------------------------------------------------------------
    public static final Block PINK_LANTERN = registerBlock("pink_lantern",
            new LanternBlock(FabricBlockSettings.of(Material.DECORATION).sounds(BlockSoundGroup.LANTERN).strength(3.50f).requiresTool().luminance(15)));

    //Light Gray Lantern --------------------------------------------------------------------------------
    public static final Block LIGHT_GRAY_LANTERN = registerBlock("light_gray_lantern",
            new LanternBlock(FabricBlockSettings.of(Material.DECORATION).sounds(BlockSoundGroup.LANTERN).strength(3.50f).requiresTool().luminance(15)));

    //Dark Gray Lantern --------------------------------------------------------------------------------
    public static final Block GRAY_LANTERN = registerBlock("gray_lantern",
            new LanternBlock(FabricBlockSettings.of(Material.DECORATION).sounds(BlockSoundGroup.LANTERN).strength(3.50f).requiresTool().luminance(15)));

    //Cyan Lantern --------------------------------------------------------------------------------
    public static final Block CYAN_LANTERN = registerBlock("cyan_lantern",
            new LanternBlock(FabricBlockSettings.of(Material.DECORATION).sounds(BlockSoundGroup.LANTERN).strength(3.50f).requiresTool().luminance(15)));

    //Purple Lantern --------------------------------------------------------------------------------
    public static final Block PURPLE_LANTERN = registerBlock("purple_lantern",
            new LanternBlock(FabricBlockSettings.of(Material.DECORATION).sounds(BlockSoundGroup.LANTERN).strength(3.50f).requiresTool().luminance(15)));

    //Blue Lantern --------------------------------------------------------------------------------
    public static final Block BLUE_LANTERN = registerBlock("blue_lantern",
            new LanternBlock(FabricBlockSettings.of(Material.DECORATION).sounds(BlockSoundGroup.LANTERN).strength(3.50f).requiresTool().luminance(15)));

    //Brown Lantern --------------------------------------------------------------------------------
    public static final Block BROWN_LANTERN = registerBlock("brown_lantern",
            new LanternBlock(FabricBlockSettings.of(Material.DECORATION).sounds(BlockSoundGroup.LANTERN).strength(3.50f).requiresTool().luminance(15)));

    //Green Lantern --------------------------------------------------------------------------------
    public static final Block GREEN_LANTERN = registerBlock("green_lantern",
            new LanternBlock(FabricBlockSettings.of(Material.DECORATION).sounds(BlockSoundGroup.LANTERN).strength(3.50f).requiresTool().luminance(15)));

    //Red Lantern --------------------------------------------------------------------------------
    public static final Block RED_LANTERN = registerBlock("red_lantern",
            new LanternBlock(FabricBlockSettings.of(Material.DECORATION).sounds(BlockSoundGroup.LANTERN).strength(3.50f).requiresTool().luminance(15)));

    //Black Lantern --------------------------------------------------------------------------------
    public static final Block BLACK_LANTERN = registerBlock("black_lantern",
            new LanternBlock(FabricBlockSettings.of(Material.DECORATION).sounds(BlockSoundGroup.LANTERN).strength(3.50f).requiresTool().luminance(15)));

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
