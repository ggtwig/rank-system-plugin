package com.jack.ranksystem;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    /*
        RANK SYSTEM:
            - /rank command
            - Save in .yml file
            - Custom permissions
            - Nametags & chat display
     */

    private RankManager rankManager;

    @Override
    public void onEnable() {
        getCommand("rank").setExecutor(new RankCommand());

        rankManager = new RankManager(this);

        Bukkit.getPluginManager().registerEvents(new RankListener(this), this);
    }

    public RankManager getRankManager() { return rankManager; }

}
