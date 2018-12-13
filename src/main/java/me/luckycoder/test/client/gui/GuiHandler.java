package me.luckycoder.test.client.gui;

import me.luckycoder.test.container.ContainerObsidianFurnace;
import me.luckycoder.test.tileentity.TileEntityObsidianFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

/**
 * Handles all of the gui's
 */
public class GuiHandler implements IGuiHandler {

	/**
	 * Each gui needs an ID
	 */

	public static final int OBSIDIAN_FURNACE = 0;

	/**
	 * Should return the container for that gui. This is called server side
	 * because servers handle items in guis
	 */
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		BlockPos pos = new BlockPos(x, y, z);
		switch (ID) {
		case OBSIDIAN_FURNACE:
			return new ContainerObsidianFurnace(player, (TileEntityObsidianFurnace) world.getTileEntity(pos));
		}
		return null;
	}

	/**
	 * Should return the actual gui. This is called client side as thats where
	 * guis are rendered
	 */
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		BlockPos pos = new BlockPos(x, y, z);
		switch (ID) {

		case OBSIDIAN_FURNACE:
			return new GuiObsidianFurnace(player, (TileEntityObsidianFurnace) world.getTileEntity(pos));
		}
		return null;
	}

}