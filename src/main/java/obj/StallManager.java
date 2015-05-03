package obj;

import main.Archery;

import java.util.HashSet;

public class StallManager {

    private final HashSet<Stall> stalls = new HashSet<Stall>();

    public StallManager(Archery arch) {
        new StallTimer(this).runTaskTimer(arch, 0L, 60L);
    }

    public void add(Stall s) {
        stalls.add(s);
    }

    public boolean inUse() {
        for(Stall s : stalls) {
            if(s.isOccupied()) return true;
        }
        return false;
    }

    public HashSet<Stall> getStalls() {
        return this.stalls;
    }

}
