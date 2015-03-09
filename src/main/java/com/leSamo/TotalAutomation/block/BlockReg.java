package com.leSamo.TotalAutomation.block;

import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;

import com.leSamo.TotalAutomation.block.*;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockReg {
	public static final TABlock PureSand = new PureSand();
	public static final TABlock PureGlass = new PureGlass();

	public static void init() {
		GameRegistry.registerBlock(PureSand, "PureSand");
		GameRegistry.registerBlock(PureGlass, "PureGlass");
	}
}