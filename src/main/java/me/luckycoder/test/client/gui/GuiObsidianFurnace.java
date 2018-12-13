package me.luckycoder.test.client.gui;

import me.luckycoder.test.Reference;
import me.luckycoder.test.container.ContainerObsidianFurnace;
import me.luckycoder.test.network.PacketGetWorker;
import me.luckycoder.test.network.PacketHandler;
import me.luckycoder.test.tileentity.TileEntityObsidianFurnace;
import me.luckycoder.core.client.gui.GuiBase;
import me.luckycoder.core.client.gui.element.ElementProgressBar;
import me.luckycoder.core.client.gui.element.ElementProgressBar.ProgressBarDirection;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;

public class GuiObsidianFurnace extends GuiBase {

	public static final ResourceLocation TEXTURE = new ResourceLocation(Reference.MODID, "textures/gui/container/obsidian_furnace.png");
	
	private static int sync = 0;
	
	public static int burnMin = 1, burnMax = 1;
	public static int cookMin = 0, cookMax = 1;
	
	private TileEntityObsidianFurnace te;
	
	public GuiObsidianFurnace(EntityPlayer player, TileEntityObsidianFurnace te) {
		super(new ContainerObsidianFurnace(player, te), TEXTURE);
		setGuiSize(176, 166);
		this.te = te;
		this.name = "container.obsidian_furnace";
	}
	
	@Override
	public void initGui() {
		super.initGui();
		addElement(new ElementProgressBar(this, 56, 36, 14, 14).setDirection(ProgressBarDirection.UP_TO_DOWN).setTextureUV(176, 0).setTexture(TEXTURE, 256, 256));
		addElement(new ElementProgressBar(this, 79, 34, 24, 18).setDirection(ProgressBarDirection.LEFT_TO_RIGHT).setTextureUV(176, 14).setTexture(TEXTURE, 256, 256));
	}
	
	@Override
	protected void updateElementInformation() {
		super.updateElementInformation();
		
		if (burnMin == 0)
			burnMin = burnMax;
		
		((ElementProgressBar) this.elements.get(0)).setMin(burnMin).setMax(burnMax);
		((ElementProgressBar) this.elements.get(1)).setMin(cookMin).setMax(cookMax);
		
		sync++;
		sync %= 10;
		if (sync == 0) {
			PacketHandler.INSTANCE.sendToServer(new PacketGetWorker(this.te.getPos(), EnumFacing.NORTH, "me.luckycoder.test.client.gui.GuiObsidianFurnace", "burnMin", "burnMax"));
			PacketHandler.INSTANCE.sendToServer(new PacketGetWorker(this.te.getPos(), EnumFacing.SOUTH, "me.luckycoder.test.client.gui.GuiObsidianFurnace", "cookMin", "cookMax"));
		}
	}

}


