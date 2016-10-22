package trulscraft;

import java.util.ArrayList;
import java.util.List;

import api.IsaksApi;

public class Hologram_Handler extends IsaksApi {

	public ArrayList<String> getHoloWorlds() {
		ArrayList<String> worlds = new ArrayList<>();
		for (String key : config.getConfig().getConfigurationSection("holograms").getKeys(false)) {
			if (config.getConfig().get("holograms." + key + ".worldname") != null) {
				worlds.add(config.getConfig().getString("holograms." + key + ".worldname"));
			}
		}
		return worlds;
	}

	public void addLine(String name, int line, String linestring) {
		if (isHologramNameTaken(name)) {
			List<String> lines = config.getConfig().getStringList("holograms." + name + ".lines");
			lines.add(linestring);

			config.getConfig().set("holograms." + name + ".lines", lines);
			config.saveConfig();
		}
	}

	public void removeLine(String name, int line) {

	}

	public void addHologram(String name, double x, double y, double z, String world, String line) {
		ArrayList<String> lines = new ArrayList<>();
		lines.add(line);
		config.getConfig().set("holograms." + name + ".x", x);
		config.getConfig().set("holograms." + name + ".y", y);
		config.getConfig().set("holograms." + name + ".z", z);
		config.getConfig().set("holograms." + name + ".worldname", world);
		config.getConfig().set("holograms." + name + ".lines", lines);
		config.saveConfig();

	}

	public void removeHologram(String name) {
		config.getConfig().set("holograms." + name + ".x", null);
		config.getConfig().set("holograms." + name + ".y", null);
		config.getConfig().set("holograms." + name + ".z", null);
		config.getConfig().set("holograms." + name + ".worldname", null);
		config.getConfig().set("holograms." + name + ".lines", null);
		config.getConfig().set("holograms." + name, null);
		config.saveConfig();
	}

	public boolean isHologramNameTaken(String name) {
		if (config.getConfig().get("holograms." + name) != null) {
			return true;
		}
		return false;

	}
}
