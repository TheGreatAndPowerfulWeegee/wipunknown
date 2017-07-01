package init;

import item.ItemWIPU;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import item.ItemFineCarbon;
import item.ItemHeatingBlob;
import item.ItemPolymerFusedAdhesive;
import item.ItemPureCarbon;
import item.ItemPyroclasticSolid; 
import block.BlockDenseCasing; 

@Mod.EventBusSubscriber
public class ModItems {
	public static final  ItemWIPU fine_carbon = new ItemFineCarbon();
	public static final  ItemPureCarbon pure_carbon = new ItemPureCarbon();
	public static final  ItemWIPU pyroclastic_solid = new ItemPyroclasticSolid();
	public static final  ItemWIPU heating_blob = new ItemHeatingBlob();
	public static final  ItemWIPU polymer_fused_adhesive = new ItemPolymerFusedAdhesive();
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(fine_carbon, pure_carbon, pyroclastic_solid, heating_blob, polymer_fused_adhesive);
		
	}
	
}
