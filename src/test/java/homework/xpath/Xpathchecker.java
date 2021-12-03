package homework.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Xpathchecker {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("src/test/java/homework/xpath/Spartak"));
        String line;
        while ((line = in.readLine()) != null) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-fullscreen");
            WebDriver driver = new ChromeDriver(options);
            driver.navigate().to("https://spartak.by");
            System.out.println(line);
            System.out.println(driver.findElement(By.xpath(line)));
            driver.close();
            driver.quit();
        }
        in.close();

        BufferedReader in = new BufferedReader(new FileReader("src/test/java/homework/xpath/Mailru"));
        String line;
        while ((line = in.readLine()) != null) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-fullscreen");
            WebDriver driver = new ChromeDriver(options);
            driver.navigate().to("https://mail.ru");
            System.out.println(line);
            System.out.println(driver.findElement(By.xpath(line)));
            driver.close();
            driver.quit();
        }
        in.close();
    }
}