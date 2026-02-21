package pages;

import org.openqa.selenium.WebDriver;
import uistore.RoseLocator;
import utils.HighlightUtil;
import utils.LoggerHandler;
import utils.ProgressBarUtil;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class RosePageAction {

    public WebDriver driver;
    public WebDriverHelper helper;

    public RosePageAction(WebDriver driver) {
        this.driver = driver;
        helper = new WebDriverHelper(driver);
    }

    public void verifyFlowers() {
        try {
            HighlightUtil.highlightElement(RoseLocator.verifyFlowers);
            ProgressBarUtil.setProgress(54, "Premium Anniversary");
            helper.waitForElementToBeVisible(RoseLocator.verifyFlowers, 5);
            helper.veriFyText(driver.findElement(RoseLocator.verifyFlowers).getText(), "Premium Anniversary");
            Reporter.logInfo("Verified Premium Anniversary");
            LoggerHandler.info("Verified Premium Anniversary");
        } catch (Exception e) {
            LoggerHandler.error("Error in verifyFlowers: " + e.getMessage());
            Reporter.logFail("Error in verifyFlowers: " + e.getMessage());
            Reporter.attachScreenshotToReport("verifyFlowers", Reporter.test, "Error in verifyFlowers");
        }
    }

    public void clickOnRoses() {
        try {
            HighlightUtil.highlightElement(RoseLocator.clickOnRoses);
            ProgressBarUtil.setProgress(72, "Click on Roses");
            helper.waitForElementToBeVisible(RoseLocator.clickOnRoses, 5);
            helper.clickOnElement(RoseLocator.clickOnRoses);
            LoggerHandler.info("Click on Roses");
            Reporter.logInfo("Click on Roses");
        } catch (Exception e) {
            LoggerHandler.error("Error in clickOnRoses: " + e.getMessage());
            Reporter.logFail("Error in clickOnRoses: " + e.getMessage());
            Reporter.attachScreenshotToReport("clickOnRoses", Reporter.test, "Error in clickOnRoses");
        }
    }

    public void firstProduct() {
        try {
            HighlightUtil.highlightElement(RoseLocator.FirstProduct);
            ProgressBarUtil.setProgress(63, "Click on FirstProduct");
            helper.waitForElementToBeVisible(RoseLocator.FirstProduct, 5);
            helper.clickOnElement(RoseLocator.FirstProduct);
            LoggerHandler.info("Click on FirstProduct");
            Reporter.logInfo("Click on First Product");
            helper.switchToTab(1);
        } catch (Exception e) {
            LoggerHandler.error("Error in firstProduct: " + e.getMessage());
            Reporter.logFail("Error in firstProduct: " + e.getMessage());
            Reporter.attachScreenshotToReport("firstProduct", Reporter.test, "Error in firstProduct");
        }
    }

    public void verifyRose() {
        try {
            ProgressBarUtil.setProgress(72, "Mixed Roses Romantic");
            helper.verifyPageTitle("Rose");
            Reporter.logInfo("Verified Mixed Roses Romantic");
            LoggerHandler.info("Verified Mixed Roses Romantic");
        } catch (Exception e) {
            LoggerHandler.error("Error in verifyRose: " + e.getMessage());
            Reporter.logFail("Error in verifyRose: " + e.getMessage());
            Reporter.attachScreenshotToReport("verifyRose", Reporter.test, "Error in verifyRose");
        }
    }

    public void clickBuyNow() {
        try {
            helper.waitForElementToBeVisible(RoseLocator.clickBuyNow, 5);
            HighlightUtil.highlightElement(RoseLocator.clickBuyNow);
            ProgressBarUtil.setProgress(81, "Click on Buy Now");
            helper.clickOnElement(RoseLocator.clickBuyNow);
            LoggerHandler.info("Click on Buy Now");
            Reporter.logInfo("Click on Buy Now");
            Screenshot.snapScreenshot("Click Buy Now");
        } catch (Exception e) {
            LoggerHandler.error("Error in clickBuyNow: " + e.getMessage());
            Reporter.logFail("Error in clickBuyNow: " + e.getMessage());
            Reporter.attachScreenshotToReport("clickBuyNow", Reporter.test, "Error in clickBuyNow");
        }
    }

    public void verifyHome() {
        try {
            HighlightUtil.highlightElement(RoseLocator.home);
            ProgressBarUtil.setProgress(100, "Home Screenshot");
            helper.waitForElementToBeVisible(RoseLocator.home, 5);
            helper.veriFyText(helper.getText(RoseLocator.home), "Home");
            Screenshot.snapScreenshot("homeScreenshot");
            Reporter.captureScreenShot("homeScreenshot");
            Reporter.attachScreenshotToReport("homeScreenshot", Reporter.test, "homeScreenshot");
            LoggerHandler.info("Verified Home text and captured screenshot");
            Reporter.logInfo("Verified Home text and captured screenshot");
        } catch (Exception e) {
            LoggerHandler.error("Error in verifyHome: " + e.getMessage());
            Reporter.logFail("Error in verifyHome: " + e.getMessage());
            Reporter.attachScreenshotToReport("verifyHome", Reporter.test, "Error in verifyHome");
        }
    }

}