package trulscraft;

import org.bukkit.entity.Player;

public class Hologram_PlaceHolders {

	public String replace(String key, Player p) {
		key.replaceAll("", "");
		return key;

	}
}
