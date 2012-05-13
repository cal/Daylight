package com.github.cal.Daylight;

import org.bukkit.plugin.java.JavaPlugin;

public class Daylight extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        // Bow chicka bow wow
        getServer().getPluginManager().registerEvents(new DaylightListener(), this);
    }

    @Override
    public void onDisable()
    {
    }
}
