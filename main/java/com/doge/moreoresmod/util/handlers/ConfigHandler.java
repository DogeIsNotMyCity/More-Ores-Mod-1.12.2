package com.doge.moreoresmod.util.handlers;

import java.io.File;

import com.doge.moreoresmod.Main;
import com.doge.moreoresmod.util.Reference;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigHandler 
{
	public static Configuration config;
	
	//GUI IDs

	public static int GUI_BLAST_FURNACE = 1;


	public static void init(File file)
	{
		config = new Configuration(file);
		String category;
		
		category = "GUI IDs";
		config.addCustomCategoryComment(category, "Set IDs for each GUI.");
		GUI_BLAST_FURNACE = config.getInt("GUI Blast Furnace", category, 4, 0, 500, "GUI ID for the Blast Furnace");
		
		config.save();
	}
	
	public static void registerConfig(FMLPreInitializationEvent event)
	{
		Main.config = new File(event.getModConfigurationDirectory() + "/" + Reference.MODID);
		Main.config.mkdirs();
		init(new File(Main.config.getPath(), Reference.MODID + ".cfg"));
	}
}
