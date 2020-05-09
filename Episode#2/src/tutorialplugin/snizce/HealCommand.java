package tutorialplugin.snizce;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class HealCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
			if(sender instanceof Player) {
				Player player = (Player) sender;
				player.setHealth(20);
				player.setFireTicks(0);
				player.sendMessage(ChatColor.GREEN + "You have been healed!");
			}else {
				System.out.println("Your not a player!");
			}
		
		return true;
	}

}
