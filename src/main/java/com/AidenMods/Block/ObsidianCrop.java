package com.AidenMods.Block;


import com.AidenMods.Item.MItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class ObsidianCrop extends BlockCrops{
	@Override
	
	protected Item func_149866_i()
    {
        return MItems.oSeed;
    }
	@Override
    protected Item func_149865_P()
    {
        return MItems.oShardItem;
    }
	
}
