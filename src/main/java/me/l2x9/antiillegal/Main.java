package me.l2x9.antiillegal;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.l2x9.antiillegal.listener.ItemStackCreateListener;

/**
 * @author 254n_m
 * @since 6/9/22/ 8:40 PM
 * This file was created as a part of L2X9AntiIllegal
 */
public final class Main extends JavaPlugin {
    private static Main instance;

    public static Main getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        getLogger().addHandler(new LoggerHandler());
        Bukkit.getPluginManager().registerEvents(new ItemStackCreateListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
