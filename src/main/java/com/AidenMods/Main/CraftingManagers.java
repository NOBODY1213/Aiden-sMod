package com.AidenMods.Main;

import com.AidenMods.Block.MBlocks;
import com.AidenMods.Item.MItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingManagers {
	public static void mainRegistry(){
		addCraftingRecipe();
		addSmeltingRecipe();
		
	}
	
	public static void addCraftingRecipe(){
		//Shaped
		GameRegistry.addRecipe(new ItemStack(MBlocks.ComStone, 1), new Object[]{"XXX","XXX","XXX", 'X', Blocks.stone});
		GameRegistry.addRecipe(new ItemStack(MItems.oStick, 1), new Object[]{" X ", " X ", 'X', Blocks.obsidian});
		GameRegistry.addRecipe(new ItemStack(Items.diamond, 1), new Object[]{" X "," Y ", 'X', MBlocks.ComStone, 'Y', MItems.oStick});
		GameRegistry.addRecipe(new ItemStack(MBlocks.WormStone, 64), new Object[]{"XXX","XYX","XXX", 'X', MBlocks.ComStone, 'Y', MItems.oStick});
		GameRegistry.addRecipe(new ItemStack(MItems.oPick, 1), new Object[]{"YYY"," X "," X ", 'Y', Blocks.obsidian, 'X', MItems.oStick});
		GameRegistry.addRecipe(new ItemStack(MItems.oAxe, 1), new Object[]{"YY ","YX "," X ", 'Y', Blocks.obsidian, 'X', MItems.oStick});
		GameRegistry.addRecipe(new ItemStack(MItems.oSpade, 1), new Object[]{" Y "," X "," X ", 'Y', Blocks.obsidian, 'X', MItems.oStick});
		GameRegistry.addRecipe(new ItemStack(MItems.oSword, 1), new Object[]{" Y "," Y "," X ", 'Y', Blocks.obsidian, 'X', MItems.oStick});
		GameRegistry.addRecipe(new ItemStack(MItems.oHoe, 1), new Object[]{"YY "," X "," X ", 'Y', Blocks.obsidian, 'X', MItems.oStick});
		GameRegistry.addRecipe(new ItemStack(MItems.oBlock, 1), new Object[]{"XXX", "XXX", "XXX", 'X', MItems.oShardItem});
		
		//Shapeless
		//GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 1), new Object[]{"SCO", 'S', Blocks.stone, 'C', MBlocks.ComStone, 'O', Blocks.obsidian});
		
	}
	
	public static void addSmeltingRecipe(){
		//Smelting
		GameRegistry.addSmelting(Blocks.coal_block, new ItemStack(Blocks.obsidian, 1), 20.0f);
		GameRegistry.addSmelting(MItems.oBlock, new ItemStack(Blocks.obsidian, 1), 20.0f);
		
	}
	
}