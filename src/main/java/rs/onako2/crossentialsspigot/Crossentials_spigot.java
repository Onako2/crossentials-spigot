package rs.onako2.crossentialsspigot;

import org.bukkit.configuration.MemoryConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import rs.onako2.crossentialsspigot.commands.CrossentialsCommand;

public final class Crossentials_spigot extends JavaPlugin {

    FileConfiguration config = this.getConfig();

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("crossentials").setExecutor(new CrossentialsCommand());

        saveDefaultConfig();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
