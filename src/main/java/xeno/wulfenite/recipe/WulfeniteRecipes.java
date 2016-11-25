package xeno.wulfenite.recipe;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xeno.wulfenite.block.WulfeniteBlocks;
import xeno.wulfenite.item.WulfeniteItems;

public class WulfeniteRecipes {
	
	public static void init() {
		
		//Shaped recipes
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.itemwulfenite), 
				"AA", 
				"AA", 'A', WulfeniteItems.shardwulfenite);
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.DIAMOND), 
				"AA", 
				"AA", 'A', WulfeniteItems.sharddiamond);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteBlocks.blockwulfenite), 
				"AAA", 
				"AAA", 
				"AAA", 'A', WulfeniteItems.itemwulfenite);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteBlocks.blockmolybdenum), 
				"AAA", 
				"AAA", 
				"AAA", 'A', WulfeniteItems.itemmolybdenum);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteBlocks.blockdiamonite), 
				"AAA", 
				"AAA", 
				"AAA", 'A', WulfeniteItems.itemdiamonite);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteBlocks.blockruby), 
				"AAA", 
				"AAA", 
				"AAA", 'A', WulfeniteItems.itemruby);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.itempyrite), 
				"AAA", 
				"AAA", 
				"AAA", 'A', WulfeniteItems.nuggetpyrite);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteBlocks.blockpyrite), 
				"AAA", 
				"AAA", 
				"AAA", 'A', WulfeniteItems.itempyrite);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteBlocks.blockamethyst), 
				"AAA", 
				"AAA", 
				"AAA", 'A', WulfeniteItems.itemamethyst);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.crownwulfenite), 
				"BAB", 
				"BBB", 'A', WulfeniteItems.itemwulfenite, 'B', Items.GOLD_INGOT);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.sharddiamond, 4, 0), 
				"A", 'A', Items.DIAMOND);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.itemruby, 9, 0), 
				"A", 'A', WulfeniteBlocks.blockruby);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.itemwulfenite, 9, 0), 
				"A", 'A', WulfeniteBlocks.blockwulfenite);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.itemdiamonite, 9, 0), 
				"A", 'A', WulfeniteBlocks.blockdiamonite);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.itempyrite, 9, 0), 
				"A", 'A', WulfeniteBlocks.blockpyrite);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.shardwulfenite, 4, 0), 
				"A", 'A', WulfeniteItems.itemwulfenite);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.nuggetpyrite, 9, 0), 
				"A", 'A', WulfeniteItems.itempyrite);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.itemamethyst, 9, 0), 
				"A", 'A', WulfeniteBlocks.blockamethyst);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.itemmolybdenum, 9, 0), 
				"A", 'A', WulfeniteBlocks.blockmolybdenum);
		
		// Armor Recipes
		// Diamonite Schtuff
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.helmdiamonite), 
				"AAA", 
				"A A", 'A', WulfeniteItems.itemdiamonite);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.chestdiamonite), 
				"A A", 
				"AAA", 
				"AAA", 'A', WulfeniteItems.itemdiamonite);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.legdiamonite), 
				"AAA", 
				"A A", 
				"A A", 'A', WulfeniteItems.itemdiamonite);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.bootdiamonite),  
				"A A", 
				"A A", 'A', WulfeniteItems.itemdiamonite);
		
		// Ruby schtuff
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.helmruby), 
				"AAA", 
				"A A", 'A', WulfeniteItems.itemruby);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.chestruby), 
				"A A", 
				"AAA", 
				"AAA", 'A', WulfeniteItems.itemruby);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.legruby), 
				"AAA", 
				"A A", 
				"A A", 'A', WulfeniteItems.itemruby);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.bootruby),  
				"A A", 
				"A A", 'A', WulfeniteItems.itemruby);
		
		// Amethyst Stuff
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.helmamethyst), 
				"AAA", 
				"A A", 'A', WulfeniteItems.itemamethyst);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.chestamethyst), 
				"A A", 
				"AAA", 
				"AAA", 'A', WulfeniteItems.itemamethyst);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.legamethyst), 
				"AAA", 
				"A A", 
				"A A", 'A', WulfeniteItems.itemamethyst);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.bootamethyst),  
				"A A", 
				"A A", 'A', WulfeniteItems.itemamethyst);
		
		// Molybdenum stuff
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.helmmolybdenum), 
				"AAA", 
				"A A", 'A', WulfeniteItems.itemmolybdenum);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.chestmolybdenum), 
				"A A", 
				"AAA", 
				"AAA", 'A', WulfeniteItems.itemmolybdenum);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.legmolybdenum), 
				"AAA", 
				"A A", 
				"A A", 'A', WulfeniteItems.itemmolybdenum);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.bootmolybdenum),  
				"A A", 
				"A A", 'A', WulfeniteItems.itemmolybdenum);
		
		// Tool recipes
		// Diamonite Schtuff
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.pickdiamonite),  
				"AAA", 
				" B ", 
				" B ", 'A', WulfeniteItems.itemdiamonite, 'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.axediamonite),  
				"AA", 
				"BA", 
				"B ", 'A', WulfeniteItems.itemdiamonite, 'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.axediamonite),  
				"AA", 
				"AB", 
				" B", 'A', WulfeniteItems.itemdiamonite, 'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.shoveldiamonite),  
				"A", 
				"B", 
				"B", 'A', WulfeniteItems.itemdiamonite, 'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.hoediamonite),  
				"AA", 
				"B ", 
				"B ", 'A', WulfeniteItems.itemdiamonite, 'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.hoediamonite),  
				"AA", 
				" B", 
				" B", 'A', WulfeniteItems.itemdiamonite, 'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.sworddiamonite),  
				"A", 
				"A", 
				"B", 'A', WulfeniteItems.itemdiamonite, 'B', Items.STICK);
		
		// Ruby schtuff
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.pickruby),  
				"AAA", 
				" B ", 
				" B ", 'A', WulfeniteItems.itemruby, 'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.axeruby),  
				"AA", 
				"BA", 
				"B ", 'A', WulfeniteItems.itemruby, 'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.axeruby),  
				"AA", 
				"AB", 
				" B", 'A', WulfeniteItems.itemruby, 'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.shovelruby),  
				"A", 
				"B", 
				"B", 'A', WulfeniteItems.itemruby, 'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.hoeruby),  
				"AA", 
				"B ", 
				"B ", 'A', WulfeniteItems.itemruby, 'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.hoeruby),  
				"AA", 
				" B", 
				" B", 'A', WulfeniteItems.itemruby, 'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.swordruby),  
				"A", 
				"A", 
				"B", 'A', WulfeniteItems.itemruby, 'B', Items.STICK);
		
		// Molybdenum Stuff
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.pickmolybdenum),  
				"AAA", 
				" B ", 
				" B ", 'A', WulfeniteItems.itemmolybdenum, 'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.axemolybdenum),  
				"AA", 
				"BA", 
				"B ", 'A', WulfeniteItems.itemmolybdenum, 'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.axemolybdenum),  
				"AA", 
				"AB", 
				" B", 'A', WulfeniteItems.itemmolybdenum, 'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.shovelmolybdenum),  
				"A", 
				"B", 
				"B", 'A', WulfeniteItems.itemmolybdenum, 'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.hoemolybdenum),  
				"AA", 
				"B ", 
				"B ", 'A', WulfeniteItems.itemmolybdenum, 'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.hoemolybdenum),  
				"AA", 
				" B", 
				" B", 'A', WulfeniteItems.itemmolybdenum, 'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.swordmolybdenum),  
				"A", 
				"A", 
				"B", 'A', WulfeniteItems.itemmolybdenum, 'B', Items.STICK);
		
		// Scythe recipes
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.scythewood),  
				"AAA", 
				" B ", 
				"B  ", 'A', Blocks.PLANKS, 'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.scythestone),  
				"AAA", 
				" B ", 
				"B  ", 'A', Blocks.COBBLESTONE, 'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.scytheiron),  
				"AAA", 
				" B ", 
				"B  ", 'A', Items.IRON_INGOT, 'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.scythegold),  
				"AAA", 
				" B ", 
				"B  ", 'A', Items.GOLD_INGOT, 'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.scythediamond),  
				"AAA", 
				" B ", 
				"B  ", 'A', Items.DIAMOND, 'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.scythemolybdenum),  
				"AAA", 
				" B ", 
				"B  ", 'A', WulfeniteItems.itemmolybdenum, 'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.scytheruby),  
				"AAA", 
				" B ", 
				"B  ", 'A', WulfeniteItems.itemruby, 'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(WulfeniteItems.scythediamonite),  
				"AAA", 
				" B ", 
				"B  ", 'A', WulfeniteItems.itemdiamonite, 'B', Items.STICK);
		
		//Shapeless recipes
		GameRegistry.addShapelessRecipe(new ItemStack(WulfeniteItems.itemdiamonite), WulfeniteItems.sharddiamond, WulfeniteItems.sharddiamond, WulfeniteItems.shardwulfenite, WulfeniteItems.shardwulfenite);
		
		//Smelting recipes
		GameRegistry.addSmelting(WulfeniteBlocks.orewulfenite, new ItemStack(WulfeniteItems.itemwulfenite), 0.7f);
		GameRegistry.addSmelting(WulfeniteBlocks.oreruby, new ItemStack(WulfeniteItems.itemruby), 0.8f);
		GameRegistry.addSmelting(WulfeniteItems.chunkwulfenite, new ItemStack(WulfeniteItems.shardwulfenite), 0.2f);
		GameRegistry.addSmelting(WulfeniteBlocks.orepyrite, new ItemStack(WulfeniteItems.itempyrite), 0.6f);
		GameRegistry.addSmelting(WulfeniteBlocks.oreamethyst, new ItemStack(WulfeniteItems.itemamethyst), 0.8f);
		GameRegistry.addSmelting(WulfeniteBlocks.oremolybdenum, new ItemStack(WulfeniteItems.itemmolybdenum), 0.5f);
	}

}
