package HW10;


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

