package latiusauro.souldew.recipes;

import latiusauro.souldew.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void initSmelting() {
		GameRegistry.addSmelting(ModItems.SOUL_DEW, new ItemStack(ModItems.SOUL_INGOT), 10.0F);
	}
}
