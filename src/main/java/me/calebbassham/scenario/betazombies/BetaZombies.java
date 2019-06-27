package me.calebbassham.scenario.betazombies;

import me.calebbassham.scenariomanager.Scenario;
import me.calebbassham.scenariomanager.ScenarioManager;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import java.util.concurrent.ThreadLocalRandom;

public class BetaZombies extends Scenario implements Listener {

    @EventHandler
    public void onKillZombie(EntityDeathEvent e) {
        Entity entity = e.getEntity();
        if (!(entity instanceof Zombie)) return;
        if(!ScenarioManager.isWorld(entity.getWorld())) return;
        e.getDrops().clear();
        e.getDrops().add(new ItemStack(Material.FEATHER, ThreadLocalRandom.current().nextInt(0, 3)));
    }

}