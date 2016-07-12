package com.killaa.vanillaexpansion.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;

public interface IQualitizer {

	void getRandomToolQuality(ItemStack item, ToolMaterial material, EntityPlayer player);
	
}
