package HW10;

import java.util.ArrayList;
import java.util.List;

public class DataConverterImpl implements IDataConverter {
    @Override
    public List<RaceEvent> convert(List<String[]> csvData) {
        List<RaceEvent> events = new ArrayList<>();

        for (String[] row : csvData) {
            if (row.length >= 3) {
                String type = row[0].trim();
                String driver = row[1].trim();
                int position = Integer.parseInt(row[2].trim());

                RaceEvent event = new RaceEvent(type, driver, position);
                events.add(event);
            }
        }
        return events;
    }
}

