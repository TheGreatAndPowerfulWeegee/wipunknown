package init;

import block.BlockCoreFuser;
import block.BlockDenseCasing;
import block.BlockSolarCore;
import block.BlockWIPU;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockContainer;
import reference.Reference;
import tileentity.TileResourcePress;


public class ModBlocks {
	public static final BlockWIPU denseCasing = new BlockDenseCasing();
	public static final BlockWIPU solarCore = new BlockSolarCore();
	public static final BlockContainer coreFuser = new BlockCoreFuser();
	public static void init()
	{
		GameRegistry.registerBlock(denseCasing, "denseCasing");
		GameRegistry.registerBlock(solarCore, "solarCore");
		GameRegistry.registerBlock(coreFuser, "coreFuser");
		GameRegistry.registerTileEntity(TileResourcePress.class, "tileResourcePress");
	}
}
