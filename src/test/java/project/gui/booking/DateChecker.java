package project.gui.booking;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class DateChecker {

    @Test
    public static boolean checkForDate(String date) {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://booking.com");
        driver.findElement(By.xpath("//input[@type = 'search']")).sendKeys("Москва");
        driver.findElement(By.xpath("//button[@data-sb-id='main']")).click();
        driver.findElement(By.xpath(String.format("//td[@data-date = '%s']", date))).click();
        String value = Arrays.stream(driver.findElement(By.xpath("//h1[contains(text(),'Moscow')]")).getText().split(" ")).skip(1).findFirst().get();
        driver.close();
        driver.quit();
        return Integer.parseInt(value.replaceAll(",", "")) > 0;
    }

    public static void main(String[] args) {

    }
}








