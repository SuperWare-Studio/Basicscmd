package main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("����������");
	}
	@Override
	public void onDisable() {
		System.out.println("���ж�����");
	}
	@Override
	public void onLoad() {
		System.out.println("����������");
	}	
	//command
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		//about kill someone
		if(command.getName().equalsIgnoreCase("kill myself")) {
			if(sender instanceof Player) {
				Player p = (Player) sender;
				//ǿ��ת��senderΪ���
				p.setHealth(0);
				//��������ֵΪ0��ɱ�����
				p.sendMessage("��c����ɱ��");
				return true;
				}
			}
				if(args.length == 0) {
					sender.sendMessage("��c/kill myself");
					return true;
				}
				if(!sender.hasPermission("Basicscmd.killmyself")) {
					sender.sendMessage("��c��û����������Ȩ��");
					return true;
				}

		return false;
	}
}
