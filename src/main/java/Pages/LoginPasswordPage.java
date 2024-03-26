package Pages;

import Base.ElementLocators;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPasswordPage {
    public static void insertPassword(WebDriver driver, String accountPassword) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(ElementLocators.PASSWORD_BOX));
        WebElement passwordBox = driver.findElement(ElementLocators.PASSWORD_BOX);
        passwordBox.sendKeys(accountPassword);
    }

    public static void submitPassword(WebDriver driver) {
        WebElement submitPasswordButton = driver.findElement(ElementLocators.SUBMIT_PASSWORD_BUTTON);
        submitPasswordButton.click();
    }

    public static void insertWrongPass(WebDriver driver, String wrongPassword) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(ElementLocators.PASSWORD_BOX));
        WebElement passwordBox = driver.findElement(ElementLocators.PASSWORD_BOX);
        passwordBox.sendKeys(wrongPassword);
    }

    public static void checkPassErrorMsg(WebDriver driver, String passwordErrorMsg) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(ElementLocators.PASSWORD_ERROR_MSG));
        WebElement passErrorMsg = driver.findElement(ElementLocators.PASSWORD_ERROR_MSG);
        String txt = passErrorMsg.getText();
        System.out.println("Wrong password error msg: " + txt);
        Assert.assertEquals(passwordErrorMsg, txt);
    }

    public static void clickForgotPassword(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.visibilityOfElementLocated(ElementLocators.FORGOT_PASSWORD_CTA));
        WebElement forgotPasswordCTA = driver.findElement(ElementLocators.FORGOT_PASSWORD_CTA);
        forgotPasswordCTA.click();
    }


}
