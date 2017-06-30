package block;

import creativetab.CreativeTabWIPU;
import multiblock.TileCoreFuser;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockCoreFuser extends BlockContainer{
	public BlockCoreFuser()
	{
		super(Material.iron);
		this.setBlockName("coreFuser");
		this.setCreativeTab(CreativeTabWIPU.WIPU_TAB);
	}
	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z, Block block)
	{
		TileEntity tile = world.getTileEntity(x, y, z);
		if (tile != null && tile instanceof TileCoreFuser)
		{
			TileCoreFuser coreFuser = (TileCoreFuser) tile;
			if (coreFuser.hasMaster())
			{
				if (coreFuser.isMaster())
				{
					if (!coreFuser.checkMultiBlockForm())
					{
						coreFuser.resetStructure();
					}
					else
					{
						if (!coreFuser.checkForMaster())
						{
							coreFuser.reset();
						}
					}
				}
			}
		}
		super.onNeighborBlockChange(world, x, y, z, block);
	}
	@Override
	public TileEntity createNewTileEntity(World world, int meta)
	{
		return new TileCoreFuser();
	}
}
