package net.fabricmc.VanillaEvolved.item;

import net.fabricmc.VanillaEvolved.Main;
import net.fabricmc.VanillaEvolved.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ModItemGroup {
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
            .icon(() -> new ItemStack(ModBlocks.ANDESITE_BRICKS)).build();
}
