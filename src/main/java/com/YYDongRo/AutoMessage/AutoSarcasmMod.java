package com.yydongro.autosarcasm;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = AutoSarcasmMod.MODID, version = AutoSarcasmMod.VERSION)
public class AutoSarcasmMod {
    public static final String MODID = "autosarcasm";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new ChatListener());
    }
}
