package project.classwork.day14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFour {

    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://google.com");
        driver.navigate().to("https://ya.ru");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.close();
    }
}
