package com.jack.ranksystem;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RankCommand implements CommandExecutor {

    //          /rank <player> <rank>

    private Main main;

    public RankCommand(Main main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use that command!");
            return true;
        }
        Player player = (Player) sender;

        if (player.isOp()) {
            if (args.length == 2) {
                if (Bukkit.getOfflinePlayer(args[0]) != null) {
                    OfflinePlayer target = Bukkit.getOfflinePlayer(args[0]);
                    target.getUniqueId();

                    for (Rank rank : Rank.values()) {
                        if (rank.name().equalsIgnoreCase(args[1])) {
                            main.getRankManager().setRank(target.getUniqueId(), rank, false);

                            player.sendMessage("§aYou changed " + target.getName() + " 's rank to " + rank.getDisplay() + "§a.");
                            if (target.isOnline()) {
                                target.getPlayer().sendMessage("§a" + player.getName() + " set your rank to " + rank.getDisplay() + "§a.");
                            }
                            return true;
                        }
                    }

                    player.sendMessage("§cYou did not specify a valid rank!");
                } else {
                    player.sendMessage("§cThis user has never joined the server before!");
                }
            } else {
                player.sendMessage("§cInvalid usage! Please use /rank <player> <rank>");
            }
        } else {
            player.sendMessage("§cYou must be OP to use this command!");
        }


        return true;
    }
}
