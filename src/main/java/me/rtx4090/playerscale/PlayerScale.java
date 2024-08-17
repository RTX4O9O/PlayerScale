package me.rtx4090.playerscale;

import com.google.common.eventbus.EventBus;
import me.rtx4090.playerscale.command.ScaleCommand;
import org.bukkit.map.MapView;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlayerScale extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("scale").setExecutor(new ScaleCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
