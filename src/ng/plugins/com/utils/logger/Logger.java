package ng.plugins.com.utils.logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;

public class Logger {

    public static String prefix = "[NgCore]";
    public static ConsoleCommandSender cs = Bukkit.getConsoleSender();

    public static void cl(LoggerType Type, String msg){
        switch (Type){
            case ON:
                cs.sendMessage(ChatColor.GREEN+prefix+" "+msg);
                break;
            case OFF:
                cs.sendMessage(ChatColor.RED+prefix+" "+msg);
                break;
            case ERROR:
                cs.sendMessage(ChatColor.DARK_RED+prefix+" "+msg);
                break;
        }
    }
}
