package project.classwork.day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Locale;

public class DriverSix {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        String todaysDate = DateTimeFormatter.ofPattern("EEEE").withLocale(new Locale("be","BE")).format(LocalDate.now().plus(1, ChronoUnit.DAYS));

        driver.navigate().to("https://google.com");
        driver.findElement(By.name("q")).sendKeys("погода Минск");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//span[contains(.,'сейчас')]")).click();
        driver.findElement(By.xpath("//div[@id='wob_dp']/div[@data-wob-di='1']")).click();
        String temperature = driver.findElement(By.xpath(String.format("//*[contains( @aria-label , 'Celsius %s 12:00')][1]",todaysDate))).getAttribute("aria-label");
        System.out.println(Arrays.stream(temperature.split("°")).findFirst().get());
        driver.close();
        driver.quit();
    }
}
