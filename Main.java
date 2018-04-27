// I definetly suggest making packages, but you can use this without packages
//Author RedstonedLife
package me.PluginName.InGameName;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.CommandExecutor

// Listener was removed, I don't think teaching events right away is good
public class Main extends JavaPlugin {
    public void onEnable() {
        System.out.println("PluginName is now enabled!");
        this.getCommand("CommandName").setExecutor(CommandExecutor() new CommandClassName());
    }
    
    public void onDisable() {
        System.out.println("PluginName is now disabled!");
    }
}

// This is the main class it will manage the commands the onEnable onDisable and maybe later some events too :D
