package com.leSamo.TotalAutomation.proxy;

import com.leSamo.TotalAutomation.tile.TileOreMelter;

import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {
	  public void registerTileEntities() {
		  GameRegistry.registerTileEntity(TileOreMelter.class, "OreMelter");
	  }
}
