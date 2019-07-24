package com.ews2001.BetterMinecraft.init;

import java.util.ArrayList;

import com.ews2001.BetterMinecraft.blocks.BlockBase;
import com.ews2001.BetterMinecraft.blocks.CompressedStone;
import com.ews2001.BetterMinecraft.blocks.CopperBlock;
import com.ews2001.BetterMinecraft.blocks.InfernalStone;
import com.ews2001.BetterMinecraft.blocks.PlatinumBlock;
import com.ews2001.BetterMinecraft.blocks.PlatinumOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import java.util.List;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block COPPER_BLOCK = new CopperBlock("copper_block", Material.IRON);
	
	public static final Block COPPER_ORE = new BlockBase("copper_ore", Material.IRON);
	
	public static final Block COMPRESSED_STONE = new CompressedStone("compressed_stone", Material.IRON);
	
	public static final Block PLATINUM_ORE = new PlatinumOre("platinum_ore", Material.IRON);
	
	public static final Block INFERNAL_STONE = new InfernalStone("infernal_stone", Material.IRON);
	
	public static final Block PLATINUM_BLOCK = new PlatinumBlock("platinum_block", Material.IRON);
	
	public static final Block IMPERIAL_DIAMOND = new BlockBase("imperial_block", Material.IRON);
}
