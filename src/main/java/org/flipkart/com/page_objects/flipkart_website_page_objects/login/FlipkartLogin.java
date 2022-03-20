package org.flipkart.com.page_objects.flipkart_website_page_objects.login;

import java.io.IOException;
import java.net.MalformedURLException;

import org.flipkart.com.page_objects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlipkartLogin extends BasePage {

	private final String EMAILID_INPUT = "testuser@testmail.lcl";
	private final String PASSWORD_INPUT = "Password@123";
	private final By EMAIL_ID_TEXTFIELD = By.cssSelector("input[class*='_2IX_2- VJZDxU']");
	private final By PASSWORD_TEXTFIELD = By.cssSelector("input[type='password']");
	private final By LOGIN_BUTTON = By.cssSelector("div[class=\"_1D1L_j\"] button[type='submit']");
	private final By LOGIN_LABEL = By.cssSelector("span[class='_36KMOx'] span");
	private final By GET_ACCESS_LABEL = By.cssSelector("p[class='_1-pxlW'] span");
	private final By FORGOT_LINK = By.xpath("//span[contains(text(),'Forgot?')]");
	private final By TERMS_OF_USE_LINK = By.xpath("//div[@class='_1Ijv5h']//a[contains(@href,'terms')]");

	public FlipkartLogin(WebDriver driver) {
		super(driver);
	}

	public boolean fillEmailTextbox() {
		return sendKeysToElement(EMAIL_ID_TEXTFIELD, EMAILID_INPUT);
	}

	public boolean fillPasswordTextbox() {
		return sendKeysToElement(PASSWORD_TEXTFIELD, PASSWORD_INPUT);
	}

	public boolean clickOnLoginButton() {
		return clickElement(LOGIN_BUTTON);
	}

	public String getLoginLabel() {
		return getElementText(LOGIN_LABEL);
	}

	public String getAccessLabel() {
		return getElementText(GET_ACCESS_LABEL);
	}

	public boolean getTermsOfUseLinkStatus() throws MalformedURLException, IOException {
		return getLinkStatus(TERMS_OF_USE_LINK);
	}
}
