package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import utils.Base;
import utils.Reporter;

public class Hooks extends Base{

    @BeforeAll
    public static void beforSetup() {
        cleanPreviousTestArtifacts();
        Reporter.initReport("FNP_Testcase_Report");
    }

    @Before
    public void setUp() {
        openBrowser();
    }

    @After
    public void tearDown() {
        if(driver!=null){
            driver.quit();
        }
    }

    @AfterAll
    public static void afterTearDown() {
        Reporter.flushReport();
    }

}