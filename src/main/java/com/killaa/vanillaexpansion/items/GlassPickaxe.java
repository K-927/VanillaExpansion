package com.killaa.vanillaexpansion.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GlassPickaxe extends VEItemPickaxe{
	public GlassPickaxe(String unlocalizedName) {
		super(ModItems.GLASS);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabTools);
	}
	
	public void onCreated(ItemStack item, World world, EntityPlayer player) {
		this.getRandomToolQuality(item, ModItems.GLASS, player);
	}
}
