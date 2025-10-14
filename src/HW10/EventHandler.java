package HW10;

import java.util.Map;

public interface EventHandler {
    public void handle(Map<Integer, String> driverPositions, RaceEvent event);

}
