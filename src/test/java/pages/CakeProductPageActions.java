package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import uistore.CakeProductLocators;
import uistore.HomePageLocators;
import uistore.PenLocator;
import utils.ExcelReader;
import utils.HighlightUtil;
import utils.LoggerHandler;
import utils.ProgressBarUtil;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class CakeProductPageActions {
    public WebDriver driver;
    public WebDriverHelper helper;

    public CakeProductPageActions(WebDriver driver) {
        this.driver = driver;
        helper = new WebDriverHelper(driver);
    }


    public void clickOnSearchBtn() {
        try {
            HighlightUtil.highlightElement(HomePageLocators.clickSearch);
            ProgressBarUtil.setProgress(65, "Clicked on search button");
            helper.clickOnElement(HomePageLocators.clickSearch);
            LoggerHandler.info("Clicked on search button");
            Reporter.logInfo("Clicked on search button");
        } catch (Exception e) {
            LoggerHandler.error("Error in clickOnSearchBtn: " + e.getMessage());
            Reporter.logFail("Error in clickOnSearchBtn: " + e.getMessage());
            Reporter.attachScreenshotToReport("clickOnSearchBtn", Reporter.test, "Error in clickOnSearchBtn");
        }
    }

    public void searchCake() throws IOException, InterruptedException {
        try {
            String text = ExcelReader.readCell(System.getProperty("user.dir") + "/testdata/data.xlsx", "Sheet1", 2, 1);
            helper.clickOnElement(HomePageLocators.clickSearch);
            LoggerHandler.info("Enter cake input");
            Reporter.logInfo("Enter cake input");
            helper.sendKeys(HomePageLocators.clickSearch, text);
            helper.enterAction(HomePageLocators.clickSearch);
        } catch (Exception e) {
            LoggerHandler.error("Error in searchCake: " + e.getMessage());
            Reporter.logFail("Error in searchCake: " + e.getMessage());
            Reporter.attachScreenshotToReport("searchCake", Reporter.test, "Error in searchCake");
        }
    }

    public void clickOnFlavour() {
        try {
            helper.hoverOverElement(CakeProductLocators.clickFlavour);
            HighlightUtil.highlightElement(CakeProductLocators.clickFlavour);
            ProgressBarUtil.setProgress(70, "Clicked on Flavours");
            helper.clickOnElement(CakeProductLocators.clickFlavour);
            LoggerHandler.info("Clicked on Flavours");
            Reporter.logInfo("Clicked on Flavours");
        } catch (Exception e) {
            LoggerHandler.error("Error in clickOnFlavour: " + e.getMessage());
            Reporter.logFail("Error in clickOnFlavour: " + e.getMessage());
            Reporter.attachScreenshotToReport("clickOnFlavour", Reporter.test, "Error in clickOnFlavour");
        }
    }

    public void clickOnChocolate() {
        try {
            HighlightUtil.highlightElement(HomePageLocators.clickOnMugs);
            ProgressBarUtil.setProgress(80, "Clicked on Chocolate");
            helper.clickOnElement(CakeProductLocators.clickChocolate);
            LoggerHandler.info("Clicked on Chocolate");
            Reporter.logInfo("Clicked on Chocolate");
        } catch (Exception e) {
            LoggerHandler.error("Error in clickOnChocolate: " + e.getMessage());
            Reporter.logFail("Error in clickOnChocolate: " + e.getMessage());
            Reporter.attachScreenshotToReport("clickOnChocolate", Reporter.test, "Error in clickOnChocolate");
        }
    }

    public void clickOnCakeProd() {
        try {
            HighlightUtil.highlightElement(CakeProductLocators.cakeProduct);
            ProgressBarUtil.setProgress(90, "Clicked on Cake Product");
            helper.clickOnElement(CakeProductLocators.cakeProduct);
            LoggerHandler.info("Clicked on Cake Product");
            Reporter.logInfo("Clicked on Cake Product");
            helper.switchToTab(1);
        } catch (Exception e) {
            LoggerHandler.error("Error in clickOnCakeProd: " + e.getMessage());
            Reporter.logFail("Error in clickOnCakeProd: " + e.getMessage());
            Reporter.attachScreenshotToReport("clickOnCakeProd", Reporter.test, "Error in clickOnCakeProd");
        }
    }

 
    public void clickOnBuyNow() {
        try {
            HighlightUtil.highlightElement(CakeProductLocators.buyNow);
            ProgressBarUtil.setProgress(100, "Clicked on Cake Buy Now");
            helper.clickOnElement(CakeProductLocators.buyNow);
            LoggerHandler.info("Clicked on Cake Buy Now");
            Reporter.logInfo("Clicked on Buy Now");
            Screenshot.snapScreenshot("Buy now");
            Reporter.attachScreenshotToReport("Buy now", Reporter.test, "Screenshot Captured");
        } catch (Exception e) {
            LoggerHandler.error("Error in clickOnBuyNow: " + e.getMessage());
            Reporter.logFail("Error in clickOnBuyNow: " + e.getMessage());
            Reporter.attachScreenshotToReport("clickOnBuyNow", Reporter.test, "Error in clickOnBuyNow");
        }
    }


    public void addToCartVerify() {
        try {
            String addCart = helper.getText(PenLocator.addToCart);
            helper.veriFyText(addCart, "Add To Cart");
            LoggerHandler.info("verified Add To Cart");
            Reporter.logInfo("verified Add To Cart");
            Screenshot.snapScreenshot("Add To Cart");
            Reporter.attachScreenshotToReport("Add To Cart", Reporter.test, "Captured");

        } catch (Exception e) {
            LoggerHandler.error("Error in addToCartVerify: " + e.getMessage());
            Reporter.logFail("Error in addToCartVerify: " + e.getMessage());
            Reporter.attachScreenshotToReport("addToCartVerify", Reporter.test, "Error in addToCartVerify");
        }
    }

}