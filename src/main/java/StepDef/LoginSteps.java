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

    @When("I click on the login button")
    public void iClickOnTheLoginButton() {
        Homepage homepage = new Homepage();
        homepage.clickOnLoginButton(driver);
    }

    @And("I submit my email address")
    public void iSubmitMyEmailAddress() {
        LoginEmailPage loginEmailPage = new LoginEmailPage();
        loginEmailPage.insertEmailAddressOrNumber(driver);
        loginEmailPage.submitEmail(driver);


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

    @Given("I am on the lidl.de login page")
    public void iAmOnTheLidlDeLoginPage() {
    }

    @And("I submit a wrong email address")
    public void iSubmitAWrongEmailAddress() {
    }

    @Then("I should see an error message indicating invalid email")
    public void iShouldSeeAnErrorMessageIndicatingInvalidEmail() {
    }

    @And("I should remain on the login page")
    public void iShouldRemainOnTheLoginPage() {
    }

    @And("I submit a wrong password")
    public void iSubmitAWrongPassword() {
    }

    @Then("I should see an error message indicating invalid password")
    public void iShouldSeeAnErrorMessageIndicatingInvalidPassword() {
    }

    @And("I click on Forgot Password link")
    public void iClickOnForgotPasswordLink() {
    }

    @Then("I should be redirected to the Password reset page")
    public void iShouldBeRedirectedToThePasswordResetPage() {
    }

    @And("I should be able to select my email to reset the password")
    public void iShouldBeAbleToSelectMyEmailToResetThePassword() {
    }

}