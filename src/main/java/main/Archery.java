package main;

import obj.StallManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Archery extends JavaPlugin {

    private StallManager stallManager;

    @Override
    public void onEnable() {
        this.stallManager = new StallManager(this);
    }

    public StallManager getStallManager() {
        return this.stallManager;
    }
}
