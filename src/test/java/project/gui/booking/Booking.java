package project.gui.booking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static project.gui.booking.DateChecker.checkForDate;
import static project.gui.booking.DateCheckerWithRating.checkForDateWithRating;


public class Booking {

    public static void main(String[] args) {

        String date = LocalDate.now().plusDays(7).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        checkForDate(date);
        checkForDateWithRating(date);

    }
}
