package trulscraft;

import org.bukkit.scheduler.BukkitRunnable;

import api.IsaksApi;

public class Hologram_Scheduler extends IsaksApi {

	
	public void startScheduler() {
	     new BukkitRunnable() {

			@Override
			public void run() {
				
				
			}
	    	 
	     }.runTaskTimer(this, 20, config.getConfig().getInt("Hologram_Update-Sekunder") * 20);
	}
}
