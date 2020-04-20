package latiusauro.souldew.materials;

import latiusauro.souldew.SoulDewMod;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class SoulDewMaterials {
	public static final ToolMaterial BASIC_SOUL_DEW = EnumHelper.addToolMaterial(SoulDewMod.MODID + ":" +"basic_soul_dew", 1, 400, 5.0F, 1.5F, 5);
	// Data = 0
	public static final ToolMaterial SOUL_DEW = EnumHelper.addToolMaterial(SoulDewMod.MODID + ":" +"soul_dew", 2, 650, 7.0F, 2.5F, 10);
	// Data = 1
	public static final ToolMaterial ADVANCED_SOUL_DEW = EnumHelper.addToolMaterial(SoulDewMod.MODID + ":" +"advanced_soul_dew", 3, 1000, 9.0F, 3.5F, 13);
	// Data = 2 or 3 [Lesser Wither]
	public static final ToolMaterial END_SOUL_DEW = EnumHelper.addToolMaterial(SoulDewMod.MODID + ":" +"end_soul_dew", 3, 1300, 11.0F, 4.5F, 15);
	// Data = 4 [Ender], 5 [Shulker] or 6 [Greater Wither]
	public static final ToolMaterial BOSS_SOUL_DEW = EnumHelper.addToolMaterial(SoulDewMod.MODID + ":" +"boss_soul_dew", 1, 1750, 13.5F, 6.0F, 20);
	// Data = 7 [Draconic] or 8 [Wither]
}
