package items;

import me.luckycoder.test.Reference;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;

public class ItemObsidiansword extends ItemSword {

	public ItemObsidiansword(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
	}
	
		
	
}