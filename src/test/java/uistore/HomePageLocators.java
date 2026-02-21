package uistore;

import org.openqa.selenium.By;

public class HomePageLocators {

    public static By noThanksButton = By.xpath("(//button[contains(text(),'No, Thanks')])");
    public static By termsAndConditions = By.xpath("(//a[contains(text(),'Terms & Conditions')])");
    public static By privacyPolicy = By.xpath("(//a[contains(text(),'Privacy Policy')])");
    public static By termsOfUse = By.xpath("(//a[contains(text(),'Terms of Use')])");
    public static By disclaimer = By.xpath("(//a[contains(text(),'Disclaimer')])");
// 
    public static By aboutUs = By.xpath("//a[contains(text(),'About Us')]");
    public static By fnpTeam = By.xpath("//a[contains(text(),'FNP Team')]");
    public static By testimonials = By.xpath("//a[contains(text(),'Testimonials')]");
    public static By newsRoom = By.xpath("//a[contains(text(),'News Room')]");
//
    public static By careers = By.xpath("//a[contains(text(),'Careers')]");
    public static By singaporePosition = By.xpath("//li[contains(text(),'Singapore Positions')]");
    public static By categoryHead = By.xpath("//h3[contains(text(),'Category Head')]");
    public static By applyNow = By.xpath("//li[@id='Category']//a[text='Apply Now']");
    ///
    public static By blog = By.xpath("//a[contains(text(),'Blog')]");
    public static By ocassion = By.xpath("(//span[contains(text(),'Occasions')])");
    public static By rakhiHampers = By.xpath("(//div[contains(text(),'Rakhi Hampers')])[2]");
    public static By firstProductRakhiHamper = By.xpath("(//div[contains(text(),'FREE Kaju Katli')])[1]");
    public static By cakes = By.xpath("//p[contains(text(),'Cakes')]");
    //
    public static By truffleCake = By.xpath("//a[contains(text(),'Truffle Cake')]");
    public static By truffleCakeHeading = By.xpath("//p[contains(text(),'Cakes')]");
    public static By continueBtn = By.xpath("//div[contains(text(),'Continue')]");
    public static By cartHeading = By.xpath("//span[contains(text(),'Cart')]");
    //
    public static By decorations = By.xpath("//a[contains(text(),'Decoration')]");
    public static By kolkata = By.xpath("//img[contains(@alt,'Kolkata')]");
    public static String itemList = "//div[@itemprop ='name']";
    public static By productHeading = By.xpath("//h1[@id ='productName']");
    ///
    public static By corporateServices = By.xpath("//a[contains(text(),'Corporate Service')]");
    public static By nameInp = By.xpath("//input[@placeholder ='Full Name']");
    public static By stateSelect = By.xpath("//select[@name ='State']");
    public static By budgetSelect = By.xpath("//select[@name ='Budget']");
    public static By submit = By.xpath("//input[@type ='submit']");


    // Testcase-9
    public static By services = By.xpath("//a[contains(text(),'Services')]");
    public static By corpororateService = By.xpath("//a[contains(text(),'Corporate Service')]");
    public static By affiliateProgram = By.xpath("//a[contains(text(),'Affiliate Program')]");
    public static By retailStores = By.xpath("//a[contains(text(),'Retails Stores')]");
    public static By frenchise = By.xpath("//a[contains(text(),'Franchise')]");
    
    // Testcase-10
    public static By logo = By.xpath("//img[@alt='Ferns N Petals']");
    public static By whereToDeliver = By.xpath("//span[contains(text(),'Where to deliver?')]");
    public static By pinCodeInput = By.xpath("//input[@id='pincode-location-input']");
    public static By continueShoppingButton = By.xpath("//div[contains(text(),'Continue Shopping')]");
    public static By lifestyleNavigation = By.xpath("//span[contains(text(),'Lifestyle')]");
    public static By jwellery = By.xpath("(//div[contains(text(),'Jewellery')])[4]");
    public static By rings = By.xpath("//a[contains(text(),'Rings')]");
    public static By firstProduct = By.xpath("(//div[@id='plpProduct']//div[@itemprop='name'])[1]");
    public static By addToCartButton = By.xpath("//button[@title='Add To Cart']/div[2]");
    public static By reviews = By.xpath("(//span[contains(text(),'Reviews')])");
    public static By pinCodeCorrectSuggestion = By.xpath("(//span[text()='Kolkata, West Bengal, India'])");
    public static By enterExactLocationMessage = By.xpath("//p[contains(text(),'Please enter the exact area within the city')]");




