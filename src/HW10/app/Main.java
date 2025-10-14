package HW10.app;


import HW10.converter.DataConverterImpl;
import HW10.converter.IDataConverter;
import HW10.core.RaceAnalyticService;
import HW10.io.CsvReaderImpl;
import HW10.io.CsvWriter;
import HW10.io.IFileReader;
import HW10.io.IFileWriter;
import HW10.report.IReportGenerator;
import HW10.report.ReportGenerator;

public class Main {
    public static void main(String[] args) {
        String pathRead = "C:\\Users\\Наташа\\Desktop\\csv\\drivers.csv";
        String pathWrite = "C:\\Users\\Наташа\\Desktop\\csv\\resultList.csv";

        IFileReader reader = new CsvReaderImpl();
        IDataConverter converter = new DataConverterImpl();
        IReportGenerator reportGenerator = new ReportGenerator();
        IFileWriter writer=new CsvWriter();

        RaceAnalyticService service = new RaceAnalyticService(reader,writer, converter, reportGenerator);
        service.processRace(pathRead,pathWrite);
    }
}

