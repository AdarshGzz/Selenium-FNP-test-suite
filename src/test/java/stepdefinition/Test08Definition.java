package stepdefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Base;
import utils.Reporter;
import pages.HomePageActions;

public class Test08Definition {
   
    public WebDriver driver;
    public HomePageActions homePageObject;

    public Test08Definition() {
        driver = Base.driver;
        homePageObject = new HomePageActions(driver);
    }

    @Given("user starts test for Testcase - 8")
    public void user_starts_test_for_testcase_8() {
        Reporter.startTest("Testcase - 8");
    }

    // @When("user clicks on corporate service")
    // public void user_clicks_on_corporate_service() {
    //     homePageObject.clickOnCorporateService();
    // }

    // @When("user switches to new tab")
    // public void user_switches_to_new_tab_corporate_service() {
    //     homePageObject.switchToNewTab();
    // }

    @Then("user verifies corporate service url")
    public void user_verifies_corporate_service_url() {
        homePageObject.verifyCorporateServiceUrl();
    }

    @When("user fills name field")
    public void user_fills_name_field() {
        homePageObject.fillName();
    }

    @When("user selects maharashtra")
    public void user_selects_maharashtra() {
        homePageObject.selectMaharashtra();
    }

    @When("user selects price range")
    public void user_selects_price_range() {
        homePageObject.selectPriceRange();
    }

    @When("user clicks on submit button")
    public void user_clicks_on_submit_button() {
        homePageObject.clickOnSubmitBtn();
    }
}