package stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Reporter;
import utils.Base;
import pages.HomePageActions;
import pages.RosePageAction;

public class Test13Definition {

public WebDriver driver;
    public HomePageActions homePageObject;
    public RosePageAction flowerPageObject;

    public Test13Definition() {
        driver = Base.driver;
        homePageObject = new HomePageActions(driver);
        flowerPageObject = new RosePageAction(driver);
    }

    @Given("user starts test for testcase-13")
    public void user_starts_test_for_testcase_13() {
        Reporter.startTest("testcase-13");
    }

    @When("user selects where to delivery")
    public void user_selects_where_to_delivery() {
        homePageObject.whereToDelivery();
    }

    @When("user enters location")
    public void user_enters_location() throws IOException, InterruptedException {
        homePageObject.enterLocation();
    }

    // @Then("user verifies location logo")
    // public void user_verifies_location_logo_anniversary() {
    //     homePageObject.verifyPageLogo();
    // }

    @When("user hovers on anniversary")
    public void user_hovers_on_anniversary() {
        homePageObject.hoverOnAnniversary();
    }

    @When("user clicks on flowers")
    public void user_clicks_on_flowers() {
        homePageObject.clickOnFlowers();
    }

    @Then("user verifies pincode chennai")
    public void user_verifies_pincode_chennai() {
        homePageObject.verifyPincodeChennai();
    }

    @When("user verifies flowers")
    public void user_verifies_flowers() {
        flowerPageObject.verifyFlowers();
    }

    @When("user clicks on roses")
    public void user_clicks_on_roses() {
        flowerPageObject.clickOnRoses();
    }

    @When("user clicks on first flower product")
    public void user_clicks_on_first_flower_product() {
        flowerPageObject.firstProduct();
    }

    @Then("user verifies rose")
    public void user_verifies_rose() {
        flowerPageObject.verifyRose();
    }

    @When("user clicks on buy now for flower")
    public void user_clicks_on_buy_now_for_flower() {
        flowerPageObject.clickBuyNow();
    }

    @Then("user verifies home page for flower")
    public void user_verifies_home_page_for_flower() {
        flowerPageObject.verifyHome();
    }
}