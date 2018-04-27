package me.PluginName.InGameName;

// Imports
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandName extends CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        Player player = (Player) sender;
        if(!(sender instanceof Player)) { // If you want this off just comment it out using double /
            // This will check if our player is a console or a real player
            sender.sendMessage(ChatColor.Red + "ERROR: " + chatcolor.Gray + "You must be a player to execute this command!"); // Will send the player a message
            return true;
        }
        if(!(player.hasPermission("PluginName.CommandName")) {
           // Code goes here if the player doesn't have the permission
        } else {
          // Code goes here if player has the permission 
        }
        // Code goes here
        sender.sendMessage("Just to verify the command works!");
        return true;
    }
}

// This is an example command that will work requiring some permissions
// NEXT example command will require permissions.
