package com.automation.cucumber.steps;

import com.automation.pages.CreateAccountPage;
import com.automation.pages.SignInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class CreateAcconutSteps {

    @And("^I enter email for create account \"([^\"]*)\"$")
    public void iEnterEmailForCreateAccount(String email) {
        new SignInPage().emailForCreateNewAccount(email);
    }

    @And("^I click on Create an account button$")
    public void iClickOnCreateAnAccountButton() {
        new SignInPage().clickCreatAccount();
    }

    @And("^I enter First name \"([^\"]*)\"$")
    public void iEnterFirstName(String Firstname) {
        new CreateAccountPage().enterFirstName(Firstname);
    }

    @And("^I enter Last name \"([^\"]*)\"$")
    public void iEnterLastName(String Lastname) {
        new CreateAccountPage().enterLastName(Lastname);
    }

    @And("^I enter password for create account \"([^\"]*)\"$")
    public void iEnterPasswordForCreateAccount(String password) {
        new CreateAccountPage().enterPassword(password);
    }

    @And("^I enter first name for address \"([^\"]*)\"$")
    public void iEnterFirstNameForAddress(String Firstname) {
        new CreateAccountPage().enterFirstNameField(Firstname);
    }

    @And("^I enter last name for address \"([^\"]*)\"$")
    public void iEnterLastNameForAddress(String Lastname) {
        new CreateAccountPage().enterLastNameField(Lastname);
    }

    @And("^I enter address \"([^\"]*)\"$")
    public void iEnterAddress(String address) {
        new CreateAccountPage().enterAddress(address);
    }

    @And("^I enter city \"([^\"]*)\"$")
    public void iEnterCity(String city) {
        new CreateAccountPage().enterCity(city);
    }

    @And("^I select state \"([^\"]*)\"$")
    public void iSelectState(String state) {
        new CreateAccountPage().selectState(state);
    }

    @And("^I enter zipCode \"([^\"]*)\"$")
    public void iEnterZipCode(String zipcode) {
        new CreateAccountPage().enterZipCode(zipcode);
    }

    @And("^I select country \"([^\"]*)\"$")
    public void iSelectCountry(String country) {
        new CreateAccountPage().selectCountry(country);
    }

    @And("^I enter phone number \"([^\"]*)\"$")
    public void iEnterPhoneNumber(String phonenumber) {
        new CreateAccountPage().enterPhoneNumber(phonenumber);
    }

    @And("^I enter adddress refrence \"([^\"]*)\"$")
    public void iEnterAdddressRefrence(String refrence) {
        new CreateAccountPage().enterReference(refrence);
    }

    @And("^I click Register button$")
    public void iClickRegisterButton() {
        new CreateAccountPage().clickOnRegisterBtn();
    }

    @Then("^I should verify My Account message$")
    public void iShouldVerifyMyAccountMessage() {
        Assert.assertEquals("My Account message not display", "MY ACCOUNT",new CreateAccountPage().verifyMyAccountText());
    }
}
