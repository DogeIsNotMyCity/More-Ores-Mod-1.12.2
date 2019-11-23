package com.doge.moreoresmod.init;

import java.util.ArrayList;
import java.util.List;

import com.doge.moreoresmod.objects.armour.ArmourBase;
import com.doge.moreoresmod.objects.items.ItemBase;
import com.doge.moreoresmod.objects.tools.ToolAxe;
import com.doge.moreoresmod.objects.tools.ToolHoe;
import com.doge.moreoresmod.objects.tools.ToolPickaxe;
import com.doge.moreoresmod.objects.tools.ToolShovel;
import com.doge.moreoresmod.objects.tools.ToolSword;
import com.doge.moreoresmod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial TOOL_BRONZE = EnumHelper.addToolMaterial("tool_bronze", 1, 196, 5.0f, 1.5f, 7);
	public static final ArmorMaterial ARMOUR_BRONZE = EnumHelper.addArmorMaterial("armour_bronze", Reference.MODID + ":bronze", 13, new int[]{2, 5, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f);
	
	//Items
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
	public static final Item TIN_INGOT = new ItemBase("tin_ingot");
	public static final Item BRONZE_INGOT = new ItemBase("bronze_ingot");
	
	//Tools
	public static final Item BRONZE_SWORD = new ToolSword("bronze_sword", TOOL_BRONZE);
	public static final Item BRONZE_PICKAXE = new ToolPickaxe("bronze_pickaxe", TOOL_BRONZE);
	public static final Item BRONZE_SHOVEL = new ToolShovel("bronze_shovel", TOOL_BRONZE);
	public static final Item BRONZE_AXE = new ToolAxe("bronze_axe", TOOL_BRONZE);
	public static final Item BRONZE_HOE = new ToolHoe("bronze_hoe", TOOL_BRONZE);
	
	//Armour
	public static final Item BRONZE_HELMET = new ArmourBase("bronze_helmet", ARMOUR_BRONZE, 1, EntityEquipmentSlot.HEAD);
	public static final Item BRONZE_CHESTPLATE = new ArmourBase("bronze_chestplate", ARMOUR_BRONZE, 1, EntityEquipmentSlot.CHEST);
	public static final Item BRONZE_LEGGINGS = new ArmourBase("bronze_leggings", ARMOUR_BRONZE, 2, EntityEquipmentSlot.LEGS);
	public static final Item BRONZE_BOOTS = new ArmourBase("bronze_boots", ARMOUR_BRONZE, 1, EntityEquipmentSlot.FEET);
}
