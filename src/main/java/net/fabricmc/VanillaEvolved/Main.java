package net.fabricmc.VanillaEvolved;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.ItemGroup;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main implements ModInitializer {

	public static final ItemGroup CMD_ONLY_ITEM_GROUP = FabricItemGroupBuilder.create(new Identifier("vanilla_evolved_mod", "general"))
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
			})
			.build();


	public static final Logger LOGGER = LogManager.getLogger("vanilla_evolved_mod");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}
