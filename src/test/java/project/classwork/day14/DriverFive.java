package project.classwork.day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFive {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.findElement(By.name("search"));
    }
}
