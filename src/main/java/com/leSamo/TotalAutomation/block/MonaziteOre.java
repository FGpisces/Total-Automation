package com.leSamo.TotalAutomation.block;

import com.leSamo.TotalAutomation.ctab.TACreativeTab;
import net.minecraft.block.material.Material;

public class MonaziteOre extends TABlock {
	public MonaziteOre() {
		super();
		this.setBlockName("monaziteore");
		this.setBlockTextureName("MonaziteOre");
		this.setHardness(0.5F);
		this.setCreativeTab(TACreativeTab.TATab);
	}
}

