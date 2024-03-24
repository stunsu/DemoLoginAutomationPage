package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePageCockieConsent {
    public static void checkHomepage(WebDriver driver) {
        String title = driver.getTitle();
        System.out.println("You are on the Homepage: " +title);
        Assert.assertEquals("LIDL lohnt sich » Top-Angebote im Onlineshop & in der Filiale", title);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[id='onetrust-accept-btn-handler']")));
        WebElement cockieConsent = driver.findElement(By.cssSelector("button[id='onetrust-accept-btn-handler']"));
        cockieConsent.click();


    }
}