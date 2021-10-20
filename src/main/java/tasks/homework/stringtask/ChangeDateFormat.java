package tasks.homework.stringtask;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class ChangeDateFormat {

    public void changeDateFormat(String date) {

        DateTimeFormatter inputDatePatter = DateTimeFormatter.ofPattern("HH.mm dd.MM.yyyy");

        LocalDateTime convertedDatePattern = LocalDateTime.parse(date, inputDatePatter);

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("MMMM, d, yyyy HH:mm");

        String formattedDateAndTime = dateTimeFormatter1.format(convertedDatePattern);

        System.out.println(formattedDateAndTime);

    }
}
