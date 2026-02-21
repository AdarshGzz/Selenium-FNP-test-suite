package stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Base;
import utils.Reporter;
import pages.CakePageAction;
import pages.HomePageActions;
import pages.MugsPageActions;
import pages.RosePageAction;

public class Test15Definition {
 public WebDriver driver;
    public HomePageActions homePageObject;
    public RosePageAction flowerPageObject;
    public CakePageAction cakePageObject;
    public MugsPageActions mugsPageObject;

    
    public Test15Definition() {
        driver = Base.driver;
        homePageObject = new HomePageActions(driver);
        flowerPageObject = new RosePageAction(driver);
        cakePageObject = new CakePageAction(driver);
        mugsPageObject = new MugsPageActions(driver);
    }
    

    @Given("user starts test for Testcase-15")
    public void user_starts_test_for_testcase_15() {
        Reporter.startTest("Testcase-15");
    }

    @When("user clicks on allow notifications")
    public void user_clicks_on_allow_notifications() {
        homePageObject.clickOnAllowNotifications();
    }

    // @Then("user verifies page logo")
    // public void user_verifies_page_logo_mug() {
    //     homePageObject.verifyPageLogo();
    // }

    // @When("user clicks on where to deliver")
    // public void user_clicks_on_where_to_deliver_mug() {
    //     homePageObject.clickOnWhereToDeliver();
    // }

    @When("user enters {string} as delivery location")
    public void user_enters_as_delivery_location(String location) throws IOException, InterruptedException {
        homePageObject.inputAsBangalore(location);
    }

    @When("user clicks on continue shopping")
    public void user_clicks_on_continue_shopping_mug() throws Throwable {
        homePageObject.clickOnContinueShopping();
    }

    @When("user hovers on personalised")
    public void user_hovers_on_personalised() {
        homePageObject.hoverOverPersonalised();
    }

    @When("user clicks on mugs")
    public void user_clicks_on_mugs() {
        homePageObject.clickOnMugs();
    }

    @Then("user verifies mug")
    public void user_verifies_mug() {
        mugsPageObject.verifyMug();
    }

    @When("user clicks on magic mugs")
    public void user_clicks_on_magic_mugs() {
        mugsPageObject.clickOnMagicMugs();
    }

    @When("user clicks on first mug product")
    public void user_clicks_on_first_mug_product() {
        mugsPageObject.clickOnFirstProductMugs();
    }

    @Then("user verifies magic mug")
    public void user_verifies_magic_mug() {
        mugsPageObject.verifyMagicMug();
    }

    @When("user switches to new mug tab")
    public void user_switches_to_new_mug_tab() {
        mugsPageObject.switchToNewMugsTab();
    }

    @When("user clicks on add to cart for mug")
    public void user_clicks_on_add_to_cart_for_mug() {
        mugsPageObject.clickOnAddToCart();
    }

    @Then("user verifies availability for mug")
    public void user_verifies_availability_for_mug() {
        mugsPageObject.verifyAvailable();
    }
}