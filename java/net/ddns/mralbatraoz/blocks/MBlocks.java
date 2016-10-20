package net.ddns.mralbatraoz.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.ddns.mralbatraoz.creativetabs.MCreativeTabs;
import net.ddns.mralbatraoz.lib.RefStrings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


public class MBlocks {
	public static void mainRegistry(){
		initializeBlock();
		registerItem();
		
	}
	
	public static Block ComStone;
		
	
	public static void initializeBlock(){
		ComStone = new ComStone(Material.ground).setBlockName("ComStone").setCreativeTab(MCreativeTabs.MainTab).setBlockTextureName(RefStrings.MODID + ":ComStone");
		
	}
	
	public static void registerItem(){
		GameRegistry.registerBlock(ComStone, ComStone.getUnlocalizedName());
	}

}
