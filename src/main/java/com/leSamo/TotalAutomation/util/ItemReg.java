package com.leSamo.TotalAutomation.util;

import com.leSamo.TotalAutomation.util.TAItem;
import com.leSamo.TotalAutomation.item.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemReg {
	public static final TAItem CeriumItem = (TAItem) new Cerium().setMaxStackSize(1);
	public static final TAItem IronChipset = new IronChipset();
	public static final TAItem GoldenChipset = new GoldenChipset();
	public static final TAItem DiamondChipset = new DiamondChipset();
	public static final TAItem EmeraldChipset = new EmeraldChipset();
	public static final TAItem Silicon = new Silicon();
	
	public static void init() {
		GameRegistry.registerItem(CeriumItem, "CeriumItem");
		GameRegistry.registerItem(IronChipset, "IronChipset");
		GameRegistry.registerItem(GoldenChipset, "GoldenChipset");
		GameRegistry.registerItem(DiamondChipset, "DiamondChipset");
		GameRegistry.registerItem(EmeraldChipset, "EmeraldChipset");
		GameRegistry.registerItem(Silicon, "Silicon");
	}
}
