package tutorialplugin.snizce;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class FlyCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
			if(sender instanceof Player) {
				Player player = (Player) sender;
				if(player.getAllowFlight() == false) {
					player.setAllowFlight(true);
					player.sendMessage(ChatColor.GRAY + "Flight Enabled!");
				}else {
					player.setAllowFlight(false);
					player.sendMessage(ChatColor.GRAY + "Flight Disabled!");
				}
			}else {
				System.out.println("Your not a player!");
			}
		
		return true;
	}

}
