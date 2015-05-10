package com.leSamo.TotalAutomation.util;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;

import com.leSamo.TotalAutomation.block.*;

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