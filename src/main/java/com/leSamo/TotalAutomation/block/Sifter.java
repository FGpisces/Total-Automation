package com.leSamo.TotalAutomation.block;

import com.leSamo.TotalAutomation.ctab.TACreativeTab;
import net.minecraft.block.material.Material;

public class Sifter extends TABlock {
	public Sifter() {
		super();
		this.setBlockName("sifter");
		this.setBlockTextureName("Sifter");
		this.setHardness(1F);
		this.setCreativeTab(TACreativeTab.TATab);
	}
}