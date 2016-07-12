package com.killaa.vanillaexpansion.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class EmeraldSword extends ItemSword{

	public EmeraldSword(String unlocalizedName) {
		super(ModItems.EMERALD);
		
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabCombat);
		
	}
}
