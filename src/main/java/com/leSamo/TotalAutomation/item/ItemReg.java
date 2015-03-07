package com.leSamo.TotalAutomation.item;

import com.leSamo.TotalAutomation.item.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemReg {
	public static final TAItem CeriumItem = new CeriumItem();
	
	public static void init() {
		GameRegistry.registerItem(CeriumItem, "CeriumItem");
	}
}
