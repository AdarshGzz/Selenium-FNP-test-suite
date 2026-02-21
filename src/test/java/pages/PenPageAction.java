package pages;

import org.openqa.selenium.WebDriver;

import uistore.PenLocator;
import utils.HighlightUtil;
import utils.LoggerHandler;
import utils.ProgressBarUtil;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class PenPageAction {
    public WebDriver driver;
    private WebDriverHelper helper;

    public PenPageAction(WebDriver driver) {
        this.driver = driver;
        helper = new WebDriverHelper(driver);
    }
    
    public void verifyPenText() {
        try {
            String pen = helper.getText(PenLocator.searchPenVerify);
            helper.veriFyText(pen, "pen");
            LoggerHandler.info("Pen text verified");
			Reporter.logInfo("Pen text verified");
            Screenshot.snapScreenshot("pen");
            Reporter.attachScreenshotToReport("pen", Reporter.test, "Captured screenshot");
        } catch (Exception e) {
            LoggerHandler.error("Error in verifyPenText: " + e.getMessage());
            Reporter.logFail("Error in verifyPenText: " + e.getMessage());
            Reporter.attachScreenshotToReport("verifyPenText", Reporter.test, "Error in verifyPenText");
        }
    }

   
    public void clickOnFirstProd() {
        try {
            helper.waitForElementToBeVisible(PenLocator.firstProducts, 5);
            HighlightUtil.highlightElement(PenLocator.firstProducts);
            ProgressBarUtil.setProgress(50, "Clicked on first Product");
            helper.clickOnElement(PenLocator.firstProducts);
            LoggerHandler.info("Clicked on first Product");
            Reporter.logInfo("Clicked on first Product");
            helper.switchToTab(1);
        } catch (Exception e) {
            LoggerHandler.error("Error in clickOnFirstProd: " + e.getMessage());
            Reporter.logFail("Error in clickOnFirstProd: " + e.getMessage());
            Reporter.attachScreenshotToReport("clickOnFirstProd", Reporter.test, "Error in clickOnFirstProd");
        }
    }

  
    public void clickAddToCart() {
        try {
            helper.waitForElementToBeVisible(PenLocator.addToCart, 5);
            HighlightUtil.highlightElement(PenLocator.addToCart);
            ProgressBarUtil.setProgress(60, "Clicked on Add To Cart");
            helper.clickOnElement(PenLocator.addToCart);
            LoggerHandler.info("Clicked on Add To Cart");
            Reporter.logInfo("Clicked on Add To Cart");
            Screenshot.snapScreenshot("Add To Cart");
            Reporter.attachScreenshotToReport("AddToCart", Reporter.test, "Screenshot Captures");
        } catch (Exception e) {
            LoggerHandler.error("Error in clickAddToCart: " + e.getMessage());
            Reporter.logFail("Error in clickAddToCart: " + e.getMessage());
            Reporter.attachScreenshotToReport("clickAddToCart", Reporter.test, "Error in clickAddToCart");
        }
    }

  
    public void buyNowVerify() {
        try {
            String buynow = helper.getText(PenLocator.verifyBuyNow);
            helper.veriFyText(buynow, "Buy Now");
            LoggerHandler.info("Buy Now verified");
			Reporter.logInfo("Buy Now verified");
            Screenshot.snapScreenshot("Buy Now");
            Reporter.attachScreenshotToReport("Buy Now", Reporter.test, "Captured screenshot");
        } catch (Exception e) {
            LoggerHandler.error("Error in buyNowVerify: " + e.getMessage());
            Reporter.logFail("Error in buyNowVerify: " + e.getMessage());
            Reporter.attachScreenshotToReport("buyNowVerify", Reporter.test, "Error in buyNowVerify");
        }
    }
}