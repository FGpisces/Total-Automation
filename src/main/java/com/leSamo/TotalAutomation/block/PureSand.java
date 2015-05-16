package com.leSamo.TotalAutomation.block;

import com.leSamo.TotalAutomation.lib.TACreativeTab;
import com.leSamo.TotalAutomation.lib.TAFallingBlock;

public class PureSand extends TAFallingBlock {
	public PureSand() {
		super();
		this.setBlockName("puresand");
		this.setBlockTextureName("PureSand");
		this.setHardness(0.5F);
		this.setCreativeTab(TACreativeTab.TATab);
		this.setHarvestLevel("shovel", 1);
	}
}