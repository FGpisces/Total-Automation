package com.leSamo.TotalAutomation.lib;

import com.leSamo.TotalAutomation.ref.ItemReg;
import com.leSamo.TotalAutomation.ref.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class TACreativeTab {
	
	public static final CreativeTabs TATab = new CreativeTabs(Reference.MID) {
		@Override
		public Item getTabIconItem() {
			return Items.apple;
		}
		
		public boolean hasSearchBar()
	    {
	        return true;
	    }
	};
}
