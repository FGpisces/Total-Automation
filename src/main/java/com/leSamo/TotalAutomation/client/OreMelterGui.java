package com.leSamo.TotalAutomation.client;

import com.leSamo.TotalAutomation.block.OreMelter;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class OreMelterGui extends GuiContainer{
	 public OreMelterGui()
	    {
	        super(null);
	        xSize = 176;
	        ySize = 161;
	    }
	 
	    @Override
	    protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3)
	    {
	    	
	    }
}