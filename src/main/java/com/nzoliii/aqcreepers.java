package com.nzoliii;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
	modid = aqcreepers.MODID,
	name = aqcreepers.NAME,
	version = aqcreepers.VERSION
)
public class aqcreepers {
	public static final String MODID = "aqcreepers";
	public static final String NAME = "Al Qaeda Creepers";
	public static final String VERSION = "1.1";
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent preinit) {
		LOGGER.info("aqcreepers loaded or something.");
	}
}
