package com.leSamo.TotalAutomation.block;

import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;

import com.leSamo.TotalAutomation.block.*;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockReg {
	public static final TABlock PureSand = new PureSand();
	public static final TABlock PureGlass = new PureGlass();
	public static final TABlock OreMelter = new OreMelter();
	public static final TABlock Sifter = new Sifter();

	public static void init() {
		GameRegistry.registerBlock(PureSand, "PureSand");
		GameRegistry.registerBlock(PureGlass, "PureGlass");
		GameRegistry.registerBlock(OreMelter, "OreMelter");
		GameRegistry.registerBlock(Sifter, "Sifter");
	}
}