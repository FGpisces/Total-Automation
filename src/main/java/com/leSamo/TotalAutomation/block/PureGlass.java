package com.leSamo.TotalAutomation.block;

import com.leSamo.TotalAutomation.util.TACreativeTab;
import com.leSamo.TotalAutomation.util.TATransparentBlock;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PureGlass extends TATransparentBlock{
	public PureGlass() {
		super();
		this.setBlockName("pureglass");
		this.setBlockTextureName("PureGlass");
		this.setLightOpacity(1);
		this.setHardness(0.3F);
		this.setCreativeTab(TACreativeTab.TATab);
	}
}