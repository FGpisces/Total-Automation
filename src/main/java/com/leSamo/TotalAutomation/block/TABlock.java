package com.leSamo.TotalAutomation.block;

import com.leSamo.TotalAutomation.TotalAutomation;
import com.leSamo.TotalAutomation.han.GUIs;
import com.leSamo.TotalAutomation.han.OreMelterGui;
import com.leSamo.TotalAutomation.ref.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

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

	@Override
		public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int meta, float hitX, float hitY, float hitZ) {
			if(world.isRemote) {
				if (world.getTileEntity(x, y, z) != null)
					player.openGui(TotalAutomation.instance, GUIs.OREMELTER.ordinal(), world, x, y, z);
				return true;
			}
		return true;
    }
}


