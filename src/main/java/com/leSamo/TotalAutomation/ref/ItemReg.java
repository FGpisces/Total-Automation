package com.leSamo.TotalAutomation.ref;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.leSamo.TotalAutomation.item.*;
import com.leSamo.TotalAutomation.lib.TAItem;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemReg {

	public static Item Cerium;

	public static void init() {
		Item Cerium;
		Item IronChipset;
		Item GoldenChipset;
		Item DiamondChipset;
		Item EmeraldChipset;
		Item Silicon;
	
		Cerium = new Cerium().setMaxStackSize(64);
		IronChipset = new IronChipset().setMaxStackSize(1);
		GoldenChipset = new GoldenChipset().setMaxStackSize(1);
		DiamondChipset = new DiamondChipset().setMaxStackSize(1);
		EmeraldChipset = new EmeraldChipset().setMaxStackSize(1);
		Silicon = new Silicon().setMaxStackSize(64);

		GameRegistry.registerItem(Cerium, "Cerium");
		GameRegistry.registerItem(IronChipset, "IronChipset");
		GameRegistry.registerItem(GoldenChipset, "GoldenChipset");
		GameRegistry.registerItem(DiamondChipset, "DiamondChipset");
		GameRegistry.registerItem(EmeraldChipset, "EmeraldChipset");
		GameRegistry.registerItem(Silicon, "Silicon");

		OreDictionary.registerOre(Reference.SILICON, new ItemStack(Silicon));
	}
}
