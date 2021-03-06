package ninja.stupdn;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import ninja.stupdn.proxy.IProxy;
import ninja.stupdn.util.STUPDNLogger;

@Mod(modid = STUPDN.MOD_ID, name = STUPDN.MOD_NAME, version = STUPDN.MOD_VERSION)
public class STUPDN 
{
    public static final String MOD_ID = "stupdn";
    public static final String MOD_NAME = "STUPDN";
    public static final String MOD_VERSION = "@VERSION@";

    @Mod.Instance(STUPDN.MOD_ID)
    public static STUPDN instance;

    @SidedProxy(clientSide = "ninja.stupdn.proxy.ServerProxy", serverSide = "ninja.stupdn.proxy.ClientProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        STUPDNLogger.debug("STUPDN pre-initialisation has been completed!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        STUPDNLogger.debug("STUPDN initialisation has been completed!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        STUPDNLogger.debug("STUPDN post-initialisation has been completed!");
    }
}
