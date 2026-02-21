package pages;

import org.openqa.selenium.WebDriver;

import uistore.CakeLocator;
import uistore.MugsPageLocators;
import utils.HighlightUtil;
import utils.LoggerHandler;
import utils.ProgressBarUtil;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class CakePageAction {
    
    public WebDriver driver;
    public WebDriverHelper helper;

    public CakePageAction(WebDriver driver) {
        this.driver = driver;
        helper = new WebDriverHelper(driver);
    }

  
    public void verifyBirthdayCake() {
        try {
            HighlightUtil.highlightElement(CakeLocator.verifyBirthdayCake);
            ProgressBarUtil.setProgress(63, "Birthday Cakes");
            helper.waitForElementToBeVisible(CakeLocator.verifyBirthdayCake, 5);
            helper.veriFyText(driver.findElement(CakeLocator.verifyBirthdayCake).getText(), "Birthday");
            Reporter.logInfo("Verified Birthday Cakes");
            LoggerHandler.info("Verified Birthday Cakes");
        } catch (Exception e) {
            LoggerHandler.error("Error in verifyBirthdayCake: " + e.getMessage());
            Reporter.logFail("Error in verifyBirthdayCake: " + e.getMessage());
            Reporter.attachScreenshotToReport("verifyBirthdayCake", Reporter.test, "Error in verifyBirthdayCake");
        }
    }

    
    public void sameDay() {
        try {
            HighlightUtil.highlightElement(CakeLocator.sameDay);
            ProgressBarUtil.setProgress(72, "Click on SameDay");
            helper.waitForElementToBeVisible(CakeLocator.sameDay, 5);
            helper.clickOnElement(CakeLocator.sameDay);
            LoggerHandler.info("Click on SameDay");
            Reporter.logInfo("Click on SameDay");
        } catch (Exception e) {
            LoggerHandler.error("Error in sameDay: " + e.getMessage());
            Reporter.logFail("Error in sameDay: " + e.getMessage());
            Reporter.attachScreenshotToReport("sameDay", Reporter.test, "Error in sameDay");
        }
    }

 
    public void clickfirstProduct() {
        try {
            HighlightUtil.highlightElement(CakeLocator.clickfirstProduct);
            ProgressBarUtil.setProgress(78, "Click on First Product");
            helper.waitForElementToBeVisible(CakeLocator.clickfirstProduct, 5);
            helper.clickOnElement(CakeLocator.clickfirstProduct);
            LoggerHandler.info("Click on First Product");
            Reporter.logInfo("Click on First Product");
            helper.switchToTab(1);
        } catch (Exception e) {
            LoggerHandler.error("Error in clickfirstProduct: " + e.getMessage());
            Reporter.logFail("Error in clickfirstProduct: " + e.getMessage());
            Reporter.attachScreenshotToReport("clickfirstProduct", Reporter.test, "Error in clickfirstProduct");
        }
    }

   
    public void verifyRoseElement() {
        try {
            ProgressBarUtil.setProgress(72, "Roses");
            System.out.println("||||||||||||| " + driver.getTitle() + " |||||||||||||||||||||");
            helper.verifyPageTitle("Love Story");
            Reporter.logInfo("Verified Roses");
            LoggerHandler.info("Verified Roses");
        } catch (Exception e) {
            LoggerHandler.error("Error in verifyRoseElement: " + e.getMessage());
            Reporter.logFail("Error in verifyRoseElement: " + e.getMessage());
            Reporter.attachScreenshotToReport("verifyRoseElement", Reporter.test, "Error in verifyRoseElement");
        }
    }

   
    public void clickAddtoCart() {
        try {
            helper.waitForElementToBeVisible(CakeLocator.clickAddtoCart, 5);
            HighlightUtil.highlightElement(CakeLocator.clickAddtoCart);
            ProgressBarUtil.setProgress(90, "Click on Add To Cart");
            helper.clickOnElement(CakeLocator.clickAddtoCart);
            LoggerHandler.info("Click on Add To Cart");
            Reporter.logInfo("Click on Add To Cart");
            Screenshot.snapScreenshot("Add to cart cake");
        } catch (Exception e) {
            LoggerHandler.error("Error in clickAddtoCart: " + e.getMessage());
            Reporter.logFail("Error in clickAddtoCart: " + e.getMessage());
            Reporter.attachScreenshotToReport("clickAddtoCart", Reporter.test, "Error in clickAddtoCart");
        }
    }

    
    public void verifyOffers() {
        try {
            HighlightUtil.highlightElement(MugsPageLocators.verifyOffersAvailable);
            ProgressBarUtil.setProgress(100, "Offers Screenshot");
            helper.waitForElementToBeVisible(MugsPageLocators.verifyOffersAvailable, 5);
            helper.veriFyText(helper.getText(MugsPageLocators.verifyOffersAvailable), "Offers Available");
            Screenshot.snapScreenshot("Offers Screenshot");
            Reporter.captureScreenShot("Offers Screenshot");
            Reporter.attachScreenshotToReport("Offers Screenshot", Reporter.test, "Offers Screenshot");
            LoggerHandler.info("Verified Offers Available and captured screenshot");
            Reporter.logInfo("Verified Offers Available and captured screenshot");
        } catch (Exception e) {
            LoggerHandler.error("Error in verifyOffers: " + e.getMessage());
            Reporter.logFail("Error in verifyOffers: " + e.getMessage());
            Reporter.attachScreenshotToReport("verifyOffers", Reporter.test, "Error in verifyOffers");
        }
    }

}