package HW10.converter;

import HW10.core.RaceEvent;

import java.util.List;

public interface IDataConverter {
    List<RaceEvent> convert(List<String[]> rawData);
}