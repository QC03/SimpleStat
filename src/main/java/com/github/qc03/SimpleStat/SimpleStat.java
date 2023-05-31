package com.github.qc03.SimpleStat;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class SimpleStat extends JavaPlugin implements Listener {

    @Override
    public void onEnable()
    {
        Bukkit.getPluginManager().registerEvents(this, this);
    }
}
