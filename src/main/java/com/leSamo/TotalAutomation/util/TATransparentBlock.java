package com.leSamo.TotalAutomation.util;

import com.leSamo.TotalAutomation.util.BlockReg;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.util.Facing;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TATransparentBlock extends BlockBreakable{
	
	private static boolean field_149996_a;
    private static String field_149995_b;
    
	public TATransparentBlock(Material material) {
		super(field_149995_b, material, field_149996_a);
	}
	
	public TATransparentBlock() {
		this(Material.glass);
	}
	@Override
	public String getUnlocalizedName () {
		return String.format("tile.%s%s", Ref.MID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
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