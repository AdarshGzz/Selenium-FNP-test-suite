package stepdefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Reporter;
import utils.Base;
import pages.HomePageActions;
import pages.RosePageAction;
import pages.CakePageAction;

public class Test14Definition {
    public WebDriver driver;
    public HomePageActions homePageObject;
    public RosePageAction flowerPageObject;
    public CakePageAction cakePageObject;

    
    public Test14Definition() {
        driver = Base.driver;
        homePageObject = new HomePageActions(driver);
        flowerPageObject = new RosePageAction(driver);
        cakePageObject = new CakePageAction(driver);
    }


    @Given("user starts test for testcase-14")
    public void user_starts_test_for_testcase_14() {
        Reporter.startTest("testcase-14");
    }

    @When("user selects where to deliver")
    public void user_selects_where_to_deliver_birthday() {
        homePageObject.whereToDeliver();
    }

    // @When("user enters location")
    // public void user_enters_location_birthday() {
    //     homePageObject.enterLocation();
    // }

    @When("user hovers on cakes")
    public void user_hovers_on_cakes_birthday() {
        homePageObject.hoverOnCakes();
    }

    @When("user clicks on birthday cake")
    public void user_clicks_on_birthday_cake() {
        homePageObject.clickBirthdayCake();
    }

    // @Then("user verifies pincode chennai")
    // public void user_verifies_pincode_chennai_birthday() {
    //     homePageObject.verifyPincodeChennai();
    // }

    @When("user verifies birthday cake")
    public void user_verifies_birthday_cake() {
        cakePageObject.verifyBirthdayCake();
    }

    @When("user selects same day")
    public void user_selects_same_day() {
        cakePageObject.sameDay();
    }

    @When("user clicks on first cake product")
    public void user_clicks_on_first_cake_product() {
        cakePageObject.clickfirstProduct();
    }

    // @When("user switches tab for cake")
    // public void user_switches_tab_for_cake() {
    //     cakePageObject.switchTab();
    // }

    @Then("user verifies rose element")
    public void user_verifies_rose_element() {
        cakePageObject.verifyRoseElement();
    }

    @When("user clicks on add to cart for cake")
    public void user_clicks_on_add_to_cart_for_cake_birthday() {
        cakePageObject.clickAddtoCart();
    }

    @Then("user verifies offers")
    public void user_verifies_offers() {
        cakePageObject.verifyOffers();
    }
}