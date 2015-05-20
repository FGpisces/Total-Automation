package com.leSamo.TotalAutomation.block;

import com.leSamo.TotalAutomation.TotalAutomation;
import com.leSamo.TotalAutomation.client.GUIs;
import com.leSamo.TotalAutomation.lib.TABlock;
import com.leSamo.TotalAutomation.lib.TACreativeTab;
import com.leSamo.TotalAutomation.ref.*;
import com.leSamo.TotalAutomation.tile.TileIngotFormer;
import com.leSamo.TotalAutomation.tile.TileOreMelter;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class IngotFormer extends TABlock implements ITileEntityProvider {
	public IngotFormer() {
		super();
		this.setBlockName("ingotformer");
		this.setBlockTextureName("IngotFormer");
		this.setHardness(1F);
		this.setCreativeTab(TACreativeTab.TATab);
	}
	
	public TileIngotFormer TileEntity(World world, int meta){
		return new TileIngotFormer();
	}
	
	@Override
	public boolean hasTileEntity(int metadata){
		return true;
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return null;
	}
	
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityLiving, ItemStack itemStack){
		
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9){
		if (!player.isSneaking() && world.isRemote){
			player.openGui(TotalAutomation.instance, GUIs.INGOT_FORMER.ordinal(), world, x, y, z);
			return true;
		}
		else return true;
	}
}