package stepdefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Base;
import utils.Reporter;
import pages.HomePageActions;

public class Test07Definition {

    public WebDriver driver;
    public HomePageActions homePageObject;

    public Test07Definition() {
        driver = Base.driver;
        homePageObject = new HomePageActions(driver);
    }

    @Given("user starts test for Testcase - 7")
    public void user_starts_test_for_testcase_7() {
        Reporter.startTest("Testcase - 7");
    }

    @When("user clicks on decorations")
    public void user_clicks_on_decorations() {
        homePageObject.clickOnDecorations();
    }

    // @When("user switches to new tab")
    // public void user_switches_to_new_tab_decorations() {
    //     homePageObject.switchToNewTab();
    // }

    @Then("user verifies decorations title")
    public void user_verifies_decorations_title() {
        homePageObject.verifyDecorationsTitle();
    }

    // @When("user enters pincode value")
    // public void user_enters_pincode_value_decorations() {
    //     homePageObject.handlePincodeInput();
    // }

    // @When("user waits for 2 seconds")
    // public void user_waits_for_2_seconds_decorations() throws InterruptedException {
    //     Thread.sleep(2000);
    // }

    // @Then("user verifies pincode")
    // public void user_verifies_pincode_decorations() {
    //     homePageObject.verifyPincode();
    // }

    // @When("user clicks on continue shopping button")
    // public void user_clicks_on_continue_shopping_button_decorations() {
    //     homePageObject.clickOnContinueShoppingButton();
    // }

    @When("user clicks on kolkata")
    public void user_clicks_on_kolkata() {
        homePageObject.clickOnKolkata();
    }

    @When("user clicks on element contains blue")
    public void user_clicks_on_element_contains_blue() {
        homePageObject.clickOnElementContainsBlue();
    }

    @Then("user verifies product heading contains blue")
    public void user_verifies_product_heading_contains_blue() {
        homePageObject.verifyProductHeadingContainsBlue();
    }
}