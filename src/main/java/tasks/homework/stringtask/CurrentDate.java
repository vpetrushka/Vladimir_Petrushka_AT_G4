package tasks.homework.stringtask;

//2.4 написать метод, который выводит в консоль текущую дату и время в формате:
//Сейчас на дворе:
//19 сентября, 2020, 3 часа 13 минут

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class CurrentDate {

    public void getCurrentDate(){

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM, yyyy, HH mm", new Locale( "ru"));

        LocalDateTime now = LocalDateTime.now();

        System.out.println("Сейчас на дворе:\n" + dateTimeFormatter.format(now));

    }
}
