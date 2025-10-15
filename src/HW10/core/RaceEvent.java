package HW10.core;

import HW10.events.EventType;

public class RaceEvent{
    private EventType type;
    private String driver;
    private Integer position;

    public RaceEvent(EventType type, String driver, int position) {
        this.type = type;
        this.driver = driver;
        this.position = position;
    }

    public EventType getType() {
        return type;
    }

    public String getDriver() {
        return driver;
    }

    public int getPosition() {
        return position;
    }


    public EventType type() {
        return type;
    }
}
