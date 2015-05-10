package com.leSamo.TotalAutomation.util;

import com.leSamo.TotalAutomation.util.ItemReg;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class TACreativeTab {
	public static final CreativeTabs TATab = new CreativeTabs(Ref.MID) {
		@Override
		public Item getTabIconItem() {
			return Items.apple;
		}
	};
}
