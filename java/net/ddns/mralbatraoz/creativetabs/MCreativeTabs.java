package net.ddns.mralbatraoz.creativetabs;

import net.minecraft.creativetab.CreativeTabs;

public class MCreativeTabs {
	
	public static CreativeTabs MainTab;

	public static void initializeTabs(){
		MainTab = new CreativeTab("MainTab");
	}
}
