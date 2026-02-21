package stepdefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePageActions;
import utils.Base;
import utils.Reporter;

public class Test01Definition {

    public WebDriver driver;
    public HomePageActions homePageObject;

    public Test01Definition() {
        driver = Base.driver;
        homePageObject = new HomePageActions(driver);
    }

    @Given("user starts test for Testcase -1")
    public void user_starts_test_for_testcase_1() {
        Reporter.startTest("Testcase -1");
    }

    @When("user clicks on terms and conditions")
    public void user_clicks_on_terms_and_conditions() {
        homePageObject.clickOnTermsNConditons();
    }

    @When("user switches to new tab")
    public void user_switches_to_new_tab_policy() {
        homePageObject.switchToNewTab();
    }

    @Then("user verifies terms and conditions page")
    public void user_verifies_terms_and_conditions_page() {
        homePageObject.verifyTermsNConditions();
    }

    @When("user switches to parent tab")
    public void user_switches_to_parent_tab_policy() {
        homePageObject.switchToParentTab();
    }

    @When("user clicks on privacy policy")
    public void user_clicks_on_privacy_policy() {
        homePageObject.clickOnPrivacyPolicy();
    }

    @Then("user verifies privacy policy page")
    public void user_verifies_privacy_policy_page() {
        homePageObject.verifyPrivacyPolicy();
    }

    @When("user clicks on terms of use")
    public void user_clicks_on_terms_of_use() {
        homePageObject.clickOnTermsOfUse();
    }

    @Then("user verifies terms of use page")
    public void user_verifies_terms_of_use_page() {
        // homePageObject.verifyTermsOfUse();
    }

    @When("user clicks on disclaimer")
    public void user_clicks_on_disclaimer() {
        homePageObject.clickOnDisclimer();
    }

    @Then("user verifies disclaimer page")
    public void user_verifies_disclaimer_page() {
        homePageObject.verifyDisclaimer();
    }
}
 
 