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
            reader.lines().forEach(line->{
                for (String key:logMap.keySet()){
                    if(line.contains(key)){
                        logMap.merge(key,1,Integer::sum);
                        break;
                    }
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter writer = new FileWriter("report.txt")) {
            for (Map.Entry<String, Integer> entry : logMap.entrySet()) {
                writer.write(entry.getKey() + ": <" + entry.getValue() + ">\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

