package Pages;

import Base.ElementLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
    public static void clickOnLoginButton(WebDriver driver){
        WebElement loginButton = driver.findElement(ElementLocators.LOGIN_BUTTON);
        //below is the basic sintax to locate an element
       // WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[1]/div[2]/div/div[1]/nav/ol/li[5]/ol/li[1]/a/span/span"));
        loginButton.click();

    }
}
