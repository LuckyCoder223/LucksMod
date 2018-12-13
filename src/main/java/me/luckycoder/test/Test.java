package me.luckycoder.test;

import init.ModArmour;
import init.ModBlocks;
import init.ModItems;
import init.ModTools;
import me.luckycoder.test.creativetabs.TabLUSM;
import me.luckycoder.test.handlers.RecipeHandler;
import me.luckycoder.test.proxy.CommonProxy;
import me.luckycoder.test.tileentity.TileEntityObsidianFurnace;
import me.luckycoder.test.util.Utils;
import me.luckycoder.test.worldgen.OreGen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class Test {
	
	public static final CreativeTabs Lusm = new TabLUSM(null);

	
	@Instance
	public static Test instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModItems.init();
		ModBlocks.init();
		ModTools.init();
		ModArmour.init();
		ModItems.register();
		ModBlocks.register();
		ModTools.register();
		ModArmour.register();
		
		proxy.registerRenders();
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		proxy.init();
		GameRegistry.registerWorldGenerator(new OreGen(), 0);
		RecipeHandler.registerCraftingRecipes();
		RecipeHandler.registerFurnaceRecipes();
		
		
	}
	
	public void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityObsidianFurnace.class, Reference.MODID + ":obsidian_furnace");
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event)
	{
		
	
		
	}
}
