package net.fabricmc.VanillaEvolved;

import net.fabricmc.VanillaEvolved.blocks.custom.VEStairsBlock;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {

	public static final ItemGroup CMD_ONLY_ITEM_GROUP = FabricItemGroupBuilder.create(new Identifier("vanilla_evolved_mod", "cmd_only"))
			.icon(() -> new ItemStack(Blocks.COMMAND_BLOCK))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(Blocks.COMMAND_BLOCK));
				stacks.add(new ItemStack(Blocks.REPEATING_COMMAND_BLOCK));
				stacks.add(new ItemStack(Blocks.CHAIN_COMMAND_BLOCK));
				stacks.add(new ItemStack(Items.COMMAND_BLOCK_MINECART));
				stacks.add(new ItemStack(Blocks.LIGHT));
				stacks.add(new ItemStack(Blocks.BARRIER));
				stacks.add(new ItemStack(Blocks.STRUCTURE_VOID));
				stacks.add(new ItemStack(Blocks.STRUCTURE_BLOCK));
				stacks.add(new ItemStack(Blocks.JIGSAW));
				stacks.add(new ItemStack(Items.WRITTEN_BOOK));
				stacks.add(new ItemStack(Items.ENCHANTED_BOOK));
				stacks.add(new ItemStack(Items.KNOWLEDGE_BOOK));
				stacks.add(new ItemStack(Blocks.SPAWNER));
				stacks.add(new ItemStack(Items.DEBUG_STICK));
				stacks.add(new ItemStack(Blocks.PETRIFIED_OAK_SLAB));
				stacks.add(new ItemStack(Items.POTION));
				stacks.add(new ItemStack(Items.SPLASH_POTION));
				stacks.add(new ItemStack(Items.LINGERING_POTION));
				stacks.add(new ItemStack(Items.TIPPED_ARROW));
				stacks.add(new ItemStack(Blocks.DRAGON_EGG));
			}).build();
	public static final ItemGroup VANILLA_EVOLVED_BLOCKS = FabricItemGroupBuilder.create(new Identifier("vanilla_evolved_mod", "van_evolved_blocks"))
			.icon(() -> new ItemStack(Main.ANDESITE_BRICKS)).build();

	public static final Block KILN_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(3.50f).requiresTool());
	public static final Block ANDESITE_BRICKS = new Block(FabricBlockSettings.of(Material.STONE).strength(1.50f).requiresTool());
	public static final SlabBlock ANDESITE_BRICKS_SLAB = new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(1.50f).requiresTool());
	public static final StairsBlock ANDESITE_BRICKS_STAIRS = new VEStairsBlock(ANDESITE_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(1.50f).requiresTool());
	public static final WallBlock ANDESITE_BRICKS_WALL = new WallBlock(FabricBlockSettings.of(Material.STONE).strength(1.50f).requiresTool());
	public static final Block DIORITE_BRICKS = new Block(FabricBlockSettings.of(Material.STONE).strength(1.50f).requiresTool());
	public static final SlabBlock DIORITE_BRICKS_SLAB = new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(1.50f).requiresTool());
	public static final StairsBlock DIORITE_BRICKS_STAIRS = new VEStairsBlock(DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(1.50f).requiresTool());
	public static final Block GRANITE_BRICKS = new Block(FabricBlockSettings.of(Material.STONE).strength(1.50f).requiresTool());
	public static final SlabBlock GRANITE_BRICKS_SLAB = new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(1.50f).requiresTool());
	public static final StairsBlock GRANITE_BRICKS_STAIRS = new VEStairsBlock(GRANITE_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(1.50f).requiresTool());
	public static final SlabBlock WHITE_CONCRETE_SLAB = new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(1.8f).requiresTool());
	public static final StairsBlock WHITE_CONCRETE_STAIRS = new VEStairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(1.50f).requiresTool());
	public static final FenceGateBlock NETHER_BRICK_FENCE_GATE = new FenceGateBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool());

	@Override
	public void onInitialize() {
		//Compostable Rotten Flesh
		CompostingChanceRegistry.INSTANCE.add(Items.ROTTEN_FLESH, 0.40f);

		//Kiln
		Registry.register(Registry.BLOCK, new Identifier("vanilla_evolved_mod", "kiln"), KILN_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("vanilla_evolved_mod", "kiln"), new BlockItem(KILN_BLOCK, new FabricItemSettings().group(Main.VANILLA_EVOLVED_BLOCKS)));
		//Nether brick fence gate
		Registry.register(Registry.BLOCK, new Identifier("vanilla_evolved_mod", "nether_brick_fence_gate"), NETHER_BRICK_FENCE_GATE);
		Registry.register(Registry.ITEM, new Identifier("vanilla_evolved_mod", "nether_brick_fence_gate"), new BlockItem(NETHER_BRICK_FENCE_GATE, new FabricItemSettings().group(Main.VANILLA_EVOLVED_BLOCKS)));
		//Andesite bricks
		Registry.register(Registry.BLOCK, new Identifier("vanilla_evolved_mod", "andesite_bricks"), ANDESITE_BRICKS);
		Registry.register(Registry.ITEM, new Identifier("vanilla_evolved_mod", "andesite_bricks"), new BlockItem(ANDESITE_BRICKS, new FabricItemSettings().group(Main.VANILLA_EVOLVED_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("vanilla_evolved_mod", "andesite_bricks_slab"), ANDESITE_BRICKS_SLAB);
		Registry.register(Registry.ITEM, new Identifier("vanilla_evolved_mod", "andesite_bricks_slab"), new BlockItem(ANDESITE_BRICKS_SLAB, new FabricItemSettings().group(Main.VANILLA_EVOLVED_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("vanilla_evolved_mod", "andesite_bricks_stairs"), ANDESITE_BRICKS_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("vanilla_evolved_mod", "andesite_bricks_stairs"), new BlockItem(ANDESITE_BRICKS_STAIRS, new FabricItemSettings().group(Main.VANILLA_EVOLVED_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("vanilla_evolved_mod", "andesite_bricks_wall"), ANDESITE_BRICKS_WALL);
		Registry.register(Registry.ITEM, new Identifier("vanilla_evolved_mod", "andesite_bricks_wall"), new BlockItem(ANDESITE_BRICKS_WALL, new FabricItemSettings().group(Main.VANILLA_EVOLVED_BLOCKS)));
		//Diorite bricks
		Registry.register(Registry.BLOCK, new Identifier("vanilla_evolved_mod", "diorite_bricks"), DIORITE_BRICKS);
		Registry.register(Registry.ITEM, new Identifier("vanilla_evolved_mod", "diorite_bricks"), new BlockItem(DIORITE_BRICKS, new FabricItemSettings().group(Main.VANILLA_EVOLVED_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("vanilla_evolved_mod", "diorite_bricks_slab"), DIORITE_BRICKS_SLAB);
		Registry.register(Registry.ITEM, new Identifier("vanilla_evolved_mod", "diorite_bricks_slab"), new BlockItem(DIORITE_BRICKS_SLAB, new FabricItemSettings().group(Main.VANILLA_EVOLVED_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("vanilla_evolved_mod", "diorite_bricks_stairs"), DIORITE_BRICKS_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("vanilla_evolved_mod", "diorite_bricks_stairs"), new BlockItem(DIORITE_BRICKS_STAIRS, new FabricItemSettings().group(Main.VANILLA_EVOLVED_BLOCKS)));
		//Granite bricks
		Registry.register(Registry.BLOCK, new Identifier("vanilla_evolved_mod", "granite_bricks"), GRANITE_BRICKS);
		Registry.register(Registry.ITEM, new Identifier("vanilla_evolved_mod", "granite_bricks"), new BlockItem(GRANITE_BRICKS, new FabricItemSettings().group(Main.VANILLA_EVOLVED_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("vanilla_evolved_mod", "granite_bricks_slab"), GRANITE_BRICKS_SLAB);
		Registry.register(Registry.ITEM, new Identifier("vanilla_evolved_mod", "granite_bricks_slab"), new BlockItem(GRANITE_BRICKS_SLAB, new FabricItemSettings().group(Main.VANILLA_EVOLVED_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("vanilla_evolved_mod", "granite_bricks_stairs"), GRANITE_BRICKS_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("vanilla_evolved_mod", "granite_bricks_stairs"), new BlockItem(GRANITE_BRICKS_STAIRS, new FabricItemSettings().group(Main.VANILLA_EVOLVED_BLOCKS)));
		//White concrete
		Registry.register(Registry.BLOCK, new Identifier("vanilla_evolved_mod", "white_concrete_slab"), WHITE_CONCRETE_SLAB);
		Registry.register(Registry.ITEM, new Identifier("vanilla_evolved_mod", "white_concrete_slab"), new BlockItem(WHITE_CONCRETE_SLAB, new FabricItemSettings().group(Main.VANILLA_EVOLVED_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("vanilla_evolved_mod", "white_concrete_stairs"), WHITE_CONCRETE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("vanilla_evolved_mod", "white_concrete_stairs"), new BlockItem(WHITE_CONCRETE_STAIRS, new FabricItemSettings().group(Main.VANILLA_EVOLVED_BLOCKS)));
	}
}
