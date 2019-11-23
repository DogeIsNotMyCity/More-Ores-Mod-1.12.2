package com.doge.moreoresmod.objects.tools;

import com.doge.moreoresmod.Main;
import com.doge.moreoresmod.init.ModItems;
import com.doge.moreoresmod.util.IHasModel;

import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel
{
    public ToolAxe(String name, ToolMaterial material)
    {
        super(material, 8.0f, -3.2f);
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
