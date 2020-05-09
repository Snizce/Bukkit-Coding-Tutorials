package tutorialplugin.snizce;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class TestCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
			if(sender instanceof Player) {
				Player player = (Player) sender;
				player.sendMessage(ChatColor.GREEN + "You ran the test command!");
			}else {
				System.out.println("Your not a player!");
			}
		
		return true;
	}
}
