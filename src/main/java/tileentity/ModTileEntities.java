package tileentity;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import multiblock.TileCoreFuser;
import tileentity.BoxTileEntity;

public final class ModTileEntities {
	public static void init()
	{
		GameRegistry.registerTileEntity(BoxTileEntity.class, "boxTileEntity");
	}
	
}
