package main;

import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("�������");
	}
	@Override
	public void onDisable() {
		System.out.println("����ر�");
	}
	@Override
	public void onLoad() {
		System.out.println("�������");
	}
}
