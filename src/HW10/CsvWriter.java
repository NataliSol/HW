package HW10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CsvWriter implements IFileWriter {
    @Override
    public void write(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
            System.out.println("Файл записаний: " + filePath);
        } catch (IOException e) {
            System.err.println("Помилка при записі: " + e.getMessage());
        }
    }
}
