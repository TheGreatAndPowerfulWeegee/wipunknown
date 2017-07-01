package block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockResourcePress extends BlockContainer {
	public BlockResourcePress()
	{
		super(Material.ROCK);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int max) {
		// TODO Auto-generated method stub
		return null;
	}
}
