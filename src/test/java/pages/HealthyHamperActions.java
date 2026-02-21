package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import uistore.FirstProductPageLocators;
import uistore.HealthyGiftHamperPageLocators;
import utils.LoggerHandler;
import utils.ProgressBarUtil;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;
import utils.HighlightUtil;

public class HealthyHamperActions {

    private WebDriver driver;
    private WebDriverHelper helper;

    public HealthyHamperActions(WebDriver driver) {
        this.driver = driver;
        helper = new WebDriverHelper(driver);
    }
   
    public void verifyHealthyHampers() {
        try {
            HighlightUtil.highlightElement(HealthyGiftHamperPageLocators.verifyHealthyHampers);
            ProgressBarUtil.setProgress(72, "Verified healthy gift hampers");
            helper.veriFyText(driver.findElement(HealthyGiftHamperPageLocators.verifyHealthyHampers).getText(), "Healthy Gift Hampers");
            Reporter.logInfo("Verified healthy gift hampers");
            LoggerHandler.info("Verified healthy gift hampers");
        } catch (Exception e) {
            LoggerHandler.error("Error in verifyHealthyHampers: " + e.getMessage());
            Reporter.logFail("Error in verifyHealthyHampers: " + e.getMessage());
            Reporter.attachScreenshotToReport("verifyHealthyHampers", Reporter.test, "Error in verifyHealthyHampers");
        }
    }

  
    public void clickOnAvailability() {
        try {
            HighlightUtil.highlightElement(HealthyGiftHamperPageLocators.availability);
            ProgressBarUtil.setProgress(75, "Clicked on Availability");
            helper.clickOnElement(HealthyGiftHamperPageLocators.availability);
            Reporter.logInfo("Clicked on Availability");
            LoggerHandler.info("Clicked on Availability");
        } catch (Exception e) {
            LoggerHandler.error("Error in clickOnAvailability: " + e.getMessage());
            Reporter.logFail("Error in clickOnAvailability: " + e.getMessage());
            Reporter.attachScreenshotToReport("clickOnAvailability", Reporter.test, "Error in clickOnAvailability");
        }
    }

  
    public void clickOnTrue() {
        try {
            HighlightUtil.highlightElement(HealthyGiftHamperPageLocators.truee);
            ProgressBarUtil.setProgress(80, "Clicked on True");
            helper.clickOnElement(HealthyGiftHamperPageLocators.truee);
            Reporter.logInfo("Clicked on True");
            LoggerHandler.info("Clicked on True");
        } catch (Exception e) {
            LoggerHandler.error("Error in clickOnTrue: " + e.getMessage());
            Reporter.logFail("Error in clickOnTrue: " + e.getMessage());
            Reporter.attachScreenshotToReport("clickOnTrue", Reporter.test, "Error in clickOnTrue");
        }
    }

   
    public void clickOnFirstProd() {
        try {
            List<WebElement> list = helper.getElementsByXPath(HealthyGiftHamperPageLocators.firstProductVaibhav);
            for (WebElement elem : list) {
                String label = elem.getText();
                if (label.contains("Bird")) {
                    HighlightUtil.highlightElement(elem);
                    ProgressBarUtil.setProgress(85, "click on the first product");
                    elem.click();
                    break;
                }
            }
            Reporter.logInfo("click on the first product");
            LoggerHandler.info("click on the first product");
            helper.switchToTab(1);
        } catch (Exception e) {
            LoggerHandler.error("Error in clickOnFirstProd: " + e.getMessage());
            Reporter.logFail("Error in clickOnFirstProd: " + e.getMessage());
            Reporter.attachScreenshotToReport("clickOnFirstProd", Reporter.test, "Error in clickOnFirstProd");
        }
    }

   
    public void verifyFirstProduct() {
        try {
            HighlightUtil.highlightElement(FirstProductPageLocators.verifyFirstProduct);
            ProgressBarUtil.setProgress(90, "Verified First Product");
            helper.veriFyText(driver.findElement(FirstProductPageLocators.verifyFirstProduct).getText(), "Bird Illustrated Dry Fruits Box By Kesar");
            Reporter.logInfo("Verified First Product");
            LoggerHandler.info("Verified First Product");
        } catch (Exception e) {
            LoggerHandler.error("Error in verifyFirstProduct: " + e.getMessage());
            Reporter.logFail("Error in verifyFirstProduct: " + e.getMessage());
            Reporter.attachScreenshotToReport("verifyFirstProduct", Reporter.test, "Error in verifyFirstProduct");
        }
    }

 
    public void clickAdd2Cart() {
        try {
            HighlightUtil.highlightElement(FirstProductPageLocators.add2Cart);
            ProgressBarUtil.setProgress(95, "Clicked on Add to Cart");
            helper.clickOnElement(FirstProductPageLocators.add2Cart);
            Reporter.logInfo("Clicked on Add to Cart");
            LoggerHandler.info("Clicked on Add to Cart");
        } catch (Exception e) {
            LoggerHandler.error("Error in clickAdd2Cart: " + e.getMessage());
            Reporter.logFail("Error in clickAdd2Cart: " + e.getMessage());
            Reporter.attachScreenshotToReport("clickAdd2Cart", Reporter.test, "Error in clickAdd2Cart");
        }
    }

 
    public void verifyMore() {
        try {
            HighlightUtil.highlightElement(FirstProductPageLocators.verifyMore);
            ProgressBarUtil.setProgress(100, "Verified More");
            helper.veriFyText(driver.findElement(FirstProductPageLocators.verifyMore).getText(), "More");
            Reporter.logInfo("Verified More");
            LoggerHandler.info("Verified More");
            Screenshot.snapScreenshot("More Screenshot");
            Reporter.captureScreenShot("More");
            Reporter.attachScreenshotToReport("FNP", Reporter.test, "More ScreenShot Added");
        } catch (Exception e) {
            LoggerHandler.error("Error in verifyMore: " + e.getMessage());
            Reporter.logFail("Error in verifyMore: " + e.getMessage());
            Reporter.attachScreenshotToReport("verifyMore", Reporter.test, "Error in verifyMore");
        }
    }
}