package com.leSamo.TotalAutomation.tile;

import com.leSamo.TotalAutomation.TotalAutomation;
import com.leSamo.TotalAutomation.client.GUIs;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TileOreMelter extends TileEntity {
    int tick = 0;
    public static String name = "oremelter";
    public String getName() {
 
        return name;
    }
 
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int meta, float hitX, float hitY, float hitZ) {
        if(world.isRemote) {
            if (world.getTileEntity(x, y, z) != null)
                player.openGui(TotalAutomation.instance, GUIs.ORE_MELTER.ordinal(), world, x, y, z);
            return true;
        }
        return true;
    }
}