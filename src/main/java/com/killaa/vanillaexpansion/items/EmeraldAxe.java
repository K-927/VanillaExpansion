package com.killaa.vanillaexpansion.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class EmeraldAxe extends ItemAxe{
	public EmeraldAxe(String unlocalizedName) {
		super(ModItems.EMERALD);
		
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabTools);
	}
}
