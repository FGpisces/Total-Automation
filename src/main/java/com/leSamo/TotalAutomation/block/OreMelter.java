package com.leSamo.TotalAutomation.block;

import com.leSamo.TotalAutomation.util.TABlock;
import com.leSamo.TotalAutomation.util.TACreativeTab;

public class OreMelter extends TABlock {
	public OreMelter() {
		super();
		this.setBlockName("oremelter");
		this.setBlockTextureName("OreMelter");
		this.setHardness(1F);
		this.setCreativeTab(TACreativeTab.TATab);
	}
}