package block;

import creativetab.CreativeTabWIPU;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockCoreFuser extends BlockContainer{
	public BlockCoreFuser()
	{
		super(Material.IRON);
		this.setRegistryName("core_fuser");
		this.setCreativeTab(CreativeTabWIPU.WIPU_TAB);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		// TODO Auto-generated method stub
		return null;
	}

}
