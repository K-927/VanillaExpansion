package com.killaa.vanillaexpansion.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class GlassAxe extends ItemAxe{
	public GlassAxe(String unlocalizedName) {
		super(ModItems.GLASS);
		
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabTools);
	}
}
