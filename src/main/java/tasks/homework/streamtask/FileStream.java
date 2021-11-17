package tasks.homework.streamtask;

//- построчно прочитать файл и создать стрим из его строк,
// пропустив первые 4 строки собрать коллекцию в отдну строку,
// разделить на по <br>, оставить только те, что начинаются с "Date log:",
// в каждой строке оставить только первые 20 символов, к каждой в конец дописать значение текущей даты

import java.io.IOException;
import java.time.LocalDate;
import java.util.stream.Collectors;

import static tasks.homework.streamtask.FileReader.read;


public class FileStream {

    public static void main(String[] args) throws IOException {

        String requestedLine = read("logfile.txt")
                .stream()
                .skip(4)
                .filter(x -> x.startsWith("Date log:"))
                .map(x -> x.substring(0, 20))
                .map(x -> x + " " + LocalDate.now())
                .collect(Collectors.joining("<br>"));

        System.out.println(requestedLine);
    }
}
