package com.doge.moreoresmod.util.handlers;

import com.doge.moreoresmod.objects.blocks.blast_furnace.ContainerBlastFurnace;
import com.doge.moreoresmod.objects.blocks.blast_furnace.GuiBlastFurnace;
import com.doge.moreoresmod.objects.blocks.blast_furnace.TileEntityBlastFurnace;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == ConfigHandler.GUI_BLAST_FURNACE)
		{
			return new ContainerBlastFurnace(player.inventory, (TileEntityBlastFurnace)world.getTileEntity(new BlockPos(x, y, z)));
		}
		return null;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == ConfigHandler.GUI_BLAST_FURNACE)
		{
			return new GuiBlastFurnace(player.inventory, (TileEntityBlastFurnace)world.getTileEntity(new BlockPos(x, y, z)));
		}
		return null;
	}
}
