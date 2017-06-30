package handler;

import java.io.File;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
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
		if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
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
