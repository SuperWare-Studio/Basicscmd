package main;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
	@Override
	public void onEnable() {
		System.out.println("�����������");
	}
	@Override
	public void onDisable() {
		System.out.println("������ر���");
	}
	@Override
	public void onLoad() {
		System.out.println("���������");
	}
	//command
	@Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(label.equalsIgnoreCase("hello")){
             String playerName = args[0];   //��ȡ�������
			 Player player = Bukkit.getPlayer(playerName);  //��Spigot�ڷ�������һ����playerName����ң���������ڣ�����null
			 player.sendMessage(sender.getName()+"����˵����ã�");   //������Ϣ
        }
    return true;
    }
}