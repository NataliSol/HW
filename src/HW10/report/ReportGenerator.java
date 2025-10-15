package HW10.report;

import java.util.*;

public class ReportGenerator implements IReportGenerator {
    @Override
    public String generateReport(Map<String, Integer> driverPositions) {
        StringBuilder reportBuilder = new StringBuilder();

        reportBuilder.append("driver,final_position\n");

        Map<Integer, String> sortedByPosition = new TreeMap<>();
        for (Map.Entry<String, Integer> entry : driverPositions.entrySet()) {
            sortedByPosition.put(entry.getValue(), entry.getKey());
        }

        for (Map.Entry<Integer, String> entry : sortedByPosition.entrySet()) {
            String driver = entry.getValue();
            int position = entry.getKey();
            reportBuilder.append(driver).append(",").append(position).append("\n");
        }

        return reportBuilder.toString();
    }
}
