package tasks.homework.streamtask;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    public static List<String> read(String file) throws IOException {
        BufferedReader in = new BufferedReader(new java.io.FileReader(file));
        String line;
        List<String> list = new ArrayList<>();
        while ((line = in.readLine()) != null) {
            list.add(line);
        }
        in.close();
        return list;
    }
}
