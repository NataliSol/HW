package HW10.events;

import HW10.core.RaceEvent;

import java.util.Map;

public interface EventHandler {
    void handle(Map<String, Integer> driverPositions, RaceEvent event);

}
