package com.leSamo.TotalAutomation.block;

import com.leSamo.TotalAutomation.lib.TABlock;
import com.leSamo.TotalAutomation.lib.TACreativeTab;

public class MonaziteOre extends TABlock {
	public MonaziteOre() {
		super();
		this.setBlockName("monaziteore");
		this.setBlockTextureName("MonaziteOre");
		this.setHardness(1F);
		this.setCreativeTab(TACreativeTab.TATab);
		this.setHarvestLevel("pickaxe", 3);
	}
}

