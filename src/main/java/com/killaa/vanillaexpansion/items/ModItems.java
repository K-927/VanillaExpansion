package com.killaa.vanillaexpansion.items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {
	
	//Materials
	public static ToolMaterial EMERALD =	EnumHelper.addToolMaterial("EMERALD",	3, 864,  8.0F, 3.0F, 10);
	public static ToolMaterial ENDER =		EnumHelper.addToolMaterial("ENDER", 	3, 1056, 6.0F, 3.0F, 20);
	public static ToolMaterial GLASS =		EnumHelper.addToolMaterial("GLASS", 	2, 131, 12.0F, 3.0F, 25);
	public static ToolMaterial MALACHITE = 	EnumHelper.addToolMaterial("MALACHITE",	2, 250,  6.0F, 2.0F, 15);
	public static ToolMaterial NETHER = 	EnumHelper.addToolMaterial("NETHER", 	3, 1561, 6.0F, 4.0F, 15);
	public static ToolMaterial OBSIDIAN = 	EnumHelper.addToolMaterial("OBSIDIAN",	3, 2036, 4.0F, 2.0F, 10);
	public static ToolMaterial THALLIUM = 	EnumHelper.addToolMaterial("THALLIUM",	2, 322,  7.0F, 3.0F, 10); //Toxic
	public static ToolMaterial VANADIUM = 	EnumHelper.addToolMaterial("VANADIUM",	2, 1321, 5.0F, 1.0F,  5); //Weird Pattern, Unbreaking I
	
	public static ArmorMaterial EMERALD_ARMOR =		EnumHelper.addArmorMaterial("EMERALD_ARMOR",	null, 864,  new int[] {3,6,4,2}, 10); // 15
	public static ArmorMaterial ENDER_ARMOR =		EnumHelper.addArmorMaterial("ENDER_ARMOR",	 	null, 1056, new int[] {1,3,3,1}, 20); // 8
	public static ArmorMaterial GLASS_ARMOR =		EnumHelper.addArmorMaterial("GLASS_ARMOR",	 	null, 131,  new int[] {2,3,3,2}, 25); // 10
	public static ArmorMaterial MALACHITE_ARMOR =	EnumHelper.addArmorMaterial("MALACHITE_ARMOR",	null, 250,  new int[] {2,4,4,2}, 15); // 12
	public static ArmorMaterial NETHER_ARMOR = 		EnumHelper.addArmorMaterial("NETHER_ARMOR", 	null, 1561, new int[] {3,5,4,2}, 15); // 14 - Fire Resist. I (Full Set)
	public static ArmorMaterial OBSIDIAN_ARMOR = 	EnumHelper.addArmorMaterial("OBSIDIAN_ARMOR",	null, 2036, new int[] {3,8,6,3}, 10); // 20 - Slowness I,  Blast Resist. I
	public static ArmorMaterial THALLIUM_ARMOR = 	EnumHelper.addArmorMaterial("THALLIUM_ARMOR",	null, 322,  new int[] {1,4,2,1}, 10); // 8  - Poison -> Attacker 
	public static ArmorMaterial VANADIUM_ARMOR = 	EnumHelper.addArmorMaterial("VANADIUM_ARMOR",	null, 1321, new int[] {3,4,4,3},  5); // 14 - Weird Pattern, Unbreaking I 

	//Items
	public static Item testItem;
	
	//Shovel / Spades
	public static Item emeraldShovel;
	public static Item enderShovel;
	public static Item glassShovel;
	//public static Item netherShovel;
	//public static Item malachiteShovel;
	//public static Item obsidianShovel;
	//public static Item thalliumShovel;
	//public static Item vanadiumShovel;
	
	//Picks
	public static Item emeraldPickaxe;
	public static Item enderPickaxe;
	public static Item glassPickaxe;
	//public static Item malachitePickaxe;
	//public static Item netherPickaxe;
	//public static Item obsidianPickaxe;
	//public static Item thalliumPickaxe;
	//public static Item vanadiumPickaxe;
	
	//Hoes
	public static Item emeraldHoe;
	public static Item enderHoe;
	public static Item glassHoe;
	//public static Item malachiteHoe;
	//public static Item netherHoe;
	//public static Item obsidianHoe;
	//public static Item thalliumHoe;
	//public static Item vanadiumHoe;
	
	//Swords
	public static Item emeraldSword;
	public static Item enderSword;
	public static Item glassSword;
	//public static Item malachiteSword;
	//public static Item netherSword;
	//public static Item obsidianSword;
	//public static Item thalliumSword;
	//public static Item vanadiumSword;
	
	//Axe
	public static Item emeraldAxe;
	public static Item enderAxe;
	public static Item glassAxe;
	//public static Item malachiteAxe;
	//public static Item netherAxe;
	//public static Item obsidianAxe;
	//public static Item thalliumAxe;
	//public static Item vanadiumAxe;
	
	//Armor
	public static Item emeraldHelmet;
	public static Item emeraldChest;
	public static Item emeraldLegs;
	public static Item emeraldBoots;
	
	public static Item enderHelmet;
	public static Item enderChest;
	public static Item enderLegs;
	public static Item enderBoots;
	
	public static Item glassHelmet;
	public static Item glassChest;
	public static Item glassLegs;
	public static Item glassBoots;
	
	/*
	public static Item malachiteHelmet;
	public static Item malachiteChest;
	public static Item malachiteLegs;
	public static Item malachiteBoots;
	
	public static Item netherHelmet;
	public static Item netherChest;
	public static Item netherLegs;
	public static Item netherBoots;
	
	public static Item obsidianHelmet;
	public static Item obsidianChest;
	public static Item obsidianLegs;
	public static Item obsidianBoots;
	
	public static Item thalliumHelmet;
	public static Item thalliumChest;
	public static Item thalliumLegs;
	public static Item thalliumBoots;
	
	public static Item vanadiumHelmet;
	public static Item vanadiumChest;
	public static Item vanadiumLegs;
	public static Item vanadiumBoots;
	*/
	
	public static void createItems() {
		GameRegistry.registerItem(testItem = new TestItem("test_item"), "test_item");
		
		GameRegistry.registerItem(emeraldAxe = new EmeraldAxe("emerald_axe"), "emerald_axe");
		GameRegistry.registerItem(emeraldHoe = new EmeraldHoe("emerald_hoe"), "emerald_hoe");
		GameRegistry.registerItem(emeraldPickaxe = new EmeraldPickaxe("emerald_pickaxe"), "emerald_pickaxe");
		GameRegistry.registerItem(emeraldShovel= new EmeraldShovel("emerald_shovel"), "emerald_shovel");
		GameRegistry.registerItem(emeraldSword = new EmeraldSword("emerald_sword"), "emerald_sword");
		
		GameRegistry.registerItem(enderAxe = new EnderAxe("ender_axe"), "ender_axe");
		GameRegistry.registerItem(enderHoe = new EnderHoe("ender_hoe"), "ender_hoe");
		GameRegistry.registerItem(enderPickaxe = new EnderPickaxe("ender_pickaxe"), "ender_pickaxe");
		GameRegistry.registerItem(enderShovel= new EnderShovel("ender_shovel"), "ender_shovel");
		GameRegistry.registerItem(enderSword = new EnderSword("ender_sword"), "ender_sword");
		
		GameRegistry.registerItem(glassAxe = new GlassAxe("glass_axe"), "glass_axe");
		GameRegistry.registerItem(glassHoe = new GlassHoe("glass_hoe"), "glass_hoe");
		GameRegistry.registerItem(glassPickaxe = new GlassPickaxe("glass_pickaxe"), "glass_pickaxe");
		GameRegistry.registerItem(glassShovel= new GlassShovel("glass_shovel"), "glass_shovel");
		GameRegistry.registerItem(glassSword = new GlassSword("glass_sword"), "glass_sword");
		
		/*
		GameRegistry.registerItem(enderAxe = new MalachiteAxe("ender_axe"), "ender_axe");
		GameRegistry.registerItem(enderHoe = new MalachiteHoe("ender_hoe"), "ender_hoe");
		GameRegistry.registerItem(enderPickaxe = new MalachitePickaxe("ender_pickaxe"), "ender_pickaxe");
		GameRegistry.registerItem(enderShovel= new MalachiteShovel("ender_shovel"), "ender_shovel");
		GameRegistry.registerItem(enderSword = new MalachiteSword("ender_sword"), "ender_sword");
		
		GameRegistry.registerItem(enderAxe = new NetherAxe("ender_axe"), "ender_axe");
		GameRegistry.registerItem(enderHoe = new NetherHoe("ender_hoe"), "ender_hoe");
		GameRegistry.registerItem(enderPickaxe = new NetherPickaxe("ender_pickaxe"), "ender_pickaxe");
		GameRegistry.registerItem(enderShovel= new NetherShovel("ender_shovel"), "ender_shovel");
		GameRegistry.registerItem(enderSword = new NetherSword("ender_sword"), "ender_sword");
		
		GameRegistry.registerItem(obsidianAxe = new ObsidianAxe("obsidian_axe"), "obsidian_axe");
		GameRegistry.registerItem(obsidianHoe = new ObsidianHoe("obsidian_hoe"), "obsidian_hoe");
		GameRegistry.registerItem(obsidianPickaxe = new ObsidianPickaxe("obsidian_pickaxe"), "obsidian_pickaxe");
		GameRegistry.registerItem(obsidianShovel= new ObsidianShovel("obsidian_shovel"), "obsidian_shovel");
		GameRegistry.registerItem(obsidianSword = new ObsidianSword("obsidian_sword"), "obsidian_sword");
		
		GameRegistry.registerItem(thalliumAxe = new ThalliumAxe("thallium_axe"), "thallium_axe");
		GameRegistry.registerItem(thalliumHoe = new ThalliumHoe("thallium_hoe"), "thallium_hoe");
		GameRegistry.registerItem(thalliumPickaxe = new ThalliumPickaxe("thallium_pickaxe"), "thallium_pickaxe");
		GameRegistry.registerItem(thalliumShovel= new ThalliumShovel("thallium_shovel"), "thallium_shovel");
		GameRegistry.registerItem(thalliumSword = new ThalliumSword("thallium_sword"), "thallium_sword");
		
		GameRegistry.registerItem(vanadiumAxe = new VanadiumAxe("vanadium_axe"), "vanadium_axe");
		GameRegistry.registerItem(vanadiumHoe = new VanadiumHoe("vanadium_hoe"), "vanadium_hoe");
		GameRegistry.registerItem(vanadiumPickaxe = new VanadiumPickaxe("vanadium_pickaxe"), "vanadium_pickaxe");
		GameRegistry.registerItem(vanadiumShovel= new VanadiumShovel("vanadium_shovel"), "vanadium_shovel");
		GameRegistry.registerItem(vanadiumSword = new VanadiumSword("vanadium_sword"), "vanadium_sword");
		*/
	}
}
