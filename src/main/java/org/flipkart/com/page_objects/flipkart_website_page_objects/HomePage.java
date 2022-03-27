package org.flipkart.com.page_objects.flipkart_website_page_objects;

import org.flipkart.com.page_objects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

	private final By EXPLORE_PLUS_NAVIGATION_HEADER = By.cssSelector("span[class='_2FVHGh']");
	private final By SEARCH_BAR_NAVIGATION_HEADER = By.name("q");
	private final By LOGIN_BUTTON =  By.className("_1_3w1N");
	private final By MORE_NAVIGATION_HEADER = By.cssSelector("div[class='exehdJ']");
	private final By CART_NAVIGATION_HEADER = By.xpath("//span[text()='Cart']");
	private final By FASHION_SUBHEADER_MENU = By.cssSelector("img[alt='Fashion']");
	private final By CONTACT_US_FOOTER_LINK = By.xpath("//a[@class='_1arVWX'][contains(text(),'Contact Us')]");
	private final By FASHION_MENU_OPTIONS = By.xpath("div._2IjXr8 a");

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public boolean hoverOnFashinSubHeaderMenu(){

		return hoverOnElement(FASHION_SUBHEADER_MENU);

	}


}
