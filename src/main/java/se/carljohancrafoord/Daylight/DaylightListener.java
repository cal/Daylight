package com.github.cal.Daylight;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.server.ServerListPingEvent;

public class DaylightListener implements Listener {

    @EventHandler
    public void onServerListPing(ServerListPingEvent event) {
        long time = Bukkit.getServer().getWorld("world").getTime();
        String timeWord = "";
        if (time < 12500 || time > 23500) {
            timeWord = "day";
        }
        else if (time < 13000) {
            timeWord = "sunset";
        }
        else if (time < 14000) {
            timeWord = "dusk";
        }
        else if (time < 22000) {
            timeWord = "night";
        }
        else if (time < 23000) {
            timeWord = "dawn";
        }
        else if (time < 23500) {
            timeWord = "sunrise";
        }
        event.setMotd(event.getMotd() + " (" + timeWord + ")");
    }
}