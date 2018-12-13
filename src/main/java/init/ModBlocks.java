package init;



import blocks.BlockLucksblock;
import blocks.BlockObsidianFurnace;
import blocks.BlockObsidianOre;
import me.luckycoder.test.Reference;
import me.luckycoder.test.Test;
import me.luckycoder.test.handlers.EnumHandler;
import me.luckycoder.test.util.Utils;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	//Blocks
	public static Block obsidian_ore;
	public static Block lucks_block;
	
	//Machines
	public static Block obsidian_furnace;

	
	public static void init() {
		//Blocks
		obsidian_ore = new BlockObsidianOre("obsidian_ore", "obsidian_ore");
		lucks_block = new BlockLucksblock("lucks_block", "lucks_block");
		//Machines
		obsidian_furnace = new BlockObsidianFurnace("obsidian_furnace");
		
	}
	
	public static void register() {
		//Blocks
		registerBlock(obsidian_ore);
		registerBlock(lucks_block);
		//Machines
		registerBlock(obsidian_furnace);
		
	}
	
	public static void registerRenders() {
		//Blocks
		registerRender(obsidian_ore);
		registerRender(lucks_block);
		//Machines
		registerRender(obsidian_furnace);
		
		}
	
	public static void registerBlock(Block block) {
		block.setCreativeTab(Test.Lusm);
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		Utils.getLogger().info("Registered Block: " + block.getUnlocalizedName().substring(5));
	}
	
	public static void registerBlock(Block block, ItemBlock itemBlock) {
		GameRegistry.register(block);
		GameRegistry.register(itemBlock.setRegistryName(block.getRegistryName()));
		Utils.getLogger().info("Registered Block: " + block.getUnlocalizedName().substring(5));
	}
	
	public static void registerRender(Block block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
		Utils.getLogger().info("Registered render for: " + block.getUnlocalizedName().substring(5));
	}
	
	public static void registerRender(Block block, int meta, String fileName) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(Reference.MODID, fileName), "inventory")); 
		Utils.getLogger().info("Register render for " + block.getUnlocalizedName().substring(5));
	}

}
