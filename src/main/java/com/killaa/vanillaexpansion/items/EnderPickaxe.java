package com.killaa.vanillaexpansion.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class EnderPickaxe extends ItemPickaxe{
	public EnderPickaxe(String unlocalizedName) {
		super(ModItems.ENDER);
		
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabTools);
	}
}
