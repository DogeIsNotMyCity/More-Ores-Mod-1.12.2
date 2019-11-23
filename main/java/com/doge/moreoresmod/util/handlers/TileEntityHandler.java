package com.doge.moreoresmod.util.handlers;

import com.doge.moreoresmod.objects.blocks.blast_furnace.TileEntityBlastFurnace;
import com.doge.moreoresmod.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityBlastFurnace.class, new ResourceLocation(Reference.MODID + ":blast_furnace"));
	}
}
