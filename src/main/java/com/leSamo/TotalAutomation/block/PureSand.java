package com.leSamo.TotalAutomation.block;

import com.leSamo.TotalAutomation.util.TACreativeTab;
import com.leSamo.TotalAutomation.util.TAFallingBlock;

public class PureSand extends TAFallingBlock {
	public PureSand() {
		super();
		this.setBlockName("puresand");
		this.setBlockTextureName("PureSand");
		this.setHardness(0.5F);
		this.setCreativeTab(TACreativeTab.TATab);
	}
}