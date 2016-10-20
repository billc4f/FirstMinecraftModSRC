package net.ddns.mralbatraoz.FirstMod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.ddns.mralbatraoz.blocks.MBlocks;
import net.ddns.mralbatraoz.item.MItems;
import net.ddns.mralbatraoz.lib.RefStrings;

@Mod(modid = RefStrings.MODID , name = RefStrings.NAME , version = RefStrings.VERSION)
public class MainRegistry {
	
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE, serverSide = RefStrings.SERVERSIDE )
	public static ServerProxy proxy;
	
	@EventHandler
	public static void PreLoad (FMLPreInitializationEvent PreEvent){
		MItems.mainRegistry();
		MBlocks.mainRegistry();
		CraftingManager.mainRegistry();
		proxy.registerRenderInfo();
	}
	
	@EventHandler
	public static void Load (FMLInitializationEvent Event){
		
	}
	
	@EventHandler
	public static void PostLoad (FMLPostInitializationEvent PostEvent){
		
	}
	

}
