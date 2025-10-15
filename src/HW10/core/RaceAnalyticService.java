package HW10.core;


import HW10.converter.IDataConverter;
import HW10.events.*;
import HW10.io.IFileReader;
import HW10.io.IFileWriter;
import HW10.report.IReportGenerator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RaceAnalyticService {

    private final IFileReader fileReader;
    private final IFileWriter fileWriter;
    private final IDataConverter dataConverter;
    private final IReportGenerator reportGenerator;
    private final EventStrategy strategy;
    private final Map<String, Integer> driverPositions;

    public RaceAnalyticService(
            IFileReader fileReader,
            IFileWriter fileWriter,
            IDataConverter dataConverter,
            IReportGenerator reportGenerator
    ) {
        this.fileReader = fileReader;
        this.fileWriter = fileWriter;
        this.dataConverter = dataConverter;
        this.reportGenerator = reportGenerator;


        this.strategy = new EventStrategy(Map.of(
                EventType.S, new StartEventHandler(),
                EventType.P, new PassEventHandler(),
                EventType.L, new LossEventHandler(),
                EventType.F, new FinishEventHandler()
        ));

        this.driverPositions = new HashMap<>();
    }

    public void processRace(String filePathRead, String filePathWrite) {
        List<String[]> rawData = fileReader.read(filePathRead);

        List<RaceEvent> events = dataConverter.convert(rawData);

        for (RaceEvent event : events) {
            strategy.handleEvent(driverPositions, event);
        }

        String report = reportGenerator.generateReport(driverPositions);

        System.out.println(report);

        fileWriter.write(filePathWrite, report);

    }
}

