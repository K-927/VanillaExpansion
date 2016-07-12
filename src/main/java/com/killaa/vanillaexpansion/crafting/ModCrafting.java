package com.killaa.vanillaexpansion.crafting;

import com.killaa.vanillaexpansion.items.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void initCrafting() {
		
		//Swords
		GameRegistry.addRecipe(new ItemStack(ModItems.emeraldSword), new Object[] {" # ", " # ", " I ", '#', Items.emerald, 'I', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ModItems.glassSword), new Object[] {" # ", " # ", " I ", '#', Blocks.glass_pane, 'I', Items.stick});
	}

}
