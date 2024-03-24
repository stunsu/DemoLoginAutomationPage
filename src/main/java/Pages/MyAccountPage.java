package Pages;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class MyAccountPage {
    public static void checkMyAccountPage(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.titleContains("My Lidl Account"));

        String title = driver.getTitle();
        System.out.println("You are on the page: " +title);
        Assert.assertEquals("My Lidl Account", title);

    }
}
