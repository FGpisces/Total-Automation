package com.leSamo.TotalAutomation.util;

import com.leSamo.TotalAutomation.util.ItemReg;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRedstone;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.*;

public class TARecipes {
	public static void init() {
		GameRegistry.addShapelessRecipe(new ItemStack(ItemReg.IronChipset),    new  ItemStack(ItemReg.Silicon), new  ItemStack(Items.redstone), new ItemStack(Items.iron_ingot));
		GameRegistry.addShapelessRecipe(new ItemStack(ItemReg.GoldenChipset),  new  ItemStack(ItemReg.Silicon), new  ItemStack(Items.redstone), new ItemStack(Items.gold_ingot));
		GameRegistry.addShapelessRecipe(new ItemStack(ItemReg.DiamondChipset), new  ItemStack(ItemReg.Silicon), new  ItemStack(Items.redstone), new ItemStack(Items.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(ItemReg.EmeraldChipset), new  ItemStack(ItemReg.Silicon), new  ItemStack(Items.redstone), new ItemStack(Items.emerald));
	}
}
