package net.ddns.mralbatraoz.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.ddns.mralbatraoz.creativetabs.MCreativeTabs;
import net.ddns.mralbatraoz.lib.RefStrings;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MItems {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
		
	}
	
	public static Item oStick;
	
	public static void initializeItem(){
		oStick = new Item().setUnlocalizedName("oStick").setCreativeTab(MCreativeTabs.MainTab).setTextureName(RefStrings.MODID + ":oStick") ;
		
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(oStick, oStick.getUnlocalizedName());
	}
}
