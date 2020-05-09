package tutorialplugin.snizce;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + "TutPlugin enabled!");
		getCommand("test").setExecutor(new TestCommand());
		getCommand("heal").setExecutor(new HealCommand());
		getCommand("feed").setExecutor(new FeedCommand());
		getCommand("fly").setExecutor(new FlyCommand());
	}
	
	@Override
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "TutPlugin disabled!");
	}
}
