package com.leSamo.TotalAutomation.block;

import com.leSamo.TotalAutomation.ctab.TACreativeTab;
import net.minecraft.block.material.Material;

public class PureSand extends TABlock {
	public PureSand() {
		super();
		this.setBlockName("puresand");
		this.setBlockTextureName("PureSand");
		this.setHardness(0.5F);
		this.setCreativeTab(TACreativeTab.TATab);
	}
}