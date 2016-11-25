package xeno.wulfenite.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import xeno.wulfenite.WulfeniteMod;
import xeno.wulfenite.item.WulfeniteItems;

public class WulfeniteTabs extends CreativeTabs {

	public WulfeniteTabs() {
		super(WulfeniteMod.modId);
	}

	@Override
	public ItemStack getTabIconItem() {
		return (new ItemStack(WulfeniteItems.chunkwulfenite));
	}
	
}
