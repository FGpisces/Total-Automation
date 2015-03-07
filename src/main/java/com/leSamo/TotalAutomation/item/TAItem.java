package com.leSamo.TotalAutomation.item;

import com.leSamo.TotalAutomation.ref.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TAItem extends Item {
	
	public TAItem() {
		super();
	}
	
	@Override
	public String getUnlocalizedName () {
		return String.format("item.%s%s", Reference.MID.toLowerCase(), getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		return String.format("item.%s%s", Reference.MID.toLowerCase(), getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf("." + 1));
	}
}
