package com.leSamo.TotalAutomation.block;

import com.leSamo.TotalAutomation.lib.TACreativeTab;
import com.leSamo.TotalAutomation.lib.TATransparentBlock;

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