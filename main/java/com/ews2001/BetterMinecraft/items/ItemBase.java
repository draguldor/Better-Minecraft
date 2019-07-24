package com.ews2001.BetterMinecraft.items;

import com.ews2001.BetterMinecraft.Main;
import com.ews2001.BetterMinecraft.init.ModItems;
import com.ews2001.BetterMinecraft.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this,0,"inventory");	
	}

}
