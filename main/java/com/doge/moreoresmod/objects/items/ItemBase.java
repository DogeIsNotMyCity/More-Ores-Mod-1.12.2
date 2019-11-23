package com.doge.moreoresmod.objects.items;

import com.doge.moreoresmod.Main;
import com.doge.moreoresmod.init.ModItems;
import com.doge.moreoresmod.util.IHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name) 
	{
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
