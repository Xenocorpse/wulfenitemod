package xeno.wulfenite.item;

import net.minecraft.item.Item;
import xeno.wulfenite.WulfeniteMod;

public class ItemHoe extends net.minecraft.item.ItemHoe implements ItemModelProvider {
	
	private String name;
	
	public ItemHoe(ToolMaterial material, String name) {
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
