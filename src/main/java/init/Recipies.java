package init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipies {
	public static void init()
	{
		GameRegistry.addRecipe(new ItemStack(ModItems.fineCarbon), "sss", "sss", "srs", 's', new ItemStack(Items.coal), 'r', new ItemStack(Items.stick ));
		GameRegistry.addRecipe(new ItemStack(ModItems.pureCarbon), "sss", "rtr", "sus", 's', new ItemStack(ModItems.fineCarbon),'r', new ItemStack(Items.redstone), 't', new ItemStack(Items.slime_ball), 'u', new ItemStack(Blocks.sand));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.denseCasing), "sis", "ipi", "sis", 's', new ItemStack(ModItems.pureCarbon), 'i', new ItemStack(Items.iron_ingot), 'p', new ItemStack(ModItems.pyroclasticSolid));
		GameRegistry.addSmelting(Items.blaze_powder, new ItemStack(ModItems.pyroclasticSolid), 0.9F);
		GameRegistry.addRecipe(new ItemStack(ModItems.heatingBlob), "sss", "sds", "sss", 's', new ItemStack(ModItems.pyroclasticSolid), 'd', new ItemStack(ModItems.polymerFusedAdhesive));
	}
}
