package com.leSamo.TotalAutomation.tile;

import net.minecraft.tileentity.TileEntity;

public class TileOreMelter extends TileEntity {
    int tick = 0;
    public static String name = "tileOreMelter";
    public String getName() {
 
        return name;
    }
 
    @Override
    public void updateEntity() {
 
        if(!worldObj.isRemote) {
 
            tick++;
            if(tick == 100) {
 
                this.worldObj.setWorldTime(1000);
                tick = 0;
            }
        }
    }
}
