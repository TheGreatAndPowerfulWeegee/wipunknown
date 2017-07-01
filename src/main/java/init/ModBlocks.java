package init;

import block.BlockCoreFuser;
import block.BlockDenseCasing;
import block.BlockSolarCore;
import block.BlockWIPU;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistryEntry;
import reference.Reference;
import tileentity.TileResourcePress;

@Mod.EventBusSubscriber
public class ModBlocks {
	public static final BlockWIPU dense_casing = new BlockDenseCasing();
	public static final BlockWIPU solar_core = new BlockSolarCore();
	public static final BlockContainer core_fuser = new BlockCoreFuser();
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
	    event.getRegistry().registerAll(dense_casing, solar_core, core_fuser);
	}
	@SubscribeEvent
	public static void onRegisterItemBlocks(RegistryEvent.Register<Item> event) {
		event.getRegistry().register(new ItemBlock(dense_casing).setRegistryName(dense_casing.getRegistryName()));
	}
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public static void onRegisterModels(RegistryEvent event) {
	    ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(dense_casing), 0, new ModelResourceLocation(dense_casing.getRegistryName(), "inventory"));
	}
}
