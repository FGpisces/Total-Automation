package com.leSamo.TotalAutomation.config;

import java.io.File;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {

	public static void init(File configFile)
	{
		Configuration configuration = new Configuration(configFile);
		
		double oreDensity = 1;
		
		try {
			configuration.load();
			oreDensity = configuration.get(Configuration.CATEGORY_GENERAL, "oreDensity", 1, "Density of all ores in mod").getDouble();
		}
		catch (Exception e) {
			
		}
		finally {
			if (configuration.hasChanged()) {
				configuration.save();
			}
		}
	}
	
	@SubscribeEvent
	public void onConfiguratoinChangedEvent (ConfigChangedEvent.OnConfigChangedEvent event) {
		if (event.modID.equalsIgnoreCase(TotalAutomation))
	}
}
