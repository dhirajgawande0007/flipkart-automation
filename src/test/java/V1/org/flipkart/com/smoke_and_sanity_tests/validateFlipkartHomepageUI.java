package V1.org.flipkart.com.smoke_and_sanity_tests;

import org.flipkart.com.page_objects.flipkart_website_page_objects.HomePage;
import org.flipkart.com.page_objects.flipkart_website_page_objects.login.FlipkartLogin;
import org.testng.Assert;
import org.testng.annotations.Test;

import V1.org.flipkart.com.base_tests.BaseBrowserTest;

public class validateFlipkartHomepageUI extends BaseBrowserTest {

	public validateFlipkartHomepageUI(){
		super();
	}

	@Test
	public void validateHomepageUI() {
		FlipkartLogin objFlipkartLogin = new FlipkartLogin(driver);
		Assert.assertTrue(objFlipkartLogin.clickOnCloseIcon(), "Unable to click on Close icon");

		HomePage objHomePage = new HomePage(driver);
		Assert.assertTrue(objHomePage.hoverOnFashinSubHeaderMenu(), "Unable to hover on Fashin Subheader Menu");
	}
}
