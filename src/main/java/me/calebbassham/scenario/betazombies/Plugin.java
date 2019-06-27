package me.calebbassham.scenario.betazombies;

import me.calebbassham.scenariomanager.ScenarioManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        ScenarioManager.register(new BetaZombies(), this);
    }
}
