package no.datsuag;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import no.datsuag.listeners.TestListener;

public class Main extends JavaPlugin {
	
	private final static double DEFAULT_BOX_CHANCE = 0.5;
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new TestListener(), this);
		JavaPlugin plugin = new Main();
		plugin.saveDefaultConfig();
		plugin.getConfig().addDefault("boxChance", DEFAULT_BOX_CHANCE);
	}
	
	@Override
	public void onDisable() {
		
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (command.getName().equalsIgnoreCase("testcommand")) { 
			sender.sendMessage("You ran my command");
			return true;
		}
		return false;
	}
}
