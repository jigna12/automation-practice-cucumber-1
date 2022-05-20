package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(CreateAccountPage.class.getName());

    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }
    /*3.CreateAccountPage -
All the fields locators and create appropriate method for it.*/
    //All the fields locators and create appropriate method for it

    @FindBy(id = "customer_firstname")
    WebElement firstName;
    @FindBy(id = "customer_lastname")
    WebElement lastName;
    @FindBy(xpath = "//input[@id='email']")
    WebElement email;
    @FindBy(id = "passwd")
    WebElement password;
    @FindBy(id = "firstname")
    WebElement firstNameField;
    @FindBy(id = "lastname")
    WebElement lastNameField;
    @FindBy(id = "address1")
    WebElement address;
    @FindBy(id = "city")
    WebElement city;
    @FindBy(id = "id_state")
    WebElement state;
    @FindBy(xpath= "//input[@id='postcode']")
    WebElement zipcode;
    @FindBy(xpath = "//select[@id='id_country']")
    WebElement countryName;
    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement phoneNumber;
    @FindBy(xpath = "//input[@id='alias']")
    WebElement reference;
    @FindBy(xpath = "//span[normalize-space()='Register']")
    WebElement registerbtn;
    @FindBy (xpath = "//h1[contains(text(),'My account')]")
    WebElement verifyMyAccount;

    public void enterFirstName(String text) {
        log.info("enter First Name " + firstName.toString());
        sendTextToElement(firstName, text);
    }

    public void enterLastName(String text) {
        log.info("enter LastName : " + lastName.toString());
        sendTextToElement(lastName, text);
    }

    public void enteremail(String text){
        log.info("enter email : "+ email.toString());
        sendTextToElement(email,text);
    }
    public void enterPassword(String text) {
        log.info("enter password " + password.toString());
        sendTextToElement(password, text);
    }

    public void enterFirstNameField(String text) {
        log.info("first Name field " + firstName.toString());
        sendTextToElement(firstNameField, text);
    }

    public void enterLastNameField(String text) {
        log.info("enter LastName field " + lastNameField.toString());
        sendTextToElement(lastNameField, text);
    }

    public void enterAddress(String text) {
        log.info("Enter address " + address.toString());
        sendTextToElement(address, text);
    }

    public void enterCity(String text) {
        log.info("enter city " + city.toString());
        sendTextToElement(city, text);
    }

    public void selectState(String text) {
        log.info("select state " + state.toString());
        sendTextToElement(state, text);
    }

    public void enterZipCode(String text) {
        log.info("enter Zip code " + zipcode.toString());
        sendTextToElement(zipcode, text);
    }

    public void selectCountry(String country){
        log.info("select country name : "+ countryName.toString());
        sendTextToElement(countryName,country);
    }

    public void enterPhoneNumber(String text) {
        log.info("enter Phone Number " + phoneNumber.toString());
        sendTextToElement(phoneNumber, text);
    }

    public void enterReference(String text) {
        log.info("enter Reference " + reference.toString());
        sendTextToElement(reference, text);
    }

    public void clickOnRegisterBtn() {
        clickOnElement(registerbtn);
    }
    public String verifyMyAccountText() {
       log.info("verify Text " + verifyMyAccount.toString());
        return getTextFromElement(verifyMyAccount);
    }
}
