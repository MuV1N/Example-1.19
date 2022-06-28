package yourland.yourname.example;

import org.bukkit.plugin.java.JavaPlugin;

public final class Example extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("This is an Example Plugin by Muv1N");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
