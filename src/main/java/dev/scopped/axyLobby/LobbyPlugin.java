package dev.scopped.axyLobby;

import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;

public class LobbyPlugin {

    private final LobbyBootstrap bootstrap;

    public LobbyPlugin(LobbyBootstrap bootstrap) {
        this.bootstrap = bootstrap;
    }

    public void reload() {

    }

    public void disable() {

    }

    public Server server() {
        return bootstrap.getServer();
    }

    public JavaPlugin bootstrap() {
        return bootstrap;
    }
}
