package init;

import items.ItemObsidianArmour;
import me.luckycoder.test.Reference;
import me.luckycoder.test.Test;
import me.luckycoder.test.util.Utils;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModArmour {
	
	public static ArmorMaterial obsidianMaterial = EnumHelper.addArmorMaterial("obsidian", Reference.MODID + ":obsidian", 50, new int[] {4,10,12,4}, 9, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 8.0F);
	
	public static ItemArmor obsidianHelmet;
	public static ItemArmor obsidianChestplate;
	public static ItemArmor obsidianLeggings;
	public static ItemArmor obsidianBoots;
	
	public static void init() {
		obsidianHelmet = new ItemObsidianArmour(obsidianMaterial, 1, EntityEquipmentSlot.HEAD, "obsidian_helmet");
		obsidianChestplate = new ItemObsidianArmour(obsidianMaterial, 1, EntityEquipmentSlot.CHEST, "obsidian_chestplate");
		obsidianLeggings = new ItemObsidianArmour(obsidianMaterial, 2, EntityEquipmentSlot.LEGS, "obsidian_leggings");
		obsidianBoots = new ItemObsidianArmour(obsidianMaterial, 1, EntityEquipmentSlot.FEET, "obsidian_boots");
		
	}
	
	public static void register() {
		registerItem(obsidianHelmet);
		registerItem(obsidianChestplate);
		registerItem(obsidianLeggings);
		registerItem(obsidianBoots);
	}
	
	public static void registerRenders() {
		registerRender(obsidianHelmet);
		registerRender(obsidianChestplate);
		registerRender(obsidianLeggings);
		registerRender(obsidianBoots);
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
