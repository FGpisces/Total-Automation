package com.leSamo.TotalAutomation.ref;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;

import com.leSamo.TotalAutomation.block.*;
import com.leSamo.TotalAutomation.lib.TATransparentBlock;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockReg {
	public static Block OreMelter = new OreMelter();
	public static Block IngotFormer = new IngotFormer();
	public static Block Sifter = new Sifter();
	public static BlockFalling PureSand = new PureSand();
	public static TATransparentBlock PureGlass = new PureGlass();
	public static Block MonaziteOre = new MonaziteOre();

	public static void init() {
		GameRegistry.registerBlock(OreMelter, "OreMelter");
		GameRegistry.registerBlock(IngotFormer, "IngotFormer");
		GameRegistry.registerBlock(Sifter, "Sifter");	
		GameRegistry.registerBlock(PureSand, "PureSand");
		GameRegistry.registerBlock(PureGlass, "PureGlass");
		GameRegistry.registerBlock(MonaziteOre, "MonaziteOre");
	}
}