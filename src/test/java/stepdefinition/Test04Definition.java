package stepdefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pages.HomePageActions;
import utils.Base;
import utils.Reporter;


public class Test04Definition {

    
    public WebDriver driver;
    public HomePageActions homePageObject;

    public Test04Definition() {
        driver = Base.driver;
        homePageObject = new HomePageActions(driver);
    }

    @Given("user starts test for Testcase -4")
    public void user_starts_test_for_testcase_4() {
        Reporter.startTest("Testcase -4");
    }

    // @When("user clicks on blog")
    // public void user_clicks_on_blog() {
    //     homePageObject.clickOnBlog();
    // }

    // @When("user switches to new tab")
    // public void user_switches_to_new_tab_blog() {
    //     homePageObject.switchToNewTab();
    // }

    @Then("user verifies blog url")
    public void user_verifies_blog_url() {
        homePageObject.verifyBlogUrl();
    }

    // @When("user switches to parent tab")
    // public void user_switches_to_parent_tab_blog() {
    //     homePageObject.switchToParentTab();
    // }

    // @When("user clicks on careers")
    // public void user_clicks_on_careers_blog() {
    //     homePageObject.clickOnCareers();
    // }

    @When("user switches to new tab careers")
    public void user_switches_to_new_tab_careers_blog() {
        homePageObject.switchToNewTab();
    }

    // @Then("user verifies careers page")
    // public void user_verifies_careers_page_blog() {
    //     homePageObject.verifyCareers();
    // }

    @When("user clicks on singapore positions blog")
    public void user_clicks_on_singapore_positions_blog() {
        homePageObject.clickOnSingaporePositions();
    }

    @When("user clicks on first listing blog")
    public void user_clicks_on_first_listing_blog() {
        homePageObject.clickOnFirstListing();
    }

    // @When("user clicks on apply now blog")
    // public void user_clicks_on_apply_now_blog() {
    //     homePageObject.clickOnApplyNow();
    // }
}