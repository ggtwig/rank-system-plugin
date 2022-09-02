package com.jack.ranksystem;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class RankListener implements Listener {

    private Main main;

    public RankListener(Main main) {
        this.main = main;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();

        if (!player.hasPlayedBefore()) {
            main.getRankManager().setRank(player.getUniqueId(), Rank.ACADEMY);
        }

    }

}
