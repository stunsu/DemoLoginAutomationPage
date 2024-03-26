package Pages;

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
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#field_Password")));
        WebElement emailBox = driver.findElement(By.cssSelector("#field_Password"));
        emailBox.sendKeys(accountPassword);
    }

    public static void submitPassword(WebDriver driver) {
        WebElement submitEmailButton = driver.findElement(By.cssSelector("#button_submit"));
        submitEmailButton.click();
    }

    public static void insertWrongPass(WebDriver driver, String wrongPassword) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#field_Password")));
        WebElement emailBox = driver.findElement(By.cssSelector("#field_Password"));
        emailBox.sendKeys(wrongPassword);
    }

    public static void checkPassErrorMsg(WebDriver driver, String passwordErrorMsg) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".field_Password")));
        WebElement passErrorMsg = driver.findElement(By.cssSelector(".field_Password"));
        String txt = passErrorMsg.getText();
        System.out.println("Wrong password error msg: " + txt);
        Assert.assertEquals(passwordErrorMsg, txt);
    }

    public static void clickForgotPassword(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/form[1]/div/section/div/div/div[3]/div/div[1]/div[3]/a")));
        WebElement forgotPasswordCTA = driver.findElement(By.xpath("/html/body/div[1]/form[1]/div/section/div/div/div[3]/div/div[1]/div[3]/a"));
        forgotPasswordCTA.click();
    }


}
