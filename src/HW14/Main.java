package HW14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {
        Map<String, Integer> logMap = new HashMap<>(Map.of(
                "INFO", 0,
                "WARN", 0,
                "ERROR", 0
        ));
        try (BufferedReader reader = new BufferedReader(new FileReader("server.log"))) {
             String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("INFO")) {
                    Integer info = logMap.get("INFO");
                    logMap.replace("INFO", info + 1);
                } else if (line.contains("WARN")) {
                    Integer info = logMap.get("WARN");
                    logMap.replace("WARN", info + 1);
                } else if (line.contains("ERROR")) {
                    Integer info = logMap.get("ERROR");
                    logMap.replace("ERROR", info + 1);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter writer = new FileWriter("report.txt")) {
            for (Map.Entry<String, Integer> entry : logMap.entrySet()) {
                writer.write(entry.getKey() + ": <" + entry.getValue()+"> "+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

