package obj;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Stall implements ConfigurationSerializable {
    private final Location door, teleport;
    private UUID rentedBy = null;
    private long timeStamp;

    public Stall(Location door, Location teleport) {
        this.door = door;
        this.teleport = teleport;
    }

    public void rent(UUID uuid) {
        this.rentedBy = uuid;
        this.timeStamp = System.currentTimeMillis();
        //lights
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public UUID getUUID() {
        return this.rentedBy;
    }

    public Player getPlayer() {
        return Bukkit.getPlayer(this.rentedBy);
    }

    public boolean isOccupied() {
        return this.rentedBy == null ? false : true;
    }

    public Map<String, Object> serialize() {
        HashMap map = new HashMap<String, Object>();
        return map;
    }
}
