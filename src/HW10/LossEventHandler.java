package HW10;

import java.util.Map;

public class LossEventHandler implements EventHandler {
    @Override
    public void handle(Map<Integer, String> driverPositions, RaceEvent event) {
        int newPosition = event.getPosition();
        String driver = event.getDriver();

        if (!driverPositions.containsValue(driver)) {
            driverPositions.put(newPosition, driver);
        } else {
            int currentPosition = findDriverPosition(driverPositions, driver);
            String displacedDriver = driverPositions.get(newPosition);
            driverPositions.put(newPosition, driver);
            driverPositions.put(currentPosition, displacedDriver);
        }
    }

    private int findDriverPosition(Map<Integer, String> driverPositions, String driver) {
        for (Map.Entry<Integer, String> entry : driverPositions.entrySet()) {
            if (entry.getValue().equals(driver)) {
                return entry.getKey();
            }
        }
        return -1;
    }
}

