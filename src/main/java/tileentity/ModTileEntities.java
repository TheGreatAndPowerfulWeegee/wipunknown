package tileentity;

import cpw.mods.fml.common.registry.GameRegistry;
import tileentity.BoxTileEntity;

public final class ModTileEntities {
	public static void init()
	{
		GameRegistry.registerTileEntity(BoxTileEntity.class, "boxTileEntity");
	}
}
