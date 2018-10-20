package main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("插件启动完成");
	}
	@Override
	public void onDisable() {
		System.out.println("插件卸载完成");
	}
	@Override
	public void onLoad() {
		System.out.println("插件重载完成");
	}	
	//command
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		//about kill someone
		if(command.getName().equalsIgnoreCase("kill myself")) {
			if(sender instanceof Player) {
				Player p = (Player) sender;
				//强制转换sender为玩家
				p.setHealth(0);
				//设置生命值为0，杀死玩家
				p.sendMessage("§c您自杀了");
				return true;
				}
			}
				if(args.length == 0) {
					sender.sendMessage("§c/kill myself");
					return true;
				}
				if(!sender.hasPermission("Basicscmd.killmyself")) {
					sender.sendMessage("§c您没有这个命令的权限");
					return true;
				}

		return false;
	}
}
