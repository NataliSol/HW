package HW10.core;

import HW10.events.*;

import java.util.Map;

final class EventStrategy {
    private final Map<EventType, EventHandler> handlers;
    EventStrategy(Map<EventType, EventHandler> handlers) { this.handlers = handlers; }

    void handleEvent(Map<String,Integer> d, RaceEvent e) {
        handlers.getOrDefault(e.type(), (x,y)->{}).handle(d, e); // без switch і new
    }
}
