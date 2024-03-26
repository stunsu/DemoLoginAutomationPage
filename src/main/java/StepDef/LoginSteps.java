package StepDef;

import Base.TestBase;
import Pages.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends TestBase {
    @Before
    public void setUP(){
        initialization();
    }

    @Given("I navigate to the lidl.de login page")
    public void iNavigateToTheLidlDeLoginPage() {
        HomePageCockieConsent homePageCockieConsent = new HomePageCockieConsent();
        homePageCockieConsent.checkHomepage(driver);
    }

    @Given("I click on the login button")
    public void iClickOnTheLoginButton() {
        Homepage homepage = new Homepage();
        homepage.clickOnLoginButton(driver);
    }

    @When("I submit my email address")
    public void iSubmitMyEmailAddress() {
        LoginEmailPage loginEmailPage = new LoginEmailPage();
        loginEmailPage.insertEmailAddress(driver);
        loginEmailPage.submitEmailOrNumber(driver);


    }

    @And("I submit my account password")
    public void iSubmitMyAccountPassword() {
        LoginPasswordPage loginPasswordPage = new LoginPasswordPage();
        loginPasswordPage.insertPassword(driver);
        loginPasswordPage.submitPassword(driver);
    }

    @Then("I should be redirected to My Lidl Account")
    public void iShouldBeRedirectedToMyLidlAccount() {
        MyAccountPage myAccountPage = new MyAccountPage();
        myAccountPage.checkMyAccountPage(driver);
    }


    @When("I submit a wrong {string} address")
    public void iSubmitAWrongEmailAddress(String wrongEmail) {
        LoginEmailPage loginEmailPage = new LoginEmailPage();
        loginEmailPage.insertWrongEmailAddressOrNumber(driver, wrongEmail);
        //now a click to the submit email button needs to be made
        loginEmailPage.submitEmailOrNumber(driver);
    }

    @Then("I should see an {string} indicating invalid email")
    public void iShouldSeeAnErrorMessageIndicatingInvalidEmail(String errorMessage) {
        LoginEmailPage loginEmailPage = new LoginEmailPage();
        loginEmailPage.checkEmailErrorMessaging(driver, errorMessage);
    }

    @When("I submit my phone number")
    public void i_submit_my_phone_number() {
        LoginEmailPage loginEmailPage = new LoginEmailPage();
        loginEmailPage.insertPhoneNumber(driver);
        loginEmailPage.submitEmailOrNumber(driver);
        loginEmailPage.submitEmailOrNumber(driver);
    }

    @When("I submit a {string}")
    public void i_submit_a (String wrongPhoneNumber) {
        LoginEmailPage loginEmailPage = new LoginEmailPage();
        loginEmailPage.insertWrongPhoneNumber(driver, wrongPhoneNumber);
        loginEmailPage.submitEmailOrNumber(driver);
        loginEmailPage.submitEmailOrNumber(driver);
    }
    @Then("I should see an {string} indicating invalid telephone number")
    public void i_should_see_an_indicating_invalid_telephone_number(String phoneErrorMessage) {
        LoginEmailPage loginEmailPage = new LoginEmailPage();
        loginEmailPage.checkPhoneNumberErrorMsg(driver, phoneErrorMessage);
    }
    @And("I submit a password {string}")
    public void iSubmitAPassword(String wrongPassword) {
        LoginPasswordPage loginPasswordPage = new LoginPasswordPage();
        loginPasswordPage.insertWrongPass(driver, wrongPassword);
        loginPasswordPage.submitPassword(driver);
    }

    @Then("I should see an {string} indicating invalid password")
    public void iShouldSeeAnIndicatingInvalidPassword(String passwordErrorMsg) {
        LoginPasswordPage loginPasswordPage = new LoginPasswordPage();
        loginPasswordPage.checkPassErrorMsg(driver, passwordErrorMsg);
    }

    @And("I click on Forgot Password link")
    public void iClickOnForgotPasswordLink() {
        LoginPasswordPage loginPasswordPage = new LoginPasswordPage();
        loginPasswordPage.clickForgotPassword(driver);
    }

    @Then("I should be redirected to the Password reset page")
    public void iShouldBeRedirectedToThePasswordResetPage() {
        PasswordResetPage passwordResetPage = new PasswordResetPage();
        passwordResetPage.checkPasswordResetPage(driver);
    }

    @And("I should be able to select my email to reset the password")
    public void iShouldBeAbleToSelectMyEmailToResetThePassword() {
        PasswordResetPage passwordResetPage = new PasswordResetPage();
        passwordResetPage.emailConfirmForPasswordReset(driver);
    }
}
