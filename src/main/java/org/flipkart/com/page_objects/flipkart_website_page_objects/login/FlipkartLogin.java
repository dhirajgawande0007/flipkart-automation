package org.flipkart.com.page_objects.flipkart_website_page_objects.login;

import org.flipkart.com.page_objects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlipkartLogin extends BasePage{

	private final String EMAILID_INPUT = "testuser@testmail.lcl";
	private final String PASSWORD_INPUT = "Password@123";
	private final By EMAIL_ID_TEXTFIELD = By.cssSelector("input[class*='_2IX_2- VJZDxU']");
	private final By PASSWORD_TEXTFIELD = By.cssSelector("input[type='password']");
	private final By LOGIN_BUTTON = By.cssSelector("div[class=\"_1D1L_j\"] button[type='submit']");
	
	public FlipkartLogin(WebDriver driver) {
		super(driver);
	}
	
	public boolean fillEmailTextbox() {
		return sendKeysToElement(EMAIL_ID_TEXTFIELD, EMAILID_INPUT );
	}
	
	public boolean fillPasswordTextbox() {
		return sendKeysToElement(PASSWORD_TEXTFIELD, PASSWORD_INPUT );
	}
	
	public boolean clickOnLoginButton() {
		return clickElement(LOGIN_BUTTON);
	}
}
