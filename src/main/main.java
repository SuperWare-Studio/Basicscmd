package main;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
	@Override
	public void onEnable() {
		System.out.println("插件被启动了");
	}
	@Override
	public void onDisable() {
		System.out.println("插件被关闭了");
	}
	@Override
	public void onLoad() {
		System.out.println("插件已重载");
	}
	//command
	@Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(label.equalsIgnoreCase("hello")){
             String playerName = args[0];   //获取这个名字
			 Player player = Bukkit.getPlayer(playerName);  //让Spigot在服务器找一个叫playerName的玩家，如果不存在，就是null
			 player.sendMessage(sender.getName()+"对你说：你好！");   //发送信息
        }
    return true;
    }
}