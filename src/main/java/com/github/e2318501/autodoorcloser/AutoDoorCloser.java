package com.github.e2318501.autodoorcloser;

import com.github.e2318501.autodoorcloser.listener.PlayerListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class AutoDoorCloser extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerListener(this), this);
    }

    @Override
    public void onDisable() {
    }
}
