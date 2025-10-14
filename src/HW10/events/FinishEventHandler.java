package HW10.events;

import HW10.core.RaceEvent;

import java.util.Map;

public class FinishEventHandler implements EventHandler {
    public void handle(Map<Integer, String> driverPositions, RaceEvent event) {
        driverPositions.put(event.getPosition(), event.getDriver());
    }
}

