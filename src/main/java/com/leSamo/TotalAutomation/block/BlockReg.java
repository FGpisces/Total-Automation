package com.leSamo.TotalAutomation.block;

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