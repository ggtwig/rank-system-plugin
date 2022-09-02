package com.jack.ranksystem;

import org.bukkit.ChatColor;

public enum Rank {

    KAGE(ChatColor.RED + "Kage"),
    JONIN(ChatColor.AQUA + "Jonin"),
    CHUNIN(ChatColor.YELLOW + "Chunin"),
    GENIN(ChatColor.DARK_GREEN + "Genin"),
    ACADEMY(ChatColor.GRAY + "Academy");

    private String display;

    Rank(String display) {
        this.display = display;
    }

    public String getDisplay() { return display; }
}
