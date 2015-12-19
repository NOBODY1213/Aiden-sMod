package com.AidenMods.CreativeTabs;

import net.minecraft.creativetab.CreativeTabs;

public class MCreativeTabs {
	
	public static CreativeTabs tabBlock;
	public static CreativeTabs tabItems;
	public static CreativeTabs tabTools;
	public static CreativeTabs tabCombat;
	
	public static void initialiseTabs(){
		tabBlock = new CreativeTabBlock("BlockTab");
		tabItems = new CreativeTabItem("ItemTab");
		tabTools = new CreativeTabTool("ToolTab");
		tabCombat = new CreativeTabCombat("CombatTab");
		
	}
	
}