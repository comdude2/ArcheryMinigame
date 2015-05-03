package obj;

import org.bukkit.ChatColor;
import org.bukkit.scheduler.BukkitRunnable;

public class StallTimer extends BukkitRunnable {

    private final StallManager sm;

    public StallTimer(StallManager instance) {
        this.sm = instance;
    }

    @Override
    public void run() {
        //don't run anything if no stalls are occupied
        if(sm.inUse()) {
            for(Stall s : sm.getStalls()) {
                if(s.isOccupied()) {
                    int seconds = (int) (System.currentTimeMillis() - s.getTimeStamp()) / 1000;
                    switch(seconds) {
                        case 60:
                            //light 1
                        case 120:
                            //light 2
                        case 180:
                            s.getPlayer().sendMessage(ChatColor.GREEN + "2:30 Minutes remaining!");
                            //light 3
                        case 240:
                            //light 4
                        case 300:
                            //light 5
                    }
                }
            }
        }
    }

}