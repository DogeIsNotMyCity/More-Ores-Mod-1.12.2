package com.doge.moreoresmod.objects.tools;

import com.doge.moreoresmod.Main;
import com.doge.moreoresmod.init.ModItems;
import com.doge.moreoresmod.util.IHasModel;

import net.minecraft.item.ItemHoe;

public class ToolHoe extends ItemHoe implements IHasModel
{
	public ToolHoe(String name, ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.moreorestab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
