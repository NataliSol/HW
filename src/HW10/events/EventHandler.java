package HW10.events;

import HW10.core.RaceEvent;

import java.util.Map;

public interface EventHandler {
    public void handle(Map<Integer, String> driverPositions, RaceEvent event);

}
