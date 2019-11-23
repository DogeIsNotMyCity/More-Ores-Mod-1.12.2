package com.doge.moreoresmod.tabs;

import com.doge.moreoresmod.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MoreOresTab extends CreativeTabs 
{
	public MoreOresTab(String label) { super("moreorestab"); }
	public ItemStack getTabIconItem() { return new ItemStack(Item.getItemFromBlock(ModBlocks.COPPER_ORE)); }
}
