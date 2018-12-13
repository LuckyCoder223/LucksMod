package items;

import me.luckycoder.test.Reference;
import net.minecraft.item.ItemBow;
import net.minecraft.util.ResourceLocation;

public class ItemObsidianbow extends ItemBow {
	
	public ItemObsidianbow(ToolMaterial material, String unlocalizedName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));

}
}
