package xeno.wulfenite.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import xeno.wulfenite.WulfeniteMod;

public class BlockBase extends Block{
	
	protected String name;

	public BlockBase(Material material, String name, String tool, int harvest) {
		super(material);

		this.name = name;
		setLightLevel(0.0f);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHarvestLevel(tool, harvest);
	}

	public void registerItemModel(ItemBlock itemBlock) {
		WulfeniteMod.proxy.registerItemRenderer(itemBlock, 0, name);
	}

	@Override
	public BlockBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
