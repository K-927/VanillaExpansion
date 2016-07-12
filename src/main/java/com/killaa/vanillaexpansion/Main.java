package com.killaa.vanillaexpansion;

import com.killaa.vanillaexpansion.proxy.CommonProxy;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemFood;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main
{
    public static final String MODID = "vanillaexpansion";
    public static final String MODNAME = "Vanilla Expansion";
    public static final String VERSION = "1.0";
    
    @Instance
    public static Main instance = new Main();
    
    @SidedProxy(clientSide="com.killaa.vanillaexpansion.proxy.ClientProxy", serverSide="com.killaa.vanillaexpansion.proxy.ServerProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	this.proxy.preInit(e);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent e) {
    	this.proxy.init(e);
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	this.proxy.postInit(e);
    }
}
