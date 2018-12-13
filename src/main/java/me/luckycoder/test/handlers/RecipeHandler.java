package me.luckycoder.test.handlers;

import init.ModArmour;
import init.ModBlocks;
import init.ModItems;
import init.ModTools;
import me.luckycoder.test.util.Utils;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler {
	
	public static void registerCraftingRecipes() {
		registerToolRecipe(ModTools.obsidianPickaxe, ModTools.obsidianAxe, ModTools.obsidianHoe, ModTools.obsidianShovel, ModTools.obsidianSword, ModItems.obsidian_ingot, ModTools.obsidianBow);
		registerArmourRecipe(ModArmour.obsidianHelmet, ModArmour.obsidianChestplate, ModArmour.obsidianLeggings, ModArmour.obsidianBoots, ModItems.obsidian_ingot);
		Utils.getLogger().info("Registered Crafting Recipes!");
	}
	
	public static void registerFurnaceRecipes() {
		GameRegistry.addSmelting(ModBlocks.obsidian_ore, new ItemStack(ModItems.obsidian_nugget), 1.5f);
		Utils.getLogger().info("Registered Furance Recipes!");
	}
	
	
	public static void registerToolRecipe(Item pickaxe, Item axe, Item hoe, Item shovel, Item sword, Item itemObsidianingot, Item bow) {
		GameRegistry.addRecipe(new ItemStack(pickaxe), new Object[] {"III"," S "," S ", 'I', itemObsidianingot, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(axe), new Object[] {" II"," SI"," S ", 'I', itemObsidianingot, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(axe), new Object[] {"II ","IS "," S ", 'I', itemObsidianingot, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(hoe), new Object[] {"II "," S "," S ", 'I', itemObsidianingot, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(hoe), new Object[] {" II"," S "," S ", 'I', itemObsidianingot, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(shovel), new Object[] {" I "," S "," S ", 'I', itemObsidianingot, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(shovel), new Object[] {"I  ","S  ","S  ", 'I', itemObsidianingot, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(shovel), new Object[] {"  I","  S","  S", 'I', itemObsidianingot, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(sword), new Object[] {" I "," I "," S ", 'I', itemObsidianingot, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(sword), new Object[] {"I  ","I  ","S  ", 'I', itemObsidianingot, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(sword), new Object[] {"  I","  I","  S", 'I', itemObsidianingot, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.lucks_block), new Object[] {"WLW","DOD","WLW", 'I', itemObsidianingot, 'W', Items.WATER_BUCKET, 'D', Items.DIAMOND, 'L', Blocks.LAPIS_BLOCK, 'O', ModItems.obsidian_ingot });
		GameRegistry.addRecipe(new ItemStack(ModItems.obsidian_ingot), new Object[] { "TTT", "TTT", "TTT", 'T', ModItems.obsidian_nugget });
		GameRegistry.addRecipe(new ItemStack(Blocks.OBSIDIAN), new Object[] { "TTT", "TTT", "TTT", 'T', ModItems.obsidian_ingot });
		GameRegistry.addRecipe(new ItemStack(bow), new Object[] {"ISR","S R","ISR", 'I', itemObsidianingot, 'S', Items.STICK, 'R', Items.STRING });
		
	}
	
	public static void registerArmourRecipe(Item helmet, Item chestplate, Item leggings, Item boots, Item ingot) {
		GameRegistry.addRecipe(new ItemStack(helmet), new Object[] { "III","I I","   ",'I',ingot});
		GameRegistry.addRecipe(new ItemStack(helmet), new Object[] { "   ","III","I I",'I',ingot});
		GameRegistry.addRecipe(new ItemStack(chestplate), new Object[] { "I I","III","III",'I',ingot});
		GameRegistry.addRecipe(new ItemStack(leggings), new Object[] { "III","I I","I I",'I',ingot});
		GameRegistry.addRecipe(new ItemStack(boots), new Object[] { "I I","I I","   ",'I',ingot});
		GameRegistry.addRecipe(new ItemStack(boots), new Object[] { "   ","I I","I I",'I',ingot});
	}

}
