package com.leSamo.TotalAutomation.ref;

import com.leSamo.TotalAutomation.block.*;
import com.leSamo.TotalAutomation.lib.TABlock;
import com.leSamo.TotalAutomation.lib.TAFallingBlock;
import com.leSamo.TotalAutomation.lib.TATransparentBlock;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockReg {
	public static final TAFallingBlock PureSand = new PureSand();
	public static final TATransparentBlock PureGlass = new PureGlass();
	public static final TABlock Sifter = new Sifter();
	public static final TABlock MonaziteOre = new MonaziteOre();

	public static void init() {
		GameRegistry.registerBlock(PureSand, "PureSand");
		GameRegistry.registerBlock(PureGlass, "PureGlass");
		GameRegistry.registerBlock(Sifter, "Sifter");
		GameRegistry.registerBlock(MonaziteOre, "MonaziteOre");
	}
}