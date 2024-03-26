package Pages;

import Base.ElementLocators;
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
        wait.until(ExpectedConditions.visibilityOfElementLocated(ElementLocators.PASS_RESET_PAGE_HEADER));
        WebElement passwordResetPageHeader = driver.findElement(ElementLocators.PASS_RESET_PAGE_HEADER);
        String passResetHeadertxt = passwordResetPageHeader.getText();
        System.out.println("You are on the Password Reset Page: " + passResetHeadertxt);
        Assert.assertEquals("Passwort zurücksetzen", passResetHeadertxt);
    }

    public static void emailConfirmForPasswordReset(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(ElementLocators.EMAIL_CONF_BUTTON));
        WebElement emailConfButton = driver.findElement(ElementLocators.EMAIL_CONF_BUTTON);

        Assert.assertTrue("The button for email confirmation is displayed ", emailConfButton.isEnabled());
    }
}
