package stepdefinition;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import utils.Reporter;
import utils.Base;
import pages.HomePageActions;
import pages.PenPageAction;



public class Test11Definition {
    
    public WebDriver driver;
    public HomePageActions homePageObject;
    public PenPageAction penPageObject;


    public Test11Definition() {
        driver = Base.driver;
        homePageObject = new HomePageActions(driver);
        penPageObject = new PenPageAction(driver);
    }

    
    @Given("user starts test for Testcase-11")
    public void user_starts_test_for_testcase_11() {
        Reporter.startTest("Testcase-11");
    }

    @When("user clicks on no thanks")
    public void user_clicks_on_no_thanks() {
        homePageObject.clickOnNoThanks();
    }

    // @Then("user verifies location logo")
    // public void user_verifies_location_logo_pen() {
    //     locationPageObject.verifyLogo();
    // }

    @When("user clicks on where to delivery")
    public void user_clicks_on_where_to_delivery() throws InterruptedException {
        homePageObject.clickOnWhereToDelivery();
    }

    @When("user enters delivery input")
    public void user_enters_delivery_input() throws IOException, InterruptedException {
        homePageObject.deliverInput();
    }

    @When("user clicks on shopping")
    public void user_clicks_on_shopping() throws InterruptedException {
        homePageObject.clickOnShopping();
    }

    @Then("user verifies delhi pincode")
    public void user_verifies_delhi_pincode() {
        homePageObject.veriifyDelhiPincode();
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        homePageObject.clickOnSearchBtn();
    }

    @When("user searches for pen")
    public void user_searches_for_pen() throws IOException, InterruptedException {
        homePageObject.searchPen();
    }

    @Then("user verifies pen text")
    public void user_verifies_pen_text() {
        penPageObject.verifyPenText();
    }

    @When("user clicks on first pen product")
    public void user_clicks_on_first_pen_product() {
        penPageObject.clickOnFirstProd();
    }

    @Then("user verifies location logo")
    public void user_verifies_location_logo_again_pen() {
        homePageObject.verifyPageLogo();
    }

    @When("user verifies buy now for pen")
    public void user_verifies_buy_now_for_pen() {
        penPageObject.buyNowVerify();
    }

    @When("user clicks on add to cart for pen")
    public void user_clicks_on_add_to_cart_for_pen() {
        penPageObject.clickAddToCart();
    }
}