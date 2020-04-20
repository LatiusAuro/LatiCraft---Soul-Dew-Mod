package latiusauro.souldew;

import latiusauro.souldew.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SoulDewTab extends CreativeTabs {
	public  SoulDewTab() {
		super(SoulDewMod.MODID);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack createIcon() {
		// TODO Auto-generated method stub
		return new ItemStack(ModItems.SOUL_DEW);
	}
}
