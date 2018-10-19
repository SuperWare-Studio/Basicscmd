package main;

import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("插件启动");
	}
	@Override
	public void onDisable() {
		System.out.println("插件关闭");
	}
	@Override
	public void onLoad() {
		System.out.println("插件重载");
	}
}
