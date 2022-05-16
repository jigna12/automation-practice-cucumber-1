package com.automation.cucumber.steps;

import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SignInSteps {

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on Signin link$")
    public void iClickOnSigninLink() {
        new HomePage().clickOnSignInLink();
    }

    @Then("^I should verify AUTHENTICATION message$")
    public void iShouldVerifyAUTHENTICATIONMessage() {
        Assert.assertEquals("Authentication message is not dispaly","AUTHENTICATION",new SignInPage().verifyAuthentication());
    }

    @And("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String name) {
        new SignInPage().enterEmail(name);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new SignInPage().enterpassword(password);
    }

    @And("^I click on signIn button$")
    public void iClickOnSignInButton() {
        new SignInPage().clickonSignInBtn();
    }

    @Then("^I should verify error message \"([^\"]*)\"$")
    public void iShouldVerifyErrorMessage(String errormessage) {
        Assert.assertEquals("Error message not display", errormessage,new SignInPage().verifyErrorMessage(errormessage));
    }

    @Then("^I should verify sign out link$")
    public void iShouldVerifySignOutLink() {
        Assert.assertEquals("Sign out link not display","Sign out",new SignInPage().verifySignOutLink());
    }

    @And("^I click on Signin out button$")
    public void iClickOnSigninOutButton() {
        new SignInPage().clickOnSignOutLink();
    }

    @Then("^I should verify signin link$")
    public void iShouldVerifySigninLink() {
        Assert.assertEquals("Sign In","Sign In");
    }
}
