package net.ddns.mralbatraoz.creativetabs;

import net.ddns.mralbatraoz.blocks.MBlocks;
import net.ddns.mralbatraoz.item.MItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab extends CreativeTabs {

	public CreativeTab(String lable) {
		super(lable);
		
	}

	@Override
	public Item getTabIconItem() {
		return MItems.oStick;
	}

}
