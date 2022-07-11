package commandsplugin.firstplug;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;


public final class FirstPlug extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void onPlayerLog (PlayerJoinEvent event){

         public PlayerJoinEvent(@NotNull final Player playerJoined, @Nullable final String joinMessage) {
            super(playerJoined);
            this.joinMessage = joinMessage;
        }

    }

}
