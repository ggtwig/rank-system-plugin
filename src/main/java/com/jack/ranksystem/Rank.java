package com.jack.ranksystem;

import org.bukkit.ChatColor;

public enum Rank {

    KAGE("§cKage", new String[]{"crescentmoon.enma"}),
    JONIN("§bJonin", new String[]{}),
    CHUNIN("§eChunin", new String[]{}),
    GENIN("§2Genin", new String[]{}),
    ACADEMY("§7Academy", new String[]{});

    private String display;
    private String[] permissions;

    Rank(String display, String[] permissions) {
        this.display = display;
        this.permissions = permissions;
    }

    public String getDisplay() { return display; }
    public String[] getPermissions() { return permissions; }

}
