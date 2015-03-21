package com.leSamo.TotalAutomation;

import net.minecraft.world.WorldType;

import com.leSamo.TotalAutomation.block.BlockReg;
import com.leSamo.TotalAutomation.han.GuiHandler;
import com.leSamo.TotalAutomation.item.ItemReg;
import com.leSamo.TotalAutomation.rec.TARecipes;
import com.leSamo.TotalAutomation.config.ConfigurationHandler;
import com.leSamo.TotalAutomation.proxy.IProxy;
import com.leSamo.TotalAutomation.ref.Reference;
import com.leSamo.TotalAutomation.wgen.WorldGenerator;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid=Reference.MID, name=Reference.MNAME, version=Reference.MVERSION)

public class TotalAutomation {
	
	@Mod.Instance(Reference.MID)
	public static TotalAutomation instance;
	
	@SidedProxy(clientSide=Reference.CPROXY, serverSide=Reference.SPROXY)
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
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){

	}
}
