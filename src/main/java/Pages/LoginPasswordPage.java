package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPasswordPage {
    public static void insertPassword(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#field_Password")));
        WebElement emailBox = driver.findElement(By.cssSelector("#field_Password"));
        emailBox.sendKeys("Mercia321!");
    }
    public static void submitPassword(WebDriver driver){
        WebElement submitEmailButton = driver.findElement(By.cssSelector("#button_submit"));
        submitEmailButton.click();
    }
}
