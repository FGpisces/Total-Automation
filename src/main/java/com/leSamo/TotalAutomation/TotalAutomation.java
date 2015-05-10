package com.leSamo.TotalAutomation;

import com.leSamo.TotalAutomation.util.BlockReg;
import com.leSamo.TotalAutomation.util.ItemReg;
import com.leSamo.TotalAutomation.util.ConfigurationHandler;
import com.leSamo.TotalAutomation.proxy.IProxy;
import com.leSamo.TotalAutomation.util.Ref;
import com.leSamo.TotalAutomation.util.TARecipes;
import com.leSamo.TotalAutomation.wgen.WorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid=Ref.MID, name=Ref.MNAME, version=Ref.MVERSION)

public class TotalAutomation {
	
	@Mod.Instance(Ref.MID)
	public static TotalAutomation instance;
	
	@SidedProxy(clientSide=Ref.CPROXY, serverSide=Ref.SPROXY)
	public static IProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		
		ItemReg.init();
		BlockReg.init();
		WorldGenerator.initWorldGen();
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event){
		TARecipes.init();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){

	}
}
