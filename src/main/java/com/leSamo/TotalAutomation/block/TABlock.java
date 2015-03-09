package com.leSamo.TotalAutomation.block;

import com.leSamo.TotalAutomation.ref.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class TABlock extends Block {

	public TABlock(Material material) {
		super(material);
	}
	
	public TABlock() {
		this(Material.glass);
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
	@SideOnly(Side.CLIENT)
	public int getRenderBlockPass()	{
	    return 0;
	}

	public boolean renderAsNormalBlock() {
	    return false;
	}
}


