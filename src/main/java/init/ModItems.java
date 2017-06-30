package init;

import cpw.mods.fml.common.registry.GameRegistry;
import item.ItemWIPU;
import item.ItemFineCarbon;
import item.ItemHeatingBlob;
import item.ItemPolymerFusedAdhesive;
import item.ItemPureCarbon;
import item.ItemPyroclasticSolid; 

public class ModItems {
	public static final  ItemWIPU fineCarbon = new ItemFineCarbon();
	public static final  ItemWIPU pureCarbon = new ItemPureCarbon();
	public static final  ItemWIPU pyroclasticSolid = new ItemPyroclasticSolid();
	public static final  ItemWIPU heatingBlob = new ItemHeatingBlob();
	public static final  ItemWIPU polymerFusedAdhesive = new ItemPolymerFusedAdhesive();
	public static void init()
	{
		GameRegistry.registerItem(fineCarbon, "fineCarbon");
		GameRegistry.registerItem(pureCarbon, "pureCarbon");
		GameRegistry.registerItem(pyroclasticSolid, "pyroclasticSolid");
		GameRegistry.registerItem(heatingBlob, "heatingBlob");
		GameRegistry.registerItem(polymerFusedAdhesive, "polymerFusedAdhesive");
	}
}
