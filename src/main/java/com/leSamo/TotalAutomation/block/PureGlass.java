package com.leSamo.TotalAutomation.block;

import com.leSamo.TotalAutomation.ctab.TACreativeTab;
import net.minecraft.block.material.Material;

public class PureGlass extends TABlock{
	public PureGlass() {
		super();
		this.setBlockName("pureglass");
		this.setBlockTextureName("PureGlass");
		this.setLightOpacity(1);
		this.setHardness(0.3F);
		this.setCreativeTab(TACreativeTab.TATab);
	}
}