package com.leSamo.TotalAutomation.util;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.leSamo.TotalAutomation.util.TAItem;
import com.leSamo.TotalAutomation.item.*;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemReg {
	
	public static void init() {
		Item CeriumItem;
		Item IronChipset;
		Item GoldenChipset;
		Item DiamondChipset;
		Item EmeraldChipset;
		Item Silicon;
	
		CeriumItem = new Cerium().setMaxStackSize(64);
		IronChipset = new IronChipset().setMaxStackSize(1);
		GoldenChipset = new GoldenChipset().setMaxStackSize(1);
		DiamondChipset = new DiamondChipset().setMaxStackSize(1);
		EmeraldChipset = new EmeraldChipset().setMaxStackSize(1);
		Silicon = new Silicon().setMaxStackSize(64);

		GameRegistry.registerItem(CeriumItem, "CeriumItem");
		GameRegistry.registerItem(IronChipset, "IronChipset");
		GameRegistry.registerItem(GoldenChipset, "GoldenChipset");
		GameRegistry.registerItem(DiamondChipset, "DiamondChipset");
		GameRegistry.registerItem(EmeraldChipset, "EmeraldChipset");
		GameRegistry.registerItem(Silicon, "Silicon");

		OreDictionary.registerOre(Ref.SILICON, new ItemStack(Silicon));
	}
}
