package rs.onako2.crossentialsspigot.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import rs.onako2.crossentialsspigot.Crossentials_spigot;

import java.util.ArrayList;
import java.util.List;

public class CrossentialsCommand implements CommandExecutor, TabCompleter {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;

        new Crossentials_spigot().saveDefaultConfig();
        if (args.length == 0) {
            player.sendMessage(new Crossentials_spigot().getConfig().getString("stringSomeString"));
        }


        if (args.length >= 1) {
            switch (args[0]) {
                case "test":
                    player.sendMessage("Test!");
            }
        }


        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
        List<String> matches = new ArrayList<>();

        if (args.length == 1) {
            matches.add("test");
        }

        return matches;
    }
}
