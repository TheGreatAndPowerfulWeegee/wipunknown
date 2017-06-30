package creativetab;

import init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import reference.Reference;

public class CreativeTabWIPU {
	public static final CreativeTabs WIPU_TAB = new CreativeTabs(Reference.MOD_ID)
	{
		@Override
		public Item getTabIconItem()
		{
			return ModItems.pureCarbon;
		}
		@Override
		public String getTranslatedTabLabel()
		{
			return "Not Known";
		}
	};
}
