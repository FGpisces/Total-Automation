package com.leSamo.TotalAutomation;

import com.leSamo.TotalAutomation.proxy.IProxy;
import com.leSamo.TotalAutomation.ref.BlockReg;
import com.leSamo.TotalAutomation.ref.ItemReg;
import com.leSamo.TotalAutomation.ref.RecipesReg;
import com.leSamo.TotalAutomation.ref.Reference;
import com.leSamo.TotalAutomation.world.WorldGenerator;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

@Mod(modid=Reference.MID, name=Reference.MNAME, version=Reference.MVERSION)

public class TotalAutomation {
	
	@Mod.Instance(Reference.MID)
	public static TotalAutomation instance;
	
	@SidedProxy(clientSide=Reference.CPROXY, serverSide=Reference.SPROXY)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){	
		ItemReg.init();
		BlockReg.init();
		WorldGenerator.initWorldGen();
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event){
		RecipesReg.init();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
