package com.AidenMods.Item;

import com.AidenMods.lib.RefStrings;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class oArmor extends ItemArmor {

	public oArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		
		if(stack.getItem() == MItems.oHelmet || stack.getItem() == MItems.oChest || stack.getItem() == MItems.oBoots) {
			return RefStrings.MODID + ":texture/armor/oArmor1.png";
		} else if(stack.getItem() == MItems.oPants) {
			return RefStrings.MODID + ":texture/armor/oArmor2.png";
		} else {
			return null;
		}
		
	}
	
}
