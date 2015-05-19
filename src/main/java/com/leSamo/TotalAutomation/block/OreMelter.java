package com.leSamo.TotalAutomation.block;

import com.leSamo.TotalAutomation.TotalAutomation;
import com.leSamo.TotalAutomation.lib.TABlock;
import com.leSamo.TotalAutomation.lib.TACreativeTab;
import com.leSamo.TotalAutomation.ref.*;
import com.leSamo.TotalAutomation.tile.TileOreMelter;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class OreMelter extends TABlock implements ITileEntityProvider {
	public OreMelter() {
		super();
		this.setBlockName("oreMelter");
		this.setBlockTextureName("OreMelter");
		this.setHardness(1F);
		this.setCreativeTab(TACreativeTab.TATab);
	}
	
	@Override
	public TileOreMelter TileEntity(World world, int meta){
		return new TileOreMelter();
	}
	
	@Override
	public boolean hasTileEntity(int metadata){
		return true;
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return null;
	}
}