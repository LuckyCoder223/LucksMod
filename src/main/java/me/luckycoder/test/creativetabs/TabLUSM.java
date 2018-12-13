package me.luckycoder.test.creativetabs;

import init.ModBlocks;
import init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TabLUSM extends CreativeTabs {

	public TabLUSM(String label) {
		super("lusm");
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModBlocks.lucks_block);
	}

}
