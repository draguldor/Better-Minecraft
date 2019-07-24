package com.ews2001.BetterMinecraft.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class InfernalStone extends BlockBase
{

	public InfernalStone(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(20.0f);
		setResistance(60.0f);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(1.0f);
		// sets how well light goes through setLightOpacity();
		//setBlockUnbreakable(1);
	}
	
}
