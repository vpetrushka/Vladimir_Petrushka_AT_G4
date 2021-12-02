package project.gui.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateChecker {

    public static boolean checkForDate(LocalDate date){

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://booking.com");
        driver.findElement(By.xpath("//input[@type = 'search']")).sendKeys("Москва");


        driver.close();
        driver.quit();








        return true;

    }

    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        System.out.println("input date in forman dd/mm/yyyy");
//        LocalDate date = in.nextLine(DateTimeFormatter.ofPattern("dd/MM/uuuu"))
        checkForDate(LocalDate.now());
    }







}
