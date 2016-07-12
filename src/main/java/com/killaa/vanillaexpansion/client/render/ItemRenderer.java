package com.killaa.vanillaexpansion.client.render;

import com.killaa.vanillaexpansion.Main;
import com.killaa.vanillaexpansion.items.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRenderer {

	//Place Items to render here
	public static void registerItemRenderer() {
		register(ModItems.testItem);
		register(ModItems.emeraldAxe);
		register(ModItems.emeraldHoe);
		register(ModItems.emeraldPickaxe);
		register(ModItems.emeraldShovel);
		register(ModItems.emeraldSword);
		/*
		register(ModItems.emeraldBoots);
		register(ModItems.emeraldChestpiece);
		register(ModItems.emeraldHelmet);
		register(ModItems.emeraldLeggings);
		*/
	}
	
	//Convenience method
	public static void register(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Main.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
}
