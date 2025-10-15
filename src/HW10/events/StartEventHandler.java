package HW10.events;

import HW10.core.RaceEvent;

import java.util.Map;

public class StartEventHandler implements EventHandler {
    public void handle(Map<String, Integer> driverPositions, RaceEvent event) {
        driverPositions.put(event.getDriver(), event.getPosition());
    }
}

