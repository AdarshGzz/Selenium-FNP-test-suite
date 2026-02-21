package stepdefinition;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pages.HomePageActions;
import utils.Base;
import utils.Reporter;


public class Test03Definition {
    
    public WebDriver driver;
    public HomePageActions homePageObject;

    public Test03Definition() {
        driver = Base.driver;
        homePageObject = new HomePageActions(driver);
    }

    @Given("user starts test for Testcase -3")
    public void user_starts_test_for_testcase_3() {
        Reporter.startTest("Testcase -3");
    }

    @When("user clicks on careers")
    public void user_clicks_on_careers() {
        homePageObject.clickOnCareers();
    }

    // @When("user switches to new tab")
    // public void user_switches_to_new_tab_careers() {
    //     homePageObject.switchToNewTab();
    // }

    @Then("user verifies careers page")
    public void user_verifies_careers_page() {
        homePageObject.verifyCareers();
    }

    @When("user clicks on singapore positions")
    public void user_clicks_on_singapore_positions() {
        homePageObject.clickOnSingaporePositions();
    }

    @When("user clicks on first listing")
    public void user_clicks_on_first_listing() {
        homePageObject.clickOnFirstListing();
    }

    @When("user clicks on apply now")
    public void user_clicks_on_apply_now() {
        homePageObject.clickOnApplyNow();
    }
}