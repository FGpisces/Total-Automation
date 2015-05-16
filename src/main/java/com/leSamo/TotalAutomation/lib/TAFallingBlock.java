package com.leSamo.TotalAutomation.lib;

import com.leSamo.TotalAutomation.TotalAutomation;
import com.leSamo.TotalAutomation.ref.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class TAFallingBlock extends BlockFalling {

	public TAFallingBlock(Material material) {
		super(material);
	}
	
	public TAFallingBlock() {
		this(Material.sand);
	}
	@Override
	public String getUnlocalizedName () {
		return String.format("tile.%s%s", Reference.MID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
}


