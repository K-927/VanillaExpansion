package com.killaa.vanillaexpansion.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class EmeraldHoe extends ItemHoe{
	public EmeraldHoe(String unlocalizedName) {
		super(ModItems.EMERALD);
		
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabTools);
	}
}
