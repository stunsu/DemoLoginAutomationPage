package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginEmailPage {
    public static void insertEmailAddressOrNumber(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#field_EmailOrPhone")));
        WebElement emailBox = driver.findElement(By.cssSelector("#field_EmailOrPhone"));
        emailBox.sendKeys("sorin.tunsu@yahoo.com");
    }
    public static void submitEmail(WebDriver driver){
        WebElement submitEmailButton = driver.findElement(By.cssSelector("#button_btn_submit_email"));
        submitEmailButton.click();
        }

    }
