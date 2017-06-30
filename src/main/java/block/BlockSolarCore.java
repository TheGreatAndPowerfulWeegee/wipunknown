package block;

import creativetab.CreativeTabWIPU;
import multiblock.TileCoreFuser;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import multiblock.TileCoreFuser;
import block.BlockWIPU;

public class BlockSolarCore extends BlockWIPU
{
	public BlockSolarCore()
	{
		super(Material.iron);
		this.setBlockName("solarCore");
		this.setCreativeTab(CreativeTabWIPU.WIPU_TAB);
	}
	

}
