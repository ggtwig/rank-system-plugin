package com.jack.ranksystem;

import org.bukkit.ChatColor;

public enum Rank {

    KAGE(ChatColor.RED + "Kage", new String[]{"worldedit.help"}),
    JONIN(ChatColor.AQUA + "Jonin", new String[]{"worldedit.help"}),
    CHUNIN(ChatColor.YELLOW + "Chunin", new String[]{}),
    GENIN(ChatColor.DARK_GREEN + "Genin", new String[]{}),
    ACADEMY(ChatColor.GRAY + "Academy", new String[]{});

    private String display;
    private String[] permissions;

    Rank(String display, String[] permissions) {
        this.display = display;
        this.permissions = permissions;
    }

    public String getDisplay() { return display; }
    public String[] getPermissions() { return permissions; }

}
