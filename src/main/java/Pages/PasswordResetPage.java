package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PasswordResetPage {
    public static void checkPasswordResetPage(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2[data-v-4fc0c64e]")));
        WebElement passwordResetPageHeader = driver.findElement(By.cssSelector("h2[data-v-4fc0c64e]"));
        String passResetHeadertxt = passwordResetPageHeader.getText();
        System.out.println("You are on the Password Reset Page: " + passResetHeadertxt);
        Assert.assertEquals("Passwort zurücksetzen", passResetHeadertxt);
    }

    public static void emailConfirmForPasswordReset(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".button-content")));
        WebElement passwordResetPageHeader = driver.findElement(By.cssSelector(".button-content"));

        Assert.assertTrue("The button for email confirmation is displayed ", passwordResetPageHeader.isEnabled());
    }
}
