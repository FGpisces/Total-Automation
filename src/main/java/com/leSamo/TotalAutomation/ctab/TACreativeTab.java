package com.leSamo.TotalAutomation.ctab;

import com.leSamo.TotalAutomation.item.ItemReg;
import com.leSamo.TotalAutomation.ref.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TACreativeTab {
	public static final CreativeTabs TATab = new CreativeTabs(Reference.MID) {
		@Override
		public Item getTabIconItem() {
			return ItemReg.CeriumItem;
		}
	};
}
