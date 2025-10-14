package HW10;

import java.util.List;

public interface IDataConverter {
    List<RaceEvent> convert(List<String[]> rawData);
}