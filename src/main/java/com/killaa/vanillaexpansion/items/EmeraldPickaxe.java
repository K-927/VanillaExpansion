package com.killaa.vanillaexpansion.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class EmeraldPickaxe extends ItemPickaxe{
	public EmeraldPickaxe(String unlocalizedName) {
		super(ModItems.EMERALD);
		
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabTools);
	}
}
