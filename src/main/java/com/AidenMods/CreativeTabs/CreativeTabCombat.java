package com.AidenMods.CreativeTabs;

import com.AidenMods.Block.MBlocks;
import com.AidenMods.Item.MItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabCombat extends CreativeTabs {

	public CreativeTabCombat(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		
		return MItems.oSword;
	}

}
