package com.doge.moreoresmod;

import java.io.File;

import com.doge.moreoresmod.init.ModRecipes;
import com.doge.moreoresmod.proxy.CommonProxy;
import com.doge.moreoresmod.tabs.MoreOresTab;
import com.doge.moreoresmod.util.Reference;
import com.doge.moreoresmod.util.handlers.RegistryHandler;
import com.doge.moreoresmod.world.ModWorldGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{
	public static File config;
	
	@Instance
	public static Main instance;
	
	public static final CreativeTabs moreorestab = new MoreOresTab("moreorestab");
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) 
	{
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
	}
	@EventHandler
	public static void init(FMLInitializationEvent event) 
	{
		ModRecipes.init();
		RegistryHandler.initRegistries();
	}
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) 
	{
		
	}
}
