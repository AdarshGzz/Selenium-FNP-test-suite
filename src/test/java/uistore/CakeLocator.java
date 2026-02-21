package uistore;

import org.openqa.selenium.By;

//NOSONAR
public class CakeLocator {

    //TestCase4
	public static By sameDay=By.xpath("//div[text()='Same Day']");
	public static By clickfirstProduct=By.xpath("(//div[@class='mb-4 line-clamp-1  text-12 font-500 leading-0 text-fnp-500 md:text-14'])[1]");
	public static By clickAddtoCart=By.xpath("//div[text()='Add To Cart']");
	public static By verifyCake=By.xpath("//p[text()='Elegant Vibe Red Roses Bouquet']");
	public static By verifyOffersCake=By.xpath("//p[text()='Offers Available']");
	public static By verifyBirthdayCake=By.xpath("//h1[text()='Birthday Cakes']");
    
}