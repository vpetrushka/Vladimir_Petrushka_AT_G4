package project.gui.booking;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateCheckerWithRating {

    public static void checkForDateWithRating(String date) {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://booking.com");
        driver.findElement(By.xpath("//input[@type = 'search']")).sendKeys("Москва");
        driver.findElement(By.xpath("//button[@data-sb-id='main']")).click();
        driver.findElement(By.xpath(String.format("//td[@data-date = '%s']", date))).click();
        driver.findElement(By.xpath("//div[@id = 'searchboxInc']/div/div/div/div/div[@data-filters-group = 'review_score']/div[contains(@data-filters-item,'90')]")).click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String firstSelected = driver.findElement(By.xpath("//div[@data-testid = 'property-card'][1]/div/div/div/a")).getAttribute("href");
        driver.navigate().to(firstSelected);
        double value = Double.parseDouble((driver.findElement(By.xpath("//div[@data-testid = 'review-score-right-component']/div[contains(@aria-label,' ')]")).getText()));
        Assert.assertTrue(value >= 9);
        driver.close();
        driver.quit();
    }
}