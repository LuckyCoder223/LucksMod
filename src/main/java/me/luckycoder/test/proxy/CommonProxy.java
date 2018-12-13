package me.luckycoder.test.proxy;

import init.ModItems;
import me.luckycoder.test.Reference;
import me.luckycoder.test.tileentity.TileEntityObsidianFurnace;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

	public void init() {
	}
	
	public void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityObsidianFurnace.class, Reference.MODID + ":obsidian_furnace");
	}
	

	/**
	 * Registers the renders - refer to the
	 * {@link ClientProxy#registerRenders()}
	 */

	public void registerRenders() {
		
	}
	
}
