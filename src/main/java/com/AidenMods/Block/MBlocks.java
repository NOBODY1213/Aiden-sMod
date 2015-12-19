package com.AidenMods.Block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.AidenMods.CreativeTabs.MCreativeTabs;
import com.AidenMods.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;


public class MBlocks {

	public static void mainRegestry(){
		intilizeBlock();
		registerBlock();
	};

	public static Block ComStone;
	public static Block WormStone;
	
	public static Block oCrop;
	
	public static void intilizeBlock(){
		ComStone = new ComStone(Material.ground).setBlockName("ComStone").setCreativeTab(MCreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":ComStone");
		WormStone = new WormStone(Material.ground).setBlockName("WormStone").setCreativeTab(MCreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":WormStone");
		oCrop = new ObsidianCrop().setBlockName("oCrop").setBlockTextureName(RefStrings.MODID + ":oPlant");
		
	}

	public static void registerBlock(){
		GameRegistry.registerBlock(ComStone, ComStone.getUnlocalizedName());
		GameRegistry.registerBlock(WormStone, WormStone.getUnlocalizedName());
		GameRegistry.registerBlock(oCrop, oCrop.getUnlocalizedName());
		
	}

}
