package dev.scopped.axyLobby;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class LobbyBootstrap extends JavaPlugin {

    private LobbyPlugin plugin;

    @Override
    public void onEnable() {
        try {
            this.plugin = new LobbyPlugin(this);
        } catch (Exception e) {
            getLogger().log(Level.SEVERE, "Failed to load plugin", e);
            getServer().getPluginManager().disablePlugin(this);
        }
    }

    @Override
    public void onDisable() {
        if (this.plugin != null) this.plugin.disable();
    }
}
