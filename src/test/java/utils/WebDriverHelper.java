package utils;

import static org.junit.Assert.assertTrue;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriverHelper {
  public WebDriver driver;
  
  public WebDriverHelper(WebDriver driver){
    this.driver = driver;
  }

  public void waitForElementToBeVisible(By locator,int seconds){
    try {
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
      wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      Reporter.logWarn(e.getMessage());
    }
  }

  public void waitForTheFrame(String id,int seconds){
    try {
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
      wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(id));
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      Reporter.logWarn(e.getMessage());
    }
  }

  public void clickOnElement(By locator){
    try {
      driver.findElement(locator).click();
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      Reporter.logWarn(e.getMessage());
    }
   
  }

  public void hoverOverElement(By locator){
    try {
      Actions action = new Actions(driver);
      action.moveToElement(driver.findElement(locator)).perform();
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      Reporter.logWarn(e.getMessage());
    }
  }

  public String getText(By locator){
    try {
      return driver.findElement(locator).getText();
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      Reporter.logWarn(e.getMessage());
    }
    return null;
  }

  public void veriFyText(String txt1, String txt2){
    try {
      assertTrue(txt1.contains(txt2));
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      Reporter.logWarn(e.getMessage());
    }
  }

  public void scrollToBottom(){
    try {
      JavascriptExecutor js = (JavascriptExecutor)driver;
      js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      Reporter.logWarn(e.getMessage());
    }
  }

  public void scrollToElement(By locator){
    try {
      WebElement element = driver.findElement(locator);
      JavascriptExecutor js = (JavascriptExecutor)driver;
      js.executeScript("arguments[0].scrollIntoView(True)",element);
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      Reporter.logWarn(e.getMessage());
    }
  }

  public void jsClick(By locator){
    try {
      WebElement element = driver.findElement(locator);
      JavascriptExecutor js = (JavascriptExecutor)driver;
      js.executeScript("arguments[0].click()",element);
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      Reporter.logWarn(e.getMessage());
    }
  }

  public void scrollByPx(int px){
    try {
      String script  = "window.scrollBy(0,"+px+");";
      JavascriptExecutor js = (JavascriptExecutor)driver;
      js.executeScript(script);
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      Reporter.logWarn(e.getMessage());
    }
  }

  public void verifyCurrentUrl(String url){
    try {
      System.out.println("URL_______"+url);
      System.out.println("expected________"+driver.getCurrentUrl());
      // Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase(url),driver.getCurrentUrl());
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      Reporter.logWarn(e.getMessage());
    }
  }

  public void verifyPageTitle(String title){
    try {
      assertTrue(driver.getTitle().contains(title));
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      Reporter.logWarn(e.getMessage());
    }
  }

  public void verifyElementDisplayed(By locator){
    try {
      WebElement element = driver.findElement(locator);
      assertTrue(element.isDisplayed());
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      Reporter.logWarn(e.getMessage());
    }
  }

  public void sendKeys(By locator,String text){
    try {
      driver.findElement(locator).sendKeys(text);
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      Reporter.logWarn(e.getMessage());
    }
  }
  
  public void sendKeys(By locator,Keys k){
	  try {
		  driver.findElement(locator).sendKeys(k);
	  } catch (Exception e) {
		  LoggerHandler.error(e.getMessage());
		  Reporter.logWarn(e.getMessage());
	  }
  }

  public void enterAction(By locator){
    try {
      driver.findElement(locator).sendKeys(Keys.ENTER);
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      Reporter.logWarn(e.getMessage());
    }
  }

  public void switchToTab(int n){
    try {
      Set<String> handles = driver.getWindowHandles();
      ArrayList<String> tabs = new ArrayList<>(handles);
      if(!tabs.isEmpty() && n<tabs.size()){
        driver.switchTo().window(tabs.get(n));
      }
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      Reporter.logWarn(e.getMessage());
    }
  }

  public String getInputValue(By locator){
	    try {
	      return driver.findElement(locator).getAttribute("value");
	    } catch (Exception e) {
	      LoggerHandler.error(e.getMessage());
	      Reporter.logWarn(e.getMessage());
	    }
	    return null;
  }
  public String sendKeysActions( By locator, String inputText){
	  try {
		  WebElement inputField = driver.findElement(locator);

		    Actions actions = new Actions(driver);
		    actions.moveToElement(inputField)
		           .click();

		    for (char c : inputText.toCharArray()) {
		        actions.sendKeys(String.valueOf(c))
		               .pause(Duration.ofMillis(100));
		    }

		
		    actions.sendKeys(Keys.SPACE)
		           .pause(Duration.ofMillis(100))
		           .sendKeys(Keys.BACK_SPACE)
		           .build()
		           .perform();


	  } catch (Exception e) {
		  LoggerHandler.error(e.getMessage());
		  Reporter.logWarn(e.getMessage());
	  }
	  return null;
  }

  public List<WebElement> getElementsByXPath(String xString){
    return driver.findElements(By.xpath(xString));
  }

  public void handleSelect(By locator, String option){
    Select select = new Select(driver.findElement(locator));
    select.selectByVisibleText(option);
  }

  
  public void navigatebacktoUrl(String url){
    driver.navigate().to(url);
  }

  public void navigateBack() {
	  driver.navigate().back();
  }

  public void closeAndSwitch(){
    driver.close();
    switchToTab(0);
  }



}
