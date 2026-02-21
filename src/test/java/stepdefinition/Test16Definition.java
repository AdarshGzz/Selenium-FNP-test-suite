package stepdefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Base;
import utils.Reporter;
import pages.HomePageActions;
import pages.PlantsPageActions;

public class Test16Definition {
public WebDriver driver;
    public PlantsPageActions plantsPageObject ;
  public HomePageActions homePageObject;
    
    public Test16Definition() {
        driver = Base.driver;
         homePageObject = new HomePageActions(driver);
        plantsPageObject = new PlantsPageActions(driver);
    }

    @Given("user starts test for Testcase-16")
    public void user_starts_test_for_testcase_16() {
        Reporter.startTest("Testcase-16");
    }

    // @When("user clicks on allow notifications")
    // public void user_clicks_on_allow_notifications_plants() {
    //     homePageObject.clickOnAllowNotifications();
    // }

    // @Then("user verifies page logo")
    // public void user_verifies_page_logo_plants() {
    //     homePageObject.verifyPageLogo();
    // }

    // @When("user clicks on where to deliver")
    // public void user_clicks_on_where_to_deliver_plants() {
    //     homePageObject.clickOnWhereToDeliver();
    // }

    // @When("user enters {string} as delivery location")
    // public void user_enters_as_delivery_location_plants(String location) {
    //     homePageObject.inputAsBangalore(location);
    // }

    // @When("user clicks on continue shopping")
    // public void user_clicks_on_continue_shopping_plants() {
    //     homePageObject.clickOnContinueShopping();
    // }

    @When("user clicks on plants")
    public void user_clicks_on_plants() {
        homePageObject.clickOnPlants();
    }

    @Then("user verifies plants")
    public void user_verifies_plants() {
        plantsPageObject.verifyPlants();
    }

    @When("user clicks on lucky bamboo")
    public void user_clicks_on_lucky_bamboo() {
        plantsPageObject.clickOnLuckyBamboo();
    }

    @When("user navigates back to plants")
    public void user_navigates_back_to_plants() {
        plantsPageObject.navigatebacktoPlants();
    }

    @When("user clicks on jade plants")
    public void user_clicks_on_jade_plants() {
        plantsPageObject.clickOnJadePlants();
    }

    @When("user navigates back")
    public void user_navigates_back() {
        plantsPageObject.navigateBack();
    }

    @When("user clicks on money plants")
    public void user_clicks_on_money_plants() {
        plantsPageObject.clickOnMoneyPlants();
    }

    @Then("user clicks on cart")
    public void user_clicks_on_cart() {
        plantsPageObject.clickOnCart();
    }

    // @Then("user verifies continue gifting")
    // public void user_verifies_continue_gifting() {
    //     plantsPageObject.verifyContinueGifting();
    // }
}