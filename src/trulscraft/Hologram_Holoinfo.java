package trulscraft;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;

import api.IsaksApi;

public class Hologram_Holoinfo extends IsaksApi {

	private String holoname;
	private double x;
	private double y;
	private double z;
	private String worldname;
	private List<String> lines;

	public Hologram_Holoinfo(String name) {
		holoname = name;
		x = config.getConfig().getDouble("holograms." + holoname + ".x");
		y = config.getConfig().getDouble("holograms." + holoname + ".y");
		z = config.getConfig().getDouble("holograms." + holoname + ".z");
		worldname = config.getConfig().getString("holograms." + holoname + ".worldname");
		lines = config.getConfig().getStringList("holograms." + holoname + ".lines");

	}

	public Location getLocation() {
		Location loc = new Location(Bukkit.getWorld(worldname), x, y, z);
		return loc;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getZ() {
		return z;
	}

	public String getWorldname() {
		return worldname;
	}

	public List<String> getLines() {
		return lines;
	}
}
