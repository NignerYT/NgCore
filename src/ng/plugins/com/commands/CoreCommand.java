package ng.plugins.com.commands;

import ng.plugins.com.Core;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CoreCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        Player p = (Player)sender;
        if(sender.equals("ngcore")){
            if(!p.hasPermission("ngcore.admin")){
                p.sendMessage("§6" + Core.getInstance().getName() + " §7[" + Core.getInstance().getDescription().getVersion() + "] §f- §7Criado por §5Maxteer§7.");
                return false;
            }


        }
        return false;
    }
}
