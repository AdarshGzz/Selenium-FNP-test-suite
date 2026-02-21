package stepdefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePageActions;
import utils.Base;
import utils.Reporter;

public class Test05Definition {
      
    public WebDriver driver;
    public HomePageActions homePageObject;

    public Test05Definition() {
        driver = Base.driver;
        homePageObject = new HomePageActions(driver);
    }
    
    @Given("user starts test for Testcase - 5")
    public void user_starts_test_for_testcase_5() {
        Reporter.startTest("Testcase - 5");
    }

    @When("user clicks on where to deliver")
    public void user_clicks_on_where_to_deliver() {
        homePageObject.clickOnWhereToDeliver();
    }

    @When("user enters pincode value")
    public void user_enters_pincode_value() {
        homePageObject.handlePincodeInput();
    }

    @When("user waits for 2 seconds")
    public void user_waits_for_2_seconds() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Then("user verifies pincode")
    public void user_verifies_pincode() {
        homePageObject.verifyPincode();
    }

    @When("user clicks on continue shopping button")
    public void user_clicks_on_continue_shopping_button() {
        homePageObject.clickOnContinueShoppingButton();
    }

    @When("user hovers on occasion")
    public void user_hovers_on_occasion() {
        homePageObject.clickOnHoverOnOccassion();
    }

    @When("user clicks on rakhi hampers")
    public void user_clicks_on_rakhi_hampers() {
        homePageObject.clickOnRakhiHampers();
    }

    @When("user clicks on first product with free kaju katli")
    public void user_clicks_on_first_product_with_free_kaju_katli() {
        homePageObject.clickOnFirstProductWithFreeKajuKatli();
    }

    // @When("user switches to new tab")
    // public void user_switches_to_new_tab_pincode() {
    //     homePageObject.switchToNewTab();
    // }

    @When("user clicks on cakes")
    public void user_clicks_on_cakes() {
        homePageObject.clickOnCakes();
    }

    @When("user clicks on truffle cake")
    public void user_clicks_on_truffle_cake() {
        homePageObject.clickOnTruffleCake();
    }

    @Then("user verifies truffle cake heading")
    public void user_verifies_truffle_cake_heading() {
        homePageObject.verifyTruffleCakeHeading();
    }
}