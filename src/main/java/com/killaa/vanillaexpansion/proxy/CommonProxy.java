package com.killaa.vanillaexpansion.proxy;

import com.killaa.vanillaexpansion.crafting.ModCrafting;
import com.killaa.vanillaexpansion.items.ModItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	

	    public void preInit(FMLPreInitializationEvent e) {
	    	ModItems.createItems();
	    }
    

	    public void init(FMLInitializationEvent e)  {
	    	ModCrafting.initCrafting();
	    }

	 
	    public void postInit(FMLPostInitializationEvent e) {
	    }
}
