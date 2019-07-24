package com.ews2001.BetterMinecraft.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PlatinumOre extends BlockBase
{

	public PlatinumOre(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(30.0f);
		setResistance(85.0f);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(2.0f);
		// sets how well light goes through setLightOpacity();
		//setBlockUnbreakable(1);
	}
	
}
