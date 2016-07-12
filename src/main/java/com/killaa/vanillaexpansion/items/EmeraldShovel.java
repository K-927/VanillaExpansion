package com.killaa.vanillaexpansion.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class EmeraldShovel extends ItemSpade{
	public EmeraldShovel(String unlocalizedName) {
		super(ModItems.EMERALD);
		
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabTools);
	}
}
