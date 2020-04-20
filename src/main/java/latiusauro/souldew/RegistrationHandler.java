package latiusauro.souldew;

import latiusauro.souldew.item.ItemSoulPickaxe;
import latiusauro.souldew.item.ItemSoulSword;
import latiusauro.souldew.materials.SoulDewMaterials;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = SoulDewMod.MODID)
public class RegistrationHandler {
	
	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		final Item[] items = {
				new Item().setRegistryName(SoulDewMod.MODID, "soul_essence").setTranslationKey(SoulDewMod.MODID + "." + "soul_essence").setCreativeTab(SoulDewMod.SOUL_DEW_TAB),
				new Item().setRegistryName(SoulDewMod.MODID, "soul_crystal").setTranslationKey(SoulDewMod.MODID + "." + "soul_crystal").setCreativeTab(SoulDewMod.SOUL_DEW_TAB),
				new Item().setRegistryName(SoulDewMod.MODID, "soul_dew").setTranslationKey(SoulDewMod.MODID + "." + "soul_dew").setCreativeTab(SoulDewMod.SOUL_DEW_TAB),
				new Item().setRegistryName(SoulDewMod.MODID, "soul_ingot").setTranslationKey(SoulDewMod.MODID + "." + "soul_ingot").setCreativeTab(SoulDewMod.SOUL_DEW_TAB),
				new ItemSoulSword(SoulDewMaterials.BASIC_SOUL_DEW).setRegistryName(SoulDewMod.MODID, "soul_dew_sword").setTranslationKey(SoulDewMod.MODID + "." + "soul_dew_sword").setCreativeTab(SoulDewMod.SOUL_DEW_TAB),
				new ItemSoulPickaxe(SoulDewMaterials.BASIC_SOUL_DEW).setRegistryName(SoulDewMod.MODID, "soul_dew_pick").setTranslationKey(SoulDewMod.MODID + "." + "soul_dew_pick").setCreativeTab(SoulDewMod.SOUL_DEW_TAB),
				
		};

		event.getRegistry().registerAll(items);
	}
}
