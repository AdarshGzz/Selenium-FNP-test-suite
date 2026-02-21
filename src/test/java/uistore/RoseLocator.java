package uistore;

import org.openqa.selenium.By;
//NOSONAR
public class RoseLocator {

    //Testcase3

    public static By clickOnRoses=By.xpath("//a[text()='Roses']");
	public static By waitformessage=By.xpath("//p[text()='Please enter the exact area within the city']");
	public static By FirstProduct=By.xpath("(//div[@class='mb-4 line-clamp-1  text-12 font-500 leading-0 text-fnp-500 md:text-14'])[1]");
	public static By clickBuyNow=By.xpath("(//div[@class='flex w-full items-center justify-center '])[7]");
	public static By clickSameday=By.xpath("(//div[@class='whitespace-nowrap text-center text-12 font-400 not-italic leading-4 text-grey-500 md:flex xxl:text-14'])[1]");
	public static By home=By.xpath("//a[text()='Home']");
	public static By verifyFlowers=By.xpath("//h1[text()='Premium Anniversary Flowers']");
	public static By verifyRose=By.xpath("//p[text()='Mixed Roses Romantic Bunch']");

}