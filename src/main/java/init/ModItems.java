package init;

import items.ItemObsidianingot;
import items.ItemObsidiannugget;
import me.luckycoder.test.Reference;
import me.luckycoder.test.Test;
import me.luckycoder.test.handlers.EnumHandler;
import me.luckycoder.test.util.Utils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item obsidian_ingot;
	public static Item obsidian_nugget;
	
	public static void init() {
		obsidian_ingot = new ItemObsidianingot("obsidian_ingot", "obsidian_ingot");
		obsidian_nugget = new ItemObsidiannugget("obsidian_nugget", "obsidian_nugget");
	}
	
	public static void register() {
		registerItem(obsidian_ingot);
		registerItem(obsidian_nugget);
	}
	public static void registerRenders() {
		registerRender(obsidian_ingot);
		registerRender(obsidian_nugget);
		}
	public static void registerItem(Item item) {
		item.setCreativeTab(Test.Lusm);
		GameRegistry.register(item);
		Utils.getLogger().info("Registered item " + item.getUnlocalizedName().substring(5));
		
		
	}
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory")); 
		Utils.getLogger().info("Register render for " + item.getUnlocalizedName().substring(5));
	}
	public static void registerRender(Item item, int meta, String fileName) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Reference.MODID, fileName), "inventory")); 
		Utils.getLogger().info("Register render for " + item.getUnlocalizedName().substring(5));
	}

}
