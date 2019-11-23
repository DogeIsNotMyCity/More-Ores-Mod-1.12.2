package com.doge.moreoresmod.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CopperOre extends BlockBase {

	public CopperOre(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(3.0f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 1);
	}
}
