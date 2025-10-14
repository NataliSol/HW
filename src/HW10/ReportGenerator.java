package HW10;

import java.util.Map;
import java.util.TreeMap;

public class ReportGenerator implements IReportGenerator {
    @Override
    public String generateReport(Map<Integer, String> driverPositions) {
        StringBuilder reportBuilder = new StringBuilder();

        reportBuilder.append("position,driver\n");

        Map<Integer, String> sortedPositions = new TreeMap<>(driverPositions);

        for (Map.Entry<Integer, String> entry : sortedPositions.entrySet()) {
            int position = entry.getKey();
            String driver = entry.getValue();
            reportBuilder.append(position).append(",").append(driver).append("\n");
        }
        return reportBuilder.toString();
    }
}
