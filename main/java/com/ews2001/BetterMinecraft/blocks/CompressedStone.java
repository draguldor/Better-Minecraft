package com.ews2001.BetterMinecraft.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CompressedStone extends BlockBase
{

	public CompressedStone(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(20.0f);
		setResistance(30.0f);
		setHarvestLevel("pickaxe", 1);
		// sets how well light goes through setLightOpacity();
		//setBlockUnbreakable(1);
	}
	
}
