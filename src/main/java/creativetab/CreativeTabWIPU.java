package creativetab;

import init.ModItems;
import item.ItemWIPU;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import reference.Reference;

public class CreativeTabWIPU {
	public static final CreativeTabs WIPU_TAB = new CreativeTabs(Reference.MOD_ID)
	{

		@Override
		public String getTranslatedTabLabel()
		{
			return "Not Known";
		}

		@Override
		public ItemStack getTabIconItem() {
			// TODO Auto-generated method stub
			return null;
		}
	};
}
