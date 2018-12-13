package init;

import items.ItemDevSharpStick;
import items.ItemObsidianaxe;
import items.ItemObsidianbow;
import items.ItemObsidianhoe;
import items.ItemObsidianpickaxe;
import items.ItemObsidianshovel;
import items.ItemObsidiansword;
import me.luckycoder.test.Reference;
import me.luckycoder.test.Test;
import me.luckycoder.test.util.Utils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModTools {
	
	public static final ToolMaterial obsidianMaterial = EnumHelper.addToolMaterial(Reference.MODID + ":obsidian", 4, 5000, 40.0F, 16.0F, 12);
	public static final ToolMaterial devMaterial = EnumHelper.addToolMaterial(Reference.MODID + ":dev", 4, 10000, 80.0F, 34.0F, 40);
	
	
public static ItemPickaxe obsidianPickaxe;
public static ItemObsidianaxe obsidianAxe;
public static ItemHoe obsidianHoe;
public static ItemSpade obsidianShovel;
public static ItemSword obsidianSword;
public static ItemBow obsidianBow;

public static ItemSword devSword;


	public static void init() {
		obsidianPickaxe = new ItemObsidianpickaxe(obsidianMaterial, "obsidian_pickaxe");
		obsidianAxe = new ItemObsidianaxe(obsidianMaterial, "obsidian_axe");
		obsidianHoe = new ItemObsidianhoe(obsidianMaterial, "obsidian_hoe");
		obsidianShovel = new ItemObsidianshovel(obsidianMaterial, "obsidian_shovel");
		obsidianSword = new ItemObsidiansword(obsidianMaterial, "obsidian_sword");
		obsidianBow = new ItemObsidianbow(obsidianMaterial, "obsidian_bow");
		
		devSword = new ItemDevSharpStick(devMaterial, "dev_stick");
		
		
		
	}
	
	public static void register() {
		registerItem(obsidianPickaxe);
		registerItem(obsidianAxe);
		registerItem(obsidianHoe);
		registerItem(obsidianShovel);
		registerItem(obsidianSword);
		registerItem(obsidianBow);
		
		registerItem(devSword);
	}
	
	public static void registerRenders() {
		registerRender(obsidianPickaxe);
		registerRender(obsidianAxe);
		registerRender(obsidianHoe);
		registerRender(obsidianShovel);
		registerRender(obsidianSword);
		registerRender(obsidianBow);
		
		registerRender(devSword);
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



	}
	