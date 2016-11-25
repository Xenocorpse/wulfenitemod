package xeno.wulfenite.item;

import net.minecraft.item.Item;
import xeno.wulfenite.WulfeniteMod;

public class ItemShovel extends net.minecraft.item.ItemSpade implements ItemModelProvider{

	private String name;
	
	public ItemShovel(ToolMaterial material, String name) {
		super(material);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}
	
	@Override
	public void registerItemModel(Item item) {
		WulfeniteMod.proxy.registerItemRenderer(this, 0, name);
	}

}
