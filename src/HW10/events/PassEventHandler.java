package HW10.events;

import HW10.core.RaceEvent;

import java.util.Map;

public class PassEventHandler implements EventHandler {
    @Override
    public void handle(Map<String, Integer> driverPositions, RaceEvent event) {
        int newPosition = event.getPosition();
        String driver = event.getDriver();

        if (!driverPositions.containsKey(driver)) {
            driverPositions.put(driver, newPosition);
        } else {
            int currentPosition = driverPositions.get(driver);
            String displacedDriver = findDriverByPosition(driverPositions, newPosition);

            driverPositions.put(driver, newPosition);
            if (displacedDriver != null) {
                driverPositions.put(displacedDriver, currentPosition);
            }
        }
    }

    private String findDriverByPosition(Map<String, Integer> driverPositions, int position) {
        for (Map.Entry<String, Integer> entry : driverPositions.entrySet()) {
            if (entry.getValue() == position) {
                return entry.getKey();
            }
        }
        return null;

    }
}

