package stepdefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePageActions;
import utils.Base;
import utils.Reporter;

public class Test06Definition {
    public WebDriver driver;
    public HomePageActions homePageObject;

    public Test06Definition() {
        driver = Base.driver;
        homePageObject = new HomePageActions(driver);
    }
    
    @Given("user starts test for Testcase - 6")
    public void user_starts_test_for_testcase_6() {
        Reporter.startTest("Testcase - 6");
    }

    // @When("user clicks on where to deliver")
    // public void user_clicks_on_where_to_deliver_cart() {
    //     homePageObject.clickOnWhereToDeliver();
    // }

    // @When("user enters pincode value")
    // public void user_enters_pincode_value_cart() {
    //     homePageObject.handlePincodeInput();
    // }

    // @When("user waits for 2 seconds")
    // public void user_waits_for_2_seconds_cart() throws InterruptedException {
    //     Thread.sleep(2000);
    // }

    // @Then("user verifies pincode")
    // public void user_verifies_pincode_cart() {
    //     homePageObject.verifyPincode();
    // }

    // @When("user clicks on continue shopping button")
    // public void user_clicks_on_continue_shopping_button_cart() {
    //     homePageObject.clickOnContinueShoppingButton();
    // }

    // @When("user hovers on occasion")
    // public void user_hovers_on_occasion_cart() {
    //     homePageObject.clickOnHoverOnOccassion();
    // }

    // @When("user clicks on rakhi hampers")
    // public void user_clicks_on_rakhi_hampers_cart() {
    //     homePageObject.clickOnRakhiHampers();
    // }

    // @When("user clicks on first product with free kaju katli")
    // public void user_clicks_on_first_product_with_free_kaju_katli_cart() {
    //     homePageObject.clickOnFirstProductWithFreeKajuKatli();
    // }

    // @When("user switches to new tab")
    // public void user_switches_to_new_tab_cart() {
    //     homePageObject.switchToNewTab();
    // }

    @When("user clicks on add to cart")
    public void user_clicks_on_add_to_cart() {
        homePageObject.clickOnAddToCart();
    }

    @When("user clicks on continue")
    public void user_clicks_on_continue() {
        homePageObject.clickOnContinue();
    }

    @Then("user verifies cart heading")
    public void user_verifies_cart_heading() {
        homePageObject.verifyCartHeading();
    }
}