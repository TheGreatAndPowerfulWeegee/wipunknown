package block;

import creativetab.CreativeTabWIPU;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import block.BlockWIPU;

public class BlockSolarCore extends BlockWIPU
{
	public BlockSolarCore()
	{
		super(Material.IRON);
		this.setRegistryName("solar_core");
		this.setCreativeTab(CreativeTabWIPU.WIPU_TAB);
	}
	

}
