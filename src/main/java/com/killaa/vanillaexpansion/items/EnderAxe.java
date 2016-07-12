package com.killaa.vanillaexpansion.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class EnderAxe extends ItemAxe{
	public EnderAxe(String unlocalizedName) {
		super(ModItems.ENDER);
		
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabTools);
	}
}
