package com.killaa.vanillaexpansion.items;

import java.util.Random;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ChatComponentTranslation;

	

public class VEItemSword extends ItemSword implements IQualitizer{
	
	public static boolean generateQualities;

	//Quality chance thresholds
	public static final int masChanceThreshold = 5;
	public static final int sprChanceThreshold = 18;
	public static final int fneChanceThreshold = 30;
	public static final int stdChanceThreshold = 80;
	public static final int crdChanceThreshold = 87;
	public static final int bknChanceThreshold = 95;
	
	//How much XP should be given when these qualities are crafted
	public static final int masXPGrant = 100;
	public static final int sprXPGrant = 50;
	public static final int fneXPGrant = 25;
	
	public VEItemSword(ToolMaterial material) {
		super(material);
	}
	
	
	@Override
	public void getRandomToolQuality(ItemStack item, ToolMaterial material, EntityPlayer player) {
		Random r = new Random();
		int quality = r.nextInt(100);
		
		if(quality<=masChanceThreshold) {
			item.setStackDisplayName("Masterful " + item.getDisplayName());
			item.addEnchantment(Enchantment.sharpness, 2);
			item.addEnchantment(Enchantment.unbreaking, 2);
			player.addExperience(r.nextInt(masXPGrant));
			player.addChatMessage(new ChatComponentTranslation("msg.masterful_sword.txt"));
		} 
		else if(quality<=sprChanceThreshold) {
			item.setStackDisplayName("Superior " + item.getDisplayName());
			item.addEnchantment(Enchantment.sharpness, 1);
			item.addEnchantment(Enchantment.unbreaking, 1);
			player.addExperience(r.nextInt(sprXPGrant));
		} 
		else if(quality<fneChanceThreshold) {
			item.setStackDisplayName("Fine " + item.getDisplayName());
			item.addEnchantment(Enchantment.sharpness, 1);
			player.addExperience(r.nextInt(fneXPGrant));	
		} 
		else if(quality<=stdChanceThreshold) {
			// Standard Quality
		}
		else if(quality<=crdChanceThreshold) {
			item.setStackDisplayName("Crude " + item.getDisplayName());
			item.damageItem((int) (material.getMaxUses() * 0.25), player);
		}
		else if(quality<=bknChanceThreshold) {
			item.setStackDisplayName("Broken " + item.getDisplayName());
			item.damageItem((int) (material.getMaxUses() * 0.50), player);
		}
	}
	
}
