package stepdefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePageActions;
import utils.Base;
import utils.Reporter;

public class Test02Definition {
    
    public WebDriver driver;
    public HomePageActions homePageObject;

    public Test02Definition() {
        driver = Base.driver;
        homePageObject = new HomePageActions(driver);
    }

    @Given("user starts test for Testcase -2")
    public void user_starts_test_for_testcase_2() {
        Reporter.startTest("Testcase -2");
    }

    @When("user clicks on about us")
    public void user_clicks_on_about_us() {
        homePageObject.clickOnAboutUs();
    }

    // @When("user switches to new tab")
    // public void user_switches_to_new_tab() {
    //     homePageObject.switchToNewTab();
    // }

    @Then("user verifies about us page")
    public void user_verifies_about_us_page() {
        homePageObject.verifyAboutUs();
    }

    // @When("user switches to parent tab")
    // public void user_switches_to_parent_tab() {
    //     homePageObject.switchToParentTab();
    // }

    @When("user clicks on fnp team")
    public void user_clicks_on_fnp_team() {
        homePageObject.clickOnFnpTeam();
    }

    @Then("user verifies fnp team page")
    public void user_verifies_fnp_team_page() {
        homePageObject.verifyFnpTeam();
    }

    @When("user clicks on testimonials")
    public void user_clicks_on_testimonials() {
        homePageObject.clickOnTestimonials();
    }

    @Then("user verifies testimonials page")
    public void user_verifies_testimonials_page() {
        homePageObject.verifyTestimonials();
    }

    @When("user clicks on news room")
    public void user_clicks_on_news_room() {
        homePageObject.clickOnNewsRoom();
    }

    @Then("user verifies news room page")
    public void user_verifies_news_room_page() {
        homePageObject.verifyNewsRoom();
    }
}

