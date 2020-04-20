package latiusauro.souldew;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import latiusauro.souldew.proxy.IProxy;
import latiusauro.souldew.recipes.ModRecipes;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = SoulDewMod.MODID, name = SoulDewMod.NAME, version = SoulDewMod.VERSION, acceptedMinecraftVersions = SoulDewMod.MC_VERSION)
public class SoulDewMod {
	public static final String MODID = "souldewmod";
	public static final String NAME = "LatiCraft Soul Dew Mod";
	public static final String VERSION = "0.0.1";
	public static final String MC_VERSION = "[1.12.2]";

	public static final Logger LOGGER = LogManager.getLogger(SoulDewMod.MODID);
	
	public static final String CLIENT = "latiusauro.souldew.proxy.ClientProxy";
	public static final String SERVER = "latiusauro.souldew.proxy.ServerProxy";
	@SidedProxy(clientSide = SoulDewMod.CLIENT, serverSide = SoulDewMod.SERVER)
	public static IProxy proxy;
	
	public static final CreativeTabs SOUL_DEW_TAB = new SoulDewTab();

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		LOGGER.info(SoulDewMod.NAME + " says hi!");
		ModRecipes.initSmelting();
		proxy.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}
