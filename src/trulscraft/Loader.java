package trulscraft;

import org.bukkit.plugin.java.JavaPlugin;

import api.ConfigAPI;

public class Loader extends JavaPlugin {

	public void onEnable() {
		ConfigAPI api = ConfigAPI.getInstance();
		api.setup(this);
		saveDefaultConfig();
	}

}