     //TestCase-1
    public static By clickWhereToDelivery=By.xpath("//span[text()='Where to deliver?']");
	public static By inputSection=By.xpath("//input[@id='pincode-location-input']");
	public static By delhiIndia=By.xpath("//span[text()='Delhi, India']");
	public static By clickContinueShopping=By.xpath("//div[text()='Continue Shopping']");
	public static By clickSearch=By.xpath("(//input[@aria-label='search_bar'])[1]");
	public static By verifyDelhiPincode=By.xpath("//div[@class='flex items-center gap-2']");

    // TestCase-5

    public static By fnpLogo = By.xpath("//span[@class='hidden md:flex']/a/img");

    public static By clickAllowNotifications = By.xpath("//button[@id='wzrk-confirm']");
    public static By clickOnWhereToDeliver = By.xpath("//span[text()='Where to deliver?']");
    public static By inputLocationAsBangalore = By.xpath("//input[@id='pincode-location-input']");

    public static By elementVisibleBanglore = By.xpath("//li[@id='list-item-0']");

    public static By clickOnContinueShopping = By.xpath("//div[text()='Continue Shopping']");

    public static String verifyBanglorePincode = "//span[@class='w-full max-w-[150px] overflow-hidden text-ellipsis whitespace-nowrap md:max-w-[200px]']";
    public static By hoverPersonalised = By.xpath("//span[text()='Personalised']");

    public static By clickOnMugs = By.xpath("(//div[text()='Mugs'])[1]");

    // TestCase07

    // homePageLocators
    public static By noThanks = By.xpath("//button[text() = 'No, Thanks']");
    public static By fnpLogoVaibhav = By.xpath("//img[@alt = 'Ferns N Petals']");
    public static By where2Deliver = By.xpath("//span[text() = 'Where to deliver?']");
    public static By bangloreInput = By.xpath("//input[@id = 'pincode-location-input']");
    public static By bangloreClick = By.xpath("//span[text() = 'Bangalore, Karnataka, India']");
    public static By continueShopping = By.xpath("//div[text() = 'Continue Shopping']");
    public static By verifyPinCode = By.xpath("//span[text() = 'Bangalore, Karnataka, India, 560002']");
    public static By combos = By.xpath("//span[text() = 'Combos']");
    public static By healthyHampers = By.xpath("//div[text() = 'Healthy Hampers']");

    // HealthyGiftHamperPageLocators --> different page 


    // TestCase08

    // HomePageLocators
    public static By scroll2Footer = By.xpath("//p[contains(text() , 'Telephone No.: +91-11-26802680 | E-mail: help@fnp.com | Grievance Resolution Officer Name: Mr. Ankit Dhir | Contact No.: +91 9212422000 / 9755-248-248')]");

 
    public static By FNPTeam = By.xpath("//a[text() = 'FNP Team']");
    public static By policyInfo = By.xpath("//h6[text() = 'Policy Info']");
    public static By popUpNoThanksBtn = By.xpath("(//button[contains(text(),'No, Thanks')])");
    public static By verifyPinCodeKolkata = By.xpath("//span[text() = 'Kolkata, West Bengal, India, 700073']");

    // Testcase-3

    public static By whereToDelivery = By.xpath("//span[text()='Where to deliver?']");
    public static By enterLocation = By.xpath("//input[@id='pincode-location-input']");
    public static By chennai = By.xpath("//span[text()='Chennai, Tamil Nadu, India']");
    public static By ContinueShopping = By.xpath("(//div[@class='text-center not-italic leading-6 text-14 font-600'])[3]");
    public static By HoveronAnniversay = By.xpath("//span[text()='Anniversary']");
    public static By clickOnFlowers = By.xpath("(//div[text()='Flowers'])[2]");
    public static By chennaipincode = By.xpath("//span[text()='Chennai, Tamil Nadu, India, 600003']");
    public static By hoverOncakes = By.xpath("//span[text()='Cakes']");
    public static By clickBirthdayCake = By.xpath("//div[text()='Birthday Cakes']");
    
    
}
