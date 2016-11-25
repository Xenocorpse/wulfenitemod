package xeno.wulfenite.item;

import net.minecraft.item.Item;
import xeno.wulfenite.WulfeniteMod;

public class ItemAxe extends net.minecraft.item.ItemAxe implements ItemModelProvider {

	private String name;
	
	protected ItemAxe(ToolMaterial material, String name) {
		super(material, 8f, -3.1f);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}
	
	@Override
	public void registerItemModel(Item item) {
		WulfeniteMod.proxy.registerItemRenderer(this, 0, name);
	}

}
