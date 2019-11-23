package com.doge.moreoresmod.init;

import java.util.ArrayList;
import java.util.List;

import com.doge.moreoresmod.Main;
import com.doge.moreoresmod.objects.blocks.BronzeBlock;
import com.doge.moreoresmod.objects.blocks.CopperBlock;
import com.doge.moreoresmod.objects.blocks.CopperOre;
import com.doge.moreoresmod.objects.blocks.TinBlock;
import com.doge.moreoresmod.objects.blocks.TinOre;
import com.doge.moreoresmod.objects.blocks.blast_furnace.BlastFurnace;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Ores
	public static final Block COPPER_ORE = new CopperOre("copper_ore", Material.ROCK);
	public static final Block TIN_ORE = new TinOre("tin_ore", Material.ROCK);
	
	//Material Blocks
	public static final Block COPPER_BLOCK = new CopperBlock("copper_block", Material.IRON);
	public static final Block TIN_BLOCK = new TinBlock("tin_block", Material.IRON);
	public static final Block BRONZE_BLOCK = new BronzeBlock("bronze_block", Material.IRON);
	
	public static final Block BLAST_FURNACE_OFF = new BlastFurnace("blast_furnace", false).setCreativeTab(Main.moreorestab);
	public static final Block BLAST_FURNACE_ON = new BlastFurnace("lit_blast_furnace", true);
}
