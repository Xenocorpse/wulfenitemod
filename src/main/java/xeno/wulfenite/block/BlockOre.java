package xeno.wulfenite.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockOre extends BlockBase{
	
	protected Item drop;
	protected int quantity;
	
	public BlockOre(String name, Item drop, int quantity, int harvest) {
		super(Material.ROCK, name, "pickaxe", harvest);
		this.drop = drop;
		this.quantity = quantity;
		setHardness(3f);
		setResistance(5f);
	}

	@Override
	public BlockOre setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return drop;
	}
	
	public int quantityDropped(Random random) {
		return quantity;
	}
	
	public int quantityDroppedWithBonus(int fortune, Random random) {
		return quantityDropped(random);
	}

}
