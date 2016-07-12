package com.killaa.vanillaexpansion.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class GlassHoe extends ItemHoe{
	public GlassHoe(String unlocalizedName) {
		super(ModItems.GLASS);
		
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabTools);
	}
}
