package stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utils.Base;
import utils.Reporter;
import pages.HomePageActions;

import pages.CakeProductPageActions;

public class Test12Definition {
 public WebDriver driver;
    public HomePageActions homePageObject;;
    public CakeProductPageActions cakeProductPageObject;


    public Test12Definition() {
        driver = Base.driver;
        homePageObject = new HomePageActions(driver);
        cakeProductPageObject = new CakeProductPageActions(driver);
    }


    @Given("user starts test for Testcase-12")
    public void user_starts_test_for_testcase_12() {
        Reporter.startTest("Testcase-12");
    }

    // @Then("user verifies location logo")
    // public void user_verifies_location_logo_cake() {
    //     locationPageObject.verifyLogo();
    // }

    // @When("user clicks on where to delivery")
    // public void user_clicks_on_where_to_delivery_cake() {
    //     homePageObject.clickOnWhereToDelivery();
    // }

    // @When("user enters delivery input")
    // public void user_enters_delivery_input_cake() {
    //     homePageObject.deliverInput();
    // }

    // @When("user clicks on shopping")
    // public void user_clicks_on_shopping_cake() {
    //     homePageObject.clickOnShopping();
    // }

    // @Then("user verifies delhi pincode")
    // public void user_verifies_delhi_pincode_cake() {
    //     homePageObject.veriifyDelhiPincode();
    // }

    // @When("user clicks on search button")
    // public void user_clicks_on_search_button_cake() {
    //     homePageObject.clickOnSearchBtn();
    // }

    @When("user searches for cake")
    public void user_searches_for_cake() throws IOException, InterruptedException {
        cakeProductPageObject.searchCake();
    }

    @When("user selects cake flavour")
    public void user_selects_cake_flavour() {
        cakeProductPageObject.clickOnFlavour();
    }

    @When("user selects chocolate")
    public void user_selects_chocolate() {
        cakeProductPageObject.clickOnChocolate();
    }

    @When("user clicks on cake product")
    public void user_clicks_on_cake_product() {
        cakeProductPageObject.clickOnCakeProd();
    }

    // @Then("user verifies location logo")
    // public void user_verifies_location_logo_cake_again() {
    //     locationPageObject.verifyPageLogo();
    // }

    @When("user verifies add to cart for cake")
    public void user_verifies_add_to_cart_for_cake() {
        cakeProductPageObject.addToCartVerify();
    }

    @When("user clicks on buy now for cake")
    public void user_clicks_on_buy_now_for_cake() {
        cakeProductPageObject.clickOnBuyNow();
    }
}