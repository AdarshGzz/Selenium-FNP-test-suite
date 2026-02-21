package pages;

import org.openqa.selenium.WebDriver;

import uistore.PlantsPageLocators;
import utils.LoggerHandler;
import utils.ProgressBarUtil;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;
import utils.HighlightUtil;

public class PlantsPageActions {
    // testcase-06
    public WebDriver driver;
    public WebDriverHelper helper;

   
    public PlantsPageActions(WebDriver driver) {
        this.driver = driver;
        helper = new WebDriverHelper(driver);
    }

   
    public void clickOnLuckyBamboo() {
        try {
            HighlightUtil.highlightElement(PlantsPageLocators.clickOnLuckyBamboo);
            ProgressBarUtil.setProgress(60, "Clicked On Lucky Bamboo");
            helper.clickOnElement(PlantsPageLocators.clickOnLuckyBamboo);
            LoggerHandler.info("Clicked On Lucky Bamboo");
            Reporter.logInfo("Clicked On Lucky Bamboo");
        } catch (Exception e) {
            LoggerHandler.error("Error in clickOnLuckyBamboo: " + e.getMessage());
            Reporter.logFail("Error in clickOnLuckyBamboo: " + e.getMessage());
            Reporter.attachScreenshotToReport("clickOnLuckyBamboo", Reporter.test, "Error in clickOnLuckyBamboo");
        }
    }

  
    public void navigateBack() {
        try {
            helper.navigateBack();
        } catch (Exception e) {
            LoggerHandler.error("Error in navigateBack: " + e.getMessage());
            Reporter.logFail("Error in navigateBack: " + e.getMessage());
            Reporter.attachScreenshotToReport("navigateBack", Reporter.test, "Error in navigateBack");
        }
    }

   
    public void clickOnJadePlants() {
        try {
            HighlightUtil.highlightElement(PlantsPageLocators.clickOnJadePlants);
            ProgressBarUtil.setProgress(70, "Clicked On Jade Plants");
            helper.waitForElementToBeVisible(PlantsPageLocators.clickOnJadePlants, 4);
            helper.clickOnElement(PlantsPageLocators.clickOnJadePlants);
            LoggerHandler.info("Clicked On Jade Plants");
            Reporter.logInfo("Clicked On Jade Plants");
        } catch (Exception e) {
            LoggerHandler.error("Error in clickOnJadePlants: " + e.getMessage());
            Reporter.logFail("Error in clickOnJadePlants: " + e.getMessage());
            Reporter.attachScreenshotToReport("clickOnJadePlants", Reporter.test, "Error in clickOnJadePlants");
        }
    }

    public void clickOnMoneyPlants() {
        try {
            HighlightUtil.highlightElement(PlantsPageLocators.clickOnMoneyPlants);
            ProgressBarUtil.setProgress(80, "Clicked On Money Plants");
            helper.waitForElementToBeVisible(PlantsPageLocators.clickOnMoneyPlants, 3);
            helper.clickOnElement(PlantsPageLocators.clickOnMoneyPlants);
            LoggerHandler.info("Clicked On Money Plants");
            Reporter.logInfo("Clicked On Money Plants");
        } catch (Exception e) {
            LoggerHandler.error("Error in clickOnMoneyPlants: " + e.getMessage());
            Reporter.logFail("Error in clickOnMoneyPlants: " + e.getMessage());
            Reporter.attachScreenshotToReport("clickOnMoneyPlants", Reporter.test, "Error in clickOnMoneyPlants");
        }
    }

    public void clickOnCart() {
        try {
            HighlightUtil.highlightElement(PlantsPageLocators.clickOnCart);
            ProgressBarUtil.setProgress(100, "Clicked On Cart");
            helper.clickOnElement(PlantsPageLocators.clickOnCart);
            LoggerHandler.info("Clicked On Cart");
            Reporter.logInfo("Clicked On Cart");
        } catch (Exception e) {
            LoggerHandler.error("Error in clickOnCart: " + e.getMessage());
            Reporter.logFail("Error in clickOnCart: " + e.getMessage());
            Reporter.attachScreenshotToReport("clickOnCart", Reporter.test, "Error in clickOnCart");
        }
    }

    public void verifyContinueGifting() {
        try {
            helper.veriFyText(helper.getText(PlantsPageLocators.verifyContinueGifting), "Continue Gifting");
            Screenshot.snapScreenshot("Verified Continue Gifting");
            Reporter.captureScreenShot("Verified Continue Gifting");
            Reporter.attachScreenshotToReport("Verified Continue Gifting", Reporter.test, "Verified Continue Gifting");
        } catch (Exception e) {
            LoggerHandler.error("Error in verifyContinueGifting: " + e.getMessage());
            Reporter.logFail("Error in verifyContinueGifting: " + e.getMessage());
            Reporter.attachScreenshotToReport("verifyContinueGifting", Reporter.test, "Error in verifyContinueGifting");
        }
    }


    public void navigatebacktoPlants() {
        try {
            helper.navigatebacktoUrl("https://www.fnp.com/all-plants-lp?promo=plants_tab_dt_hm");
        } catch (Exception e) {
            LoggerHandler.error("Error in navigatebacktoPlants: " + e.getMessage());
            Reporter.logFail("Error in navigatebacktoPlants: " + e.getMessage());
            Reporter.attachScreenshotToReport("navigatebacktoPlants", Reporter.test, "Error in navigatebacktoPlants");
        }
    }

    public void verifyPlants() {
        try {
            helper.waitForElementToBeVisible(PlantsPageLocators.clickOnLuckyBamboo, 7);
            helper.verifyPageTitle("Plants:");
            LoggerHandler.info("Verified Plants Page Loaded");
            Reporter.logInfo("Verified Plants Page Loaded");
        } catch (Exception e) {
            LoggerHandler.error("Error in verifyPlants: " + e.getMessage());
            Reporter.logFail("Error in verifyPlants: " + e.getMessage());
            Reporter.attachScreenshotToReport("verifyPlants", Reporter.test, "Error in verifyPlants");
        }
    }

}