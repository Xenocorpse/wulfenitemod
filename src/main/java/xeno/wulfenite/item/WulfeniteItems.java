package xeno.wulfenite.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xeno.wulfenite.WulfeniteMod;
import xeno.wulfenite.client.WulfeniteTabs;

public class WulfeniteItems {
	
	// Basic items
	public static ItemBase chunkwulfenite;
	public static ItemBase shardwulfenite;
	public static ItemBase itemwulfenite;
	public static ItemBase sharddiamond;
	public static ItemBase itemdiamonite;
	public static ItemBase itemruby;
	public static ItemBase itempyrite;
	public static ItemBase nuggetpyrite;
	public static ItemBase itemamethyst;
	public static ItemBase itemmolybdenum;
	
	// Tool items
	// Diamonite
	public static ItemSword sworddiamonite;
	public static ItemPickaxe pickdiamonite;
	public static ItemShovel shoveldiamonite;
	public static ItemAxe axediamonite;
	public static ItemHoe hoediamonite;
	// Ruby
	public static ItemSword swordruby;
	public static ItemPickaxe pickruby;
	public static ItemShovel shovelruby;
	public static ItemAxe axeruby;
	public static ItemHoe hoeruby;
	// Molybdenum
	public static ItemSword swordmolybdenum;
	public static ItemPickaxe pickmolybdenum;
	public static ItemShovel shovelmolybdenum;
	public static ItemAxe axemolybdenum;
	public static ItemHoe hoemolybdenum;
	
	// Armor items
	// Diamonite
	public static ItemArmor chestdiamonite;
	public static ItemArmor legdiamonite;
	public static ItemArmor bootdiamonite;
	public static ItemArmor helmdiamonite;
	// Crown
	public static ItemArmor crownwulfenite;
	// Ruby
	public static ItemArmor chestruby;
	public static ItemArmor legruby;
	public static ItemArmor bootruby;
	public static ItemArmor helmruby;
	// Amethyst
	public static ItemArmor chestamethyst;
	public static ItemArmor legamethyst;
	public static ItemArmor bootamethyst;
	public static ItemArmor helmamethyst;
	// Molybdenum
	public static ItemArmor chestmolybdenum;
	public static ItemArmor legmolybdenum;
	public static ItemArmor bootmolybdenum;
	public static ItemArmor helmmolybdenum;
	
	// Food items
	public static ItemFood pyriteapple;
	public static ItemFood pyritemelon;
	
