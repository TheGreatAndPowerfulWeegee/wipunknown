package com.weegee.wipunknown;
import reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import handler.configurationHandler;
import init.ModBlocks;
import init.ModItems;
import proxy.IProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class wipunknown 
{
	@Mod.Instance("wipunknown")
	public static wipunknown instance;
	
	@SidedProxy(clientSide = "proxy.ClientProxy", serverSide = "proxy.ServerProxy")
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		configurationHandler.init(event.getSuggestedConfigurationFile());
		ModItems.init();
		ModBlocks.init();
	}
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) 
	{
		init.Recipies.init();
	}
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) 
	{
		
	}
}
