package net.disaapsesv.gamecore.killthecore;

import org.bukkit.plugin.java.JavaPlugin;

import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;

public class GameCore extends JavaPlugin {

	private ProtocolManager protocolManager;

	@Override
	public void onEnable() {
		getLogger().info("Enable-GameCore");
		getLogger().info("--==KillTheCore==--");

		super.onEnable();
	}

	public void onDisable() {
		getLogger().info("Disable-GameCore");
		getLogger().info("--==KillTheCore==--");

		super.onDisable();
	}

	public void onLoad() {
	    protocolManager = ProtocolLibrary.getProtocolManager();
	}



}
