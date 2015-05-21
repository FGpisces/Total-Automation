package com.leSamo.TotalAutomation.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
	    @Override
	    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
	        return null;
	    }
	 
	    @Override
	    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
	        if(ID == GUIs.ORE_MELTER.ordinal()) return new GuiOreMelter(player, world, x, y, z);
	        if(ID == GUIs.INGOT_FORMER.ordinal()) return new GuiIngotFormer(player, world, x, y, z);
	        if(ID == GUIs.SIFTER.ordinal()) return new GuiSifter(player, world, x, y, z);
	        else return null;
	    }
}
