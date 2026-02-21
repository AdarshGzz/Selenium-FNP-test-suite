package pages;

import org.openqa.selenium.WebDriver;

import uistore.MugsPageLocators;
import utils.LoggerHandler;
import utils.ProgressBarUtil;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;
import utils.HighlightUtil;

public class MugsPageActions {
    // testcase05
    public WebDriver driver;
    public WebDriverHelper helper;


    public MugsPageActions(WebDriver driver) {
        this.driver = driver;
        helper = new WebDriverHelper(driver);
    }

    
    public void clickOnMagicMugs() {
        try {
            HighlightUtil.highlightElement(MugsPageLocators.clickOnMagicMugs);
            ProgressBarUtil.setProgress(70, "Clicked On Magic Mugs");
            helper.waitForElementToBeVisible(MugsPageLocators.clickOnMagicMugs, 3);
            helper.clickOnElement(MugsPageLocators.clickOnMagicMugs);
            LoggerHandler.info("Clicked On Magic Mugs");
            Reporter.logInfo("Clicked On Magic Mugs");
        } catch (Exception e) {
            LoggerHandler.error("Error in clickOnMagicMugs: " + e.getMessage());
            Reporter.logFail("Error in clickOnMagicMugs: " + e.getMessage());
            Reporter.attachScreenshotToReport("clickOnMagicMugs", Reporter.test, "Error in clickOnMagicMugs");
        }
    }

   
    public void clickOnFirstProductMugs() {
        try {
            HighlightUtil.highlightElement(MugsPageLocators.clickOnFirstProductMugs);
            ProgressBarUtil.setProgress(90, "Clicked On First Product Mugs");
            helper.clickOnElement(MugsPageLocators.clickOnFirstProductMugs);
            LoggerHandler.info("Clicked On First Product Mugs");
            Reporter.logInfo("Clicked On First Product Mugs");
        } catch (Exception e) {
            LoggerHandler.error("Error in clickOnFirstProductMugs: " + e.getMessage());
            Reporter.logFail("Error in clickOnFirstProductMugs: " + e.getMessage());
            Reporter.attachScreenshotToReport("clickOnFirstProductMugs", Reporter.test,
                    "Error in clickOnFirstProductMugs");
        }
    }


    public void switchToNewMugsTab() {
        try {
            helper.switchToTab(1);
            LoggerHandler.info("Tab Switched");
            Reporter.logInfo("Tab Switched");
        } catch (Exception e) {
            LoggerHandler.error("Error in switchToNewMugsTab: " + e.getMessage());
            Reporter.logFail("Error in switchToNewMugsTab: " + e.getMessage());
            Reporter.attachScreenshotToReport("switchToNewMugsTab", Reporter.test, "Error in switchToNewMugsTab");
        }
    }

   
    public void clickOnAddToCart() {
        try {
            HighlightUtil.highlightElement(MugsPageLocators.ClickOnAddToCart);
            ProgressBarUtil.setProgress(100, "Clicked on Add To Cart");
            helper.clickOnElement(MugsPageLocators.ClickOnAddToCart);
            LoggerHandler.info("Clicked on Add To Cart");
            Reporter.logInfo("Clicked on Add To Cart");
        } catch (Exception e) {
            LoggerHandler.error("Error in clickOnAddToCart: " + e.getMessage());
            Reporter.logFail("Error in clickOnAddToCart: " + e.getMessage());
            Reporter.attachScreenshotToReport("clickOnAddToCart", Reporter.test, "Error in clickOnAddToCart");
        }
    }

    
    public void verifyAvailable() {
        try {
            helper.veriFyText(helper.getText(MugsPageLocators.verifyOffersAvailable), "Offers Available");
            Screenshot.snapScreenshot("Verified Offers Available");
            Reporter.captureScreenShot("Verified Offers Available");
            Reporter.attachScreenshotToReport("Verified Offers Available", Reporter.test, "Verified Offers Available");
        } catch (Exception e) {
            LoggerHandler.error("Error in verifyAvailable: " + e.getMessage());
            Reporter.logFail("Error in verifyAvailable: " + e.getMessage());
            Reporter.attachScreenshotToReport("verifyAvailable", Reporter.test, "Error in verifyAvailable");
        }
    }

   
    public void verifyMug() {
        try {
            helper.verifyPageTitle("Mug");
        } catch (Exception e) {
            LoggerHandler.error("Error in verifyMug: " + e.getMessage());
            Reporter.logFail("Error in verifyMug: " + e.getMessage());
            Reporter.attachScreenshotToReport("verifyMug", Reporter.test, "Error in verifyMug");
        }
    }

   
    public void verifyMagicMug() {
        try {
            helper.verifyPageTitle("Magic Mug");
        } catch (Exception e) {
            LoggerHandler.error("Error in verifyMagicMug: " + e.getMessage());
            Reporter.logFail("Error in verifyMagicMug: " + e.getMessage());
            Reporter.attachScreenshotToReport("verifyMagicMug", Reporter.test, "Error in verifyMagicMug");
        }
    }

}