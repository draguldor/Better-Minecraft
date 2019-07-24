package com.ews2001.BetterMinecraft.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CopperBlock extends BlockBase
{

	public CopperBlock(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(10.0f);
		setResistance(20.0f);
		setHarvestLevel("pickaxe", 2);
		// sets how well light goes through setLightOpacity();
		//setBlockUnbreakable(1);
	}
	
}
