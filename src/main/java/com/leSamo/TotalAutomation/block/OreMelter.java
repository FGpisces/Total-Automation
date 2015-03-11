package com.leSamo.TotalAutomation.block;

import com.leSamo.TotalAutomation.ctab.TACreativeTab;
import net.minecraft.block.material.Material;

public class OreMelter extends TABlock {
	public OreMelter() {
		super();
		this.setBlockName("oremelter");
		this.setBlockTextureName("OreMelter");
		this.setHardness(1F);
		this.setCreativeTab(TACreativeTab.TATab);
	}
}