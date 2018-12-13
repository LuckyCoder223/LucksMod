package items;

import me.luckycoder.test.Reference;
import net.minecraft.item.ItemHoe;
import net.minecraft.util.ResourceLocation;

public class ItemObsidianhoe extends ItemHoe {

	public ItemObsidianhoe(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
	}
	



}
