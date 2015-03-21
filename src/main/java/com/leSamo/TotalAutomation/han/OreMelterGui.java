package com.leSamo.TotalAutomation.han;

import com.leSamo.TotalAutomation.ref.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class OreMelterGui {
	 
	     private int x, y, z;
	     private EntityPlayer player;
	     private World world;
	     private int xSize, ySize;
	   
	     public OreMelterGui(EntityPlayer player, World world, int x, int y, int z) {
	   
	          this.x = x;
	          this.y = y;
	          this.z = z;
	          this.player = player;
	          this.world = world;
	          xSize = 176;
	          ySize = 214;
	      }
	      private ResourceLocation backgroundimage = new ResourceLocation(Reference.MID.toLowerCase() + ":" + "textures/client/gui/GuiSmasher.png");    
}