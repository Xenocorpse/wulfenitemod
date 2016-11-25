package xeno.wulfenite.item;

import net.minecraft.item.Item;
import xeno.wulfenite.WulfeniteMod;

public class ItemSword extends net.minecraft.item.ItemSword implements ItemModelProvider{
	
	private String name;
	private float damage;

	public ItemSword(ToolMaterial material, String name) {
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
