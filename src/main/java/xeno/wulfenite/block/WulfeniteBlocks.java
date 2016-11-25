package xeno.wulfenite.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xeno.wulfenite.WulfeniteMod;
import xeno.wulfenite.item.WulfeniteItems;

public class WulfeniteBlocks {
	
	static Random rand = new Random();
	
	public static BlockOre orewulfenite;
	public static BlockOre oreruby;
	public static BlockOre oreamethyst;
	
	public static BlockBase blockwulfenite;
	public static BlockBase blockdiamonite;
	public static BlockBase blockruby;
	public static BlockBase orepyrite;
	public static BlockBase blockpyrite;
	public static BlockBase blockamethyst;
	public static BlockBase oremolybdenum;
	public static BlockBase blockmolybdenum;

	public static void init() {
		// Init ores
		orewulfenite = (BlockOre) register(new BlockOre("orewulfenite", WulfeniteItems.chunkwulfenite, 4, 1).setLightLevel(0.2f).setCreativeTab(WulfeniteMod.tabwulfenite));
		oreruby = (BlockOre) register(new BlockOre("oreruby", WulfeniteItems.itemruby, 1, 2).setCreativeTab(WulfeniteMod.tabwulfenite));
		orepyrite = (BlockBase) register(new BlockBase(Material.ROCK, "orepyrite", "pickaxe", 1).setHardness(3f).setResistance(5f).setCreativeTab(WulfeniteMod.tabwulfenite));
		oreamethyst = (BlockOre) register(new BlockOre("oreamethyst", WulfeniteItems.itemamethyst, 1, 2).setCreativeTab(WulfeniteMod.tabwulfenite));
		oremolybdenum = (BlockBase) register(new BlockBase(Material.ROCK, "oremolybdenum", "pickaxe", 1).setHardness(3f).setResistance(5f).setCreativeTab(WulfeniteMod.tabwulfenite));
		
		// Init blocks
		blockwulfenite = (BlockBase) register(new BlockBase(Material.GLASS, "blockwulfenite", "pickaxe", 1).setLightLevel(1.0f).setHardness(3f).setResistance(5f).setCreativeTab(WulfeniteMod.tabwulfenite));
		blockdiamonite = (BlockBase) register(new BlockBase(Material.IRON, "blockdiamonite", "pickaxe", 2).setHardness(3f).setResistance(5f).setCreativeTab(WulfeniteMod.tabwulfenite));
		blockruby = (BlockBase) register(new BlockBase(Material.IRON, "blockruby", "pickaxe", 2).setHardness(3f).setResistance(5f).setCreativeTab(WulfeniteMod.tabwulfenite));
		blockpyrite = (BlockBase) register(new BlockBase(Material.IRON, "blockpyrite", "pickaxe", 2).setHardness(3f).setResistance(5f).setCreativeTab(WulfeniteMod.tabwulfenite));
		blockamethyst = (BlockBase) register(new BlockBase(Material.IRON, "blockamethyst", "pickaxe", 2).setHardness(3f).setResistance(5f).setCreativeTab(WulfeniteMod.tabwulfenite));
		blockmolybdenum = (BlockBase) register(new BlockBase(Material.IRON, "blockmolybdenum", "pickaxe", 1).setHardness(3f).setResistance(5f).setCreativeTab(WulfeniteMod.tabwulfenite));
	}

	private static <T extends Block> T register(T block, ItemBlock itemBlock) {
		GameRegistry.register(block);
		GameRegistry.register(itemBlock);

		if (block instanceof BlockBase) {
			((BlockBase)block).registerItemModel(itemBlock);
		}

		return block;
	}

	private static <T extends Block> T register(T block) {
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block, itemBlock);
	}
	
}
