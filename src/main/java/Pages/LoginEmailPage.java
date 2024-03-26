package Pages;

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
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#field_EmailOrPhone")));
        WebElement emailBox = driver.findElement(By.cssSelector("#field_EmailOrPhone"));
        emailBox.sendKeys(emailAddress);
    }
    public static void submitEmailOrNumber(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#button_btn_submit_email")));
        WebElement submitEmailButton = driver.findElement(By.cssSelector("#button_btn_submit_email"));
        submitEmailButton.click();
        }

    public static void insertWrongEmailAddressOrNumber(WebDriver driver, String wrongEmail) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#field_EmailOrPhone")));
        WebElement emailBox = driver.findElement(By.cssSelector("#field_EmailOrPhone"));
        emailBox.sendKeys(wrongEmail);
    }

    public static void checkEmailErrorMessaging(WebDriver driver, String errorMessage) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".error_EmailOrPhone")));
        WebElement emailErrorMessagign = driver.findElement(By.cssSelector(".error_EmailOrPhone"));
        String txt = emailErrorMessagign.getText();
        System.out.println("Wrong email error msg: " +txt);
        Assert.assertEquals(errorMessage ,txt);
    }

    public static void insertPhoneNumber(WebDriver driver, String phoneNumber) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#field_EmailOrPhone")));
        WebElement emailBox = driver.findElement(By.cssSelector("#field_EmailOrPhone"));
        emailBox.sendKeys(phoneNumber);
    }

    public static void insertWrongPhoneNumber(WebDriver driver, String wrongPhoneNumber) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#field_EmailOrPhone")));
        WebElement emailBox = driver.findElement(By.cssSelector("#field_EmailOrPhone"));
        emailBox.sendKeys(wrongPhoneNumber);
    }

    public static void checkPhoneNumberErrorMsg(WebDriver driver, String phoneErrorMessage) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".error_PhoneNumber")));
        WebElement phoneErrorMsg = driver.findElement(By.cssSelector(".error_PhoneNumber"));
        String txt = phoneErrorMsg.getText();
        System.out.println("Wrong phone number error msg: " +txt);
        Assert.assertEquals(phoneErrorMessage ,txt);
}
}

