package HW10.converter;

import HW10.core.RaceEvent;
import HW10.events.EventType;

import java.util.ArrayList;
import java.util.List;

public class DataConverterImpl implements IDataConverter {
    @Override
    public List<RaceEvent> convert(List<String[]> csvData) {
        List<RaceEvent> events = new ArrayList<>();

        for (String[] row : csvData) {
            if (row.length >= 3) {
                String typeStr = row[0].trim().toUpperCase(); // на всякий случай приводим к верхнему регистру
                String driver = row[1].trim();
                int position = Integer.parseInt(row[2].trim());

                try {
                    EventType type = EventType.valueOf(typeStr); // ✅ преобразуем строку в enum
                    RaceEvent event = new RaceEvent(type, driver, position);
                    events.add(event);
                } catch (IllegalArgumentException e) {
                    System.out.println("Невідомий тип події: " + typeStr);
                }
            }
        }
        return events;
    }
}

