package pages;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import uistore.HomePageLocators;
import uistore.PlantsPageLocators;
import utils.ExcelReader;
import utils.HighlightUtil;
import utils.LoggerHandler;
import utils.ProgressBarUtil;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomePageActions {

	public WebDriver driver;
	public WebDriverHelper helper;

	public HomePageActions(WebDriver driver) {
		this.driver = driver;
		helper = new WebDriverHelper(driver);
	}

	public void clickOnNoThanks() {
		try {
			helper.waitForElementToBeVisible(HomePageLocators.noThanks, 10);
			helper.clickOnElement(HomePageLocators.noThanks);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnNoThanks: " + e.getMessage());
			Reporter.logFail("Error in clickOnNoThanks: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnNoThanks", Reporter.test, "Error in clickOnNoThanks");
		}
	}

	public void clickOnTermsNConditons() {
		try {
			helper.hoverOverElement(HomePageLocators.termsAndConditions);
			helper.clickOnElement(HomePageLocators.termsAndConditions);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnTermsNConditons: " + e.getMessage());
			Reporter.logFail("Error in clickOnTermsNConditons: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnTermsNConditons", Reporter.test,
					"Error in clickOnTermsNConditons");
		}
	}

	public void verifyTermsNConditions() {
		try {
			helper.verifyCurrentUrl("https://www.fnp.com/info/terms-and-conditions");
			helper.verifyPageTitle("Terms and Conditions");
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyTermsNConditions: " + e.getMessage());
			Reporter.logFail("Error in verifyTermsNConditions: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyTermsNConditions", Reporter.test,
					"Error in verifyTermsNConditions");
		}
	}

	public void clickOnPrivacyPolicy() {
		try {
			helper.hoverOverElement(HomePageLocators.privacyPolicy);
			helper.clickOnElement(HomePageLocators.privacyPolicy);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnPrivacyPolicy: " + e.getMessage());
			Reporter.logFail("Error in clickOnPrivacyPolicy: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnPrivacyPolicy", Reporter.test, "Error in clickOnPrivacyPolicy");
		}
	}

	public void verifyPrivacyPolicy() {
		try {
			helper.verifyCurrentUrl("https://www.fnp.com/info/privacy-policy");
			// helper.verifyPageTitle("Privacy Policy");
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyPrivacyPolicy: " + e.getMessage());
			Reporter.logFail("Error in verifyPrivacyPolicy: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyPrivacyPolicy", Reporter.test, "Error in verifyPrivacyPolicy");
		}
	}

	public void clickOnTermsOfUse() {
		try {
			helper.hoverOverElement(HomePageLocators.termsOfUse);
			helper.clickOnElement(HomePageLocators.termsOfUse);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnTermsOfUse: " + e.getMessage());
			Reporter.logFail("Error in clickOnTermsOfUse: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnTermsOfUse", Reporter.test, "Error in clickOnTermsOfUse");
		}
	}

	public void verifyTermsOfUse() {
		try {
			helper.verifyCurrentUrl("https://www.fnp.com/info/terms-of-use");
			helper.verifyPageTitle("Terms and Conditions of Use");
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyTermsOfUse: " + e.getMessage());
			Reporter.logFail("Error in verifyTermsOfUse: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyTermsOfUse", Reporter.test, "Error in verifyTermsOfUse");
		}
	}

	public void clickOnDisclimer() {
		try {
			helper.hoverOverElement(HomePageLocators.disclaimer);
			helper.clickOnElement(HomePageLocators.disclaimer);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnDisclimer: " + e.getMessage());
			Reporter.logFail("Error in clickOnDisclimer: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnDisclimer", Reporter.test, "Error in clickOnDisclimer");
		}
	}

	public void verifyDisclaimer() {
		try {
			helper.verifyCurrentUrl("https://www.fnp.com/info/disclaimer");
			helper.verifyPageTitle("Disclaimer");
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyDisclaimer: " + e.getMessage());
			Reporter.logFail("Error in verifyDisclaimer: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyDisclaimer", Reporter.test, "Error in verifyDisclaimer");
		}
	}

	public void clickOnAboutUs() {
		try {
			helper.hoverOverElement(HomePageLocators.aboutUs);
			helper.clickOnElement(HomePageLocators.aboutUs);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnAboutUs: " + e.getMessage());
			Reporter.logFail("Error in clickOnAboutUs: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnAboutUs", Reporter.test, "Error in clickOnAboutUs");
		}
	}

	public void verifyAboutUs() {
		try {
			helper.verifyCurrentUrl("https://www.fnp.com/info/about-us");
			helper.verifyPageTitle("About Us");
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyAboutUs: " + e.getMessage());
			Reporter.logFail("Error in verifyAboutUs: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyAboutUs", Reporter.test, "Error in verifyAboutUs");
		}
	}

	public void clickOnFnpTeam() {
		try {
			helper.hoverOverElement(HomePageLocators.fnpTeam);
			helper.clickOnElement(HomePageLocators.fnpTeam);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnFnpTeam: " + e.getMessage());
			Reporter.logFail("Error in clickOnFnpTeam: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnFnpTeam", Reporter.test, "Error in clickOnFnpTeam");
		}
	}

	public void verifyFnpTeam() {
		try {
			helper.verifyCurrentUrl("https://www.fnp.com/info/fnp-team");
			helper.verifyPageTitle("Ferns N Petals Family");
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyFnpTeam: " + e.getMessage());
			Reporter.logFail("Error in verifyFnpTeam: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyFnpTeam", Reporter.test, "Error in verifyFnpTeam");
		}
	}

	public void clickOnTestimonials() {
		try {
			helper.hoverOverElement(HomePageLocators.testimonials);
			helper.clickOnElement(HomePageLocators.testimonials);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnTestimonials: " + e.getMessage());
			Reporter.logFail("Error in clickOnTestimonials: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnTestimonials", Reporter.test, "Error in clickOnTestimonials");
		}
	}

	public void verifyTestimonials() {
		try {
			helper.verifyCurrentUrl("https://www.fnp.com/info/testimonials");
			helper.verifyPageTitle("Testimonials");
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyTestimonials: " + e.getMessage());
			Reporter.logFail("Error in verifyTestimonials: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyTestimonials", Reporter.test, "Error in verifyTestimonials");
		}
	}

	public void clickOnNewsRoom() {
		try {
			helper.hoverOverElement(HomePageLocators.newsRoom);
			helper.clickOnElement(HomePageLocators.newsRoom);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnNewsRoom: " + e.getMessage());
			Reporter.logFail("Error in clickOnNewsRoom: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnNewsRoom", Reporter.test, "Error in clickOnNewsRoom");
		}
	}

	public void verifyNewsRoom() {
		try {
			helper.verifyCurrentUrl("https://www.fnp.com/info/news");
			helper.verifyPageTitle("Event News");
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyNewsRoom: " + e.getMessage());
			Reporter.logFail("Error in verifyNewsRoom: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyNewsRoom", Reporter.test, "Error in verifyNewsRoom");
		}
	}

	public void clickOnCareers() {
		try {
			helper.hoverOverElement(HomePageLocators.careers);
			helper.clickOnElement(HomePageLocators.careers);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnCareers: " + e.getMessage());
			Reporter.logFail("Error in clickOnCareers: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnCareers", Reporter.test, "Error in clickOnCareers");
		}
	}

	public void verifyCareers() {
		try {
			helper.verifyCurrentUrl("https://www.fnp.com/info/careers");
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyCareers: " + e.getMessage());
			Reporter.logFail("Error in verifyCareers: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyCareers", Reporter.test, "Error in verifyCareers");
		}
	}

	public void clickOnSingaporePositions() {
		try {
			helper.clickOnElement(HomePageLocators.singaporePosition);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnSingaporePositions: " + e.getMessage());
			Reporter.logFail("Error in clickOnSingaporePositions: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnSingaporePositions", Reporter.test,
					"Error in clickOnSingaporePositions");
		}
	}

	public void clickOnFirstListing() {
		try {
			helper.clickOnElement(HomePageLocators.categoryHead);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnFirstListing: " + e.getMessage());
			Reporter.logFail("Error in clickOnFirstListing: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnFirstListing", Reporter.test, "Error in clickOnFirstListing");
		}
	}

	public void clickOnApplyNow() {
		try {
			helper.hoverOverElement(HomePageLocators.applyNow);
			helper.clickOnElement(HomePageLocators.applyNow);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnApplyNow: " + e.getMessage());
			Reporter.logFail("Error in clickOnApplyNow: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnApplyNow", Reporter.test, "Error in clickOnApplyNow");
		}
	}

	public void clickOnBlog() {
		try {
			LoggerHandler.info("Clicking");
			helper.hoverOverElement(HomePageLocators.blog);
			helper.clickOnElement(HomePageLocators.blog);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnBlog: " + e.getMessage());
			Reporter.logFail("Error in clickOnBlog: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnBlog", Reporter.test, "Error in clickOnBlog");
		}
	}

	public void verifyBlogUrl() {
		try {
			helper.verifyCurrentUrl("https://www.fnp.com/blog/");
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyBlogUrl: " + e.getMessage());
			Reporter.logFail("Error in verifyBlogUrl: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyBlogUrl", Reporter.test, "Error in verifyBlogUrl");
		}
	}

	public void verifyBlogTitle() {
		try {
			helper.verifyPageTitle("FNP Blog");
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyBlogTitle: " + e.getMessage());
			Reporter.logFail("Error in verifyBlogTitle: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyBlogTitle", Reporter.test, "Error in verifyBlogTitle");
		}
	}

	public void clickOnHoverOnOccassion() {
		try {
			helper.hoverOverElement(HomePageLocators.ocassion);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnHoverOnOccassion: " + e.getMessage());
			Reporter.logFail("Error in clickOnHoverOnOccassion: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnHoverOnOccassion", Reporter.test,
					"Error in clickOnHoverOnOccassion");
		}
	}

	public void clickOnRakhiHampers() {
		try {
			helper.clickOnElement(HomePageLocators.rakhiHampers);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnRakhiHampers: " + e.getMessage());
			Reporter.logFail("Error in clickOnRakhiHampers: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnRakhiHampers", Reporter.test, "Error in clickOnRakhiHampers");
		}
	}

	public void clickOnFirstProductWithFreeKajuKatli() {
		try {
			helper.clickOnElement(HomePageLocators.firstProductRakhiHamper);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnFirstProductWithFreeKajuKatli: " + e.getMessage());
			Reporter.logFail("Error in clickOnFirstProductWithFreeKajuKatli: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnFirstProductWithFreeKajuKatli", Reporter.test,
					"Error in clickOnFirstProductWithFreeKajuKatli");
		}
	}

	public void clickOnCakes() {
		try {
			helper.hoverOverElement(HomePageLocators.cakes);
			helper.clickOnElement(HomePageLocators.cakes);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnCakes: " + e.getMessage());
			Reporter.logFail("Error in clickOnCakes: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnCakes", Reporter.test, "Error in clickOnCakes");
		}
	}

	public void clickOnTruffleCake() {
		try {
			helper.hoverOverElement(HomePageLocators.truffleCake);
			helper.clickOnElement(HomePageLocators.truffleCake);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnTruffleCake: " + e.getMessage());
			Reporter.logFail("Error in clickOnTruffleCake: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnTruffleCake", Reporter.test, "Error in clickOnTruffleCake");
		}
	}

	public void verifyTruffleCakeHeading() {
		try {
			helper.veriFyText(helper.getText(HomePageLocators.truffleCakeHeading), "Truffle Cakes");
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyTruffleCakeHeading: " + e.getMessage());
			Reporter.logFail("Error in verifyTruffleCakeHeading: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyTruffleCakeHeading", Reporter.test,
					"Error in verifyTruffleCakeHeading");
		}
	}

	public void clickOnContinue() {
		try {
			helper.clickOnElement(HomePageLocators.continueBtn);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnContinue: " + e.getMessage());
			Reporter.logFail("Error in clickOnContinue: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnContinue", Reporter.test, "Error in clickOnContinue");
		}
	}

	public void verifyCartHeading() {
		try {
			helper.waitForElementToBeVisible(HomePageLocators.cartHeading, 5);
			helper.veriFyText(helper.getText(HomePageLocators.cartHeading), "Cart");
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyCartHeading: " + e.getMessage());
			Reporter.logFail("Error in verifyCartHeading: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyCartHeading", Reporter.test, "Error in verifyCartHeading");
		}
	}

	public void clickOnDecorations() {
		try {
			LoggerHandler.info("Clicking");
			helper.hoverOverElement(HomePageLocators.decorations);
			helper.clickOnElement(HomePageLocators.decorations);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnDecorations: " + e.getMessage());
			Reporter.logFail("Error in clickOnDecorations: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnDecorations", Reporter.test, "Error in clickOnDecorations");
		}
	}

	public void switchToNewTab() {
		try {
			helper.switchToTab(1);
		} catch (Exception e) {
			LoggerHandler.error("Error in switchToNewTab: " + e.getMessage());
			Reporter.logFail("Error in switchToNewTab: " + e.getMessage());
			Reporter.attachScreenshotToReport("switchToNewTab", Reporter.test, "Error in switchToNewTab");
		}
	}

	public void verifyDecorationUrl() {
		try {
			helper.verifyCurrentUrl("https://www.fnp.com/decoration-services-lp");
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyDecorationUrl: " + e.getMessage());
			Reporter.logFail("Error in verifyDecorationUrl: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyDecorationUrl", Reporter.test, "Error in verifyDecorationUrl");
		}
	}

	public void clickOnKolkata() {
		try {
			helper.hoverOverElement(HomePageLocators.kolkata);
			helper.clickOnElement(HomePageLocators.kolkata);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnKolkata: " + e.getMessage());
			Reporter.logFail("Error in clickOnKolkata: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnKolkata", Reporter.test, "Error in clickOnKolkata");
		}
	}

	public void clickOnElementContainsBlue() {
		try {
			List<WebElement> list = helper.getElementsByXPath(HomePageLocators.itemList);
			if (!list.isEmpty()) {
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getText().contains("Blue")) {
						list.get(i).click();
						break;
					}
				}
			}
			helper.switchToTab(2);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnElementContainsBlue: " + e.getMessage());
			Reporter.logFail("Error in clickOnElementContainsBlue: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnElementContainsBlue", Reporter.test,
					"Error in clickOnElementContainsBlue");
		}
	}

	public void verifyProductHeadingContainsBlue() {
		try {
			helper.veriFyText(helper.getText(HomePageLocators.productHeading), "Blue");
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyProductHeadingContainsBlue: " + e.getMessage());
			Reporter.logFail("Error in verifyProductHeadingContainsBlue: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyProductHeadingContainsBlue", Reporter.test,
					"Error in verifyProductHeadingContainsBlue");
		}
	}

	public void clickOnCorporateService() {
		try {
			helper.hoverOverElement(HomePageLocators.corpororateService);
			helper.clickOnElement(HomePageLocators.corpororateService);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnCorporateService: " + e.getMessage());
			Reporter.logFail("Error in clickOnCorporateService: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnCorporateService", Reporter.test,
					"Error in clickOnCorporateService");
		}
	}

	public void verifyCorporateServiceUrl() {
		try {
			helper.verifyCurrentUrl("https://www.fnp.com/corporate/");
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyCorporateServiceUrl: " + e.getMessage());
			Reporter.logFail("Error in verifyCorporateServiceUrl: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyCorporateServiceUrl", Reporter.test,
					"Error in verifyCorporateServiceUrl");
		}
	}

	public void fillName() {
		try {
			helper.hoverOverElement(HomePageLocators.nameInp);
			helper.sendKeys(HomePageLocators.nameInp, "Jhon Doe");
		} catch (Exception e) {
			LoggerHandler.error("Error in fillName: " + e.getMessage());
			Reporter.logFail("Error in fillName: " + e.getMessage());
			Reporter.attachScreenshotToReport("fillName", Reporter.test, "Error in fillName");
		}
	}

	public void selectMaharashtra() {
		try {
			helper.handleSelect(HomePageLocators.stateSelect, "MAHARASHTRA");
		} catch (Exception e) {
			LoggerHandler.error("Error in selectMaharashtra: " + e.getMessage());
			Reporter.logFail("Error in selectMaharashtra: " + e.getMessage());
			Reporter.attachScreenshotToReport("selectMaharashtra", Reporter.test, "Error in selectMaharashtra");
		}
	}

	public void selectPriceRange() {
		try {
			helper.handleSelect(HomePageLocators.budgetSelect, "Under ₹999");
		} catch (Exception e) {
			LoggerHandler.error("Error in selectPriceRange: " + e.getMessage());
			Reporter.logFail("Error in selectPriceRange: " + e.getMessage());
			Reporter.attachScreenshotToReport("selectPriceRange", Reporter.test, "Error in selectPriceRange");
		}
	}

	public void clickOnSubmitBtn() {
		try {
			helper.clickOnElement(HomePageLocators.submit);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnSubmitBtn: " + e.getMessage());
			Reporter.logFail("Error in clickOnSubmitBtn: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnSubmitBtn", Reporter.test, "Error in clickOnSubmitBtn");
		}
	}

	public void verifyDecorationsTitle() {
		try {
			helper.verifyPageTitle("Decoration");
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyDecorationsTitle: " + e.getMessage());
			Reporter.logFail("Error in verifyDecorationsTitle: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyDecorationsTitle", Reporter.test,
					"Error in verifyDecorationsTitle");
		}
	}

	public void switchToParentTab() {
		try {
			driver.close();
			helper.switchToTab(0);
		} catch (Exception e) {
			LoggerHandler.error("Error in switchToParentTab: " + e.getMessage());
			Reporter.logFail("Error in switchToParentTab: " + e.getMessage());
			Reporter.attachScreenshotToReport("switchToParentTab", Reporter.test, "Error in switchToParentTab");
		}
	}

	public void clickOnServices() {
		try {
			LoggerHandler.info("Clicking");
			helper.hoverOverElement(HomePageLocators.services);
			helper.clickOnElement(HomePageLocators.services);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnServices: " + e.getMessage());
			Reporter.logFail("Error in clickOnServices: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnServices", Reporter.test, "Error in clickOnServices");
		}
	}

	public void verifyServicesUrl() {
		try {
			helper.verifyCurrentUrl("https://www.fnp.com/decoration-services-lp");
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyServicesUrl: " + e.getMessage());
			Reporter.logFail("Error in verifyServicesUrl: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyServicesUrl", Reporter.test, "Error in verifyServicesUrl");
		}
	}

	public void verifyServicesTitle() {
		try {
			helper.verifyPageTitle("Services");
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyServicesTitle: " + e.getMessage());
			Reporter.logFail("Error in verifyServicesTitle: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyServicesTitle", Reporter.test, "Error in verifyServicesTitle");
		}
	}

	public void verifyCorporateServiceTitle() {
		try {
			helper.verifyPageTitle("Corporate");
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyCorporateServiceTitle: " + e.getMessage());
			Reporter.logFail("Error in verifyCorporateServiceTitle: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyCorporateServiceTitle", Reporter.test,
					"Error in verifyCorporateServiceTitle");
		}
	}

	public void clickOnAffiliateProgram() {
		try {
			LoggerHandler.info("Clicking");
			helper.hoverOverElement(HomePageLocators.affiliateProgram);
			helper.clickOnElement(HomePageLocators.affiliateProgram);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnAffiliateProgram: " + e.getMessage());
			Reporter.logFail("Error in clickOnAffiliateProgram: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnAffiliateProgram", Reporter.test,
					"Error in clickOnAffiliateProgram");
		}
	}

	public void verifyAffiliateProgramUrl() {
		try {
			helper.verifyCurrentUrl("https://www.fnp.com/info/affiliate-program");
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyAffiliateProgramUrl: " + e.getMessage());
			Reporter.logFail("Error in verifyAffiliateProgramUrl: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyAffiliateProgramUrl", Reporter.test,
					"Error in verifyAffiliateProgramUrl");
		}
	}

	public void verifyAffiliateProgramTitle() {
		try {
			helper.verifyPageTitle("Affiliate Program");
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyAffiliateProgramTitle: " + e.getMessage());
			Reporter.logFail("Error in verifyAffiliateProgramTitle: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyAffiliateProgramTitle", Reporter.test,
					"Error in verifyAffiliateProgramTitle");
		}
	}

	public void clickOnRetailsStore() {
		try {
			LoggerHandler.info("Clicking");
			helper.hoverOverElement(HomePageLocators.retailStores);
			helper.clickOnElement(HomePageLocators.retailStores);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnRetailsStore: " + e.getMessage());
			Reporter.logFail("Error in clickOnRetailsStore: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnRetailsStore", Reporter.test, "Error in clickOnRetailsStore");
		}
	}

	public void verifyRetailsStoreUrl() {
		try {
			helper.verifyCurrentUrl("https://www.fnp.com/info/retail-stores");
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyRetailsStoreUrl: " + e.getMessage());
			Reporter.logFail("Error in verifyRetailsStoreUrl: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyRetailsStoreUrl", Reporter.test, "Error in verifyRetailsStoreUrl");
		}
	}

	public void verifyRetailsStoreTitle() {
		try {
			helper.verifyPageTitle("Retails Stores");
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyRetailsStoreTitle: " + e.getMessage());
			Reporter.logFail("Error in verifyRetailsStoreTitle: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyRetailsStoreTitle", Reporter.test,
					"Error in verifyRetailsStoreTitle");
		}
	}

	public void clickOnFrenchise() {
		try {
			LoggerHandler.info("Clicking");
			helper.hoverOverElement(HomePageLocators.frenchise);
			helper.clickOnElement(HomePageLocators.frenchise);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnFrenchise: " + e.getMessage());
			Reporter.logFail("Error in clickOnFrenchise: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnFrenchise", Reporter.test, "Error in clickOnFrenchise");
		}
	}

	public void verifyFrenchiseUrl() {
		try {
			helper.verifyCurrentUrl("https://www.fnp.com/info/franchise-programme");
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyFrenchiseUrl: " + e.getMessage());
			Reporter.logFail("Error in verifyFrenchiseUrl: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyFrenchiseUrl", Reporter.test, "Error in verifyFrenchiseUrl");
		}
	}

	public void verifyFrenchiseTitle() {
		try {
			helper.verifyPageTitle("Franchise");
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyFrenchiseTitle: " + e.getMessage());
			Reporter.logFail("Error in verifyFrenchiseTitle: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyFrenchiseTitle", Reporter.test, "Error in verifyFrenchiseTitle");
		}
	}

	public void verifyPageLogo() {
		try {
			helper.verifyElementDisplayed(HomePageLocators.logo);
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyPageLogo: " + e.getMessage());
			Reporter.logFail("Error in verifyPageLogo: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyPageLogo", Reporter.test, "Error in verifyPageLogo");
		}
	}

	public void clickOnWhereToDeliver() {
		try {
			LoggerHandler.info("Clicking");
			helper.clickOnElement(HomePageLocators.whereToDeliver);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnWhereToDeliver: " + e.getMessage());
			Reporter.logFail("Error in clickOnWhereToDeliver: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnWhereToDeliver", Reporter.test, "Error in clickOnWhereToDeliver");
		}
	}

	public void handlePincodeInput() {
		try {
			helper.waitForElementToBeVisible(HomePageLocators.pinCodeInput, 5);
			helper.clickOnElement(HomePageLocators.pinCodeInput);
			helper.sendKeysActions(HomePageLocators.pinCodeInput, "Kolkata");
			helper.waitForElementToBeVisible(HomePageLocators.pinCodeCorrectSuggestion, 50);
			helper.clickOnElement(HomePageLocators.pinCodeCorrectSuggestion);
		} catch (Exception e) {
			LoggerHandler.error("Error in handlePincodeInput: " + e.getMessage());
			Reporter.logFail("Error in handlePincodeInput: " + e.getMessage());
			Reporter.attachScreenshotToReport("handlePincodeInput", Reporter.test, "Error in handlePincodeInput");
		}
	}

	public void verifyPincode() {
		try {
			helper.veriFyText(helper.getInputValue(HomePageLocators.pinCodeInput), "700073");
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyPincode: " + e.getMessage());
			Reporter.logFail("Error in verifyPincode: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyPincode", Reporter.test, "Error in verifyPincode");
		}
	}

	public void clickOnContinueShoppingButton() {
		try {
			helper.clickOnElement(HomePageLocators.continueShoppingButton);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnContinueShoppingButton: " + e.getMessage());
			Reporter.logFail("Error in clickOnContinueShoppingButton: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnContinueShoppingButton", Reporter.test,
					"Error in clickOnContinueShoppingButton");
		}
	}

	public void hoverOnLifeStyle() {
		try {
			helper.hoverOverElement(HomePageLocators.lifestyleNavigation);
		} catch (Exception e) {
			LoggerHandler.error("Error in hoverOnLifeStyle: " + e.getMessage());
			Reporter.logFail("Error in hoverOnLifeStyle: " + e.getMessage());
			Reporter.attachScreenshotToReport("hoverOnLifeStyle", Reporter.test, "Error in hoverOnLifeStyle");
		}
	}

	public void clickOnJwellery() {
		try {
			helper.clickOnElement(HomePageLocators.jwellery);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnJwellery: " + e.getMessage());
			Reporter.logFail("Error in clickOnJwellery: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnJwellery", Reporter.test, "Error in clickOnJwellery");
		}
	}

	public void clickOnRings() {
		try {
			helper.clickOnElement(HomePageLocators.rings);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnRings: " + e.getMessage());
			Reporter.logFail("Error in clickOnRings: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnRings", Reporter.test, "Error in clickOnRings");
		}
	}

	public void clickOnFirstProduct() {
		try {
			helper.hoverOverElement(HomePageLocators.firstProduct);
			helper.clickOnElement(HomePageLocators.firstProduct);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnFirstProduct: " + e.getMessage());
			Reporter.logFail("Error in clickOnFirstProduct: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnFirstProduct", Reporter.test, "Error in clickOnFirstProduct");
		}
	}

	public void clickOnAddToCart() {
		try {
			helper.clickOnElement(HomePageLocators.addToCartButton);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnAddToCart: " + e.getMessage());
			Reporter.logFail("Error in clickOnAddToCart: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnAddToCart", Reporter.test, "Error in clickOnAddToCart");
		}
	}

	public void verifyReviews() {
		try {
			helper.veriFyText(helper.getText(HomePageLocators.reviews), "Reviews");
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyReviews: " + e.getMessage());
			Reporter.logFail("Error in verifyReviews: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyReviews", Reporter.test, "Error in verifyReviews");
		}
	}

	public void clickOnWhereToDelivery() throws InterruptedException {
		try {
			helper.waitForElementToBeVisible(HomePageLocators.whereToDeliver, 5);
			HighlightUtil.highlightElement(HomePageLocators.clickWhereToDelivery);
			ProgressBarUtil.setProgress(10, "Clicked on where to delivery");
			helper.clickOnElement(HomePageLocators.clickWhereToDelivery);
			LoggerHandler.info("Clicked on where to delivery");
			Reporter.logInfo("Clicked on where to delivery");
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnWhereToDelivery: " + e.getMessage());
			Reporter.logFail("Error in clickOnWhereToDelivery: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnWhereToDelivery", Reporter.test,
					"Error in clickOnWhereToDelivery");
		}
	}

	public void deliverInput() throws IOException, InterruptedException {
		try {
			String text = ExcelReader.readCell(System.getProperty("user.dir") + "/testdata/data.xlsx", "Sheet1", 1, 0);
			helper.waitForElementToBeVisible(HomePageLocators.inputSection, 5);
			helper.clickOnElement(HomePageLocators.inputSection);
			LoggerHandler.info("Delhi input entered");
			Reporter.logInfo("Delhi input entered");
			helper.sendKeys(HomePageLocators.inputSection, text);
			helper.waitForElementToBeVisible(HomePageLocators.inputSection, 10);
			HighlightUtil.highlightElement(HomePageLocators.delhiIndia);
			ProgressBarUtil.setProgress(20, "Delhi clicked");
			helper.clickOnElement(HomePageLocators.delhiIndia);
		} catch (Exception e) {
			LoggerHandler.error("Error in deliverInput: " + e.getMessage());
			Reporter.logFail("Error in deliverInput: " + e.getMessage());
			Reporter.attachScreenshotToReport("deliverInput", Reporter.test, "Error in deliverInput");
		}
	}

	public void clickOnShopping() throws InterruptedException {
		try {
			helper.waitForElementToBeVisible(HomePageLocators.clickContinueShopping, 5);
			HighlightUtil.highlightElement(HomePageLocators.clickContinueShopping);
			ProgressBarUtil.setProgress(25, "Clicked on continue Shopping");
			helper.clickOnElement(HomePageLocators.clickContinueShopping);
			LoggerHandler.info("Clicked on continue Shopping");
			Reporter.logInfo("Clicked on continue Shopping");
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnShopping: " + e.getMessage());
			Reporter.logFail("Error in clickOnShopping: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnShopping", Reporter.test, "Error in clickOnShopping");
		}
	}

	public void veriifyDelhiPincode() {
		try {
			helper.veriFyText(helper.getInputValue(HomePageLocators.verifyDelhiPincode), "110085");
			LoggerHandler.info("Delhi Pincode verified");
			Reporter.logInfo("Delhi Pincode verified");
			Screenshot.snapScreenshot("Delhi");
			Reporter.attachScreenshotToReport("Delhi", Reporter.test, "Captured");
		} catch (Exception e) {
			LoggerHandler.error("Error in veriifyDelhiPincode: " + e.getMessage());
			Reporter.logFail("Error in veriifyDelhiPincode: " + e.getMessage());
			Reporter.attachScreenshotToReport("veriifyDelhiPincode", Reporter.test, "Error in veriifyDelhiPincode");
		}
	}

	public void clickOnSearchBtn() {
		try {
			helper.waitForElementToBeVisible(HomePageLocators.clickSearch, 5);
			HighlightUtil.highlightElement(HomePageLocators.clickSearch);
			ProgressBarUtil.setProgress(30, "Clicked on searched Button");
			helper.clickOnElement(HomePageLocators.clickSearch);
			LoggerHandler.info("Clicked on searched Button");
			Reporter.logInfo("Clicked on searched Button");
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnSearchBtn: " + e.getMessage());
			Reporter.logFail("Error in clickOnSearchBtn: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnSearchBtn", Reporter.test, "Error in clickOnSearchBtn");
		}
	}

	public void searchPen() throws IOException, InterruptedException {
		try {
			String text = ExcelReader.readCell(System.getProperty("user.dir") + "/testdata/data.xlsx", "Sheet1", 2, 0);
			helper.waitForElementToBeVisible(HomePageLocators.clickSearch, 5);
			HighlightUtil.highlightElement(HomePageLocators.clickSearch);
			ProgressBarUtil.setProgress(40, "pen input entered");
			helper.clickOnElement(HomePageLocators.clickSearch);
			LoggerHandler.info("pen input entered");
			Reporter.logInfo("pen input entered");
			helper.sendKeys(HomePageLocators.clickSearch, text);
			helper.waitForElementToBeVisible(HomePageLocators.clickSearch, 5);
			helper.enterAction(HomePageLocators.clickSearch);
		} catch (Exception e) {
			LoggerHandler.error("Error in searchPen: " + e.getMessage());
			Reporter.logFail("Error in searchPen: " + e.getMessage());
			Reporter.attachScreenshotToReport("searchPen", Reporter.test, "Error in searchPen");
		}
	}

	public void whereToDelivery() {
		try {
			HighlightUtil.highlightElement(HomePageLocators.whereToDelivery);
			ProgressBarUtil.setProgress(18, "Click on Where to Deliver");
			helper.waitForElementToBeVisible(HomePageLocators.clickAllowNotifications, 5);
			helper.clickOnElement(HomePageLocators.clickAllowNotifications);
			helper.clickOnElement(HomePageLocators.whereToDelivery);
			LoggerHandler.info("Click on Where to Deliver");
			Reporter.logInfo("Click on Where to Deliver");
		} catch (Exception e) {
			LoggerHandler.error("Error in whereToDelivery: " + e.getMessage());
			Reporter.logFail("Error in whereToDelivery: " + e.getMessage());
			Reporter.attachScreenshotToReport("whereToDelivery", Reporter.test, "Error in whereToDelivery");
		}
	}

	public void enterLocation() throws IOException, InterruptedException {
		try {
			HighlightUtil.highlightElement(HomePageLocators.enterLocation);
			ProgressBarUtil.setProgress(27, "Click on enter Location");
			helper.waitForElementToBeVisible(HomePageLocators.enterLocation, 5);
			helper.clickOnElement(HomePageLocators.enterLocation);
			LoggerHandler.info("Click on enter Location");
			Reporter.logInfo("Click on enter Location");

			String text = ExcelReader.readCell(System.getProperty("user.dir") + "/testdata/data.xlsx", "Sheet1", 1, 2);
			HighlightUtil.highlightElement(HomePageLocators.enterLocation);
			helper.waitForElementToBeVisible(HomePageLocators.enterLocation, 5);
			helper.sendKeys(HomePageLocators.enterLocation, text);
			LoggerHandler.info("Enter location in search bar");
			Reporter.logInfo("Enter location in search bar");

			HighlightUtil.highlightElement(HomePageLocators.chennai);
			helper.waitForElementToBeVisible(HomePageLocators.chennai, 5);
			helper.clickOnElement(HomePageLocators.chennai);
			LoggerHandler.info("Click on Chennai");
			Reporter.logInfo("Click on Chennai");

			HighlightUtil.highlightElement(HomePageLocators.ContinueShopping);
			helper.waitForElementToBeVisible(HomePageLocators.ContinueShopping, 5);
			helper.clickOnElement(HomePageLocators.ContinueShopping);
			LoggerHandler.info("Click on Continue Shopping");
			Reporter.logInfo("Click on Continue Shopping");

		} catch (Exception e) {
			LoggerHandler.error("Error in enterLocation: " + e.getMessage());
			Reporter.logFail("Error in enterLocation: " + e.getMessage());
			Reporter.attachScreenshotToReport("enterLocation", Reporter.test, "Error in enterLocation");
		}
	}

	public void hoverOnAnniversary() {
		try {
			HighlightUtil.highlightElement(HomePageLocators.HoveronAnniversay);
			ProgressBarUtil.setProgress(36, "Hover on Anniversary");
			helper.waitForElementToBeVisible(HomePageLocators.HoveronAnniversay, 5);
			helper.hoverOverElement(HomePageLocators.HoveronAnniversay);
			LoggerHandler.info("Hover on Anniversary");
			Reporter.logInfo("Hover on Anniversary");
		} catch (Exception e) {
			LoggerHandler.error("Error in hoverOnAnniversary: " + e.getMessage());
			Reporter.logFail("Error in hoverOnAnniversary: " + e.getMessage());
			Reporter.attachScreenshotToReport("hoverOnAnniversary", Reporter.test, "Error in hoverOnAnniversary");
		}
	}

	public void clickOnFlowers() {
		try {
			HighlightUtil.highlightElement(HomePageLocators.clickOnFlowers);
			ProgressBarUtil.setProgress(45, "Click on Flowers");
			helper.waitForElementToBeVisible(HomePageLocators.clickOnFlowers, 3);
			helper.clickOnElement(HomePageLocators.clickOnFlowers);
			LoggerHandler.info("Click on Flowers");
			Reporter.logInfo("Click on Flowers");
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnFlowers: " + e.getMessage());
			Reporter.logFail("Error in clickOnFlowers: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnFlowers", Reporter.test, "Error in clickOnFlowers");
		}
	}

	public void verifyPincodeChennai() {
		try {
			HighlightUtil.highlightElement(HomePageLocators.chennaipincode);
			ProgressBarUtil.setProgress(36, "Verify the pincode");
			helper.waitForElementToBeVisible(HomePageLocators.chennaipincode, 3);
			helper.veriFyText(helper.getInputValue(HomePageLocators.chennaipincode), "600003");
			Reporter.logInfo("Verified the pincode for Chennai");
			LoggerHandler.info("Verified the pincode for Chennai");
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyPincodeChennai: " + e.getMessage());
			Reporter.logFail("Error in verifyPincodeChennai: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyPincodeChennai", Reporter.test, "Error in verifyPincodeChennai");
		}
	}

	public void whereToDeliver() {
		try {
			HighlightUtil.highlightElement(HomePageLocators.whereToDeliver);
			ProgressBarUtil.setProgress(18, "Click on Where to Deliver");
			helper.waitForElementToBeVisible(HomePageLocators.clickAllowNotifications, 5);
			helper.clickOnElement(HomePageLocators.clickAllowNotifications);
			helper.waitForElementToBeVisible(HomePageLocators.whereToDeliver, 5);
			helper.clickOnElement(HomePageLocators.whereToDeliver);
			LoggerHandler.info("Click on Where to Deliver");
			Reporter.logInfo("Click on Where to Deliver");
		} catch (Exception e) {
			LoggerHandler.error("Error in whereToDeliver: " + e.getMessage());
			Reporter.logFail("Error in whereToDeliver: " + e.getMessage());
			Reporter.attachScreenshotToReport("whereToDeliver", Reporter.test, "Error in whereToDeliver");
		}
	}

	public void hoverOnCakes() {
		try {
			HighlightUtil.highlightElement(HomePageLocators.hoverOncakes);
			ProgressBarUtil.setProgress(45, "Hover on Cakes");
			helper.waitForElementToBeVisible(HomePageLocators.hoverOncakes, 5);
			helper.hoverOverElement(HomePageLocators.hoverOncakes);
			LoggerHandler.info("Hover on Cakes");
			Reporter.logInfo("Hover on Cakes");
		} catch (Exception e) {
			LoggerHandler.error("Error in hoverOnCakes: " + e.getMessage());
			Reporter.logFail("Error in hoverOnCakes: " + e.getMessage());
			Reporter.attachScreenshotToReport("hoverOnCakes", Reporter.test, "Error in hoverOnCakes");
		}
	}

	public void clickBirthdayCake() {
		try {
			HighlightUtil.highlightElement(HomePageLocators.clickBirthdayCake);
			ProgressBarUtil.setProgress(54, "Click on Birthday Cakes");
			helper.waitForElementToBeVisible(HomePageLocators.clickBirthdayCake, 5);
			helper.clickOnElement(HomePageLocators.clickBirthdayCake);
			LoggerHandler.info("Click on Birthday Cakes");
			Reporter.logInfo("Click on Birthday Cakes");
		} catch (Exception e) {
			LoggerHandler.error("Error in clickBirthdayCake: " + e.getMessage());
			Reporter.logFail("Error in clickBirthdayCake: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickBirthdayCake", Reporter.test, "Error in clickBirthdayCake");
		}
	}

	public void clickOnAllowNotifications() {
		try {
			HighlightUtil.highlightElement(HomePageLocators.clickAllowNotifications);
			ProgressBarUtil.setProgress(10, "Clicked Allow Notifications");
			helper.clickOnElement(HomePageLocators.clickAllowNotifications);
			LoggerHandler.info("Clicked Allow Notifications");
			Reporter.logInfo("Clicked Allow Notifications");
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnAllowNotifications: " + e.getMessage());
			Reporter.logFail("Error in clickOnAllowNotifications: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnAllowNotifications", Reporter.test,
					"Error in clickOnAllowNotifications");
		}
	}

	public void inputAsBangalore(String location) throws IOException, InterruptedException {
		try {
			helper.sendKeys(HomePageLocators.inputLocationAsBangalore, location);
			helper.waitForElementToBeVisible(HomePageLocators.elementVisibleBanglore, 6);
			helper.enterAction(HomePageLocators.inputLocationAsBangalore);

			LoggerHandler.info("Given Input as Bangalore");
			Reporter.logInfo("Given Input as Bangalore");
		} catch (Exception e) {
			LoggerHandler.error("Error in inputAsBangalore: " + e.getMessage());
			Reporter.logFail("Error in inputAsBangalore: " + e.getMessage());
			Reporter.attachScreenshotToReport("inputAsBangalore", Reporter.test, "Error in inputAsBangalore");
		}
	}

	public void clickOnContinueShopping() throws Throwable {
		try {
			Thread.sleep(2000);
			HighlightUtil.highlightElement(HomePageLocators.clickOnContinueShopping);
			ProgressBarUtil.setProgress(10, "Clicked On Continue Shopping");
			helper.waitForElementToBeVisible(HomePageLocators.clickOnContinueShopping, 6);
			helper.clickOnElement(HomePageLocators.clickOnContinueShopping);
			LoggerHandler.info("Clicked On Continue Shopping");
			Reporter.logInfo("Clicked On Continue Shopping");
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnContinueShopping: " + e.getMessage());
			Reporter.logFail("Error in clickOnContinueShopping: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnContinueShopping", Reporter.test,
					"Error in clickOnContinueShopping");
		}
	}

	public void verifyPincodeBanglore() {
		try {
			helper.veriFyText(helper.getInputValue(HomePageLocators.pinCodeInput), "560002");
			LoggerHandler.info("Verified Banglore Pincode");
			Reporter.logInfo("Verified Banglore Pincode");
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyPincodeBanglore: " + e.getMessage());
			Reporter.logFail("Error in verifyPincodeBanglore: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyPincodeBanglore", Reporter.test, "Error in verifyPincodeBanglore");
		}
	}

	public void hoverOverPersonalised() {
		try {
			helper.hoverOverElement(HomePageLocators.hoverPersonalised);
			LoggerHandler.info("Hover Over Personalised");
			Reporter.logInfo("Hover Over Personalised");
		} catch (Exception e) {
			LoggerHandler.error("Error in hoverOverPersonalised: " + e.getMessage());
			Reporter.logFail("Error in hoverOverPersonalised: " + e.getMessage());
			Reporter.attachScreenshotToReport("hoverOverPersonalised", Reporter.test, "Error in hoverOverPersonalised");
		}
	}

	public void clickOnMugs() {
		try {
			HighlightUtil.highlightElement(HomePageLocators.clickOnMugs);
			ProgressBarUtil.setProgress(10, "Clicked On Mugs");
			helper.hoverOverElement(HomePageLocators.clickOnMugs);
			helper.clickOnElement(HomePageLocators.clickOnMugs);
			LoggerHandler.info("Clicked On Mugs");
			Reporter.logInfo("Clicked On Mugs");
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnMugs: " + e.getMessage());
			Reporter.logFail("Error in clickOnMugs: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnMugs", Reporter.test, "Error in clickOnMugs");
		}
	}

	public void clickOnPlants() {
		try {

			HighlightUtil.highlightElement(PlantsPageLocators.clickOnPlants);
			ProgressBarUtil.setProgress(10, "Clicked On Plants");
			helper.clickOnElement(PlantsPageLocators.clickOnPlants);
			LoggerHandler.info("Clicked On Plants");
			Reporter.logInfo("Clicked On Plants");
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnPlants: " + e.getMessage());
			Reporter.logFail("Error in clickOnPlants: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnPlants", Reporter.test, "Error in clickOnPlants");
		}
	}

	public void verifyLogo() {
		try {
			HighlightUtil.highlightElement(HomePageLocators.fnpLogo);
			ProgressBarUtil.setProgress(10, "Verified FNP Logo");
			helper.verifyElementDisplayed(HomePageLocators.fnpLogo);
			Reporter.logInfo("Verified FNP Logo");
			LoggerHandler.info("Verified FNP Logo");
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyLogo: " + e.getMessage());
			Reporter.logFail("Error in verifyLogo: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyLogo", Reporter.test, "Error in verifyLogo");
		}
	}

	public void clickOnNoThanksVaibhav() {
		try {
			helper.waitForElementToBeVisible(HomePageLocators.noThanks, 5);
			HighlightUtil.highlightElement(HomePageLocators.noThanks);
			ProgressBarUtil.setProgress(15, "Clicked on No, Thanks");
			helper.clickOnElement(HomePageLocators.noThanks);
			Reporter.logInfo("Clicked on No, Thanks");
			LoggerHandler.info("Clicked on No, Thanks");
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnNoThanksVaibhav: " + e.getMessage());
			Reporter.logFail("Error in clickOnNoThanksVaibhav: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnNoThanksVaibhav", Reporter.test,
					"Error in clickOnNoThanksVaibhav");
		}
	}

	public void clickOnWhere2Deliver() {
		try {
			HighlightUtil.highlightElement(HomePageLocators.where2Deliver);
			ProgressBarUtil.setProgress(25, "Clicked on where to deliver");
			helper.clickOnElement(HomePageLocators.where2Deliver);
			Reporter.logInfo("Clicked on where to deliver");
			LoggerHandler.info("Clicked on where to deliver");
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnWhere2Deliver: " + e.getMessage());
			Reporter.logFail("Error in clickOnWhere2Deliver: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnWhere2Deliver", Reporter.test, "Error in clickOnWhere2Deliver");
		}
	}

	public void sendBanglore() throws IOException {
		try {
			helper.waitForElementToBeVisible(HomePageLocators.bangloreInput, 5);
			HighlightUtil.highlightElement(HomePageLocators.bangloreInput);
			ProgressBarUtil.setProgress(30, "Entered Bangalore as input");
			helper.sendKeys(HomePageLocators.bangloreInput,
					ExcelReader.readCell("./testdata/data.xlsx", "Sheet1", 1, 6));
			helper.enterAction(HomePageLocators.bangloreInput);
			Reporter.logInfo("Entered Bangalore as input");
			LoggerHandler.info("Entered Bangalore as input");
		} catch (Exception e) {
			LoggerHandler.error("Error in sendBanglore: " + e.getMessage());
			Reporter.logFail("Error in sendBanglore: " + e.getMessage());
			Reporter.attachScreenshotToReport("sendBanglore", Reporter.test, "Error in sendBanglore");
		}
	}

	public void clickOnBanglore() {
		try {
			helper.waitForElementToBeVisible(HomePageLocators.bangloreClick, 3);
			HighlightUtil.highlightElement(HomePageLocators.bangloreClick);
			ProgressBarUtil.setProgress(40, "Clicked on Bangalore");
			helper.clickOnElement(HomePageLocators.bangloreClick);
			Reporter.logInfo("Clicked on Bangalore");
			LoggerHandler.info("Clicked on Bangalore");
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnBanglore: " + e.getMessage());
			Reporter.logFail("Error in clickOnBanglore: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnBanglore", Reporter.test, "Error in clickOnBanglore");
		}
	}

	public void clickOnContinueShoppingVaibhav() {
		try {
			helper.waitForElementToBeVisible(HomePageLocators.continueShopping, 3);
			HighlightUtil.highlightElement(HomePageLocators.continueShopping);
			ProgressBarUtil.setProgress(50, "Clicked on continue shopping");
			helper.clickOnElement(HomePageLocators.continueShopping);
			Reporter.logInfo("Clicked on continue shopping");
			LoggerHandler.info("Clicked on continue shopping");
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnContinueShoppingVaibhav: " + e.getMessage());
			Reporter.logFail("Error in clickOnContinueShoppingVaibhav: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnContinueShoppingVaibhav", Reporter.test,
					"Error in clickOnContinueShoppingVaibhav");
		}
	}

	public void verifyPincodeVaibhav() {
		try {
			helper.waitForElementToBeVisible(HomePageLocators.verifyPinCode, 3);
			HighlightUtil.highlightElement(HomePageLocators.verifyPinCode);
			ProgressBarUtil.setProgress(55, "verify the pincode");
			helper.veriFyText(driver.findElement(HomePageLocators.verifyPinCode).getText(), "560002");
			Reporter.logInfo("verify the pincode");
			LoggerHandler.info("verify the pincode");
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyPincodeVaibhav: " + e.getMessage());
			Reporter.logFail("Error in verifyPincodeVaibhav: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyPincodeVaibhav", Reporter.test, "Error in verifyPincodeVaibhav");
		}
	}

	public void hoverCombos() {
		try {
			helper.waitForElementToBeVisible(HomePageLocators.combos, 5);
			HighlightUtil.highlightElement(HomePageLocators.combos);
			ProgressBarUtil.setProgress(60, "Hovered over Combos");
			helper.hoverOverElement(HomePageLocators.combos);
			Reporter.logInfo("Hovered over Combos");
			LoggerHandler.info("Hovered over Combos");
		} catch (Exception e) {
			LoggerHandler.error("Error in hoverCombos: " + e.getMessage());
			Reporter.logFail("Error in hoverCombos: " + e.getMessage());
			Reporter.attachScreenshotToReport("hoverCombos", Reporter.test, "Error in hoverCombos");
		}
	}

	public void clickOnHealthyHampers() {
		try {
			helper.waitForElementToBeVisible(HomePageLocators.healthyHampers, 5);
			HighlightUtil.highlightElement(HomePageLocators.healthyHampers);
			ProgressBarUtil.setProgress(70, "Clicked on healthy hampers");
			helper.clickOnElement(HomePageLocators.healthyHampers);
			Reporter.logInfo("Clicked on healthy hampers");
			LoggerHandler.info("Clicked on healthy hampers");
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnHealthyHampers: " + e.getMessage());
			Reporter.logFail("Error in clickOnHealthyHampers: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnHealthyHampers", Reporter.test, "Error in clickOnHealthyHampers");
		}
	}

	public void clickOnTermsAndConditions() {
		try {
			clickOnNoThanks();
			helper.scrollToBottom();
			HighlightUtil.highlightElement(HomePageLocators.termsAndConditions);
			ProgressBarUtil.setProgress(7, "Clicked on Terms and Conditions");
			helper.clickOnElement(HomePageLocators.termsAndConditions);
			Reporter.logInfo("Clicked on Terms and Conditions");
			LoggerHandler.info("Clicked on Terms and Conditions");
			helper.switchToTab(1);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnTermsAndConditions: " + e.getMessage());
			Reporter.logFail("Error in clickOnTermsAndConditions: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnTermsAndConditions", Reporter.test,
					"Error in clickOnTermsAndConditions");
		}
	}

	public void verifyTnCTitleAndUrl() {
		try {
			ProgressBarUtil.setProgress(14, "Verified Terms and Conditions Title and URL");
			helper.verifyPageTitle("Ferns N Petals Terms and Conditions Information");
			helper.verifyCurrentUrl("https://www.fnp.com/info/terms-and-conditions");
			Reporter.logInfo("Verified Terms and Conditions Title and URL");
			LoggerHandler.info("Verified Terms and Conditions Title and URL");
			helper.closeAndSwitch();
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyTnCTitleAndUrl: " + e.getMessage());
			Reporter.logFail("Error in verifyTnCTitleAndUrl: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyTnCTitleAndUrl", Reporter.test, "Error in verifyTnCTitleAndUrl");
		}
	}

	public void verifyPPTitleAndUrl() {
		try {
			ProgressBarUtil.setProgress(28, "Verified Privacy Policy Title and URL");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
			// helper.verifyPageTitle("Privacy Policy Information - Ferns N Petals");
			helper.verifyCurrentUrl("https://www.fnp.com/info/privacy-policy");
			Reporter.logInfo("Verified Privacy Policy Title and URL");
			LoggerHandler.info("Verified Privacy Policy Title and URL");
			helper.closeAndSwitch();
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyPPTitleAndUrl: " + e.getMessage());
			Reporter.logFail("Error in verifyPPTitleAndUrl: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyPPTitleAndUrl", Reporter.test, "Error in verifyPPTitleAndUrl");
		}
	}

	public void clickOnDisclaimer() {
		try {
			helper.scrollToBottom();
			helper.waitForElementToBeVisible(HomePageLocators.disclaimer, 5);
			HighlightUtil.highlightElement(HomePageLocators.disclaimer);
			ProgressBarUtil.setProgress(35, "Clicked on Disclaimer");
			helper.clickOnElement(HomePageLocators.disclaimer);
			Reporter.logInfo("Clicked on Disclaimer");
			LoggerHandler.info("Clicked on Disclaimer");
			helper.switchToTab(1);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnDisclaimer: " + e.getMessage());
			Reporter.logFail("Error in clickOnDisclaimer: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnDisclaimer", Reporter.test, "Error in clickOnDisclaimer");
		}
	}

	public void verifyDisclaimerTitleAndUrl() {
		try {
			ProgressBarUtil.setProgress(42, "Verified Disclaimer Title and URL");
			helper.verifyPageTitle("Disclaimer");
			helper.verifyCurrentUrl("https://www.fnp.com/info/disclaimer");
			Reporter.logInfo("Verified Disclaimer Title and URL");
			LoggerHandler.info("Verified Disclaimer Title and URL");
			helper.closeAndSwitch();
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyDisclaimerTitleAndUrl: " + e.getMessage());
			Reporter.logFail("Error in verifyDisclaimerTitleAndUrl: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyDisclaimerTitleAndUrl", Reporter.test,
					"Error in verifyDisclaimerTitleAndUrl");
		}
	}

	public void verifyAboutUsTitleAndUrl() {
		try {
			ProgressBarUtil.setProgress(54, "Verified About Us Title and URL");
			helper.verifyPageTitle("About Us Information");
			helper.verifyCurrentUrl("https://www.fnp.com/info/about-us");
			Reporter.logInfo("Verified About Us Title and URL");
			LoggerHandler.info("Verified About Us Title and URL");
			helper.closeAndSwitch();
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyAboutUsTitleAndUrl: " + e.getMessage());
			Reporter.logFail("Error in verifyAboutUsTitleAndUrl: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyAboutUsTitleAndUrl", Reporter.test,
					"Error in verifyAboutUsTitleAndUrl");
		}
	}

	public void clickOnFNPTeam() {
		try {
			helper.scrollToBottom();
			helper.waitForElementToBeVisible(HomePageLocators.FNPTeam, 5);
			HighlightUtil.highlightElement(HomePageLocators.FNPTeam);
			ProgressBarUtil.setProgress(59, "Clicked on FNP Team");
			helper.clickOnElement(HomePageLocators.FNPTeam);
			Reporter.logInfo("Clicked on FNP Team");
			LoggerHandler.info("Clicked on FNP Team");
			helper.switchToTab(1);
		} catch (Exception e) {
			LoggerHandler.error("Error in clickOnFNPTeam: " + e.getMessage());
			Reporter.logFail("Error in clickOnFNPTeam: " + e.getMessage());
			Reporter.attachScreenshotToReport("clickOnFNPTeam", Reporter.test, "Error in clickOnFNPTeam");
		}
	}

	public void verifyFNPTeamTitleAndUrl() {
		try {
			ProgressBarUtil.setProgress(66, "Verified FNP Team Title and URL");
			System.out.println("----> " + driver.getTitle() + " <-----");
			helper.verifyPageTitle("Family");
			helper.verifyCurrentUrl("https://www.fnp.com/info/fnp-team");
			Reporter.logInfo("Verified FNP Team Title and URL");
			LoggerHandler.info("Verified FNP Team Title and URL");
			helper.closeAndSwitch();
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyFNPTeamTitleAndUrl: " + e.getMessage());
			Reporter.logFail("Error in verifyFNPTeamTitleAndUrl: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyFNPTeamTitleAndUrl", Reporter.test,
					"Error in verifyFNPTeamTitleAndUrl");
		}
	}

	public void verifyCareersTitleAndUrl() {
		try {
			ProgressBarUtil.setProgress(80, "Verified Career Title and URL");
			helper.verifyPageTitle("Ferns N Petals Careers | Job Vacancy in Ferns N Petals");
			helper.verifyCurrentUrl("https://www.fnp.com/info/careers");
			Reporter.logInfo("Verified Career Title and URL");
			LoggerHandler.info("Verified Career Title and URL");
			helper.closeAndSwitch();
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyCareersTitleAndUrl: " + e.getMessage());
			Reporter.logFail("Error in verifyCareersTitleAndUrl: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyCareersTitleAndUrl", Reporter.test,
					"Error in verifyCareersTitleAndUrl");
		}
	}

	public void verifyTestimonialsTitleAndUrl() {
		try {
			ProgressBarUtil.setProgress(94, "Verified testimonial Title and URL");
			helper.verifyPageTitle("Heartfelt Testimonials from Happy Customers | FNP");
			helper.verifyCurrentUrl("https://www.fnp.com/info/testimonials");
			Reporter.logInfo("Verified testimonial Title and URL");
			LoggerHandler.info("Verified testimonial Title and URL");
			helper.closeAndSwitch();
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyTestimonialsTitleAndUrl: " + e.getMessage());
			Reporter.logFail("Error in verifyTestimonialsTitleAndUrl: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyTestimonialsTitleAndUrl", Reporter.test,
					"Error in verifyTestimonialsTitleAndUrl");
		}
	}

	public void verifyPolicyInfo() {
		try {
			HighlightUtil.highlightElement(HomePageLocators.policyInfo);
			ProgressBarUtil.setProgress(100, "Verified Policy Info");
			helper.veriFyText(driver.findElement(HomePageLocators.policyInfo).getText(), "Policy Info");
			Reporter.logInfo("Verified Policy Info");
			LoggerHandler.info("Verified Policy Info");
		} catch (Exception e) {
			LoggerHandler.error("Error in verifyPolicyInfo: " + e.getMessage());
			Reporter.logFail("Error in verifyPolicyInfo: " + e.getMessage());
			Reporter.attachScreenshotToReport("verifyPolicyInfo", Reporter.test, "Error in verifyPolicyInfo");
		}
	}

}
