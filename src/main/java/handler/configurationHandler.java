package handler;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import reference.Reference;

public class configurationHandler 
{
	public static Configuration configuration;
	public static boolean testValue = false;
	public static void init(File configFile) 
	
	{
		
		if  (configuration == null)
		{
			Configuration configuration = new Configuration(configFile);
		}
	}
	@SubscribeEvent
	public void onConfigurationChangedEvent (ConfigChangedEvent.OnConfigChangedEvent event)
	{
		if (event.getModID().equalsIgnoreCase(Reference.MOD_ID))
		{
			
		}
	}
	public void loadConfiguration()
	{
		testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "Foop");
		if (configuration.hasChanged())
		{
			configuration.save();
		}
	}
}
