package com.weegee.wipunknown;
import reference.Reference;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import handler.configurationHandler;
import init.ModBlocks;
import init.ModItems;
import net.minecraftforge.fml.common.Optional.Method;
import net.minecraftforge.fml.common.SidedProxy;
import proxy.IProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class wipunknown 
{
	@Mod.Instance("wipunknown")
	public static wipunknown instance;
	
	@SidedProxy(clientSide = "proxy.ClientProxy", serverSide = "proxy.ServerProxy")
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(net.minecraftforge.fml.common.event.FMLPreInitializationEvent event) 
	{
		configurationHandler.init(event.getSuggestedConfigurationFile());
		
	}

	@Mod.EventHandler
	public void postInit(net.minecraftforge.fml.common.event.FMLPostInitializationEvent event) 
	{
		
	}
}
