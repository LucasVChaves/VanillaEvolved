package net.fabricmc.VanillaEvolved.registries;

import net.fabricmc.VanillaEvolved.Main;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.minecraft.item.Items;

public class ModRegistries {
    public static void registerComposterFilling() {
        System.out.println("Now registering Fuels for " + Main.MOD_ID);

        CompostingChanceRegistry.INSTANCE.add(Items.ROTTEN_FLESH, 0.40f);
        CompostingChanceRegistry.INSTANCE.add(Items.BAMBOO, 0.25f);
        CompostingChanceRegistry.INSTANCE.add(Items.POISONOUS_POTATO, 0.40f);
    }
}
