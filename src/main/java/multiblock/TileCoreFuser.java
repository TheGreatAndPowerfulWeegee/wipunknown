package multiblock;

import net.minecraft.block.Block;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TileCoreFuser extends TileEntity {
	private boolean hasMaster, isMaster;
	private int masterX, masterY, masterZ;
	
	
	@Override
	public void writeToNBT(NBTTagCompound data)
	{
		super.writeToNBT(data);
		data.setInteger("masterX", masterX);
		data.setInteger("masterY", masterY);
		data.setInteger("masterZ", masterZ);
		data.setBoolean("hasMaster", hasMaster);
		data.setBoolean("isMaster", isMaster);
		if (hasMaster() && isMaster())
		{
			
		}
	}
	@Override
	public void readFromNBT(NBTTagCompound data)
	{
		super.readFromNBT(data);
		masterX = data.getInteger("masterX");
		masterY = data.getInteger("masterY");
		masterZ = data.getInteger("masterZ");
		hasMaster = data.getBoolean("hasMaster");
		isMaster = data.getBoolean("isMaster");
		if (hasMaster() && isMaster())
		{
			
		}
	}
	public boolean hasMaster()
	{
		return hasMaster;
	}
	public boolean isMaster()
	{
		return isMaster;
	}
	public int getMasterX()
	{
		return masterX;
	}
	public int getMasterY()
	{
		return masterY;
	}
	public int getMasterZ()
	{
		return masterZ;
	}
	public void setHasMaster(boolean bool)
	{
		hasMaster = bool;
	}
	public void setIsMaster(boolean bool)
	{
		isMaster = bool;
	}
	public void setMasterCoords(int x, int y, int z)
	{
		masterX = x;
		masterY = y;
		masterZ = z;
	}
	public boolean checkMultiBlockForm()
	{
		int i = 0;
		for (int x = xCoord - 1; x < xCoord + 2; x++)
		{
			for (int y = yCoord; y < yCoord + 3; y++)
			{
				for(int z = zCoord; z < zCoord + 2; z++)
				{
					TileEntity tile = worldObj.getTileEntity(x, y, z);
					if (tile != null && (tile instanceof TileCoreFuser))
					{
						if (this.isMaster())
						{
							if (((TileCoreFuser)tile).hasMaster())
							{
								i++;
							}
							else if (!((TileCoreFuser)tile).hasMaster())
							{
								i++;
							}
						}
					}
					
				}
			}
		}
		return i > 25 & worldObj.isAirBlock(xCoord, yCoord + 1, zCoord);
	}
	public void setupStructure()
	{
		for (int x = xCoord - 1; x < xCoord + 2; x++)
		{
			for (int y = yCoord; y < yCoord + 3; y++)
			{
				for (int z = zCoord - 1; z < zCoord + 2; z++)
				{
					TileEntity tile = worldObj.getTileEntity(x, y, z);
					boolean master = (x == xCoord && y == yCoord && z == zCoord);
					if (tile != null && (tile instanceof TileCoreFuser))
					{
						((TileCoreFuser) tile).setMasterCoords(xCoord, yCoord, zCoord);
						((TileCoreFuser) tile).setHasMaster(true);
						((TileCoreFuser) tile).setIsMaster(master);
					}
				}
			}
		}
	}
	public void reset()
	{
		masterX = 0;
		masterY = 0;
		masterZ = 0;
		hasMaster = false;
		isMaster = false;
	}
	public boolean checkForMaster()
	{
		TileEntity tile = worldObj.getTileEntity(masterX, masterY, masterZ);
		return (tile != null && (tile instanceof TileCoreFuser));
	}
	public void resetStructure()
	{
		for (int x = xCoord - 1; x < xCoord + 2; x++)
		{
			for (int y = yCoord; y < yCoord + 3; y++)
			{
				for (int z = zCoord - 1; z < zCoord + 2; z++)
				{
					TileEntity tile = worldObj.getTileEntity(x, y, z);
					if (tile != null && (tile instanceof TileCoreFuser))
					{
						((TileCoreFuser)tile).reset();
					}
				}
			}
		}
	}
	@Override
	public void updateEntity()
	{
		super.updateEntity();
		if (!worldObj.isRemote)
		{
			if (hasMaster())
			{
				if (isMaster())
				{
					//insert multiblock functions here
				}
				else
				{
					if (checkMultiBlockForm())
					{
						setupStructure();
					}
				}
			}
		}
	}
	
}
