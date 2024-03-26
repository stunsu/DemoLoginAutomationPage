package Pages;

import Base.ElementLocators;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginEmailPage {
    public static void insertEmailAddress(WebDriver driver, String emailAddress) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(ElementLocators.EMAIL_BOX));
        WebElement emailBox = driver.findElement(ElementLocators.EMAIL_BOX);
        emailBox.sendKeys(emailAddress);
    }
    public static void submitEmailOrNumber(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(ElementLocators.SUBMIT_EMAIL_BUTTON));
        WebElement submitEmailButton = driver.findElement(ElementLocators.SUBMIT_EMAIL_BUTTON);
        submitEmailButton.click();
        }

    public static void insertWrongEmailAddressOrNumber(WebDriver driver, String wrongEmail) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(ElementLocators.EMAIL_BOX));
        WebElement emailBox = driver.findElement(ElementLocators.EMAIL_BOX);
        emailBox.sendKeys(wrongEmail);
    }

    public static void checkEmailErrorMessaging(WebDriver driver, String errorMessage) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(ElementLocators.EMAIL_ERROR_MESSAGING));
        WebElement emailErrorMessaging = driver.findElement(ElementLocators.EMAIL_ERROR_MESSAGING);
        String txt = emailErrorMessaging.getText();
        System.out.println("Wrong email error msg: " +txt);
        Assert.assertEquals(errorMessage ,txt);
    }

    public static void insertPhoneNumber(WebDriver driver, String phoneNumber) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(ElementLocators.EMAIL_BOX));
        WebElement emailBox = driver.findElement(ElementLocators.EMAIL_BOX);
        emailBox.sendKeys(phoneNumber);
    }

    public static void insertWrongPhoneNumber(WebDriver driver, String wrongPhoneNumber) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(ElementLocators.EMAIL_BOX));
        WebElement emailBox = driver.findElement(ElementLocators.EMAIL_BOX);
        emailBox.sendKeys(wrongPhoneNumber);
    }

    public static void checkPhoneNumberErrorMsg(WebDriver driver, String phoneErrorMessage) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(ElementLocators.PHONE_ERROR_MSG));
        WebElement phoneErrorMsg = driver.findElement(ElementLocators.PHONE_ERROR_MSG);
        String txt = phoneErrorMsg.getText();
        System.out.println("Wrong phone number error msg: " +txt);
        Assert.assertEquals(phoneErrorMessage ,txt);
}
}

