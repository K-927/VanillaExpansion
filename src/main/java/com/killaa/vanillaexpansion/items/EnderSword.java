package com.killaa.vanillaexpansion.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class EnderSword extends ItemSword{

	public EnderSword(String unlocalizedName) {
		super(ModItems.ENDER);
		
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabCombat);
		
	}
}
