package com.leSamo.TotalAutomation.item;

import com.leSamo.TotalAutomation.item.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemReg {
	public static final TAItem CeriumItem = new CeriumItem();
	public static final TAItem IronChipset = new IronChipset();
	public static final TAItem GoldenChipset = new GoldenChipset();
	public static final TAItem DiamondChipset = new DiamondChipset();
	public static final TAItem EmeraldChipset = new EmeraldChipset();
	
	public static void init() {
		GameRegistry.registerItem(CeriumItem, "CeriumItem");
		GameRegistry.registerItem(IronChipset, "IronChipset");
		GameRegistry.registerItem(GoldenChipset, "GoldenChipset");
		GameRegistry.registerItem(DiamondChipset, "DiamondChipset");
		GameRegistry.registerItem(EmeraldChipset, "EmeraldChipset");
	}
}
