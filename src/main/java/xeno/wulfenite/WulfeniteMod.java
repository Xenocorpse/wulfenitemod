package xeno.wulfenite;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xeno.wulfenite.block.WulfeniteBlocks;
import xeno.wulfenite.client.WulfeniteTabs;
import xeno.wulfenite.item.WulfeniteItems;
import xeno.wulfenite.proxy.CommonProxy;
import xeno.wulfenite.recipe.WulfeniteRecipes;
import xeno.wulfenite.world.WulfeniteWorldGen;

@Mod(modid = WulfeniteMod.modId, name = WulfeniteMod.name, version = WulfeniteMod.version, acceptedMinecraftVersions = "[1.11]")
public class WulfeniteMod {
	
	@SidedProxy(serverSide = "xeno.wulfenite.proxy.CommonProxy", clientSide = "xeno.wulfenite.proxy.ClientProxy")
	public static CommonProxy proxy;

	public static final String modId = "wulfenite";
	public static final String name = "Wulfenite Mod";
	public static final String version = "1.0.0";

	@Mod.Instance(modId)
	public static WulfeniteMod instance;
	
	public static final WulfeniteTabs tabwulfenite = new WulfeniteTabs();
	
	// Tool materials
	public static final Item.ToolMaterial diamoniteToolMaterial = EnumHelper.addToolMaterial("DIAMONITE", 3, 1600, 8, 4, 14);
	public static final Item.ToolMaterial rubyToolMaterial = EnumHelper.addToolMaterial("RUBY", 3, 1521, 7, 3, 12);
	public static final Item.ToolMaterial molybdenumToolMaterial = EnumHelper.addToolMaterial("MOLYBDENUM", 2, 750, 5, 2, 10);
	
	// Armor materials
	public static final ItemArmor.ArmorMaterial diamoniteArmorMaterial = EnumHelper.addArmorMaterial("DIAMONITE", modId + ":diamonite", 15, new int[]{4, 7, 8, 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	public static final ItemArmor.ArmorMaterial wulfeniteArmorMaterial = EnumHelper.addArmorMaterial("WULFENITE", modId + ":wulfenite", 15, new int[]{2, 4, 5, 1}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ItemArmor.ArmorMaterial rubyArmorMaterial = EnumHelper.addArmorMaterial("RUBY", modId + ":ruby", 15, new int[]{3, 6, 7, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	public static final ItemArmor.ArmorMaterial amethystArmorMaterial = EnumHelper.addArmorMaterial("AMETHYST", modId + ":amethyst", 15, new int[]{2, 6, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	public static final ItemArmor.ArmorMaterial molybdenumArmorMaterial = EnumHelper.addArmorMaterial("MOLYBDENUM", modId + ":molybdenum", 15, new int[]{2, 4, 5, 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name + " is loading!");
		WulfeniteItems.init();
		WulfeniteBlocks.init();
		GameRegistry.registerWorldGenerator(new WulfeniteWorldGen(), 3);
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		WulfeniteRecipes.init();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

}