package com.leSamo.TotalAutomation;

import com.leSamo.TotalAutomation.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

@Mod(modid="TotalAutomation", name="Total Automation", version="pre0.1a")

public class TotalAutomation {
	
	@Mod.Instance("TotalAutomation")
	public static TotalAutomation instance;
	
	@SidedProxy(clientSide= "", serverSide = "")
	public static IProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event){
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}