	// Initialize items in main mod
	public static void init() {
		// Init items
		chunkwulfenite = register(new ItemBase("chunkwulfenite").setCreativeTab(WulfeniteMod.tabwulfenite));
		shardwulfenite = register(new ItemBase("shardwulfenite").setCreativeTab(WulfeniteMod.tabwulfenite));
		itemwulfenite = register(new ItemBase("itemwulfenite").setCreativeTab(WulfeniteMod.tabwulfenite));
		sharddiamond = register(new ItemBase("sharddiamond").setCreativeTab(WulfeniteMod.tabwulfenite));
		itemdiamonite = register(new ItemBase("itemdiamonite").setCreativeTab(WulfeniteMod.tabwulfenite));
		itemruby = register(new ItemBase("itemruby").setCreativeTab(WulfeniteMod.tabwulfenite));
		itempyrite = register(new ItemBase("itempyrite").setCreativeTab(WulfeniteMod.tabwulfenite));
		nuggetpyrite = register(new ItemBase("nuggetpyrite").setCreativeTab(WulfeniteMod.tabwulfenite));
		itemamethyst = register(new ItemBase("itemamethyst").setCreativeTab(WulfeniteMod.tabwulfenite));
		itemmolybdenum = register(new ItemBase("itemmolybdenum").setCreativeTab(WulfeniteMod.tabwulfenite));
		
		// Init tools
		// Diamonite
		sworddiamonite = (ItemSword) register(new ItemSword(WulfeniteMod.diamoniteToolMaterial, "sworddiamonite").setCreativeTab(WulfeniteMod.tabwulfenite));
		pickdiamonite = (ItemPickaxe) register(new ItemPickaxe(WulfeniteMod.diamoniteToolMaterial, "pickdiamonite").setCreativeTab(WulfeniteMod.tabwulfenite));
		shoveldiamonite = (ItemShovel) register(new ItemShovel(WulfeniteMod.diamoniteToolMaterial, "shoveldiamonite").setCreativeTab(WulfeniteMod.tabwulfenite));
		axediamonite = (ItemAxe) register(new ItemAxe(WulfeniteMod.diamoniteToolMaterial, "axediamonite").setCreativeTab(WulfeniteMod.tabwulfenite));
		hoediamonite = (ItemHoe) register(new ItemHoe(WulfeniteMod.diamoniteToolMaterial, "hoediamonite").setCreativeTab(WulfeniteMod.tabwulfenite));
		// Ruby
		swordruby = (ItemSword) register(new ItemSword(WulfeniteMod.rubyToolMaterial, "swordruby").setCreativeTab(WulfeniteMod.tabwulfenite));
		pickruby = (ItemPickaxe) register(new ItemPickaxe(WulfeniteMod.rubyToolMaterial, "pickruby").setCreativeTab(WulfeniteMod.tabwulfenite));
		shovelruby = (ItemShovel) register(new ItemShovel(WulfeniteMod.rubyToolMaterial, "shovelruby").setCreativeTab(WulfeniteMod.tabwulfenite));
		axeruby = (ItemAxe) register(new ItemAxe(WulfeniteMod.rubyToolMaterial, "axeruby").setCreativeTab(WulfeniteMod.tabwulfenite));
		hoeruby = (ItemHoe) register(new ItemHoe(WulfeniteMod.rubyToolMaterial, "hoeruby").setCreativeTab(WulfeniteMod.tabwulfenite));
		// Molybdenum
		swordmolybdenum = (ItemSword) register(new ItemSword(WulfeniteMod.molybdenumToolMaterial, "swordmolybdenum").setCreativeTab(WulfeniteMod.tabwulfenite));
		pickmolybdenum = (ItemPickaxe) register(new ItemPickaxe(WulfeniteMod.molybdenumToolMaterial, "pickmolybdenum").setCreativeTab(WulfeniteMod.tabwulfenite));
		shovelmolybdenum = (ItemShovel) register(new ItemShovel(WulfeniteMod.molybdenumToolMaterial, "shovelmolybdenum").setCreativeTab(WulfeniteMod.tabwulfenite));
		axemolybdenum = (ItemAxe) register(new ItemAxe(WulfeniteMod.molybdenumToolMaterial, "axemolybdenum").setCreativeTab(WulfeniteMod.tabwulfenite));
		hoemolybdenum = (ItemHoe) register(new ItemHoe(WulfeniteMod.molybdenumToolMaterial, "hoemolybdenum").setCreativeTab(WulfeniteMod.tabwulfenite));
		
		// Init armor
		// Diamonite
		chestdiamonite = (ItemArmor) register(new ItemArmor(WulfeniteMod.diamoniteArmorMaterial, EntityEquipmentSlot.CHEST, "chestdiamonite").setCreativeTab(WulfeniteMod.tabwulfenite));
		legdiamonite = (ItemArmor) register(new ItemArmor(WulfeniteMod.diamoniteArmorMaterial, EntityEquipmentSlot.LEGS, "legdiamonite").setCreativeTab(WulfeniteMod.tabwulfenite));
		bootdiamonite = (ItemArmor) register(new ItemArmor(WulfeniteMod.diamoniteArmorMaterial, EntityEquipmentSlot.FEET, "bootdiamonite").setCreativeTab(WulfeniteMod.tabwulfenite));
		helmdiamonite = (ItemArmor) register(new ItemArmor(WulfeniteMod.diamoniteArmorMaterial, EntityEquipmentSlot.HEAD, "helmdiamonite").setCreativeTab(WulfeniteMod.tabwulfenite));
		// Crown
		crownwulfenite = (ItemArmor) register(new ItemArmor(WulfeniteMod.wulfeniteArmorMaterial, EntityEquipmentSlot.HEAD, "crownwulfenite").setCreativeTab(WulfeniteMod.tabwulfenite));
		// Ruby
		chestruby = (ItemArmor) register(new ItemArmor(WulfeniteMod.rubyArmorMaterial, EntityEquipmentSlot.CHEST, "chestruby").setCreativeTab(WulfeniteMod.tabwulfenite));
		legruby = (ItemArmor) register(new ItemArmor(WulfeniteMod.rubyArmorMaterial, EntityEquipmentSlot.LEGS, "legruby").setCreativeTab(WulfeniteMod.tabwulfenite));
		bootruby = (ItemArmor) register(new ItemArmor(WulfeniteMod.rubyArmorMaterial, EntityEquipmentSlot.FEET, "bootruby").setCreativeTab(WulfeniteMod.tabwulfenite));
		helmruby = (ItemArmor) register(new ItemArmor(WulfeniteMod.rubyArmorMaterial, EntityEquipmentSlot.HEAD, "helmruby").setCreativeTab(WulfeniteMod.tabwulfenite));
		// Amethyst
		chestamethyst = (ItemArmor) register(new ItemArmor(WulfeniteMod.amethystArmorMaterial, EntityEquipmentSlot.CHEST, "chestamethyst").setCreativeTab(WulfeniteMod.tabwulfenite));
		legamethyst = (ItemArmor) register(new ItemArmor(WulfeniteMod.amethystArmorMaterial, EntityEquipmentSlot.LEGS, "legamethyst").setCreativeTab(WulfeniteMod.tabwulfenite));
		bootamethyst = (ItemArmor) register(new ItemArmor(WulfeniteMod.amethystArmorMaterial, EntityEquipmentSlot.FEET, "bootamethyst").setCreativeTab(WulfeniteMod.tabwulfenite));
		helmamethyst = (ItemArmor) register(new ItemArmor(WulfeniteMod.amethystArmorMaterial, EntityEquipmentSlot.HEAD, "helmamethyst").setCreativeTab(WulfeniteMod.tabwulfenite));
		// Molybdenum
		chestmolybdenum = (ItemArmor) register(new ItemArmor(WulfeniteMod.molybdenumArmorMaterial, EntityEquipmentSlot.CHEST, "chestmolybdenum").setCreativeTab(WulfeniteMod.tabwulfenite));
		legmolybdenum = (ItemArmor) register(new ItemArmor(WulfeniteMod.molybdenumArmorMaterial, EntityEquipmentSlot.LEGS, "legmolybdenum").setCreativeTab(WulfeniteMod.tabwulfenite));
		bootmolybdenum = (ItemArmor) register(new ItemArmor(WulfeniteMod.molybdenumArmorMaterial, EntityEquipmentSlot.FEET, "bootmolybdenum").setCreativeTab(WulfeniteMod.tabwulfenite));
		helmmolybdenum = (ItemArmor) register(new ItemArmor(WulfeniteMod.molybdenumArmorMaterial, EntityEquipmentSlot.HEAD, "helmmolybdenum").setCreativeTab(WulfeniteMod.tabwulfenite));
		
		// Init food
		pyriteapple = (ItemFood) register(new ItemFood("pyriteapple", 10, 2.0f, false).setPotionEffect((new PotionEffect(MobEffects.NAUSEA, 800, 2)), 1.0f).setCreativeTab(WulfeniteMod.tabwulfenite));
		pyritemelon = (ItemFood) register(new ItemFood("pyritemelon", 5, 1.5f, false).setPotionEffect(new PotionEffect(MobEffects.NAUSEA, 400, 2), 1.0f).setCreativeTab(WulfeniteMod.tabwulfenite));
	}
	
	// Render items
	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);

		if (item instanceof ItemModelProvider) {
			((ItemModelProvider)item).registerItemModel(item);
		}

		return item;
	}

}
