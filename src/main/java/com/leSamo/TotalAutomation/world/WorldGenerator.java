package com.leSamo.TotalAutomation.world;

import com.leSamo.TotalAutomation.block.*;
import com.leSamo.TotalAutomation.world.*;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldGenerator {
	public static void mainRegistry(){
		init();
	}
	
	public static void init(){
		registerWorldGen(new WorldGenMonazite(), 1);
	}
	
	public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProbabaility){
		GameRegistry.registerWorldGenerator(worldGenClass, weightedProbabaility);
	}
}