package com.killaa.vanillaexpansion.items;

import java.util.Random;

import com.sun.xml.internal.stream.Entity;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class GlassSword extends VEItemSword{

	public GlassSword(String unlocalizedName) {
		super(ModItems.GLASS);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
	
	public void onCreated(ItemStack item, World world, EntityPlayer player) {
		this.getRandomToolQuality(item, ModItems.GLASS, player);
		
	}

}
