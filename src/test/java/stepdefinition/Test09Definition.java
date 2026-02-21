package stepdefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import utils.Base;
import utils.Reporter;
import pages.HomePageActions;

public class Test09Definition {

    public WebDriver driver;
    public HomePageActions homePageObject;

    public Test09Definition() {
        driver = Base.driver;
        homePageObject = new HomePageActions(driver);
    }

    @Given("user starts test for Testcase - 9")
    public void user_starts_test_for_testcase_9() {
        Reporter.startTest("Testcase - 9");
    }

    // @When("user clicks on decorations")
    // public void user_clicks_on_decorations_home_links() {
    //     homePageObject.clickOnDecorations();
    // }

    // @When("user switches to new tab")
    // public void user_switches_to_new_tab_home_links() {
    //     homePageObject.switchToNewTab();
    // }

    @Then("user verifies decoration url")
    public void user_verifies_decoration_url() {
        homePageObject.verifyDecorationUrl();
        // homePageObject.verifyDecorationsTitle(); // If needed, uncomment
    }

    // @When("user switches to parent tab")
    // public void user_switches_to_parent_tab_home_links() {
    //     homePageObject.switchToParentTab();
    // }

    @When("user clicks on services")
    public void user_clicks_on_services() {
        homePageObject.clickOnServices();
    }

    @Then("user verifies services url")
    public void user_verifies_services_url() {
        homePageObject.verifyServicesUrl();
        // homePageObject.verifyServicesTitle(); // If needed, uncomment
    }

    @When("user clicks on corporate service")
    public void user_clicks_on_corporate_service_home_links() {
        homePageObject.clickOnCorporateService();
    }

    // @Then("user verifies corporate service url")
    // public void user_verifies_corporate_service_url_home_links() {
    //     homePageObject.verifyCorporateServiceUrl();
    // }

    @Then("user verifies corporate service title")
    public void user_verifies_corporate_service_title() {
        homePageObject.verifyCorporateServiceTitle();
    }

    @When("user clicks on affiliate program")
    public void user_clicks_on_affiliate_program() {
        homePageObject.clickOnAffiliateProgram();
    }

    @Then("user verifies affiliate program url")
    public void user_verifies_affiliate_program_url() {
        homePageObject.verifyAffiliateProgramUrl();
    }

    @Then("user verifies affiliate program title")
    public void user_verifies_affiliate_program_title() {
        homePageObject.verifyAffiliateProgramTitle();
    }

    @When("user clicks on retails store")
    public void user_clicks_on_retails_store() {
        homePageObject.clickOnRetailsStore();
    }

    @Then("user verifies retails store url")
    public void user_verifies_retails_store_url() {
        homePageObject.verifyRetailsStoreUrl();
    }
    
    @Then("user verifies retails store title")
    public void user_verifies_retails_store_title() {
        homePageObject.verifyRetailsStoreTitle();
    }

    @When("user clicks on frenchise")
    public void user_clicks_on_frenchise() {
        homePageObject.clickOnFrenchise();
    }

    @Then("user verifies frenchise url")
    public void user_verifies_frenchise_url() {
        homePageObject.verifyFrenchiseUrl();
    }

    @Then("user verifies frenchise title")
    public void user_verifies_frenchise_title() {
        homePageObject.verifyFrenchiseTitle();
    }

    @When("user clicks on blog")
    public void user_clicks_on_blog_home_links() {
        homePageObject.clickOnBlog();
    }

    // @Then("user verifies blog url")
    // public void user_verifies_blog_url_home_links() {
    //     homePageObject.verifyBlogUrl();
    // }

    @Then("user verifies blog title")
    public void user_verifies_blog_title() {
        homePageObject.verifyBlogTitle();
    }
}