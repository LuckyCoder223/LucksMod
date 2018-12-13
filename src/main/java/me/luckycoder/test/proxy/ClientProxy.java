package me.luckycoder.test.proxy;

import init.ModArmour;
import init.ModBlocks;
import init.ModItems;
import init.ModTools;
import me.luckycoder.test.Reference;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenders() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		ModTools.registerRenders();
		ModArmour.registerRenders();
		
	}
	
}

