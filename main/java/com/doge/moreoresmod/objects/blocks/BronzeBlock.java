package com.doge.moreoresmod.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BronzeBlock extends BlockBase {

	public BronzeBlock(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0f);
		setResistance(30.0f);
		setHarvestLevel("pickaxe", 1);
	}
}
