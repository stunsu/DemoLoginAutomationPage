package Base;

import org.openqa.selenium.By;

public class ElementLocators {
    public static final By LOGIN_BUTTON = By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[1]/div[2]/div/div[1]/nav/ol/li[5]/ol/li[1]/a/span/span");
    public static final By COOCKIE_CONSENT = By.cssSelector("button[id='onetrust-accept-btn-handler']");
    public static final By EMAIL_BOX = By.cssSelector("#field_EmailOrPhone");
    public static final By SUBMIT_EMAIL_BUTTON = By.cssSelector("#button_btn_submit_email");
    public static final By EMAIL_ERROR_MESSAGING = By.cssSelector(".error_EmailOrPhone");
    public static final By PHONE_ERROR_MSG = By.cssSelector(".error_PhoneNumber");
    public static final By PASSWORD_BOX = By.cssSelector("#field_Password");
    public static final By SUBMIT_PASSWORD_BUTTON = By.cssSelector("#button_submit");
    public static final By PASSWORD_ERROR_MSG = By.cssSelector(".field_Password");
    public static final By FORGOT_PASSWORD_CTA = By.xpath("/html/body/div[1]/form[1]/div/section/div/div/div[3]/div/div[1]/div[3]/a");
    public static final By PASS_RESET_PAGE_HEADER = By.cssSelector("h2[data-v-4fc0c64e]");
    public static final By EMAIL_CONF_BUTTON = By.cssSelector(".button-content");




}
