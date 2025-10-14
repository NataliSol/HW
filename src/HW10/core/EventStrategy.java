package HW10.core;

import HW10.events.FinishEventHandler;
import HW10.events.LossEventHandler;
import HW10.events.PassEventHandler;
import HW10.events.StartEventHandler;

import java.util.Map;

public class EventStrategy {
    public EventStrategy() {
    }

    public void handleEvent(Map<Integer, String> driverPositions, RaceEvent event) {
        switch (event.getType()) {
            case "s":
                new StartEventHandler().handle(driverPositions, event);
                break;
            case "p":
                new PassEventHandler().handle(driverPositions, event);
                break;
            case "l":
                new LossEventHandler().handle(driverPositions, event);
                break;
            case "f":
                new FinishEventHandler().handle(driverPositions, event);
                break;
            default:
                System.out.println("Тип активності не ідентифікованний");
        }
    }
}

