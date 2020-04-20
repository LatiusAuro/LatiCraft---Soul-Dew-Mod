package latiusauro.souldew.proxy;

import latiusauro.souldew.SoulDewMod;
import latiusauro.souldew.init.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(value = Side.CLIENT, modid = SoulDewMod.MODID)
public class ModelRegistrationHandler {
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		registerModel(ModItems.SOUL_CRYSTAL, 0); // 1 Variant
		registerModel(ModItems.SOUL_ESSENCE, 0); // 10 Variants
		registerModel(ModItems.SOUL_DEW, 0); // 8 Variants
		registerModel(ModItems.SOUL_INGOT, 0); // 8 Variants
		registerModel(ModItems.SOUL_DEW_SWORD, 0); // 8 Variants
		registerModel(ModItems.SOUL_DEW_PICK, 0); // 5 Variants
	}

	private static void registerModel(Item item, int meta) {
		ModelLoader.setCustomModelResourceLocation(item, meta, 
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
