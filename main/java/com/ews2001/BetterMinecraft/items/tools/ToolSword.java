package com.ews2001.BetterMinecraft.items.tools;

import com.ews2001.BetterMinecraft.Main;
import com.ews2001.BetterMinecraft.init.ModItems;
import com.ews2001.BetterMinecraft.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel{

	public ToolSword(String name,ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ModItems.ITEMS.add(this);
	}
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this,0,"inventory");	
	}

}


