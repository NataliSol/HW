package HW10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReaderImpl implements IFileReader {


    @Override
    public List<String[]> read(String fileName) {
        List<String[]> rows = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            boolean firstLine = true;

            while ((line = br.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }

                String[] values = line.split(",");
                rows.add(values);
            }

        } catch (IOException e) {
            System.err.println("Помилка при читанні: " + e.getMessage());
        }

        return rows;
    }
}
