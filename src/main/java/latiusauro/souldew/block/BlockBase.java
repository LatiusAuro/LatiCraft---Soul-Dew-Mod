package latiusauro.souldew.block;

import latiusauro.souldew.SoulDewMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBase extends Block {
	public BlockBase(String name, Material material) {
		super(material);
		setRegistryName(SoulDewMod.MODID, name);
		setTranslationKey(SoulDewMod.MODID + "." + name);
		setCreativeTab(SoulDewMod.SOUL_DEW_TAB);
	}
}
