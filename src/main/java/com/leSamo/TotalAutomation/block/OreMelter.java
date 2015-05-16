package com.leSamo.TotalAutomation.block;

import com.leSamo.TotalAutomation.lib.TABlock;
import com.leSamo.TotalAutomation.lib.TACreativeTab;

import net.minecraft.block.Block;

public class OreMelter extends TABlock {
	public OreMelter() {
		super();
		this.setBlockName("oreMelter");
		this.setBlockTextureName("OreMelter");
		this.setHardness(1F);
		this.setCreativeTab(TACreativeTab.TATab);
	}
}