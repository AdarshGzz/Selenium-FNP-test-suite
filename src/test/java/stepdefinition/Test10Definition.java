package stepdefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Base;
import utils.Reporter;
import pages.HomePageActions;

public class Test10Definition {

    public WebDriver driver;
    public HomePageActions homePageObject;

    public Test10Definition() {
        driver = Base.driver;
        homePageObject = new HomePageActions(driver);
    }

    @Given("user starts test for Testcase - 10")
    public void user_starts_test_for_testcase_10() {
        Reporter.startTest("Testcase - 10");
    }

    @Then("user verifies page logo")
    public void user_verifies_page_logo() {
        homePageObject.verifyPageLogo();
    }

    // @When("user clicks on where to deliver")
    // public void user_clicks_on_where_to_deliver_jewellery() {
    //     homePageObject.clickOnWhereToDeliver();
    // }

    // @When("user enters pincode value")
    // public void user_enters_pincode_value_jewellery() {
    //     homePageObject.handlePincodeInput();
    // }

    // @When("user waits for 2 seconds")
    // public void user_waits_for_2_seconds_jewellery() throws InterruptedException {
    //     Thread.sleep(2000);
    // }

    // @Then("user verifies pincode")
    // public void user_verifies_pincode_jewellery() {
    //     homePageObject.verifyPincode();
    // }

    // @When("user clicks on continue shopping button")
    // public void user_clicks_on_continue_shopping_button_jewellery() {
    //     homePageObject.clickOnContinueShoppingButton();
    // }

    @When("user hovers on lifestyle")
    public void user_hovers_on_lifestyle() {
        homePageObject.hoverOnLifeStyle();
    }

    @When("user clicks on jewellery")
    public void user_clicks_on_jewellery() {
        homePageObject.clickOnJwellery();
    }

    @When("user clicks on rings")
    public void user_clicks_on_rings() {
        homePageObject.clickOnRings();
    }

    @When("user clicks on first product")
    public void user_clicks_on_first_product() {
        homePageObject.clickOnFirstProduct();
    }

    // @When("user clicks on add to cart")
    // public void user_clicks_on_add_to_cart_jewellery() {
    //     homePageObject.clickOnAddToCart();
    // }

    @Then("user verifies reviews")
    public void user_verifies_reviews() {
        homePageObject.verifyReviews();
    }
}