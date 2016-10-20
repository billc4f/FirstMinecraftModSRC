package net.ddns.mralbatraoz.FirstMod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.ddns.mralbatraoz.blocks.MBlocks;
import net.ddns.mralbatraoz.item.MItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CraftingManager {
	public static void mainRegistry(){
		addCraftingRec();
		addSmeltingRec();
	}
	public static void addCraftingRec(){
		//Shaped
		GameRegistry.addRecipe(new ItemStack(MBlocks.ComStone, 1), new Object[]{"XXX","XXX","XXX", 'X', Blocks.stone});	
		GameRegistry.addRecipe(new ItemStack(Item.getItemById(122), 1), new Object[]{"SOS","SDS","SOS",'O',Blocks.obsidian,'S',Blocks.obsidian,'D',Items.nether_star});
		GameRegistry.addRecipe(new ItemStack(MItems.oStick, 1), new Object[]{"O  ","O  ","   ",'O',Blocks.obsidian});
		GameRegistry.addRecipe(new ItemStack(MItems.oStick, 1), new Object[]{" O "," O ","   ",'O',Blocks.obsidian});
		GameRegistry.addRecipe(new ItemStack(MItems.oStick, 1), new Object[]{"  O","  O","   ",'O',Blocks.obsidian});
		GameRegistry.addRecipe(new ItemStack(MItems.oStick, 1), new Object[]{"   ","O  ","O  ",'O',Blocks.obsidian});
		GameRegistry.addRecipe(new ItemStack(MItems.oStick, 1), new Object[]{"   "," O "," O ",'O',Blocks.obsidian});
		GameRegistry.addRecipe(new ItemStack(MItems.oStick, 1), new Object[]{"   ","  O","  O",'O',Blocks.obsidian});
		//shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.grass, 1) , new Object[]{ Items.wheat_seeds, Blocks.dirt, Items.melon_seeds, Items.pumpkin_seeds});
		}
	public static void addSmeltingRec(){
		
	}
}
