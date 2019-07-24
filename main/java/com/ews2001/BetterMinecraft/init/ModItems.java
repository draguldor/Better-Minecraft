package com.ews2001.BetterMinecraft.init;

import java.util.ArrayList;
import java.util.List;

import com.ews2001.BetterMinecraft.items.ItemBase;
import com.ews2001.BetterMinecraft.items.armor.ArmorBase;
import com.ews2001.BetterMinecraft.items.tools.ToolAxe;
import com.ews2001.BetterMinecraft.items.tools.ToolHoe;
import com.ews2001.BetterMinecraft.items.tools.ToolPickaxe;
import com.ews2001.BetterMinecraft.items.tools.ToolSpade;
import com.ews2001.BetterMinecraft.items.tools.ToolSword;
import com.ews2001.BetterMinecraft.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	//Materials
	public static final ToolMaterial MATERIAL_PLATINUM = EnumHelper.addToolMaterial("material_platinum", 3, 1561, 10.0f, 9.0f, 10);
	public static final ArmorMaterial ARMOR_MATERIAL_PLATINUM = EnumHelper.addArmorMaterial("material_platinum", Reference.MOD_ID + ":platinum", 1600, new int[] {2, 7, 6, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f);
	
	
	//items
	public static final List<Item> ITEMS = new ArrayList<Item>();
			// items
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
	
	public static final Item TUNGSTEN_INGOT = new ItemBase("tungsten_ingot");
	
	public static final Item STEEL_ONE = new ItemBase("steel_one");
	
	public static final Item STEEL_two = new ItemBase("steel_two");
	
	public static final Item STEEL_ONE_SHARD = new ItemBase("steel_one_shard");
	
	public static final Item STEEL_TWO_SHARD = new ItemBase("steel_two_shard");
	
	public static final Item DEMONIC_INGOT = new ItemBase("demonic_ingot");
	
	public static final Item DEMONIC_ESSENCE = new ItemBase("demonic_essence");
	
	public static final Item PLATNIUM_INGOT = new ItemBase("platinum_ingot");
	
	public static final Item PLATNIUM_NUGGET = new ItemBase("platinum_nugget");
	
	public static final Item IMPERIAL_DIAMOND_ITEM = new ItemBase("imperial_diamond_item");
	
	
	//Tools
	public static final ItemSword PLATINUM_SWORD = new ToolSword("platinum_sword", MATERIAL_PLATINUM);
	public static final ItemSpade PLATINUM_SHOVEL = new ToolSpade("platinum_shovel", MATERIAL_PLATINUM);
	public static final ItemAxe PLATINUM_AXE = new ToolAxe("platinum_axe", MATERIAL_PLATINUM);
	public static final ItemPickaxe PLATINUM_PICKAXE = new ToolPickaxe("platinum_pickaxe", MATERIAL_PLATINUM);
	public static final ItemHoe PLATINUM_HOE = new ToolHoe("platinum_hoe", MATERIAL_PLATINUM);
	
	
	//Armor
	public static final Item PLATINUM_HELMET = new ArmorBase("platinum_helmet", ARMOR_MATERIAL_PLATINUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item PLATINUM_CHESTPLATE = new ArmorBase("platinum_chestplate", ARMOR_MATERIAL_PLATINUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item PLATINUM_BOOTS = new ArmorBase("platinum_boots", ARMOR_MATERIAL_PLATINUM, 1, EntityEquipmentSlot.FEET);
	public static final Item PLATINUM_LEGGINGS = new ArmorBase("platinum_leggings", ARMOR_MATERIAL_PLATINUM, 1, EntityEquipmentSlot.LEGS);
}
