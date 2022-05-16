package com.automation.cucumber.steps;

import com.automation.pages.ProductPage;
import com.automation.pages.WomenCategoryPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class WomenCategarySteps {
    @When("^I click on WOMEN tab$")
    public void iClickOnWOMENTab() {
        new WomenCategoryPage().clickOnWomen();
    }

    @Then("^I should navigate to Women Category page successfully$")
    public void iShouldNavigateToWomenCategoryPageSuccessfully() {
        Assert.assertEquals("Women text not display", "Women",new WomenCategoryPage().verifyWomen());
    }

    @And("^I click on the product \"([^\"]*)\"$")
    public void iClickOnTheProduct(String product) {
        new ProductPage().selProduct(product);
    }

    @And("^I change the quantity \"([^\"]*)\"$")
    public void iChangeTheQuantityQty(String qty) {
        new ProductPage().enterQtyAdd(qty);
    }

    @And("^I select size \"([^\"]*)\"$")
    public void iSelectSize(String size) {
        new ProductPage().selectSize(size);
    }

    @And("^I selecy colour \"([^\"]*)\"$")
    public void iSelecyColour(String colour) {
        new ProductPage().selColour(colour);
    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        new ProductPage().clickAddCart();
    }

    @And("^I should verify product message$")
    public void iShouldVerifyProductMessage() {
        new ProductPage().getAddMes("Product successfully added to your shopping cart");
    }

    @Then("^I click on x button and close$")
    public void iClickOnXButtonAndClose() {
        new ProductPage().setCloseBtn();
    }
}
