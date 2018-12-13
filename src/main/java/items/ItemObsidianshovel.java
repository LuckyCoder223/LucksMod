package items;


import me.luckycoder.test.Reference;
import net.minecraft.item.ItemSpade;
import net.minecraft.util.ResourceLocation;

public class ItemObsidianshovel extends ItemSpade {

	public ItemObsidianshovel(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
	}
	

		
	
}