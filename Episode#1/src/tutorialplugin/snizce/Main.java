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
	}
	
	@Override
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "TutPlugin disabled!");
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("test")) {
			if(sender instanceof Player) {
				Player player = (Player) sender;
				player.sendMessage(ChatColor.GREEN + "You ran the test command!");
			}else {
				System.out.println("Your not a player!");
			}
		}
		
		return true;
	}
}
